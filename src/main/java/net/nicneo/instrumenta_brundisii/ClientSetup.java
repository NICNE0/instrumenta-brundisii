package net.nicneo.instrumenta_brundisii;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;

@Mod.EventBusSubscriber(modid = instrumentaBrundisii.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {

        setRenderLayer(ModBlocks.CORN_CROP.get(), ChunkSectionLayer.CUTOUT);
        setRenderLayer(ModBlocks.COTTON_CROP.get(), ChunkSectionLayer.CUTOUT);

        setRenderLayer(ModBlocks.BOUGAINVILLEA_LEAVES.get(), ChunkSectionLayer.CUTOUT);

        setRenderLayer(ModBlocks.PINK_BOUGAINVILLEA.get(), ChunkSectionLayer.CUTOUT);
        setRenderLayer(ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_1.get(), ChunkSectionLayer.CUTOUT);
        setRenderLayer(ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_2.get(), ChunkSectionLayer.CUTOUT);
        setRenderLayer(ModBlocks.PINK_FLOWERING_BOUGAINVILLEA_1.get(), ChunkSectionLayer.CUTOUT);
        setRenderLayer(ModBlocks.PINK_FLOWERING_BOUGAINVILLEA_2.get(), ChunkSectionLayer.CUTOUT);

        setRenderLayer(ModBlocks.ORANGE_BOUGAINVILLEA.get(), ChunkSectionLayer.CUTOUT);
        setRenderLayer(ModBlocks.ORANGE_BLOOMING_BOUGAINVILLEA_1.get(), ChunkSectionLayer.CUTOUT);
        setRenderLayer(ModBlocks.ORANGE_BLOOMING_BOUGAINVILLEA_2.get(), ChunkSectionLayer.CUTOUT);
        setRenderLayer(ModBlocks.ORANGE_FLOWERING_BOUGAINVILLEA_1.get(), ChunkSectionLayer.CUTOUT);
        setRenderLayer(ModBlocks.ORANGE_FLOWERING_BOUGAINVILLEA_2.get(), ChunkSectionLayer.CUTOUT);

        setRenderLayer(ModBlocks.WHITE_BOUGAINVILLEA.get(), ChunkSectionLayer.CUTOUT);
        setRenderLayer(ModBlocks.WHITE_BLOOMING_BOUGAINVILLEA_1.get(), ChunkSectionLayer.CUTOUT);
        setRenderLayer(ModBlocks.WHITE_BLOOMING_BOUGAINVILLEA_2.get(), ChunkSectionLayer.CUTOUT);
        setRenderLayer(ModBlocks.WHITE_FLOWERING_BOUGAINVILLEA_1.get(), ChunkSectionLayer.CUTOUT);
        setRenderLayer(ModBlocks.WHITE_FLOWERING_BOUGAINVILLEA_2.get(), ChunkSectionLayer.CUTOUT);
    }

    private static void setRenderLayer(Block block, ChunkSectionLayer type) {
        ItemBlockRenderTypes.setRenderLayer(block, type);
    }
}
