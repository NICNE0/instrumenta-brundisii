package net.nicneo.instrumenta_brundisii.block;

import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.nicneo.instrumenta_brundisii.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, instrumentaBrundisii.MOD_ID);

//  This Section defines the new block, in this case it is copying the properties of another block, cobblestone,
//    just as in other cases, the name is defined first as a method using upper case and then it's internal
//    identifier in the registerBlock argument.
    public static final RegistryObject<Block> PLASTER_BLOCK = registerBlock("plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> PLASTER_STAIRS = registerBlock("plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.PLASTER_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> PLASTER_SLAB = registerBlock("plaster_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> PLASTER_BUTTON = registerBlock("plaster_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> PLASTER_PRESSURE_PLATE = registerBlock("plaster_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), BlockSetType.IRON));
    public static final RegistryObject<Block> PLASTER_FENCE = registerBlock("plaster_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> PLASTER_FENCE_DOOR = registerBlock("plaster_fence_door",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> PLASTER_WALL = registerBlock("plaster_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> RED_PLASTER_BLOCK = registerBlock("red_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> RED_PLASTER_STAIRS = registerBlock("red_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.RED_PLASTER_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> RED_PLASTER_SLAB = registerBlock("red_plaster_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> RED_PLASTER_BUTTON = registerBlock("red_plaster_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> RED_PLASTER_PRESSURE_PLATE = registerBlock("red_plaster_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), BlockSetType.IRON));
    public static final RegistryObject<Block> RED_PLASTER_FENCE = registerBlock("red_plaster_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> RED_PLASTER_FENCE_DOOR = registerBlock("red_plaster_fence_door",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> RED_PLASTER_WALL = registerBlock("red_plaster_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> SCARLET_PLASTER_BLOCK = registerBlock("scarlet_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> SCARLET_PLASTER_STAIRS = registerBlock("scarlet_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.SCARLET_PLASTER_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> SCARLET_PLASTER_SLAB = registerBlock("scarlet_plaster_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> SCARLET_PLASTER_BUTTON = registerBlock("scarlet_plaster_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> SCARLET_PLASTER_PRESSURE_PLATE = registerBlock("scarlet_plaster_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), BlockSetType.IRON));
    public static final RegistryObject<Block> SCARLET_PLASTER_FENCE = registerBlock("scarlet_plaster_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> SCARLET_PLASTER_FENCE_DOOR = registerBlock("scarlet_plaster_fence_door",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> SCARLET_PLASTER_WALL = registerBlock("scarlet_plaster_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> BLUE_PLASTER_BLOCK = registerBlock("blue_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> BLUE_PLASTER_STAIRS = registerBlock("blue_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.BLUE_PLASTER_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> BLUE_PLASTER_SLAB = registerBlock("blue_plaster_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> BLUE_PLASTER_BUTTON = registerBlock("blue_plaster_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> BLUE_PLASTER_PRESSURE_PLATE = registerBlock("blue_plaster_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), BlockSetType.IRON));
    public static final RegistryObject<Block> BLUE_PLASTER_FENCE = registerBlock("blue_plaster_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> BLUE_PLASTER_FENCE_DOOR = registerBlock("blue_plaster_fence_door",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> BLUE_PLASTER_WALL = registerBlock("blue_plaster_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_BLOCK = registerBlock("light_blue_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_STAIRS = registerBlock("light_blue_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_SLAB = registerBlock("light_blue_plaster_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_BUTTON = registerBlock("light_blue_plaster_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_PRESSURE_PLATE = registerBlock("light_blue_plaster_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), BlockSetType.IRON));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_FENCE = registerBlock("light_blue_plaster_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_FENCE_DOOR = registerBlock("light_blue_plaster_fence_door",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_WALL = registerBlock("light_blue_plaster_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> DARK_BLUE_PLASTER_BLOCK = registerBlock("dark_blue_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_STAIRS = registerBlock("dark_blue_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_BLUE_PLASTER_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_SLAB = registerBlock("dark_blue_plaster_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_BUTTON = registerBlock("dark_blue_plaster_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_PRESSURE_PLATE = registerBlock("dark_blue_plaster_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), BlockSetType.IRON));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_FENCE = registerBlock("dark_blue_plaster_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_FENCE_DOOR = registerBlock("dark_blue_plaster_fence_door",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_WALL = registerBlock("dark_blue_plaster_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> YELLOW_PLASTER_BLOCK = registerBlock("yellow_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> YELLOW_PLASTER_STAIRS = registerBlock("yellow_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.YELLOW_PLASTER_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> YELLOW_PLASTER_SLAB = registerBlock("yellow_plaster_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> YELLOW_PLASTER_BUTTON = registerBlock("yellow_plaster_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> YELLOW_PLASTER_PRESSURE_PLATE = registerBlock("yellow_plaster_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), BlockSetType.IRON));
    public static final RegistryObject<Block> YELLOW_PLASTER_FENCE = registerBlock("yellow_plaster_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> YELLOW_PLASTER_FENCE_DOOR = registerBlock("yellow_plaster_fence_door",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> YELLOW_PLASTER_WALL = registerBlock("yellow_plaster_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_BLOCK = registerBlock("light_yellow_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_STAIRS = registerBlock("light_yellow_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_SLAB = registerBlock("light_yellow_plaster_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_BUTTON = registerBlock("light_yellow_plaster_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_PRESSURE_PLATE = registerBlock("light_yellow_plaster_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), BlockSetType.IRON));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_FENCE = registerBlock("light_yellow_plaster_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_FENCE_DOOR = registerBlock("light_yellow_plaster_fence_door",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_WALL = registerBlock("light_yellow_plaster_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> GREEN_PLASTER_BLOCK = registerBlock("green_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> GREEN_PLASTER_STAIRS = registerBlock("green_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.GREEN_PLASTER_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> GREEN_PLASTER_SLAB = registerBlock("green_plaster_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> GREEN_PLASTER_BUTTON = registerBlock("green_plaster_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> GREEN_PLASTER_PRESSURE_PLATE = registerBlock("green_plaster_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), BlockSetType.IRON));
    public static final RegistryObject<Block> GREEN_PLASTER_FENCE = registerBlock("green_plaster_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> GREEN_PLASTER_FENCE_DOOR = registerBlock("green_plaster_fence_door",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> GREEN_PLASTER_WALL = registerBlock("green_plaster_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> DARK_GREEN_PLASTER_BLOCK = registerBlock("dark_green_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_STAIRS = registerBlock("dark_green_plaster_stairs",
            () -> new StairBlock(() -> ModBlocks.DARK_GREEN_PLASTER_BLOCK.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_SLAB = registerBlock("dark_green_plaster_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_BUTTON = registerBlock("dark_green_plaster_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_PRESSURE_PLATE = registerBlock("dark_green_plaster_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), BlockSetType.IRON));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_FENCE = registerBlock("dark_green_plaster_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_FENCE_DOOR = registerBlock("dark_green_plaster_fence_door",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_WALL = registerBlock("dark_green_plaster_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> RETICULA = registerBlock("reticula",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> LIME_BRICK_MIX = registerBlock("lime_brick_mix",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> LIGHT_RETICULA = registerBlock("light_reticula",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> MIXED_RETICULA = registerBlock("mixed_reticula",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));


    public static final RegistryObject<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            () -> new StairBlock(() -> ModBlocks.LIMESTONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIMESTONE_SLAB = registerBlock("limestone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIMESTONE_BUTTON = registerBlock("limestone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.IRON, 10, true));
    public static final RegistryObject<Block> LIMESTONE_PRESSURE_PLATE = registerBlock("limestone_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), BlockSetType.IRON));
    public static final RegistryObject<Block> LIMESTONE_FENCE = registerBlock("limestone_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIMESTONE_FENCE_DOOR = registerBlock("limestone_fence_door",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> LIMESTONE_WALL = registerBlock("limestone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

// ======================================== TERRACOTTA ========================================
    public static final RegistryObject<Block> TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            () -> new StairBlock(() -> Blocks.TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));


    public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.WHITE_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));


    public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.ORANGE_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));


    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));


    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));


    public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            () -> new StairBlock(() -> Blocks.RED_TERRACOTTA.defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));
    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
