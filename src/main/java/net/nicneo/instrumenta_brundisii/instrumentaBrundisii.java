package net.nicneo.instrumenta_brundisii;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.block.entity.ModBlockEntities;
import net.nicneo.instrumenta_brundisii.entity.ModEntities;
import net.nicneo.instrumenta_brundisii.entity.client.CommonTailedRenderer;
import net.nicneo.instrumenta_brundisii.event.BougainvilleaInteractionHandler;
import net.nicneo.instrumenta_brundisii.item.ModCreativeModTabs;
import net.nicneo.instrumenta_brundisii.item.ModItems;
import net.nicneo.instrumenta_brundisii.sound.ModSounds;
import net.nicneo.instrumenta_brundisii.util.ModWoodTypes;
import org.slf4j.Logger;
import net.minecraft.client.renderer.entity.ThrownItemRenderer;


// The value here should match an entry in the META-INF/mods.toml file
@Mod(instrumentaBrundisii.MOD_ID)
public class instrumentaBrundisii {
    public static final String MOD_ID = "instrumenta_brundisii";
    private static final Logger LOGGER = LogUtils.getLogger();

    public instrumentaBrundisii() {
        BusGroup modBusGroup = FMLJavaModLoadingContext.get().getModBusGroup();

        ModCreativeModTabs.register(modBusGroup);

        ModItems.register(modBusGroup);
        ModBlocks.register(modBusGroup);

        ModSounds.register(modBusGroup);
        ModEntities.register(modBusGroup);

        ModBlockEntities.register(modBusGroup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS){
            event.accept(ModItems.AURI);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.QUARTZ);
            Sheets.addWoodType(ModWoodTypes.ANDESITE);
            Sheets.addWoodType(ModWoodTypes.DIORITE);
            Sheets.addWoodType(ModWoodTypes.GRANITE);
            EntityRenderers.register(ModEntities.COMMON_TAILED.get(), CommonTailedRenderer::new);
            EntityRenderers.register(ModEntities.THROWN_COMMON_TAILED_EGG.get(), ThrownItemRenderer::new);
        }
    }
}
