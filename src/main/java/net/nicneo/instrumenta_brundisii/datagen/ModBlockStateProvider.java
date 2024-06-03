package net.nicneo.instrumenta_brundisii.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.BlockModelBuilder;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.block.custom.*;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;

import java.util.function.Function;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, instrumentaBrundisii.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
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

//      CROPS:
//      ================================================================================================================
        makeCornCrop((CropBlock) ModBlocks.CORN_CROP.get(), "corn_stage_", "corn_stage_");

        makeFlaxCrop((CropBlock) ModBlocks.FLAX_CROP.get(), "flax_stage", "flax_stage");

        makeBarleyCrop((CropBlock) ModBlocks.BARLEY_CROP.get(), "barley_stage", "barley_stage");

        makeOatCrop((CropBlock) ModBlocks.OAT_CROP.get(), "oat_stage", "oat_stage");

        makeRyeCrop((CropBlock) ModBlocks.RYE_CROP.get(), "rye_stage", "rye_stage");

        makeLeekCrop((CropBlock) ModBlocks.LEEK_CROP.get(), "leek_stage", "leek_stage");

        makeGarlicCrop((CropBlock) ModBlocks.GARLIC_CROP.get(), "garlic_stage", "garlic_stage");

        makeOnionCrop((CropBlock) ModBlocks.ONION_CROP.get(), "onion_stage", "onion_stage");



//      COLUMN BLOCKS:
//      ================================================================================================================
        logBlock(((RotatedPillarBlock) ModBlocks.PILLAR_TEST.get()));
        blockItem(ModBlocks.PILLAR_TEST);

        logBlock(((RotatedPillarBlock) ModBlocks.BLACK_FLOOR_TILE.get()));
        blockItem(ModBlocks.BLACK_FLOOR_TILE);

        makePlayerFacingBlock(ModBlocks.BLACK_FLOOR_TILE_CORNER, "black_floor_tile_corner");
        makePlayerFacingBlock(ModBlocks.ORIENTABLE_TEST, "orientable_test");

    }



//    CORN

//    public void makeCornCrop(CropBlock block, String modelName, String textureName) {
//        Function<BlockState, ConfiguredModel[]> function = state -> cornStates(state, block, modelName, textureName);
//
//        getVariantBuilder(block).forAllStates(function);
//    }
//
//    private ConfiguredModel[] cornStates(BlockState state, CropBlock block, String modelName, String textureName) {
//        ConfiguredModel[] models = new ConfiguredModel[1];
//        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((CornCropBlock) block).getAgeProperty()),
//                new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + textureName + state.getValue(((CornCropBlock) block).getAgeProperty()))).renderType("cutout"));
//
//        return models;
//    }

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

}
