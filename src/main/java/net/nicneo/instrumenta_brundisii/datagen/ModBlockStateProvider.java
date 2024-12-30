package net.nicneo.instrumenta_brundisii.datagen;

import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.block.custom.*;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;

import java.util.Objects;
import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, instrumentaBrundisii.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

//      ===================== LICHEN LIKE BLOCKS ====================
        makeLichenLikeBlock(ModBlocks.BOUGAINVILLEA_LEAVES, "bougainvillea_leaves");
        makeLichenLikeBlock(ModBlocks.PINK_BOUGAINVILLEA, "pink_bougainvillea");
        makeLichenLikeBlock(ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_1, "pink_blooming_bougainvillea_1");
        makeLichenLikeBlock(ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_2, "pink_blooming_bougainvillea_2");
        makeLichenLikeBlock(ModBlocks.PINK_FLOWERING_BOUGAINVILLEA_1, "pink_flowering_bougainvillea_1");
        makeLichenLikeBlock(ModBlocks.PINK_FLOWERING_BOUGAINVILLEA_2, "pink_flowering_bougainvillea_2");

//      ========================== PLASTER ==========================
        blockWithItem(ModBlocks.PLASTER_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.PLASTER_STAIRS.get()), blockTexture(ModBlocks.PLASTER_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.PLASTER_SLAB.get()), blockTexture(ModBlocks.PLASTER_BLOCK.get()), blockTexture(ModBlocks.PLASTER_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.PLASTER_BUTTON.get()), blockTexture(ModBlocks.PLASTER_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.PLASTER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.PLASTER_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.PLASTER_FENCE.get()), blockTexture(ModBlocks.PLASTER_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.PLASTER_FENCE_DOOR.get()), blockTexture(ModBlocks.PLASTER_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.PLASTER_WALL.get()), blockTexture(ModBlocks.PLASTER_BLOCK.get()));

        blockWithItem(ModBlocks.BLUE_PLASTER_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.BLUE_PLASTER_STAIRS.get()), blockTexture(ModBlocks.BLUE_PLASTER_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.BLUE_PLASTER_SLAB.get()), blockTexture(ModBlocks.BLUE_PLASTER_BLOCK.get()), blockTexture(ModBlocks.BLUE_PLASTER_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.BLUE_PLASTER_BUTTON.get()), blockTexture(ModBlocks.BLUE_PLASTER_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.BLUE_PLASTER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.BLUE_PLASTER_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.BLUE_PLASTER_FENCE.get()), blockTexture(ModBlocks.BLUE_PLASTER_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.BLUE_PLASTER_FENCE_DOOR.get()), blockTexture(ModBlocks.BLUE_PLASTER_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.BLUE_PLASTER_WALL.get()), blockTexture(ModBlocks.BLUE_PLASTER_BLOCK.get()));

        blockWithItem(ModBlocks.DARK_BLUE_PLASTER_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.DARK_BLUE_PLASTER_STAIRS.get()), blockTexture(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.DARK_BLUE_PLASTER_SLAB.get()), blockTexture(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get()), blockTexture(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.DARK_BLUE_PLASTER_BUTTON.get()), blockTexture(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.DARK_BLUE_PLASTER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.DARK_BLUE_PLASTER_FENCE.get()), blockTexture(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.DARK_BLUE_PLASTER_FENCE_DOOR.get()), blockTexture(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_BLUE_PLASTER_WALL.get()), blockTexture(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get()));

        blockWithItem(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_BLUE_PLASTER_STAIRS.get()), blockTexture(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.LIGHT_BLUE_PLASTER_SLAB.get()), blockTexture(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get()), blockTexture(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.LIGHT_BLUE_PLASTER_BUTTON.get()), blockTexture(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.LIGHT_BLUE_PLASTER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.LIGHT_BLUE_PLASTER_FENCE.get()), blockTexture(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.LIGHT_BLUE_PLASTER_FENCE_DOOR.get()), blockTexture(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_BLUE_PLASTER_WALL.get()), blockTexture(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get()));

        blockWithItem(ModBlocks.GREEN_PLASTER_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.GREEN_PLASTER_STAIRS.get()), blockTexture(ModBlocks.GREEN_PLASTER_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.GREEN_PLASTER_SLAB.get()), blockTexture(ModBlocks.GREEN_PLASTER_BLOCK.get()), blockTexture(ModBlocks.GREEN_PLASTER_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.GREEN_PLASTER_BUTTON.get()), blockTexture(ModBlocks.GREEN_PLASTER_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.GREEN_PLASTER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.GREEN_PLASTER_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.GREEN_PLASTER_FENCE.get()), blockTexture(ModBlocks.GREEN_PLASTER_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.GREEN_PLASTER_FENCE_DOOR.get()), blockTexture(ModBlocks.GREEN_PLASTER_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.GREEN_PLASTER_WALL.get()), blockTexture(ModBlocks.GREEN_PLASTER_BLOCK.get()));

        blockWithItem(ModBlocks.DARK_GREEN_PLASTER_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.DARK_GREEN_PLASTER_STAIRS.get()), blockTexture(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.DARK_GREEN_PLASTER_SLAB.get()), blockTexture(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()), blockTexture(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.DARK_GREEN_PLASTER_BUTTON.get()), blockTexture(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.DARK_GREEN_PLASTER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.DARK_GREEN_PLASTER_FENCE.get()), blockTexture(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.DARK_GREEN_PLASTER_FENCE_DOOR.get()), blockTexture(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.DARK_GREEN_PLASTER_WALL.get()), blockTexture(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()));

        blockWithItem(ModBlocks.RED_PLASTER_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.RED_PLASTER_STAIRS.get()), blockTexture(ModBlocks.RED_PLASTER_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.RED_PLASTER_SLAB.get()), blockTexture(ModBlocks.RED_PLASTER_BLOCK.get()), blockTexture(ModBlocks.RED_PLASTER_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.RED_PLASTER_BUTTON.get()), blockTexture(ModBlocks.RED_PLASTER_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.RED_PLASTER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.RED_PLASTER_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.RED_PLASTER_FENCE.get()), blockTexture(ModBlocks.RED_PLASTER_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.RED_PLASTER_FENCE_DOOR.get()), blockTexture(ModBlocks.RED_PLASTER_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.RED_PLASTER_WALL.get()), blockTexture(ModBlocks.RED_PLASTER_BLOCK.get()));

        blockWithItem(ModBlocks.SCARLET_PLASTER_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.SCARLET_PLASTER_STAIRS.get()), blockTexture(ModBlocks.SCARLET_PLASTER_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.SCARLET_PLASTER_SLAB.get()), blockTexture(ModBlocks.SCARLET_PLASTER_BLOCK.get()), blockTexture(ModBlocks.SCARLET_PLASTER_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.SCARLET_PLASTER_BUTTON.get()), blockTexture(ModBlocks.SCARLET_PLASTER_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.SCARLET_PLASTER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.SCARLET_PLASTER_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.SCARLET_PLASTER_FENCE.get()), blockTexture(ModBlocks.SCARLET_PLASTER_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.SCARLET_PLASTER_FENCE_DOOR.get()), blockTexture(ModBlocks.SCARLET_PLASTER_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.SCARLET_PLASTER_WALL.get()), blockTexture(ModBlocks.SCARLET_PLASTER_BLOCK.get()));

        blockWithItem(ModBlocks.YELLOW_PLASTER_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.YELLOW_PLASTER_STAIRS.get()), blockTexture(ModBlocks.YELLOW_PLASTER_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.YELLOW_PLASTER_SLAB.get()), blockTexture(ModBlocks.YELLOW_PLASTER_BLOCK.get()), blockTexture(ModBlocks.YELLOW_PLASTER_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.YELLOW_PLASTER_BUTTON.get()), blockTexture(ModBlocks.YELLOW_PLASTER_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.YELLOW_PLASTER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.YELLOW_PLASTER_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.YELLOW_PLASTER_FENCE.get()), blockTexture(ModBlocks.YELLOW_PLASTER_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.YELLOW_PLASTER_FENCE_DOOR.get()), blockTexture(ModBlocks.YELLOW_PLASTER_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.YELLOW_PLASTER_WALL.get()), blockTexture(ModBlocks.YELLOW_PLASTER_BLOCK.get()));

        blockWithItem(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.LIGHT_YELLOW_PLASTER_STAIRS.get()), blockTexture(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.LIGHT_YELLOW_PLASTER_SLAB.get()), blockTexture(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get()), blockTexture(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get()));
        buttonBlock(((ButtonBlock) ModBlocks.LIGHT_YELLOW_PLASTER_BUTTON.get()), blockTexture(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.LIGHT_YELLOW_PLASTER_PRESSURE_PLATE.get()), blockTexture(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get()));
        fenceBlock(((FenceBlock) ModBlocks.LIGHT_YELLOW_PLASTER_FENCE.get()), blockTexture(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.LIGHT_YELLOW_PLASTER_FENCE_DOOR.get()), blockTexture(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get()));
        wallBlock(((WallBlock) ModBlocks.LIGHT_YELLOW_PLASTER_WALL.get()), blockTexture(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get()));

