package net.nicneo.instrumenta_brundisii.item;

import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, instrumentaBrundisii.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("instrumenta_brundisii",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOD_LOGO.get()))
                    .title(Component.translatable("instrumenta.brundisii_tab"))
                    .displayItems((pParameters, pOutput) -> {

//                      BLOCKS:
                        pOutput.accept(ModBlocks.PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get());

                        pOutput.accept(ModBlocks.RETICULA.get());


//                      COINS:
                        pOutput.accept(ModItems.AURI.get());
                        pOutput.accept(ModItems.DENARI.get());
                        pOutput.accept(ModItems.SESTERCI.get());
                        pOutput.accept(ModItems.AS.get());
                        pOutput.accept(ModItems.SEMI.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
