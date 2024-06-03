package net.nicneo.instrumenta_brundisii.datagen.loot;

import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.nicneo.instrumenta_brundisii.block.custom.*;
import net.nicneo.instrumenta_brundisii.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
//      TUFF:
//      ================================================================================================================
        this.dropSelf(ModBlocks.TUFF_STAIRS.get());
        this.dropSelf(ModBlocks.TUFF_BUTTON.get());
        this.dropSelf(ModBlocks.TUFF_FENCE.get());
        this.dropSelf(ModBlocks.TUFF_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.TUFF_WALL.get());
        this.dropSelf(ModBlocks.TUFF_PRESSURE_PLATE.get());
        this.add(ModBlocks.TUFF_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TUFF_SLAB.get()));



//      PLASTER:
//      ================================================================================================================
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



//      LIMESTONE:
//      ================================================================================================================
        this.dropSelf(ModBlocks.LIMESTONE_BRICKS.get());
        this.dropSelf(ModBlocks.LIMESTONE_STAIRS.get());
        this.dropSelf(ModBlocks.LIMESTONE_BUTTON.get());
        this.dropSelf(ModBlocks.LIMESTONE_FENCE.get());
        this.dropSelf(ModBlocks.LIMESTONE_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.LIMESTONE_WALL.get());
        this.dropSelf(ModBlocks.LIMESTONE_PRESSURE_PLATE.get());
        this.add(ModBlocks.LIMESTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIMESTONE_SLAB.get()));
        this.dropSelf(ModBlocks.LIME_BRICK_MIX.get());



//      RETICULA:
//      ================================================================================================================
        this.dropSelf(ModBlocks.RETICULA.get());
        this.dropSelf(ModBlocks.LIGHT_RETICULA.get());
        this.dropSelf(ModBlocks.MIXED_RETICULA.get());



//      LINTELS:
//      ================================================================================================================
        this.dropSelf(ModBlocks.LINTEL_BLACK_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_BLUE_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_BROWN_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_CYAN_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_GRAY_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_GREEN_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_LIGHT_BLUE_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_LIGHT_GRAY_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_LIME_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_MAGENTA_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_ORANGE_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_PINK_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_PURPLE_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_RED_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_WHITE_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_YELLOW_TERRACOTTA.get());
        this.dropSelf(ModBlocks.LINTEL_BLUE_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LINTEL_DARK_BLUE_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LINTEL_DARK_GREEN_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LINTEL_GREEN_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LINTEL_LIGHT_BLUE_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LINTEL_LIGHT_YELLOW_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LINTEL_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LINTEL_RED_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LINTEL_SCARLET_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LINTEL_YELLOW_PLASTER_BLOCK.get());
        this.dropSelf(ModBlocks.LINTEL_BRICKS.get());



//      TERRACOTTA:
//      ================================================================================================================
        this.dropSelf(ModBlocks.TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.TERRACOTTA_SLAB.get()));
        this.dropSelf(ModBlocks.TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.TERRACOTTA_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.TERRACOTTA_WALL.get());

        this.dropSelf(ModBlocks.WHITE_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.WHITE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.WHITE_TERRACOTTA_SLAB.get()));
        this.dropSelf(ModBlocks.WHITE_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.WHITE_TERRACOTTA_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.WHITE_TERRACOTTA_WALL.get());

        this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.ORANGE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.ORANGE_TERRACOTTA_SLAB.get()));
        this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.ORANGE_TERRACOTTA_WALL.get());

        this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get()));
        this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());

        this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get()));
        this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());

        this.dropSelf(ModBlocks.RED_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.RED_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.RED_TERRACOTTA_SLAB.get()));
        this.dropSelf(ModBlocks.RED_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.RED_TERRACOTTA_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.RED_TERRACOTTA_WALL.get());

        this.dropSelf(ModBlocks.BLACK_TERRACOTTA_STAIRS.get());
        this.add(ModBlocks.BLACK_TERRACOTTA_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLACK_TERRACOTTA_SLAB.get()));
        this.dropSelf(ModBlocks.BLACK_TERRACOTTA_FENCE.get());
        this.dropSelf(ModBlocks.BLACK_TERRACOTTA_FENCE_DOOR.get());
        this.dropSelf(ModBlocks.BLACK_TERRACOTTA_WALL.get());