//      ============================= TUFF =============================
        stairsBlock(((StairBlock) ModBlocks.TUFF_STAIRS.get()), blockTexture(Blocks.TUFF));
        slabBlock(((SlabBlock) ModBlocks.TUFF_SLAB.get()), blockTexture(Blocks.TUFF), blockTexture(Blocks.TUFF));
        buttonBlock(((ButtonBlock) ModBlocks.TUFF_BUTTON.get()), blockTexture(Blocks.TUFF));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.TUFF_PRESSURE_PLATE.get()), blockTexture(Blocks.TUFF));
        fenceBlock(((FenceBlock) ModBlocks.TUFF_FENCE.get()), blockTexture(Blocks.TUFF));
        fenceGateBlock(((FenceGateBlock) ModBlocks.TUFF_FENCE_DOOR.get()), blockTexture(Blocks.TUFF));
        wallBlock(((WallBlock) ModBlocks.TUFF_WALL.get()), blockTexture(Blocks.TUFF));

//      ============================= SMOOTH SANDSTONE =============================
        wallBlock(((WallBlock) ModBlocks.SMOOTH_SANDSTONE_WALL.get()), new ResourceLocation("minecraft", "block/sandstone_top"));
        wallBlock(((WallBlock) ModBlocks.SMOOTH_RED_SANDSTONE_WALL.get()), new ResourceLocation("minecraft", "block/red_sandstone_top"));


//      ========================== LIMESTONE ==========================
        blockWithItem(ModBlocks.LIMESTONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.LIMESTONE_STAIRS.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.LIMESTONE_SLAB.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.LIMESTONE_BUTTON.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.LIMESTONE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.LIMESTONE_FENCE.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.LIMESTONE_FENCE_DOOR.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.LIMESTONE_WALL.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));

