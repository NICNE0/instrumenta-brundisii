package net.nicneo.instrumenta_brundisii.event;

import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;

@Mod.EventBusSubscriber(modid = instrumentaBrundisii.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BougainvilleaModEvents {
    @SubscribeEvent
    public static void registerVariants(FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            BougainvilleaInteractionHandler.registerColor("PINK",
                    ModBlocks.PINK_BOUGAINVILLEA.get(),
                    ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_1.get(),
                    ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_2.get(),
                    ModBlocks.PINK_FLOWERING_BOUGAINVILLEA_1.get(),
                    ModBlocks.PINK_FLOWERING_BOUGAINVILLEA_2.get()
            );

            BougainvilleaInteractionHandler.registerColor("ORANGE",
                    ModBlocks.ORANGE_BOUGAINVILLEA.get(),
                    ModBlocks.ORANGE_BLOOMING_BOUGAINVILLEA_1.get(),
                    ModBlocks.ORANGE_BLOOMING_BOUGAINVILLEA_2.get(),
                    ModBlocks.ORANGE_FLOWERING_BOUGAINVILLEA_1.get(),
                    ModBlocks.ORANGE_FLOWERING_BOUGAINVILLEA_2.get()
            );

            BougainvilleaInteractionHandler.registerColor("WHITE",
                    ModBlocks.WHITE_BOUGAINVILLEA.get(),
                    ModBlocks.WHITE_BLOOMING_BOUGAINVILLEA_1.get(),
                    ModBlocks.WHITE_BLOOMING_BOUGAINVILLEA_2.get(),
                    ModBlocks.WHITE_FLOWERING_BOUGAINVILLEA_1.get(),
                    ModBlocks.WHITE_FLOWERING_BOUGAINVILLEA_2.get()
            );

            // Add more colors here if needed
        });
    }
}