//      FLOOR TILES:
//      ================================================================================================================
        this.dropSelf(ModBlocks.BLACK_FLOOR_TILE.get());
        this.dropSelf(ModBlocks.BLACK_FLOOR_TILE_CORNER.get());



//      CROPS
//      ================================================================================================================

//      CORN CROP:
        LootItemCondition.Builder lootitemcondition$builder2 = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 3))
                .or(LootItemBlockStatePropertyCondition
                        .hasBlockStateProperties(ModBlocks.CORN_CROP.get())
                        .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CornCropBlock.AGE, 4)));

        this.add(ModBlocks.CORN_CROP.get(), createCropDrops(ModBlocks.CORN_CROP.get(), ModItems.CORN_COB.get(),
                ModItems.CORN_SEEDS.get(), lootitemcondition$builder2));

//      FLAX CROP:
        LootItemCondition.Builder lootitemcondition$builder_flax = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.FLAX_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(FlaxCropBlock.AGE, 5));

        this.add(ModBlocks.FLAX_CROP.get(), createCropDrops(ModBlocks.FLAX_CROP.get(), ModItems.FLAX_FIBERS.get(),
                ModItems.FLAX_SEEDS.get(), lootitemcondition$builder_flax));

//      BARLEY CROP:
        LootItemCondition.Builder lootitemcondition$builder_barley = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.BARLEY_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(BarleyCropBlock.AGE, 5));

        this.add(ModBlocks.BARLEY_CROP.get(), createCropDrops(ModBlocks.BARLEY_CROP.get(), ModItems.BARLEY.get(),
                ModItems.BARLEY_SEEDS.get(), lootitemcondition$builder_barley));

//      OAT CROP:
        LootItemCondition.Builder lootitemcondition$builder_oat = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.OAT_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OatCropBlock.AGE, 5));

        this.add(ModBlocks.OAT_CROP.get(), createCropDrops(ModBlocks.OAT_CROP.get(), ModItems.OATS.get(),
                ModItems.OAT_SEEDS.get(), lootitemcondition$builder_barley));

//      RYE CROP:
        LootItemCondition.Builder lootitemcondition$builder_rye = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.RYE_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(RyeCropBlock.AGE, 5));

        this.add(ModBlocks.RYE_CROP.get(), createCropDrops(ModBlocks.RYE_CROP.get(), ModItems.RYE.get(),
                ModItems.RYE_SEEDS.get(), lootitemcondition$builder_barley));

//      LEEK CROP:
        LootItemCondition.Builder lootitemcondition$builder_leek = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.LEEK_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(LeekCropBlock.AGE, 5));

        this.add(ModBlocks.LEEK_CROP.get(), createCropDrops(ModBlocks.LEEK_CROP.get(), ModItems.LEEK.get(),
                ModItems.LEEK_SEEDS.get(), lootitemcondition$builder_barley));

//      GARLIC CROP:
        LootItemCondition.Builder lootitemcondition$builder_garlic = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.GARLIC_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(GarlicCropBlock.AGE, 5));

        this.add(ModBlocks.GARLIC_CROP.get(), createCropDrops(ModBlocks.GARLIC_CROP.get(), ModItems.GARLIC.get(),
                ModItems.GARLIC_SEEDS.get(), lootitemcondition$builder_barley));

//      ONION CROP:
        LootItemCondition.Builder lootitemcondition$builder_onion = LootItemBlockStatePropertyCondition
                .hasBlockStateProperties(ModBlocks.ONION_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(OnionCropBlock.AGE, 5));

        this.add(ModBlocks.ONION_CROP.get(), createCropDrops(ModBlocks.ONION_CROP.get(), ModItems.ONION.get(),
                ModItems.ONION_SEEDS.get(), lootitemcondition$builder_barley));



//      DEBUG:
//      ================================================================================================================
        this.dropSelf(ModBlocks.TEST_BLOCK_1.get());
        this.dropSelf(ModBlocks.PILLAR_TEST.get());
        this.dropSelf(ModBlocks.ORIENTABLE_TEST.get());

    }



    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

}