//      ========================== TERRACOTTA ==========================
        stairsBlock(((StairBlock) ModBlocks.TERRACOTTA_STAIRS.get()), blockTexture(Blocks.TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.TERRACOTTA_SLAB.get()), blockTexture(Blocks.TERRACOTTA), blockTexture(Blocks.TERRACOTTA));
        fenceBlock(((FenceBlock) ModBlocks.TERRACOTTA_FENCE.get()), blockTexture(Blocks.TERRACOTTA));
        fenceGateBlock(((FenceGateBlock) ModBlocks.TERRACOTTA_FENCE_DOOR.get()), blockTexture(Blocks.TERRACOTTA));
        wallBlock(((WallBlock) ModBlocks.TERRACOTTA_WALL.get()), blockTexture(Blocks.TERRACOTTA));

        stairsBlock(((StairBlock) ModBlocks.WHITE_TERRACOTTA_STAIRS.get()), blockTexture(Blocks.WHITE_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.WHITE_TERRACOTTA_SLAB.get()), blockTexture(Blocks.WHITE_TERRACOTTA), blockTexture(Blocks.WHITE_TERRACOTTA));
        fenceBlock(((FenceBlock) ModBlocks.WHITE_TERRACOTTA_FENCE.get()), blockTexture(Blocks.WHITE_TERRACOTTA));
        fenceGateBlock(((FenceGateBlock) ModBlocks.WHITE_TERRACOTTA_FENCE_DOOR.get()), blockTexture(Blocks.WHITE_TERRACOTTA));
        wallBlock(((WallBlock) ModBlocks.WHITE_TERRACOTTA_WALL.get()), blockTexture(Blocks.WHITE_TERRACOTTA));

        stairsBlock(((StairBlock) ModBlocks.ORANGE_TERRACOTTA_STAIRS.get()), blockTexture(Blocks.ORANGE_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.ORANGE_TERRACOTTA_SLAB.get()), blockTexture(Blocks.ORANGE_TERRACOTTA), blockTexture(Blocks.ORANGE_TERRACOTTA));
        fenceBlock(((FenceBlock) ModBlocks.ORANGE_TERRACOTTA_FENCE.get()), blockTexture(Blocks.ORANGE_TERRACOTTA));
        fenceGateBlock(((FenceGateBlock) ModBlocks.ORANGE_TERRACOTTA_FENCE_DOOR.get()), blockTexture(Blocks.ORANGE_TERRACOTTA));
        wallBlock(((WallBlock) ModBlocks.ORANGE_TERRACOTTA_WALL.get()), blockTexture(Blocks.ORANGE_TERRACOTTA));

        stairsBlock(((StairBlock) ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get()), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get()), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        fenceBlock(((FenceBlock) ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE.get()), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        fenceGateBlock(((FenceGateBlock) ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_DOOR.get()), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));
        wallBlock(((WallBlock) ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get()), blockTexture(Blocks.LIGHT_BLUE_TERRACOTTA));

        stairsBlock(((StairBlock) ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get()), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get()), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        fenceBlock(((FenceBlock) ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE.get()), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        fenceGateBlock(((FenceGateBlock) ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_DOOR.get()), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));
        wallBlock(((WallBlock) ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get()), blockTexture(Blocks.LIGHT_GRAY_TERRACOTTA));

        stairsBlock(((StairBlock) ModBlocks.RED_TERRACOTTA_STAIRS.get()), blockTexture(Blocks.RED_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.RED_TERRACOTTA_SLAB.get()), blockTexture(Blocks.RED_TERRACOTTA), blockTexture(Blocks.RED_TERRACOTTA));
        fenceBlock(((FenceBlock) ModBlocks.RED_TERRACOTTA_FENCE.get()), blockTexture(Blocks.RED_TERRACOTTA));
        fenceGateBlock(((FenceGateBlock) ModBlocks.RED_TERRACOTTA_FENCE_DOOR.get()), blockTexture(Blocks.RED_TERRACOTTA));
        wallBlock(((WallBlock) ModBlocks.RED_TERRACOTTA_WALL.get()), blockTexture(Blocks.RED_TERRACOTTA));

        stairsBlock(((StairBlock) ModBlocks.BLACK_TERRACOTTA_STAIRS.get()), blockTexture(Blocks.BLACK_TERRACOTTA));
        slabBlock(((SlabBlock) ModBlocks.BLACK_TERRACOTTA_SLAB.get()), blockTexture(Blocks.BLACK_TERRACOTTA), blockTexture(Blocks.BLACK_TERRACOTTA));
        fenceBlock(((FenceBlock) ModBlocks.BLACK_TERRACOTTA_FENCE.get()), blockTexture(Blocks.BLACK_TERRACOTTA));
        fenceGateBlock(((FenceGateBlock) ModBlocks.BLACK_TERRACOTTA_FENCE_DOOR.get()), blockTexture(Blocks.BLACK_TERRACOTTA));
        wallBlock(((WallBlock) ModBlocks.BLACK_TERRACOTTA_WALL.get()), blockTexture(Blocks.BLACK_TERRACOTTA));


//      ========================== OTHERS ==========================
        blockWithItem(ModBlocks.RETICULA);
        blockWithItem(ModBlocks.LIGHT_RETICULA);
        blockWithItem(ModBlocks.MIXED_RETICULA);

        blockWithItem(ModBlocks.TEST_BLOCK_1);

        makeMultiFacedBlock(ModBlocks.LIME_BRICK_MIX, "lime_brick_mix");

        makeLintelBlock(ModBlocks.LINTEL_BLACK_TERRACOTTA, "lintel_black_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_BLUE_TERRACOTTA, "lintel_blue_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_BROWN_TERRACOTTA, "lintel_brown_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_CYAN_TERRACOTTA, "lintel_cyan_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_GRAY_TERRACOTTA, "lintel_gray_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_GREEN_TERRACOTTA, "lintel_green_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_LIGHT_BLUE_TERRACOTTA, "lintel_light_blue_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_LIGHT_GRAY_TERRACOTTA, "lintel_light_gray_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_LIME_TERRACOTTA, "lintel_lime_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_MAGENTA_TERRACOTTA, "lintel_magenta_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_ORANGE_TERRACOTTA, "lintel_orange_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_PINK_TERRACOTTA, "lintel_pink_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_PURPLE_TERRACOTTA, "lintel_purple_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_RED_TERRACOTTA, "lintel_red_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_TERRACOTTA, "lintel_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_WHITE_TERRACOTTA, "lintel_white_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_YELLOW_TERRACOTTA, "lintel_yellow_terracotta");
        makeLintelBlock(ModBlocks.LINTEL_BLUE_PLASTER_BLOCK, "lintel_blue_plaster_block");
        makeLintelBlock(ModBlocks.LINTEL_DARK_BLUE_PLASTER_BLOCK, "lintel_dark_blue_plaster_block");
        makeLintelBlock(ModBlocks.LINTEL_DARK_GREEN_PLASTER_BLOCK, "lintel_dark_green_plaster_block");
        makeLintelBlock(ModBlocks.LINTEL_GREEN_PLASTER_BLOCK, "lintel_green_plaster_block");
        makeLintelBlock(ModBlocks.LINTEL_LIGHT_BLUE_PLASTER_BLOCK, "lintel_light_blue_plaster_block");
        makeLintelBlock(ModBlocks.LINTEL_LIGHT_YELLOW_PLASTER_BLOCK, "lintel_light_yellow_plaster_block");
        makeLintelBlock(ModBlocks.LINTEL_PLASTER_BLOCK, "lintel_plaster_block");
        makeLintelBlock(ModBlocks.LINTEL_RED_PLASTER_BLOCK, "lintel_red_plaster_block");
        makeLintelBlock(ModBlocks.LINTEL_SCARLET_PLASTER_BLOCK, "lintel_scarlet_plaster_block");
        makeLintelBlock(ModBlocks.LINTEL_YELLOW_PLASTER_BLOCK, "lintel_yellow_plaster_block");
        makeLintelBlock(ModBlocks.LINTEL_BRICKS, "lintel_bricks");

