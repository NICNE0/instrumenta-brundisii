package net.nicneo.instrumenta_brundisii;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;

@Mod.EventBusSubscriber(modid = instrumentaBrundisii.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

        setRenderLayer(ModBlocks.CORN_CROP.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.COTTON_CROP.get(), RenderType.cutout());

        setRenderLayer(ModBlocks.BOUGAINVILLEA_LEAVES.get(), RenderType.cutout());

        setRenderLayer(ModBlocks.PINK_BOUGAINVILLEA.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_1.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_2.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.PINK_FLOWERING_BOUGAINVILLEA_1.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.PINK_FLOWERING_BOUGAINVILLEA_2.get(), RenderType.cutout());

        setRenderLayer(ModBlocks.ORANGE_BOUGAINVILLEA.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.ORANGE_BLOOMING_BOUGAINVILLEA_1.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.ORANGE_BLOOMING_BOUGAINVILLEA_2.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.ORANGE_FLOWERING_BOUGAINVILLEA_1.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.ORANGE_FLOWERING_BOUGAINVILLEA_2.get(), RenderType.cutout());

        setRenderLayer(ModBlocks.WHITE_BOUGAINVILLEA.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.WHITE_BLOOMING_BOUGAINVILLEA_1.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.WHITE_BLOOMING_BOUGAINVILLEA_2.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.WHITE_FLOWERING_BOUGAINVILLEA_1.get(), RenderType.cutout());
        setRenderLayer(ModBlocks.WHITE_FLOWERING_BOUGAINVILLEA_2.get(), RenderType.cutout());
    }

    private static void setRenderLayer(Block block, RenderType type) {
        ItemBlockRenderTypes.setRenderLayer(block, type);
    }
}