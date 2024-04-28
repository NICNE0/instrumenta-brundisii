package net.nicneo.instrumenta_brundisii.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;

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

//      ========================== LIMESTONE ==========================
        blockWithItem(ModBlocks.LIMESTONE_BRICKS);
        stairsBlock(((StairBlock) ModBlocks.LIMESTONE_STAIRS.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.LIMESTONE_SLAB.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.LIMESTONE_BUTTON.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.LIMESTONE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.LIMESTONE_FENCE.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.LIMESTONE_FENCE_DOOR.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.LIMESTONE_WALL.get()), blockTexture(ModBlocks.LIMESTONE_BRICKS.get()));

        blockWithItem(ModBlocks.RETICULA);
        blockWithItem(ModBlocks.LIGHT_RETICULA);
        blockWithItem(ModBlocks.LIME_BRICK_MIX);
        blockWithItem(ModBlocks.MIXED_RETICULA);


    }

//    This lets you pass the registry Object and creates a custom block and an item for it
    private void  blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}