//      DOUBLE CROPS:
//      ================================================================================================================
        makeCornCrop((CropBlock) ModBlocks.CORN_CROP.get(), "corn_stage_", "corn_stage_");

        makeOpiumCrop((CropBlock) ModBlocks.OPIUM_CROP.get(), "opium_stage_", "opium_stage_");

        makeTomatoCrop((CropBlock) ModBlocks.TOMATO_CROP.get(), "tomato_stage_", "tomato_stage_");

        makeSweetPotatoCrop((CropBlock) ModBlocks.SWEET_POTATO_CROP.get(), "sweet_potato_stage_", "sweet_potato_stage_");

//      SIMPLE CROPS:
//      ================================================================================================================
        makeFlaxCrop((CropBlock) ModBlocks.FLAX_CROP.get(), "flax_stage", "flax_stage");

        makeBarleyCrop((CropBlock) ModBlocks.BARLEY_CROP.get(), "barley_stage", "barley_stage");

        makeOatCrop((CropBlock) ModBlocks.OAT_CROP.get(), "oat_stage", "oat_stage");

        makeRyeCrop((CropBlock) ModBlocks.RYE_CROP.get(), "rye_stage", "rye_stage");

        makeLeekCrop((CropBlock) ModBlocks.LEEK_CROP.get(), "leek_stage", "leek_stage");

        makeGarlicCrop((CropBlock) ModBlocks.GARLIC_CROP.get(), "garlic_stage", "garlic_stage");

        makeOnionCrop((CropBlock) ModBlocks.ONION_CROP.get(), "onion_stage", "onion_stage");

        makeAsparagusCrop((CropBlock) ModBlocks.ASPARAGUS_CROP.get(), "asparagus_stage", "asparagus_stage");

        makeParsnipCrop((CropBlock) ModBlocks.PARSNIP_CROP.get(), "parsnip_stage", "parsnip_stage");

        makeCabbageCrop((CropBlock) ModBlocks.CABBAGE_CROP.get(), "cabbage_stage", "cabbage_stage");

        makeTurnipCrop((CropBlock) ModBlocks.TURNIP_CROP.get(), "turnip_stage", "turnip_stage");

//      COLUMN BLOCKS:
//      ================================================================================================================
        logBlock(((RotatedPillarBlock) ModBlocks.PILLAR_TEST.get()));
        blockItem(ModBlocks.PILLAR_TEST);

        makePlayerFacingBlock(ModBlocks.ORIENTABLE_TEST, "orientable_test");

        logBlock(((RotatedPillarBlock) ModBlocks.BLACK_FLOOR_TILE.get()));
        blockItem(ModBlocks.BLACK_FLOOR_TILE);
        makePlayerFacingBlock(ModBlocks.BLACK_FLOOR_TILE_CORNER, "black_floor_tile_corner");

        logBlock(((RotatedPillarBlock) ModBlocks.WHITE_DOT_TILE.get()));
        blockItem(ModBlocks.WHITE_DOT_TILE);
        makePlayerFacingBlock(ModBlocks.WHITE_DOT_TILE_CORNER, "white_dot_tile_corner");

        logBlock(((RotatedPillarBlock) ModBlocks.CIRCLE_BLACK_TILE.get()));
        blockItem(ModBlocks.CIRCLE_BLACK_TILE);
        makePlayerFacingBlock(ModBlocks.CIRCLE_BLACK_TILE_CORNER, "circle_black_tile_corner");

        logBlock(((RotatedPillarBlock) ModBlocks.CIRCLE_WHITE_TILE.get()));
        blockItem(ModBlocks.CIRCLE_WHITE_TILE);
        makePlayerFacingBlock(ModBlocks.CIRCLE_WHITE_TILE_CORNER, "circle_white_tile_corner");

        logBlock(((RotatedPillarBlock) ModBlocks.DIAMOND_BLACK_TILE.get()));
        blockItem(ModBlocks.DIAMOND_BLACK_TILE);
        makePlayerFacingBlock(ModBlocks.DIAMOND_BLACK_TILE_CORNER, "diamond_black_tile_corner");

        logBlock(((RotatedPillarBlock) ModBlocks.DIAMOND_WHITE_TILE.get()));
        blockItem(ModBlocks.DIAMOND_WHITE_TILE);
        makePlayerFacingBlock(ModBlocks.DIAMOND_WHITE_TILE_CORNER, "diamond_white_tile_corner");

        logBlock(((RotatedPillarBlock) ModBlocks.DIAMOND_BLACK_AND_YELLOW_TILE.get()));
        blockItem(ModBlocks.DIAMOND_BLACK_AND_YELLOW_TILE);
        makePlayerFacingBlock(ModBlocks.DIAMOND_BLACK_AND_YELLOW_TILE_CORNER, "diamond_black_and_yellow_tile_corner");

        logBlock(((RotatedPillarBlock) ModBlocks.DIAMOND_PINK_TILE.get()));
        blockItem(ModBlocks.DIAMOND_PINK_TILE);
        makePlayerFacingBlock(ModBlocks.DIAMOND_PINK_TILE_CORNER, "diamond_pink_tile_corner");

        signBlock(((StandingSignBlock) ModBlocks.QUARTZ_SIGN.get()), ((WallSignBlock) ModBlocks.QUARTZ_WALL_SIGN.get()),
                blockTexture(ModBlocks.PLASTER_BLOCK.get()));
        hangingSignBlock(ModBlocks.QUARTZ_HANGING_SIGN.get(), ModBlocks.QUARTZ_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.PLASTER_BLOCK.get()));

        signBlock(((StandingSignBlock) ModBlocks.ANDESITE_SIGN.get()), ((WallSignBlock) ModBlocks.ANDESITE_WALL_SIGN.get()),
                blockTexture(ModBlocks.PLASTER_BLOCK.get()));
        hangingSignBlock(ModBlocks.ANDESITE_HANGING_SIGN.get(), ModBlocks.ANDESITE_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.PLASTER_BLOCK.get()));

        signBlock(((StandingSignBlock) ModBlocks.DIORITE_SIGN.get()), ((WallSignBlock) ModBlocks.DIORITE_WALL_SIGN.get()),
                blockTexture(ModBlocks.PLASTER_BLOCK.get()));
        hangingSignBlock(ModBlocks.DIORITE_HANGING_SIGN.get(), ModBlocks.DIORITE_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.PLASTER_BLOCK.get()));

        signBlock(((StandingSignBlock) ModBlocks.GRANITE_SIGN.get()), ((WallSignBlock) ModBlocks.GRANITE_WALL_SIGN.get()),
                blockTexture(ModBlocks.PLASTER_BLOCK.get()));
        hangingSignBlock(ModBlocks.GRANITE_HANGING_SIGN.get(), ModBlocks.GRANITE_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.PLASTER_BLOCK.get()));

