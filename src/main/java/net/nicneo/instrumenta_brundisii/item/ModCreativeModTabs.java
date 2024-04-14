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

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("tutorial_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOD_LOGO.get()))
                    .title(Component.translatable("instrumenta.brundisii_tab"))
                    .displayItems((pParameters, pOutput) -> {
//                      COINS:
                        pOutput.accept(ModItems.AURI.get());
                        pOutput.accept(ModItems.DENARI.get());
                        pOutput.accept(ModItems.SESTERCI.get());
                        pOutput.accept(ModItems.AS.get());
                        pOutput.accept(ModItems.SEMI.get());

//                      BLOCKS:
                        pOutput.accept(ModBlocks.PLASTER.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
