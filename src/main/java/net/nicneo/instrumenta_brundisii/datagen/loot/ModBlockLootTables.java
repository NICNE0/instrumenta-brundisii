package net.nicneo.instrumenta_brundisii.datagen.loot;

import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.RED_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.SCARLET_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.BLUE_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.GREEN_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.YELLOW_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get());


        this.dropSelf(ModBlocks.RETICULA.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
