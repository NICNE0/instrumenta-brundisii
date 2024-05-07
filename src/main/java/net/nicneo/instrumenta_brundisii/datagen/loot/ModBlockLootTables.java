package net.nicneo.instrumenta_brundisii.datagen.loot;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.nicneo.instrumenta_brundisii.block.custom.CornCropBlock;
import net.nicneo.instrumenta_brundisii.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.PLASTER_STAIRS.get());
        this.dropSelf(ModBlocks.PLASTER_BUTTON.get());
        this.dropSelf(ModBlocks.PLASTER_FENCE.get());
        this.dropSelf(ModBlocks.PLASTER_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.PLASTER_WALL.get());
        this.dropSelf(ModBlocks.PLASTER_PRESSURE_PLATE.get());
        this.add(ModBlocks.PLASTER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.PLASTER_SLAB.get()));

        this.dropSelf(ModBlocks.RED_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.RED_PLASTER_STAIRS.get());
        this.dropSelf(ModBlocks.RED_PLASTER_BUTTON.get());
        this.dropSelf(ModBlocks.RED_PLASTER_FENCE.get());
        this.dropSelf(ModBlocks.RED_PLASTER_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.RED_PLASTER_WALL.get());
        this.dropSelf(ModBlocks.RED_PLASTER_PRESSURE_PLATE.get());
        this.add(ModBlocks.RED_PLASTER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RED_PLASTER_SLAB.get()));

        this.dropSelf(ModBlocks.SCARLET_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.SCARLET_PLASTER_STAIRS.get());
        this.dropSelf(ModBlocks.SCARLET_PLASTER_BUTTON.get());
        this.dropSelf(ModBlocks.SCARLET_PLASTER_FENCE.get());
        this.dropSelf(ModBlocks.SCARLET_PLASTER_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.SCARLET_PLASTER_WALL.get());
        this.dropSelf(ModBlocks.SCARLET_PLASTER_PRESSURE_PLATE.get());
        this.add(ModBlocks.SCARLET_PLASTER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.SCARLET_PLASTER_SLAB.get()));

        this.dropSelf(ModBlocks.BLUE_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.BLUE_PLASTER_STAIRS.get());
        this.dropSelf(ModBlocks.BLUE_PLASTER_BUTTON.get());
        this.dropSelf(ModBlocks.BLUE_PLASTER_FENCE.get());
        this.dropSelf(ModBlocks.BLUE_PLASTER_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.BLUE_PLASTER_WALL.get());
        this.dropSelf(ModBlocks.BLUE_PLASTER_PRESSURE_PLATE.get());
        this.add(ModBlocks.BLUE_PLASTER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLUE_PLASTER_SLAB.get()));

        this.dropSelf(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_PLASTER_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_PLASTER_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_PLASTER_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_PLASTER_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_PLASTER_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_PLASTER_PRESSURE_PLATE.get());
        this.add(ModBlocks.LIGHT_BLUE_PLASTER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_BLUE_PLASTER_SLAB.get()));

        this.dropSelf(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.DARK_BLUE_PLASTER_STAIRS.get());
        this.dropSelf(ModBlocks.DARK_BLUE_PLASTER_BUTTON.get());
        this.dropSelf(ModBlocks.DARK_BLUE_PLASTER_FENCE.get());
        this.dropSelf(ModBlocks.DARK_BLUE_PLASTER_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.DARK_BLUE_PLASTER_WALL.get());
        this.dropSelf(ModBlocks.DARK_BLUE_PLASTER_PRESSURE_PLATE.get());
        this.add(ModBlocks.DARK_BLUE_PLASTER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_BLUE_PLASTER_SLAB.get()));

        this.dropSelf(ModBlocks.GREEN_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.GREEN_PLASTER_STAIRS.get());
        this.dropSelf(ModBlocks.GREEN_PLASTER_BUTTON.get());
        this.dropSelf(ModBlocks.GREEN_PLASTER_FENCE.get());
        this.dropSelf(ModBlocks.GREEN_PLASTER_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.GREEN_PLASTER_WALL.get());
        this.dropSelf(ModBlocks.GREEN_PLASTER_PRESSURE_PLATE.get());
        this.add(ModBlocks.GREEN_PLASTER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GREEN_PLASTER_SLAB.get()));

        this.dropSelf(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.DARK_GREEN_PLASTER_STAIRS.get());
        this.dropSelf(ModBlocks.DARK_GREEN_PLASTER_BUTTON.get());
        this.dropSelf(ModBlocks.DARK_GREEN_PLASTER_FENCE.get());
        this.dropSelf(ModBlocks.DARK_GREEN_PLASTER_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.DARK_GREEN_PLASTER_WALL.get());
        this.dropSelf(ModBlocks.DARK_GREEN_PLASTER_PRESSURE_PLATE.get());
        this.add(ModBlocks.DARK_GREEN_PLASTER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.DARK_GREEN_PLASTER_SLAB.get()));

        this.dropSelf(ModBlocks.YELLOW_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.YELLOW_PLASTER_STAIRS.get());
        this.dropSelf(ModBlocks.YELLOW_PLASTER_BUTTON.get());
        this.dropSelf(ModBlocks.YELLOW_PLASTER_FENCE.get());
        this.dropSelf(ModBlocks.YELLOW_PLASTER_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.YELLOW_PLASTER_WALL.get());
        this.dropSelf(ModBlocks.YELLOW_PLASTER_PRESSURE_PLATE.get());
        this.add(ModBlocks.YELLOW_PLASTER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.YELLOW_PLASTER_SLAB.get()));

        this.dropSelf(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LIGHT_YELLOW_PLASTER_STAIRS.get());
        this.dropSelf(ModBlocks.LIGHT_YELLOW_PLASTER_BUTTON.get());
        this.dropSelf(ModBlocks.LIGHT_YELLOW_PLASTER_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_YELLOW_PLASTER_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.LIGHT_YELLOW_PLASTER_WALL.get());
        this.dropSelf(ModBlocks.LIGHT_YELLOW_PLASTER_PRESSURE_PLATE.get());
        this.add(ModBlocks.LIGHT_YELLOW_PLASTER_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_YELLOW_PLASTER_SLAB.get()));

        this.dropSelf(ModBlocks.LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIMESTONE_BUTTON.get());
        this.dropSelf(ModBlocks.LIMESTONE_FENCE.get());
        this.dropSelf(ModBlocks.LIMESTONE_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.LIMESTONE_PRESSURE_PLATE.get());
        this.add(ModBlocks.LIMESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIMESTONE_SLAB.get()));

        this.dropSelf(ModBlocks.RETICULA.get());
        this.dropSelf(ModBlocks.LIGHT_RETICULA.get());
        this.dropSelf(ModBlocks.MIXED_RETICULA.get());
        this.dropSelf(ModBlocks.LIME_BRICK_MIX.get());


        this.dropSelf(ModBlocks.TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TERRACOTTA_SLAB.get()));

        this.dropSelf(ModBlocks.WHITE_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.WHITE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WHITE_TERRACOTTA_SLAB.get()));


        this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.ORANGE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ORANGE_TERRACOTTA_SLAB.get()));


        this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get()));


        this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get()));


        this.dropSelf(ModBlocks.RED_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.RED_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RED_TERRACOTTA_SLAB.get()));

        LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 3))
                .or(LootItemBlockStatePropertyCondition
                        .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 4)));

        // LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
        //         .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
        //         .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 8));

        this.add(ModBlocks.CORN_CROP.get(), createCropDrops(ModBlocks.CORN_CROP.get(), ModItems.CORN_COB.get(),
                ModItems.CORN_SEEDS.get(), lootitemcondition$builder2));

        this.dropSelf(ModBlocks.TEST_BLOCK_1.get());



    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