//      ========================== WOOD SLABS ==========================
        getVariantBuilder(ModBlocks.OAK_WOOD_SLAB.get()).forAllStates(state -> {
            SlabType type = state.getValue(SlabBlock.TYPE);
            Direction.Axis axis = state.getValue(OrientableSlabBlock.AXIS);
            String typeName = type.getSerializedName(); // "bottom", "top", "double"
            String axisName = axis.getName(); // "x", "y", "z"
            if (type == SlabType.DOUBLE) {
                // Double slab uses cube_column model with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("oak_wood_double_slab_" + axisName, "minecraft:block/cube_column")
                                .texture("end", "minecraft:block/oak_log")
                                .texture("side", "instrumenta_brundisii:block/oak_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else if (type == SlabType.TOP) {
                // Top slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("oak_wood_slab_top_" + axisName, "minecraft:block/slab_top")
                                .texture("bottom", "minecraft:block/oak_log")
                                .texture("top", "minecraft:block/oak_log")
                                .texture("side", "instrumenta_brundisii:block/oak_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else {
                // Bottom slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("oak_wood_slab_bottom_" + axisName, "minecraft:block/slab")
                                .texture("bottom", "minecraft:block/oak_log")
                                .texture("top", "minecraft:block/oak_log")
                                .texture("side", "instrumenta_brundisii:block/oak_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            }
        });
        getVariantBuilder(ModBlocks.ACACIA_WOOD_SLAB.get()).forAllStates(state -> {
            SlabType type = state.getValue(SlabBlock.TYPE);
            Direction.Axis axis = state.getValue(OrientableSlabBlock.AXIS);
            String typeName = type.getSerializedName(); // "bottom", "top", "double"
            String axisName = axis.getName(); // "x", "y", "z"
            if (type == SlabType.DOUBLE) {
                // Double slab uses cube_column model with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("acacia_wood_double_slab_" + axisName, "minecraft:block/cube_column")
                                .texture("end", "minecraft:block/acacia_log")
                                .texture("side", "instrumenta_brundisii:block/acacia_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else if (type == SlabType.TOP) {
                // Top slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("acacia_wood_slab_top_" + axisName, "minecraft:block/slab_top")
                                .texture("bottom", "minecraft:block/acacia_log")
                                .texture("top", "minecraft:block/acacia_log")
                                .texture("side", "instrumenta_brundisii:block/acacia_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else {
                // Bottom slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("acacia_wood_slab_bottom_" + axisName, "minecraft:block/slab")
                                .texture("bottom", "minecraft:block/acacia_log")
                                .texture("top", "minecraft:block/acacia_log")
                                .texture("side", "instrumenta_brundisii:block/acacia_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            }
        });


        getVariantBuilder(ModBlocks.BIRCH_WOOD_SLAB.get()).forAllStates(state -> {
            SlabType type = state.getValue(SlabBlock.TYPE);
            Direction.Axis axis = state.getValue(OrientableSlabBlock.AXIS);
            String typeName = type.getSerializedName(); // "bottom", "top", "double"
            String axisName = axis.getName(); // "x", "y", "z"
            if (type == SlabType.DOUBLE) {
                // Double slab uses cube_column model with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("birch_wood_double_slab_" + axisName, "minecraft:block/cube_column")
                                .texture("end", "minecraft:block/birch_log")
                                .texture("side", "instrumenta_brundisii:block/birch_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else if (type == SlabType.TOP) {
                // Top slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("birch_wood_slab_top_" + axisName, "minecraft:block/slab_top")
                                .texture("bottom", "minecraft:block/birch_log")
                                .texture("top", "minecraft:block/birch_log")
                                .texture("side", "instrumenta_brundisii:block/birch_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else {
                // Bottom slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("birch_wood_slab_bottom_" + axisName, "minecraft:block/slab")
                                .texture("bottom", "minecraft:block/birch_log")
                                .texture("top", "minecraft:block/birch_log")
                                .texture("side", "instrumenta_brundisii:block/birch_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            }
        });


        getVariantBuilder(ModBlocks.CHERRY_WOOD_SLAB.get()).forAllStates(state -> {
            SlabType type = state.getValue(SlabBlock.TYPE);
            Direction.Axis axis = state.getValue(OrientableSlabBlock.AXIS);
            String typeName = type.getSerializedName(); // "bottom", "top", "double"
            String axisName = axis.getName(); // "x", "y", "z"
            if (type == SlabType.DOUBLE) {
                // Double slab uses cube_column model with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("cherry_wood_double_slab_" + axisName, "minecraft:block/cube_column")
                                .texture("end", "minecraft:block/cherry_log")
                                .texture("side", "instrumenta_brundisii:block/cherry_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else if (type == SlabType.TOP) {
                // Top slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("cherry_wood_slab_top_" + axisName, "minecraft:block/slab_top")
                                .texture("bottom", "minecraft:block/cherry_log")
                                .texture("top", "minecraft:block/cherry_log")
                                .texture("side", "instrumenta_brundisii:block/cherry_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else {
                // Bottom slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("cherry_wood_slab_bottom_" + axisName, "minecraft:block/slab")
                                .texture("bottom", "minecraft:block/cherry_log")
                                .texture("top", "minecraft:block/cherry_log")
                                .texture("side", "instrumenta_brundisii:block/cherry_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            }
        });

        getVariantBuilder(ModBlocks.JUNGLE_WOOD_SLAB.get()).forAllStates(state -> {
            SlabType type = state.getValue(SlabBlock.TYPE);
            Direction.Axis axis = state.getValue(OrientableSlabBlock.AXIS);
            String typeName = type.getSerializedName(); // "bottom", "top", "double"
            String axisName = axis.getName(); // "x", "y", "z"
            if (type == SlabType.DOUBLE) {
                // Double slab uses cube_column model with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("jungle_wood_double_slab_" + axisName, "minecraft:block/cube_column")
                                .texture("end", "minecraft:block/jungle_log")
                                .texture("side", "instrumenta_brundisii:block/jungle_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else if (type == SlabType.TOP) {
                // Top slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("jungle_wood_slab_top_" + axisName, "minecraft:block/slab_top")
                                .texture("bottom", "minecraft:block/jungle_log")
                                .texture("top", "minecraft:block/jungle_log")
                                .texture("side", "instrumenta_brundisii:block/jungle_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else {
                // Bottom slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("jungle_wood_slab_bottom_" + axisName, "minecraft:block/slab")
                                .texture("bottom", "minecraft:block/jungle_log")
                                .texture("top", "minecraft:block/jungle_log")
                                .texture("side", "instrumenta_brundisii:block/jungle_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            }
        });


        getVariantBuilder(ModBlocks.MANGROVE_WOOD_SLAB.get()).forAllStates(state -> {
            SlabType type = state.getValue(SlabBlock.TYPE);
            Direction.Axis axis = state.getValue(OrientableSlabBlock.AXIS);
            String typeName = type.getSerializedName(); // "bottom", "top", "double"
            String axisName = axis.getName(); // "x", "y", "z"
            if (type == SlabType.DOUBLE) {
                // Double slab uses cube_column model with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("mangrove_wood_double_slab_" + axisName, "minecraft:block/cube_column")
                                .texture("end", "minecraft:block/mangrove_log")
                                .texture("side", "instrumenta_brundisii:block/mangrove_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else if (type == SlabType.TOP) {
                // Top slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("mangrove_wood_slab_top_" + axisName, "minecraft:block/slab_top")
                                .texture("bottom", "minecraft:block/mangrove_log")
                                .texture("top", "minecraft:block/mangrove_log")
                                .texture("side", "instrumenta_brundisii:block/mangrove_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else {
                // Bottom slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("mangrove_wood_slab_bottom_" + axisName, "minecraft:block/slab")
                                .texture("bottom", "minecraft:block/mangrove_log")
                                .texture("top", "minecraft:block/mangrove_log")
                                .texture("side", "instrumenta_brundisii:block/mangrove_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            }
        });

        getVariantBuilder(ModBlocks.DARK_OAK_WOOD_SLAB.get()).forAllStates(state -> {
            SlabType type = state.getValue(SlabBlock.TYPE);
            Direction.Axis axis = state.getValue(OrientableSlabBlock.AXIS);
            String typeName = type.getSerializedName(); // "bottom", "top", "double"
            String axisName = axis.getName(); // "x", "y", "z"
            if (type == SlabType.DOUBLE) {
                // Double slab uses cube_column model with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("dark_oak_wood_double_slab_" + axisName, "minecraft:block/cube_column")
                                .texture("end", "minecraft:block/dark_oak_log")
                                .texture("side", "instrumenta_brundisii:block/dark_oak_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else if (type == SlabType.TOP) {
                // Top slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("dark_oak_wood_slab_top_" + axisName, "minecraft:block/slab_top")
                                .texture("bottom", "minecraft:block/dark_oak_log")
                                .texture("top", "minecraft:block/dark_oak_log")
                                .texture("side", "instrumenta_brundisii:block/dark_oak_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else {
                // Bottom slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("dark_oak_wood_slab_bottom_" + axisName, "minecraft:block/slab")
                                .texture("bottom", "minecraft:block/dark_oak_log")
                                .texture("top", "minecraft:block/dark_oak_log")
                                .texture("side", "instrumenta_brundisii:block/dark_oak_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            }
        });


        getVariantBuilder(ModBlocks.SPRUCE_WOOD_SLAB.get()).forAllStates(state -> {
            SlabType type = state.getValue(SlabBlock.TYPE);
            Direction.Axis axis = state.getValue(OrientableSlabBlock.AXIS);
            String typeName = type.getSerializedName(); // "bottom", "top", "double"
            String axisName = axis.getName(); // "x", "y", "z"
            if (type == SlabType.DOUBLE) {
                // Double slab uses cube_column model with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("spruce_wood_double_slab_" + axisName, "minecraft:block/cube_column")
                                .texture("end", "minecraft:block/spruce_log")
                                .texture("side", "instrumenta_brundisii:block/spruce_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else if (type == SlabType.TOP) {
                // Top slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("spruce_wood_slab_top_" + axisName, "minecraft:block/slab_top")
                                .texture("bottom", "minecraft:block/spruce_log")
                                .texture("top", "minecraft:block/spruce_log")
                                .texture("side", "instrumenta_brundisii:block/spruce_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            } else {
                // Bottom slab with custom side texture
                return ConfiguredModel.builder()
                        .modelFile(models().withExistingParent("spruce_wood_slab_bottom_" + axisName, "minecraft:block/slab")
                                .texture("bottom", "minecraft:block/spruce_log")
                                .texture("top", "minecraft:block/spruce_log")
                                .texture("side", "instrumenta_brundisii:block/spruce_log_slab_side")) // Replace side texture
                        .rotationY(getRotationForAxis(axis)) // Adjust rotation for side textures
                        .build();
            }
        });
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }

    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }


    public void makeCornCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> cornStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] cornStates(BlockState state, CropBlock block, String modelName, String textureName) {
        int age = state.getValue(CornCropBlock.AGE);
        ModelFile model = models().withExistingParent(modelName + age, mcLoc("block/cross"))
                .texture("cross", modLoc("block/" + textureName + age));
        return new ConfiguredModel[] { new ConfiguredModel(model, 0, 0, true) };
    }

//  OPIUM
    public void makeOpiumCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> opiumStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] opiumStates(BlockState state, CropBlock block, String modelName, String textureName) {
        int age = state.getValue(OpiumCropBlock.AGE);
        ModelFile model = models().withExistingParent(modelName + age, mcLoc("block/cross"))
                .texture("cross", modLoc("block/" + textureName + age)).renderType("cutout");
        return new ConfiguredModel[] { new ConfiguredModel(model, 0, 0, true) };
    }

//  TOMATO
    public void makeTomatoCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> tomatoStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] tomatoStates(BlockState state, CropBlock block, String modelName, String textureName) {
        int age = state.getValue(TomatoCropBlock.AGE);
        ModelFile model = models().withExistingParent(modelName + age, mcLoc("block/cross"))
                .texture("cross", modLoc("block/" + textureName + age)).renderType("cutout");
        return new ConfiguredModel[] { new ConfiguredModel(model, 0, 0, true) };
    }

//  SWEET POTATO
    public void makeSweetPotatoCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> sweetPotatoStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] sweetPotatoStates(BlockState state, CropBlock block, String modelName, String textureName) {
        int age = state.getValue(SweetPotatoCropBlock.AGE);
        ModelFile model = models().withExistingParent(modelName + age, mcLoc("block/cross"))
                .texture("cross", modLoc("block/" + textureName + age)).renderType("cutout");
        return new ConfiguredModel[] { new ConfiguredModel(model, 0, 0, true) };
    }

//  FLAX
    public void makeFlaxCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> flaxStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] flaxStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((FlaxCropBlock) block).getAgeProperty()),
                new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + textureName + state.getValue(((FlaxCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
    }

//  BARLEY
    public void makeBarleyCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> barleyStates(state, block, modelName, textureName);
        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] barleyStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((BarleyCropBlock) block).getAgeProperty()),
                new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + textureName + state.getValue(((BarleyCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

//  OAT
    public void makeOatCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> oatStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] oatStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((OatCropBlock) block).getAgeProperty()),
                new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + textureName + state.getValue(((OatCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

//  RYE
    public void makeRyeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> ryeStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] ryeStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((RyeCropBlock) block).getAgeProperty()),
                new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + textureName + state.getValue(((RyeCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

//  LEEK
    public void makeLeekCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> leekStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] leekStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((LeekCropBlock) block).getAgeProperty()),
                new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + textureName + state.getValue(((LeekCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

//  GARLIC
    public void makeGarlicCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> garlicStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] garlicStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((GarlicCropBlock) block).getAgeProperty()),
                new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + textureName + state.getValue(((GarlicCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

//  ONION
    public void makeOnionCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> onionStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] onionStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((OnionCropBlock) block).getAgeProperty()),
                new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + textureName + state.getValue(((OnionCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }


//  ASPARAGUS
    public void makeAsparagusCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> asparagusStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] asparagusStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((AsparagusCropBlock) block).getAgeProperty()),
                new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + textureName + state.getValue(((AsparagusCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }


//  PARSNIP
    public void makeParsnipCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> parsnipStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] parsnipStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((ParsnipCropBlock) block).getAgeProperty()),
                new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + textureName + state.getValue(((ParsnipCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //  CABBAGE
    public void makeCabbageCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> cabbageStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] cabbageStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CabbageCropBlock) block).getAgeProperty()),
                new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + textureName + state.getValue(((CabbageCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    //  TURNIP
    public void makeTurnipCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> turnipStates(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }
    private ConfiguredModel[] turnipStates(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((TurnipCropBlock) block).getAgeProperty()),
                new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + textureName + state.getValue(((TurnipCropBlock) block).getAgeProperty()))).renderType("cutout"));
        return models;
    }

    private void makePlayerFacingBlock(RegistryObject<Block> blockRegistryObject, String textureBase) {
        Block block = blockRegistryObject.get();
        ResourceLocation blockName = blockRegistryObject.getId(); // Get the block's registry name

        // Assuming you have a simple cube model that uses the same texture on all sides.
        ModelFile blockModel = models().withExistingParent(blockName.getPath(), "minecraft:block/cube_bottom_top")
                .texture("bottom", modLoc("block/" + textureBase + "_bottom"))
                .texture("side", modLoc("block/" + textureBase))
                .texture("top", modLoc("block/" + textureBase + "_top"));

        // Define block states for different horizontal facings
        getVariantBuilder(block).forAllStates(state -> {
            Direction dir = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
            int yRot = switch (dir) {
                case EAST -> 90;
                case SOUTH -> 180;
                case WEST -> 270;
                default -> 0;
            };
            return ConfiguredModel.builder()
                    .modelFile(blockModel)
                    .rotationY(yRot)
                    .build();
        });

        simpleBlockItem(block, blockModel);  // Generate an item model for this block.
    }

    private void makeMultiFacedBlock(RegistryObject<Block> blockRegistryObject, String textureBase) {
        Block block = blockRegistryObject.get();
        ResourceLocation blockName = blockRegistryObject.getId(); // Get the block's registry name

        // Define the model with top, side, and bottom textures
        ModelFile blockModel = models().withExistingParent(blockName.getPath(), "minecraft:block/cube_bottom_top")
                .texture("bottom", modLoc("block/" + textureBase + "_bottom"))
                .texture("side", modLoc("block/" + textureBase))
                .texture("top", modLoc("block/" + textureBase + "_top"));

        // Register the block model
        simpleBlockWithItem(block, blockModel);
        // Generate an item model for this block that uses the block model
        itemModels().withExistingParent(blockName.getPath(), modLoc("block/" + blockName.getPath()));
    }

    private void makeLintelBlock(RegistryObject<Block> blockRegistryObject, String textureBase) {
        Block block = blockRegistryObject.get();
        ResourceLocation blockName = blockRegistryObject.getId(); // Get the block's registry name

    //  MOD BRICKS:
        if (textureBase.contains("plaster")) {
            ModelFile blockModel = models().withExistingParent(blockName.getPath(), "minecraft:block/cube_bottom_top")
                    .texture("bottom", mcLoc("block/oak_log"))
                    .texture("side", modLoc("block/" + textureBase))
                    .texture("top", modLoc("block/" + textureBase.replace("lintel_", "")));

            // Register the block model
            simpleBlockWithItem(block, blockModel);
            // Generate an item model for this block that uses the block model
            itemModels().withExistingParent(blockName.getPath(), modLoc("block/" + blockName.getPath()));

    //  VANILLA BRICKS:
        } else if (textureBase.contains("terracotta") || textureBase.contains("bricks")) {
            String modifiedTextureBase = textureBase.replace("lintel_", "");
            ModelFile blockModel = models().withExistingParent(blockName.getPath(), "minecraft:block/cube_bottom_top")
                    .texture("bottom", mcLoc("block/oak_log"))
                    .texture("side", modLoc("block/" + textureBase))
                    .texture("top", mcLoc("block/"+modifiedTextureBase));

            // Register the block model
            simpleBlockWithItem(block, blockModel);
            // Generate an item model for this block that uses the block model
            itemModels().withExistingParent(blockName.getPath(), modLoc("block/" + blockName.getPath()));

    //  SPECIFIC TEXTURE BRICKS:
        } else {
            ModelFile blockModel = models().withExistingParent(blockName.getPath(), "minecraft:block/cube_bottom_top")
                    .texture("bottom", mcLoc("block/oak_log"))
                    .texture("side", modLoc("block/" + textureBase))
                    .texture("top", modLoc("block/" + textureBase + "_top"));

            // Register the block model
            simpleBlockWithItem(block, blockModel);
            // Generate an item model for this block that uses the block model
            itemModels().withExistingParent(blockName.getPath(), modLoc("block/" + blockName.getPath()));
        }
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(instrumentaBrundisii.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

//    This lets you pass the registry Object and creates a custom block and an item for it
    private void  blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    // Helper method to determine rotation based on axis for wood slabs
    private int getRotationForAxis(Direction.Axis axis) {
        return switch (axis) {
            case X -> 90; // Rotate 90 degrees for X-axis
            case Z -> 0;  // No rotation for Z-axis
            default -> 0; // Default (Y-axis)
        };
    }

    private void registerMultifaceBlock(Block block, ResourceLocation texture) {
        // Generate a blockstate for a multiface block
        getMultipartBuilder(block)
                .part().modelFile(multifaceModel(block, texture)).addModel().condition(BlockStateProperties.NORTH, true).end()
                .part().modelFile(multifaceModel(block, texture)).addModel().condition(BlockStateProperties.SOUTH, true).end()
                .part().modelFile(multifaceModel(block, texture)).addModel().condition(BlockStateProperties.EAST, true).end()
                .part().modelFile(multifaceModel(block, texture)).addModel().condition(BlockStateProperties.WEST, true).end()
                .part().modelFile(multifaceModel(block, texture)).addModel().condition(BlockStateProperties.UP, true).end()
                .part().modelFile(multifaceModel(block, texture)).addModel().condition(BlockStateProperties.DOWN, true).end();
    }

    private ModelFile multifaceModel(Block block, ResourceLocation texture) {
        String blockName = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();
        return models().withExistingParent(blockName, mcLoc("block/block"))
                .texture("particle", texture)
                .texture("up", texture)
                .texture("down", texture)
                .texture("north", texture)
                .texture("south", texture)
                .texture("east", texture)
                .texture("west", texture);
    }

    /**
     * Generates a blockstate and model for a lichen-like block.
     */
    private void makeLichenLikeBlock(RegistryObject<Block> blockRegistryObject, String textureName) {
        // Get block and resource name
        Block block = blockRegistryObject.get();
        ResourceLocation blockName = blockRegistryObject.getId();

        // Define the block model (for in-world appearance)
        ModelFile blockModel = models().withExistingParent(blockName.getPath(), "minecraft:block/block")
                .texture("particle", modLoc("block/" + textureName))
                .texture("bougainvillea", modLoc("block/" + textureName))
                .element()
                .from(0, 0, 0.1f) // Very thin geometry like glow_lichen
                .to(16, 16, 0.1f)
                .face(Direction.NORTH).uvs(16, 0, 0, 16).texture("#bougainvillea").end()
                .face(Direction.SOUTH).uvs(0, 0, 16, 16).texture("#bougainvillea").end()
                .end();

        // Generate the blockstate JSON with rotation logic
        getVariantBuilder(block).forAllStates(state -> {
            ConfiguredModel.Builder<?> modelBuilder = ConfiguredModel.builder()
                    .modelFile(blockModel);

            // Check all possible faces for which face is active
            for (Direction direction : Direction.values()) {
                BooleanProperty property = MultifaceBlock.getFaceProperty(direction);
                if (state.getValue(property)) {
                    modelBuilder.rotationX(calculateXRotation(direction))
                            .rotationY(calculateYRotation(direction));
                    break; // Stop after finding the first active face
                }
            }

            return modelBuilder.build();
        });

        // Define the item model (for inventory representation)
        itemModels().getBuilder(blockName.getPath())
                .parent(models().getExistingFile(mcLoc("item/generated")))
                .texture("layer0", modLoc("block/" + textureName));
    }

    /**
     * Calculates the X rotation based on the block's direction.
     *
     * @param direction The direction of the block face.
     * @return The X-axis rotation value.
     */
    private int calculateXRotation(Direction direction) {
        return switch (direction) {
            case UP -> -90;  // Rotated upwards
            case DOWN -> 90; // Rotated downwards
            default -> 0;    // No X-axis rotation for horizontal faces
        };
    }

    /**
     * Calculates the Y rotation based on the block's direction.
     *
     * @param direction The direction of the block face.
     * @return The Y-axis rotation value.
     */
    private int calculateYRotation(Direction direction) {
        return switch (direction) {
            case SOUTH -> 180;  // Rotated towards the south
            case WEST -> 270;   // Rotated towards the west
            case EAST -> 90;    // Rotated towards the east
            default -> 0;       // Default is north-facing
        };
    }

}
