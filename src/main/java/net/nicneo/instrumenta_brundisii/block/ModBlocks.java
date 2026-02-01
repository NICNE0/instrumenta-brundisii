package net.nicneo.instrumenta_brundisii.block;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nicneo.instrumenta_brundisii.block.custom.*;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.nicneo.instrumenta_brundisii.util.ModWoodTypes;

import java.util.function.Supplier;

import static net.nicneo.instrumenta_brundisii.item.ModItems.ITEMS;


//  This Section defines the new block, in this case it is copying the properties of another block, cobblestone,
//    just as in other cases, the name is defined first as a method using upper case and then it's internal
//    identifier in the registerBlock argument.
public class ModBlocks {
    private static BlockBehaviour.Properties blockProps(String name, BlockBehaviour.Properties props) {
        return props.setId(BLOCKS.key(name));
    }

    private static Item.Properties blockItemProps(String name) {
        return new Item.Properties().setId(ITEMS.key(name));
    }

    private static BlockBehaviour.Properties cropProps(String name) {
        return blockProps(name, BlockBehaviour.Properties.of()
            .mapColor(MapColor.PLANT)
            .noCollision()
            .randomTicks()
            .instabreak()
            .sound(SoundType.CROP)
            .pushReaction(PushReaction.DESTROY));
    }


    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, instrumentaBrundisii.MOD_ID);

//  LARGE COLUMN BLOCKS:
//  ====================================================================================================================
    public static final RegistryObject<Block> SIMPLE_LARGE_QUARTZ_COLUMN = registerBlock("simple_large_quartz_column",
            () -> new BigSimpleColumnBlock(blockProps("simple_large_quartz_column", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(BigSimpleColumnBlock.FACING);}});

    public static final RegistryObject<Block> QUARTZ_LARGE_DORIC_COLUMN = registerBlock("quartz_large_doric_column",
            () -> new LargeQuartzColumnBlock(blockProps("quartz_large_doric_column", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeQuartzColumnBlock.FACING);}});
    public static final RegistryObject<Block> QUARTZ_LARGE_DORIC_CAPITAL = registerBlock("quartz_large_doric_capital",
            () -> new LargeQuartzCapitalBlock(blockProps("quartz_large_doric_capital", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeQuartzCapitalBlock.FACING);}});
    public static final RegistryObject<Block> QUARTZ_LARGE_DORIC_BASE = registerBlock("quartz_large_doric_base",
            () -> new LargeQuartzBaseBlock(blockProps("quartz_large_doric_base", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeQuartzBaseBlock.FACING);}});

    public static final RegistryObject<Block> TUFF_LARGE_DORIC_COLUMN = registerBlock("tuff_large_doric_column",
            () -> new LargeTuffColumnBlock(blockProps("tuff_large_doric_column", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeTuffColumnBlock.FACING);}});
    public static final RegistryObject<Block> TUFF_LARGE_DORIC_CAPITAL = registerBlock("tuff_large_doric_capital",
            () -> new LargeTuffCapitalBlock(blockProps("tuff_large_doric_capital", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeTuffCapitalBlock.FACING);}});
    public static final RegistryObject<Block> TUFF_LARGE_DORIC_BASE = registerBlock("tuff_large_doric_base",
            () -> new LargeTuffBaseBlock(blockProps("tuff_large_doric_base", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeTuffBaseBlock.FACING);}});

    public static final RegistryObject<Block> GRANITE_LARGE_DORIC_COLUMN = registerBlock("granite_large_doric_column",
            () -> new LargeGraniteColumnBlock(blockProps("granite_large_doric_column", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeGraniteColumnBlock.FACING);}});
    public static final RegistryObject<Block> GRANITE_LARGE_DORIC_CAPITAL = registerBlock("granite_large_doric_capital",
            () -> new LargeGraniteCapitalBlock(blockProps("granite_large_doric_capital", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeGraniteCapitalBlock.FACING);}});
    public static final RegistryObject<Block> GRANITE_LARGE_DORIC_BASE = registerBlock("granite_large_doric_base",
            () -> new LargeGraniteBaseBlock(blockProps("granite_large_doric_base", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeGraniteBaseBlock.FACING);}});

    public static final RegistryObject<Block> ANDESITE_LARGE_DORIC_COLUMN = registerBlock("andesite_large_doric_column",
            () -> new LargeAndesiteColumnBlock(blockProps("andesite_large_doric_column", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeAndesiteColumnBlock.FACING);}});
    public static final RegistryObject<Block> ANDESITE_LARGE_DORIC_CAPITAL = registerBlock("andesite_large_doric_capital",
            () -> new LargeAndesiteCapitalBlock(blockProps("andesite_large_doric_capital", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeAndesiteCapitalBlock.FACING);}});
    public static final RegistryObject<Block> ANDESITE_LARGE_DORIC_BASE = registerBlock("andesite_large_doric_base",
            () -> new LargeAndesiteBaseBlock(blockProps("andesite_large_doric_base", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeAndesiteBaseBlock.FACING);}});

    public static final RegistryObject<Block> DIORITE_LARGE_DORIC_COLUMN = registerBlock("diorite_large_doric_column",
            () -> new LargeDioriteColumnBlock(blockProps("diorite_large_doric_column", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeDioriteColumnBlock.FACING);}});
    public static final RegistryObject<Block> DIORITE_LARGE_DORIC_CAPITAL = registerBlock("diorite_large_doric_capital",
            () -> new LargeDioriteCapitalBlock(blockProps("diorite_large_doric_capital", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeDioriteCapitalBlock.FACING);}});
    public static final RegistryObject<Block> DIORITE_LARGE_DORIC_BASE = registerBlock("diorite_large_doric_base",
            () -> new LargeDioriteBaseBlock(blockProps("diorite_large_doric_base", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeDioriteBaseBlock.FACING);}});

    public static final RegistryObject<Block> POLISHED_GRANITE_LARGE_DORIC_COLUMN = registerBlock("polished_granite_large_doric_column",
            () -> new LargePolishedGraniteColumnBlock(blockProps("polished_granite_large_doric_column", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargePolishedGraniteColumnBlock.FACING);}});
    public static final RegistryObject<Block> POLISHED_GRANITE_LARGE_DORIC_CAPITAL = registerBlock("polished_granite_large_doric_capital",
            () -> new LargePolishedGraniteCapitalBlock(blockProps("polished_granite_large_doric_capital", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargePolishedGraniteCapitalBlock.FACING);}});
    public static final RegistryObject<Block> POLISHED_GRANITE_LARGE_DORIC_BASE = registerBlock("polished_granite_large_doric_base",
            () -> new LargePolishedGraniteBaseBlock(blockProps("polished_granite_large_doric_base", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargePolishedGraniteBaseBlock.FACING);}});

    public static final RegistryObject<Block> POLISHED_ANDESITE_LARGE_DORIC_COLUMN = registerBlock("polished_andesite_large_doric_column",
            () -> new LargePolishedAndesiteColumnBlock(blockProps("polished_andesite_large_doric_column", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargePolishedAndesiteColumnBlock.FACING);}});
    public static final RegistryObject<Block> POLISHED_ANDESITE_LARGE_DORIC_CAPITAL = registerBlock("polished_andesite_large_doric_capital",
            () -> new LargePolishedAndesiteCapitalBlock(blockProps("polished_andesite_large_doric_capital", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargePolishedAndesiteCapitalBlock.FACING);}});
    public static final RegistryObject<Block> POLISHED_ANDESITE_LARGE_DORIC_BASE = registerBlock("polished_andesite_large_doric_base",
            () -> new LargePolishedAndesiteBaseBlock(blockProps("polished_andesite_large_doric_base", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargePolishedAndesiteBaseBlock.FACING);}});

    public static final RegistryObject<Block> POLISHED_DIORITE_LARGE_DORIC_COLUMN = registerBlock("polished_diorite_large_doric_column",
            () -> new LargePolishedDioriteColumnBlock(blockProps("polished_diorite_large_doric_column", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargePolishedDioriteColumnBlock.FACING);}});
    public static final RegistryObject<Block> POLISHED_DIORITE_LARGE_DORIC_CAPITAL = registerBlock("polished_diorite_large_doric_capital",
            () -> new LargePolishedDioriteCapitalBlock(blockProps("polished_diorite_large_doric_capital", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargePolishedDioriteCapitalBlock.FACING);}});
    public static final RegistryObject<Block> POLISHED_DIORITE_LARGE_DORIC_BASE = registerBlock("polished_diorite_large_doric_base",
            () -> new LargePolishedDioriteBaseBlock(blockProps("polished_diorite_large_doric_base", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargePolishedDioriteBaseBlock.FACING);}});

    public static final RegistryObject<Block> CALCITE_LARGE_DORIC_COLUMN = registerBlock("calcite_large_doric_column",
            () -> new LargeCalciteColumnBlock(blockProps("calcite_large_doric_column", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeCalciteColumnBlock.FACING);}});
    public static final RegistryObject<Block> CALCITE_LARGE_DORIC_CAPITAL = registerBlock("calcite_large_doric_capital",
            () -> new LargeCalciteCapitalBlock(blockProps("calcite_large_doric_capital", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeCalciteCapitalBlock.FACING);}});
    public static final RegistryObject<Block> CALCITE_LARGE_DORIC_BASE = registerBlock("calcite_large_doric_base",
            () -> new LargeCalciteBaseBlock(blockProps("calcite_large_doric_base", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE))) {
                @Override
                protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
                    builder.add(LargeCalciteBaseBlock.FACING);}});


//  LEAVE BLOCKS:
//  ====================================================================================================================
    public static final RegistryObject<Block> BOUGAINVILLEA_BLOCK = registerBlock("bougainvillea_block",
        () -> new ModLeavesBlock(blockProps("bougainvillea_block", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));

    public static final RegistryObject<Block> PINK_BOUGAINVILLEA_BLOCK = registerBlock("pink_bougainvillea_block",
            () -> new ModLeavesBlock(blockProps("pink_bougainvillea_block", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));
    public static final RegistryObject<Block> PINK_BLOOMING_BOUGAINVILLEA_BLOCK_1 = registerBlock("pink_blooming_bougainvillea_block_1",
            () -> new ModLeavesBlock(blockProps("pink_blooming_bougainvillea_block_1", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));
    public static final RegistryObject<Block> PINK_BLOOMING_BOUGAINVILLEA_BLOCK_2 = registerBlock("pink_blooming_bougainvillea_block_2",
            () -> new ModLeavesBlock(blockProps("pink_blooming_bougainvillea_block_2", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));
    public static final RegistryObject<Block> PINK_FLOWERING_BOUGAINVILLEA_BLOCK_1 = registerBlock("pink_flowering_bougainvillea_block_1",
            () -> new ModLeavesBlock(blockProps("pink_flowering_bougainvillea_block_1", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));
    public static final RegistryObject<Block> PINK_FLOWERING_BOUGAINVILLEA_BLOCK_2 = registerBlock("pink_flowering_bougainvillea_block_2",
            () -> new ModLeavesBlock(blockProps("pink_flowering_bougainvillea_block_2", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));

    public static final RegistryObject<Block> ORANGE_BOUGAINVILLEA_BLOCK = registerBlock("orange_bougainvillea_block",
            () -> new ModLeavesBlock(blockProps("orange_bougainvillea_block", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));
    public static final RegistryObject<Block> ORANGE_BLOOMING_BOUGAINVILLEA_BLOCK_1 = registerBlock("orange_blooming_bougainvillea_block_1",
            () -> new ModLeavesBlock(blockProps("orange_blooming_bougainvillea_block_1", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));
    public static final RegistryObject<Block> ORANGE_BLOOMING_BOUGAINVILLEA_BLOCK_2 = registerBlock("orange_blooming_bougainvillea_block_2",
            () -> new ModLeavesBlock(blockProps("orange_blooming_bougainvillea_block_2", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));
    public static final RegistryObject<Block> ORANGE_FLOWERING_BOUGAINVILLEA_BLOCK_1 = registerBlock("orange_flowering_bougainvillea_block_1",
            () -> new ModLeavesBlock(blockProps("orange_flowering_bougainvillea_block_1", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));
    public static final RegistryObject<Block> ORANGE_FLOWERING_BOUGAINVILLEA_BLOCK_2 = registerBlock("orange_flowering_bougainvillea_block_2",
            () -> new ModLeavesBlock(blockProps("orange_flowering_bougainvillea_block_2", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));

    public static final RegistryObject<Block> WHITE_BOUGAINVILLEA_BLOCK = registerBlock("white_bougainvillea_block",
            () -> new ModLeavesBlock(blockProps("white_bougainvillea_block", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));
    public static final RegistryObject<Block> WHITE_BLOOMING_BOUGAINVILLEA_BLOCK_1 = registerBlock("white_blooming_bougainvillea_block_1",
            () -> new ModLeavesBlock(blockProps("white_blooming_bougainvillea_block_1", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));
    public static final RegistryObject<Block> WHITE_BLOOMING_BOUGAINVILLEA_BLOCK_2 = registerBlock("white_blooming_bougainvillea_block_2",
            () -> new ModLeavesBlock(blockProps("white_blooming_bougainvillea_block_2", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));
    public static final RegistryObject<Block> WHITE_FLOWERING_BOUGAINVILLEA_BLOCK_1 = registerBlock("white_flowering_bougainvillea_block_1",
            () -> new ModLeavesBlock(blockProps("white_flowering_bougainvillea_block_1", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));
    public static final RegistryObject<Block> WHITE_FLOWERING_BOUGAINVILLEA_BLOCK_2 = registerBlock("white_flowering_bougainvillea_block_2",
            () -> new ModLeavesBlock(blockProps("white_flowering_bougainvillea_block_2", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LEAVES))));

//  LICHEN LIKE BLOCKS:
//  ====================================================================================================================
    public static final RegistryObject<Block> BOUGAINVILLEA_LEAVES = registerLichenLike("bougainvillea_leaves",
            () -> new BougainvilleaBlock(blockProps("bougainvillea_leaves", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));

    public static final RegistryObject<Block> PINK_BOUGAINVILLEA = registerLichenLike("pink_bougainvillea",
            () -> new BougainvilleaBlock(blockProps("pink_bougainvillea", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));
    public static final RegistryObject<Block> PINK_BLOOMING_BOUGAINVILLEA_1 = registerLichenLike("pink_blooming_bougainvillea_1",
            () -> new BougainvilleaBlock(blockProps("pink_blooming_bougainvillea_1", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));
    public static final RegistryObject<Block> PINK_BLOOMING_BOUGAINVILLEA_2 = registerLichenLike("pink_blooming_bougainvillea_2",
            () -> new BougainvilleaBlock(blockProps("pink_blooming_bougainvillea_2", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));
    public static final RegistryObject<Block> PINK_FLOWERING_BOUGAINVILLEA_1 = registerLichenLike("pink_flowering_bougainvillea_1",
            () -> new BougainvilleaBlock(blockProps("pink_flowering_bougainvillea_1", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));
    public static final RegistryObject<Block> PINK_FLOWERING_BOUGAINVILLEA_2 = registerLichenLike("pink_flowering_bougainvillea_2",
            () -> new BougainvilleaBlock(blockProps("pink_flowering_bougainvillea_2", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));

    public static final RegistryObject<Block> ORANGE_BOUGAINVILLEA = registerLichenLike("orange_bougainvillea",
            () -> new BougainvilleaBlock(blockProps("orange_bougainvillea", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));
    public static final RegistryObject<Block> ORANGE_BLOOMING_BOUGAINVILLEA_1 = registerLichenLike("orange_blooming_bougainvillea_1",
            () -> new BougainvilleaBlock(blockProps("orange_blooming_bougainvillea_1", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));
    public static final RegistryObject<Block> ORANGE_BLOOMING_BOUGAINVILLEA_2 = registerLichenLike("orange_blooming_bougainvillea_2",
            () -> new BougainvilleaBlock(blockProps("orange_blooming_bougainvillea_2", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));
    public static final RegistryObject<Block> ORANGE_FLOWERING_BOUGAINVILLEA_1 = registerLichenLike("orange_flowering_bougainvillea_1",
            () -> new BougainvilleaBlock(blockProps("orange_flowering_bougainvillea_1", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));
    public static final RegistryObject<Block> ORANGE_FLOWERING_BOUGAINVILLEA_2 = registerLichenLike("orange_flowering_bougainvillea_2",
            () -> new BougainvilleaBlock(blockProps("orange_flowering_bougainvillea_2", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));

    public static final RegistryObject<Block> WHITE_BOUGAINVILLEA = registerLichenLike("white_bougainvillea",
            () -> new BougainvilleaBlock(blockProps("white_bougainvillea", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));
    public static final RegistryObject<Block> WHITE_BLOOMING_BOUGAINVILLEA_1 = registerLichenLike("white_blooming_bougainvillea_1",
            () -> new BougainvilleaBlock(blockProps("white_blooming_bougainvillea_1", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));
    public static final RegistryObject<Block> WHITE_BLOOMING_BOUGAINVILLEA_2 = registerLichenLike("white_blooming_bougainvillea_2",
            () -> new BougainvilleaBlock(blockProps("white_blooming_bougainvillea_2", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));
    public static final RegistryObject<Block> WHITE_FLOWERING_BOUGAINVILLEA_1 = registerLichenLike("white_flowering_bougainvillea_1",
            () -> new BougainvilleaBlock(blockProps("white_flowering_bougainvillea_1", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));
    public static final RegistryObject<Block> WHITE_FLOWERING_BOUGAINVILLEA_2 = registerLichenLike("white_flowering_bougainvillea_2",
            () -> new BougainvilleaBlock(blockProps("white_flowering_bougainvillea_2", BlockBehaviour.Properties.ofFullCopy(Blocks.GLOW_LICHEN).noCollision().lightLevel(state -> 7))));

//  CUSTOM WOOD SLABS:
//  ====================================================================================================================
    public static final RegistryObject<Block> OAK_WOOD_SLAB = registerBlock("oak_wood_slab",
            () -> new OrientableSlabBlock(blockProps("oak_wood_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WOOD))));

    public static final RegistryObject<Block> ACACIA_WOOD_SLAB = registerBlock("acacia_wood_slab",
            () -> new OrientableSlabBlock(blockProps("acacia_wood_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.ACACIA_WOOD))));

    public static final RegistryObject<Block> BIRCH_WOOD_SLAB = registerBlock("birch_wood_slab",
            () -> new OrientableSlabBlock(blockProps("birch_wood_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.BIRCH_WOOD))));

    public static final RegistryObject<Block> CHERRY_WOOD_SLAB = registerBlock("cherry_wood_slab",
            () -> new OrientableSlabBlock(blockProps("cherry_wood_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.CHERRY_WOOD))));

    public static final RegistryObject<Block> DARK_OAK_WOOD_SLAB = registerBlock("dark_oak_wood_slab",
            () -> new OrientableSlabBlock(blockProps("dark_oak_wood_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.DARK_OAK_WOOD))));

    public static final RegistryObject<Block> JUNGLE_WOOD_SLAB = registerBlock("jungle_wood_slab",
            () -> new OrientableSlabBlock(blockProps("jungle_wood_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.JUNGLE_WOOD))));

    public static final RegistryObject<Block> MANGROVE_WOOD_SLAB = registerBlock("mangrove_wood_slab",
            () -> new OrientableSlabBlock(blockProps("mangrove_wood_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.MANGROVE_WOOD))));

    public static final RegistryObject<Block> SPRUCE_WOOD_SLAB = registerBlock("spruce_wood_slab",
            () -> new OrientableSlabBlock(blockProps("spruce_wood_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.SPRUCE_WOOD))));

//  SIGNS:
//  ====================================================================================================================
    public static final RegistryObject<Block> QUARTZ_SIGN = BLOCKS.register("quartz_sign",
            () -> new ModStandingSignBlock(blockProps("quartz_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)), ModWoodTypes.QUARTZ));
    public static final RegistryObject<Block> QUARTZ_WALL_SIGN = BLOCKS.register("quartz_wall_sign",
            () -> new ModWallSignBlock(blockProps("quartz_wall_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)), ModWoodTypes.QUARTZ));
    public static final RegistryObject<Block> QUARTZ_HANGING_SIGN = BLOCKS.register("quartz_hanging_sign",
            () -> new ModHangingSignBlock(blockProps("quartz_hanging_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)), ModWoodTypes.QUARTZ));
    public static final RegistryObject<Block> QUARTZ_WALL_HANGING_SIGN = BLOCKS.register("quartz_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(blockProps("quartz_wall_hanging_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)), ModWoodTypes.QUARTZ));

    public static final RegistryObject<Block> ANDESITE_SIGN = BLOCKS.register("andesite_sign",
            () -> new ModStandingSignBlock(blockProps("andesite_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)), ModWoodTypes.ANDESITE));
    public static final RegistryObject<Block> ANDESITE_WALL_SIGN = BLOCKS.register("andesite_wall_sign",
            () -> new ModWallSignBlock(blockProps("andesite_wall_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)), ModWoodTypes.ANDESITE));
    public static final RegistryObject<Block> ANDESITE_HANGING_SIGN = BLOCKS.register("andesite_hanging_sign",
            () -> new ModHangingSignBlock(blockProps("andesite_hanging_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)), ModWoodTypes.ANDESITE));
    public static final RegistryObject<Block> ANDESITE_WALL_HANGING_SIGN = BLOCKS.register("andesite_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(blockProps("andesite_wall_hanging_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)), ModWoodTypes.ANDESITE));

    public static final RegistryObject<Block> DIORITE_SIGN = BLOCKS.register("diorite_sign",
            () -> new ModStandingSignBlock(blockProps("diorite_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)), ModWoodTypes.DIORITE));
    public static final RegistryObject<Block> DIORITE_WALL_SIGN = BLOCKS.register("diorite_wall_sign",
            () -> new ModWallSignBlock(blockProps("diorite_wall_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)), ModWoodTypes.DIORITE));
    public static final RegistryObject<Block> DIORITE_HANGING_SIGN = BLOCKS.register("diorite_hanging_sign",
            () -> new ModHangingSignBlock(blockProps("diorite_hanging_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)), ModWoodTypes.DIORITE));
    public static final RegistryObject<Block> DIORITE_WALL_HANGING_SIGN = BLOCKS.register("diorite_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(blockProps("diorite_wall_hanging_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)), ModWoodTypes.DIORITE));

    public static final RegistryObject<Block> GRANITE_SIGN = BLOCKS.register("granite_sign",
            () -> new ModStandingSignBlock(blockProps("granite_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_SIGN)), ModWoodTypes.GRANITE));
    public static final RegistryObject<Block> GRANITE_WALL_SIGN = BLOCKS.register("granite_wall_sign",
            () -> new ModWallSignBlock(blockProps("granite_wall_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_SIGN)), ModWoodTypes.GRANITE));
    public static final RegistryObject<Block> GRANITE_HANGING_SIGN = BLOCKS.register("granite_hanging_sign",
            () -> new ModHangingSignBlock(blockProps("granite_hanging_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_HANGING_SIGN)), ModWoodTypes.GRANITE));
    public static final RegistryObject<Block> GRANITE_WALL_HANGING_SIGN = BLOCKS.register("granite_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(blockProps("granite_wall_hanging_sign", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_WALL_HANGING_SIGN)), ModWoodTypes.GRANITE));

//  DOUBLE CROPS:
//  ====================================================================================================================
    public static final RegistryObject<Block> CORN_CROP = BLOCKS.register("corn_crop",
            () -> new CornCropBlock(cropProps("corn_crop")));

    public static final RegistryObject<Block> OPIUM_CROP = BLOCKS.register("opium_crop",
            () -> new OpiumCropBlock(cropProps("opium_crop")));

    public static final RegistryObject<Block> TOMATO_CROP = BLOCKS.register("tomato_crop",
            () -> new TomatoCropBlock(cropProps("tomato_crop")));

    public static final RegistryObject<Block> SWEET_POTATO_CROP = BLOCKS.register("sweet_potato_crop",
            () -> new SweetPotatoCropBlock(cropProps("sweet_potato_crop")));

    public static final RegistryObject<Block> COTTON_CROP = BLOCKS.register("cotton_crop",
            () -> new CottonCropBlock(cropProps("cotton_crop")));

    //  SIMPLE CROPS:
//  ====================================================================================================================
    public static final RegistryObject<Block> FLAX_CROP = BLOCKS.register("flax_crop",
            () -> new FlaxCropBlock(cropProps("flax_crop")));

    public static final RegistryObject<Block> BARLEY_CROP = BLOCKS.register("barley_crop",
            () -> new BarleyCropBlock(cropProps("barley_crop")));

    public static final RegistryObject<Block> OAT_CROP = BLOCKS.register("oat_crop",
            () -> new OatCropBlock(cropProps("oat_crop")));

    public static final RegistryObject<Block> RYE_CROP = BLOCKS.register("rye_crop",
            () -> new RyeCropBlock(cropProps("rye_crop")));

    public static final RegistryObject<Block> LEEK_CROP = BLOCKS.register("leek_crop",
            () -> new LeekCropBlock(cropProps("leek_crop")));

    public static final RegistryObject<Block> GARLIC_CROP = BLOCKS.register("garlic_crop",
            () -> new GarlicCropBlock(cropProps("garlic_crop")));

    public static final RegistryObject<Block> ONION_CROP = BLOCKS.register("onion_crop",
            () -> new OnionCropBlock(cropProps("onion_crop")));

    public static final RegistryObject<Block> ASPARAGUS_CROP = BLOCKS.register("asparagus_crop",
            () -> new AsparagusCropBlock(cropProps("asparagus_crop")));

    public static final RegistryObject<Block> PARSNIP_CROP = BLOCKS.register("parsnip_crop",
            () -> new ParsnipCropBlock(cropProps("parsnip_crop")));

    public static final RegistryObject<Block> CABBAGE_CROP = BLOCKS.register("cabbage_crop",
            () -> new CabbageCropBlock(cropProps("cabbage_crop")));

    public static final RegistryObject<Block> TURNIP_CROP = BLOCKS.register("turnip_crop",
            () -> new TurnipCropBlock(cropProps("turnip_crop")));

    //  PLASTERS:
//  ====================================================================================================================
    public static final RegistryObject<Block> PLASTER_BLOCK = registerBlock("plaster_block",
            () -> new Block(blockProps("plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> PLASTER_STAIRS = registerBlock("plaster_stairs",
            () -> new StairBlock(ModBlocks.PLASTER_BLOCK.get().defaultBlockState(),
                    blockProps("plaster_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> PLASTER_SLAB = registerBlock("plaster_slab",
            () -> new SlabBlock(blockProps("plaster_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> PLASTER_BUTTON = registerBlock("plaster_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, blockProps("plaster_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));
    public static final RegistryObject<Block> PLASTER_PRESSURE_PLATE = registerBlock("plaster_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, blockProps("plaster_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> PLASTER_FENCE = registerBlock("plaster_fence",
            () -> new FenceBlock(blockProps("plaster_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> PLASTER_FENCE_DOOR = registerBlock("plaster_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("plaster_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> PLASTER_WALL = registerBlock("plaster_wall",
            () -> new WallBlock(blockProps("plaster_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));

    public static final RegistryObject<Block> RED_PLASTER_BLOCK = registerBlock("red_plaster_block",
            () -> new Block(blockProps("red_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> RED_PLASTER_STAIRS = registerBlock("red_plaster_stairs",
            () -> new StairBlock(ModBlocks.RED_PLASTER_BLOCK.get().defaultBlockState(),
                    blockProps("red_plaster_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> RED_PLASTER_SLAB = registerBlock("red_plaster_slab",
            () -> new SlabBlock(blockProps("red_plaster_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> RED_PLASTER_BUTTON = registerBlock("red_plaster_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, blockProps("red_plaster_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));
    public static final RegistryObject<Block> RED_PLASTER_PRESSURE_PLATE = registerBlock("red_plaster_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, blockProps("red_plaster_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> RED_PLASTER_FENCE = registerBlock("red_plaster_fence",
            () -> new FenceBlock(blockProps("red_plaster_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> RED_PLASTER_FENCE_DOOR = registerBlock("red_plaster_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("red_plaster_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> RED_PLASTER_WALL = registerBlock("red_plaster_wall",
            () -> new WallBlock(blockProps("red_plaster_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));

    public static final RegistryObject<Block> SCARLET_PLASTER_BLOCK = registerBlock("scarlet_plaster_block",
            () -> new Block(blockProps("scarlet_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> SCARLET_PLASTER_STAIRS = registerBlock("scarlet_plaster_stairs",
            () -> new StairBlock(ModBlocks.SCARLET_PLASTER_BLOCK.get().defaultBlockState(),
                    blockProps("scarlet_plaster_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> SCARLET_PLASTER_SLAB = registerBlock("scarlet_plaster_slab",
            () -> new SlabBlock(blockProps("scarlet_plaster_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> SCARLET_PLASTER_BUTTON = registerBlock("scarlet_plaster_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, blockProps("scarlet_plaster_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));
    public static final RegistryObject<Block> SCARLET_PLASTER_PRESSURE_PLATE = registerBlock("scarlet_plaster_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, blockProps("scarlet_plaster_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> SCARLET_PLASTER_FENCE = registerBlock("scarlet_plaster_fence",
            () -> new FenceBlock(blockProps("scarlet_plaster_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> SCARLET_PLASTER_FENCE_DOOR = registerBlock("scarlet_plaster_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("scarlet_plaster_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> SCARLET_PLASTER_WALL = registerBlock("scarlet_plaster_wall",
            () -> new WallBlock(blockProps("scarlet_plaster_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));

    public static final RegistryObject<Block> BLUE_PLASTER_BLOCK = registerBlock("blue_plaster_block",
            () -> new Block(blockProps("blue_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> BLUE_PLASTER_STAIRS = registerBlock("blue_plaster_stairs",
            () -> new StairBlock(ModBlocks.BLUE_PLASTER_BLOCK.get().defaultBlockState(),
                    blockProps("blue_plaster_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> BLUE_PLASTER_SLAB = registerBlock("blue_plaster_slab",
            () -> new SlabBlock(blockProps("blue_plaster_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> BLUE_PLASTER_BUTTON = registerBlock("blue_plaster_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, blockProps("blue_plaster_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));
    public static final RegistryObject<Block> BLUE_PLASTER_PRESSURE_PLATE = registerBlock("blue_plaster_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, blockProps("blue_plaster_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> BLUE_PLASTER_FENCE = registerBlock("blue_plaster_fence",
            () -> new FenceBlock(blockProps("blue_plaster_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> BLUE_PLASTER_FENCE_DOOR = registerBlock("blue_plaster_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("blue_plaster_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> BLUE_PLASTER_WALL = registerBlock("blue_plaster_wall",
            () -> new WallBlock(blockProps("blue_plaster_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));

    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_BLOCK = registerBlock("light_blue_plaster_block",
            () -> new Block(blockProps("light_blue_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_STAIRS = registerBlock("light_blue_plaster_stairs",
            () -> new StairBlock(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get().defaultBlockState(),
                    blockProps("light_blue_plaster_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_SLAB = registerBlock("light_blue_plaster_slab",
            () -> new SlabBlock(blockProps("light_blue_plaster_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_BUTTON = registerBlock("light_blue_plaster_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, blockProps("light_blue_plaster_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_PRESSURE_PLATE = registerBlock("light_blue_plaster_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, blockProps("light_blue_plaster_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_FENCE = registerBlock("light_blue_plaster_fence",
            () -> new FenceBlock(blockProps("light_blue_plaster_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_FENCE_DOOR = registerBlock("light_blue_plaster_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("light_blue_plaster_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_WALL = registerBlock("light_blue_plaster_wall",
            () -> new WallBlock(blockProps("light_blue_plaster_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));

    public static final RegistryObject<Block> DARK_BLUE_PLASTER_BLOCK = registerBlock("dark_blue_plaster_block",
            () -> new Block(blockProps("dark_blue_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_STAIRS = registerBlock("dark_blue_plaster_stairs",
            () -> new StairBlock(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get().defaultBlockState(),
                    blockProps("dark_blue_plaster_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_SLAB = registerBlock("dark_blue_plaster_slab",
            () -> new SlabBlock(blockProps("dark_blue_plaster_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_BUTTON = registerBlock("dark_blue_plaster_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, blockProps("dark_blue_plaster_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_PRESSURE_PLATE = registerBlock("dark_blue_plaster_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, blockProps("dark_blue_plaster_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_FENCE = registerBlock("dark_blue_plaster_fence",
            () -> new FenceBlock(blockProps("dark_blue_plaster_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_FENCE_DOOR = registerBlock("dark_blue_plaster_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("dark_blue_plaster_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> DARK_BLUE_PLASTER_WALL = registerBlock("dark_blue_plaster_wall",
            () -> new WallBlock(blockProps("dark_blue_plaster_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));

    public static final RegistryObject<Block> YELLOW_PLASTER_BLOCK = registerBlock("yellow_plaster_block",
            () -> new Block(blockProps("yellow_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> YELLOW_PLASTER_STAIRS = registerBlock("yellow_plaster_stairs",
            () -> new StairBlock(ModBlocks.YELLOW_PLASTER_BLOCK.get().defaultBlockState(),
                    blockProps("yellow_plaster_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> YELLOW_PLASTER_SLAB = registerBlock("yellow_plaster_slab",
            () -> new SlabBlock(blockProps("yellow_plaster_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> YELLOW_PLASTER_BUTTON = registerBlock("yellow_plaster_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, blockProps("yellow_plaster_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));
    public static final RegistryObject<Block> YELLOW_PLASTER_PRESSURE_PLATE = registerBlock("yellow_plaster_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, blockProps("yellow_plaster_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> YELLOW_PLASTER_FENCE = registerBlock("yellow_plaster_fence",
            () -> new FenceBlock(blockProps("yellow_plaster_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> YELLOW_PLASTER_FENCE_DOOR = registerBlock("yellow_plaster_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("yellow_plaster_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> YELLOW_PLASTER_WALL = registerBlock("yellow_plaster_wall",
            () -> new WallBlock(blockProps("yellow_plaster_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));

    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_BLOCK = registerBlock("light_yellow_plaster_block",
            () -> new Block(blockProps("light_yellow_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_STAIRS = registerBlock("light_yellow_plaster_stairs",
            () -> new StairBlock(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get().defaultBlockState(),
                    blockProps("light_yellow_plaster_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_SLAB = registerBlock("light_yellow_plaster_slab",
            () -> new SlabBlock(blockProps("light_yellow_plaster_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_BUTTON = registerBlock("light_yellow_plaster_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, blockProps("light_yellow_plaster_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_PRESSURE_PLATE = registerBlock("light_yellow_plaster_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, blockProps("light_yellow_plaster_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_FENCE = registerBlock("light_yellow_plaster_fence",
            () -> new FenceBlock(blockProps("light_yellow_plaster_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_FENCE_DOOR = registerBlock("light_yellow_plaster_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("light_yellow_plaster_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_WALL = registerBlock("light_yellow_plaster_wall",
            () -> new WallBlock(blockProps("light_yellow_plaster_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));

    public static final RegistryObject<Block> GREEN_PLASTER_BLOCK = registerBlock("green_plaster_block",
            () -> new Block(blockProps("green_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> GREEN_PLASTER_STAIRS = registerBlock("green_plaster_stairs",
            () -> new StairBlock(ModBlocks.GREEN_PLASTER_BLOCK.get().defaultBlockState(),
                    blockProps("green_plaster_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> GREEN_PLASTER_SLAB = registerBlock("green_plaster_slab",
            () -> new SlabBlock(blockProps("green_plaster_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> GREEN_PLASTER_BUTTON = registerBlock("green_plaster_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, blockProps("green_plaster_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));
    public static final RegistryObject<Block> GREEN_PLASTER_PRESSURE_PLATE = registerBlock("green_plaster_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, blockProps("green_plaster_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> GREEN_PLASTER_FENCE = registerBlock("green_plaster_fence",
            () -> new FenceBlock(blockProps("green_plaster_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> GREEN_PLASTER_FENCE_DOOR = registerBlock("green_plaster_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("green_plaster_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> GREEN_PLASTER_WALL = registerBlock("green_plaster_wall",
            () -> new WallBlock(blockProps("green_plaster_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));

    public static final RegistryObject<Block> DARK_GREEN_PLASTER_BLOCK = registerBlock("dark_green_plaster_block",
            () -> new Block(blockProps("dark_green_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_STAIRS = registerBlock("dark_green_plaster_stairs",
            () -> new StairBlock(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get().defaultBlockState(),
                    blockProps("dark_green_plaster_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_SLAB = registerBlock("dark_green_plaster_slab",
            () -> new SlabBlock(blockProps("dark_green_plaster_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_BUTTON = registerBlock("dark_green_plaster_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, blockProps("dark_green_plaster_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_PRESSURE_PLATE = registerBlock("dark_green_plaster_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, blockProps("dark_green_plaster_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_FENCE = registerBlock("dark_green_plaster_fence",
            () -> new FenceBlock(blockProps("dark_green_plaster_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_FENCE_DOOR = registerBlock("dark_green_plaster_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("dark_green_plaster_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> DARK_GREEN_PLASTER_WALL = registerBlock("dark_green_plaster_wall",
            () -> new WallBlock(blockProps("dark_green_plaster_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));



//  LIMESTONE:
//  ====================================================================================================================
    public static final RegistryObject<Block> LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            () -> new Block(blockProps("limestone_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            () -> new StairBlock(ModBlocks.LIMESTONE_BRICKS.get().defaultBlockState(),
                    blockProps("limestone_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIMESTONE_SLAB = registerBlock("limestone_slab",
            () -> new SlabBlock(blockProps("limestone_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIMESTONE_BUTTON = registerBlock("limestone_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, blockProps("limestone_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));
    public static final RegistryObject<Block> LIMESTONE_PRESSURE_PLATE = registerBlock("limestone_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, blockProps("limestone_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIMESTONE_FENCE = registerBlock("limestone_fence",
            () -> new FenceBlock(blockProps("limestone_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIMESTONE_FENCE_DOOR = registerBlock("limestone_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("limestone_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> LIMESTONE_WALL = registerBlock("limestone_wall",
            () -> new WallBlock(blockProps("limestone_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIME_BRICK_MIX = registerBlock("lime_brick_mix",
            () -> new Block(blockProps("lime_brick_mix", BlockBehaviour.Properties.ofFullCopy(Blocks.SANDSTONE))));



//  LINTELS:
//  ====================================================================================================================
    public static final RegistryObject<Block> LINTEL_BLACK_TERRACOTTA = registerBlock("lintel_black_terracotta",
            () -> new Block(blockProps("lintel_black_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_BLUE_TERRACOTTA = registerBlock("lintel_blue_terracotta",
            () -> new Block(blockProps("lintel_blue_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_BROWN_TERRACOTTA = registerBlock("lintel_brown_terracotta",
            () -> new Block(blockProps("lintel_brown_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_CYAN_TERRACOTTA = registerBlock("lintel_cyan_terracotta",
            () -> new Block(blockProps("lintel_cyan_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_GRAY_TERRACOTTA = registerBlock("lintel_gray_terracotta",
            () -> new Block(blockProps("lintel_gray_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_GREEN_TERRACOTTA = registerBlock("lintel_green_terracotta",
            () -> new Block(blockProps("lintel_green_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_LIGHT_BLUE_TERRACOTTA = registerBlock("lintel_light_blue_terracotta",
            () -> new Block(blockProps("lintel_light_blue_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_LIGHT_GRAY_TERRACOTTA = registerBlock("lintel_light_gray_terracotta",
            () -> new Block(blockProps("lintel_light_gray_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_LIME_TERRACOTTA = registerBlock("lintel_lime_terracotta",
            () -> new Block(blockProps("lintel_lime_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_MAGENTA_TERRACOTTA = registerBlock("lintel_magenta_terracotta",
            () -> new Block(blockProps("lintel_magenta_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_ORANGE_TERRACOTTA = registerBlock("lintel_orange_terracotta",
            () -> new Block(blockProps("lintel_orange_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_PINK_TERRACOTTA = registerBlock("lintel_pink_terracotta",
            () -> new Block(blockProps("lintel_pink_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_PURPLE_TERRACOTTA = registerBlock("lintel_purple_terracotta",
            () -> new Block(blockProps("lintel_purple_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_RED_TERRACOTTA = registerBlock("lintel_red_terracotta",
            () -> new Block(blockProps("lintel_red_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_TERRACOTTA = registerBlock("lintel_terracotta",
            () -> new Block(blockProps("lintel_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_WHITE_TERRACOTTA = registerBlock("lintel_white_terracotta",
            () -> new Block(blockProps("lintel_white_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_YELLOW_TERRACOTTA = registerBlock("lintel_yellow_terracotta",
            () -> new Block(blockProps("lintel_yellow_terracotta", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_BLUE_PLASTER_BLOCK = registerBlock("lintel_blue_plaster_block",
            () -> new Block(blockProps("lintel_blue_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_DARK_BLUE_PLASTER_BLOCK = registerBlock("lintel_dark_blue_plaster_block",
            () -> new Block(blockProps("lintel_dark_blue_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_DARK_GREEN_PLASTER_BLOCK = registerBlock("lintel_dark_green_plaster_block",
            () -> new Block(blockProps("lintel_dark_green_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_GREEN_PLASTER_BLOCK = registerBlock("lintel_green_plaster_block",
            () -> new Block(blockProps("lintel_green_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_LIGHT_BLUE_PLASTER_BLOCK = registerBlock("lintel_light_blue_plaster_block",
            () -> new Block(blockProps("lintel_light_blue_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_LIGHT_YELLOW_PLASTER_BLOCK = registerBlock("lintel_light_yellow_plaster_block",
            () -> new Block(blockProps("lintel_light_yellow_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_PLASTER_BLOCK = registerBlock("lintel_plaster_block",
            () -> new Block(blockProps("lintel_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_RED_PLASTER_BLOCK = registerBlock("lintel_red_plaster_block",
            () -> new Block(blockProps("lintel_red_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_SCARLET_PLASTER_BLOCK = registerBlock("lintel_scarlet_plaster_block",
            () -> new Block(blockProps("lintel_scarlet_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_YELLOW_PLASTER_BLOCK = registerBlock("lintel_yellow_plaster_block",
            () -> new Block(blockProps("lintel_yellow_plaster_block", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));
    public static final RegistryObject<Block> LINTEL_BRICKS = registerBlock("lintel_bricks",
            () -> new Block(blockProps("lintel_bricks", BlockBehaviour.Properties.ofFullCopy(Blocks.TERRACOTTA))));



//  RETICULA:
//  ====================================================================================================================
    public static final RegistryObject<Block> RETICULA = registerBlock("reticula",
            () -> new Block(blockProps("reticula", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_RETICULA = registerBlock("light_reticula",
            () -> new Block(blockProps("light_reticula", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> MIXED_RETICULA = registerBlock("mixed_reticula",
            () -> new Block(blockProps("mixed_reticula", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));

    public static final RegistryObject<Block> LARGE_DARK_STONE_RETICULA = registerBlock("large_dark_stone_reticula",
            () -> new Block(blockProps("large_dark_stone_reticula", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LARGE_LIGHT_DEEPSLATE_RETICULA = registerBlock("large_light_deepslate_reticula",
            () -> new Block(blockProps("large_light_deepslate_reticula", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LARGE_LIGHT_STONE_RETICULA = registerBlock("large_light_stone_reticula",
            () -> new Block(blockProps("large_light_stone_reticula", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> SMALL_DARK_STONE_RETICULA = registerBlock("small_dark_stone_reticula",
            () -> new Block(blockProps("small_dark_stone_reticula", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> SMALL_LIGHT_DEEPSLATE_RETICULA = registerBlock("small_light_deepslate_reticula",
            () -> new Block(blockProps("small_light_deepslate_reticula", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> SMALL_LIGHT_STONE_RETICULA = registerBlock("small_light_stone_reticula",
            () -> new Block(blockProps("small_light_stone_reticula", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));

//  TERRACOTTA:
//  ====================================================================================================================
    public static final RegistryObject<Block> TERRACOTTA_STAIRS = registerBlock("terracotta_stairs",
            () -> new StairBlock(Blocks.TERRACOTTA.defaultBlockState(),
                    blockProps("terracotta_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> TERRACOTTA_SLAB = registerBlock("terracotta_slab",
            () -> new SlabBlock(blockProps("terracotta_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> TERRACOTTA_FENCE = registerBlock("terracotta_fence",
            () -> new FenceBlock(blockProps("terracotta_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));
    public static final RegistryObject<Block> TERRACOTTA_FENCE_DOOR = registerBlock("terracotta_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("terracotta_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> TERRACOTTA_WALL = registerBlock("terracotta_wall",
            () -> new WallBlock(blockProps("terracotta_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));

    public static final RegistryObject<Block> WHITE_TERRACOTTA_STAIRS = registerBlock("white_terracotta_stairs",
            () -> new StairBlock(Blocks.WHITE_TERRACOTTA.defaultBlockState(),
                    blockProps("white_terracotta_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_SLAB = registerBlock("white_terracotta_slab",
            () -> new SlabBlock(blockProps("white_terracotta_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_FENCE = registerBlock("white_terracotta_fence",
            () -> new FenceBlock(blockProps("white_terracotta_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_FENCE_DOOR = registerBlock("white_terracotta_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("white_terracotta_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> WHITE_TERRACOTTA_WALL = registerBlock("white_terracotta_wall",
            () -> new WallBlock(blockProps("white_terracotta_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));

    public static final RegistryObject<Block> ORANGE_TERRACOTTA_STAIRS = registerBlock("orange_terracotta_stairs",
            () -> new StairBlock(Blocks.ORANGE_TERRACOTTA.defaultBlockState(),
                    blockProps("orange_terracotta_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_SLAB = registerBlock("orange_terracotta_slab",
            () -> new SlabBlock(blockProps("orange_terracotta_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_FENCE = registerBlock("orange_terracotta_fence",
            () -> new FenceBlock(blockProps("orange_terracotta_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_FENCE_DOOR = registerBlock("orange_terracotta_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("orange_terracotta_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> ORANGE_TERRACOTTA_WALL = registerBlock("orange_terracotta_wall",
            () -> new WallBlock(blockProps("orange_terracotta_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));

    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock("light_blue_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_BLUE_TERRACOTTA.defaultBlockState(),
                    blockProps("light_blue_terracotta_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock("light_blue_terracotta_slab",
            () -> new SlabBlock(blockProps("light_blue_terracotta_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_FENCE = registerBlock("light_blue_terracotta_fence",
            () -> new FenceBlock(blockProps("light_blue_terracotta_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_FENCE_DOOR = registerBlock("light_blue_terracotta_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("light_blue_terracotta_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> LIGHT_BLUE_TERRACOTTA_WALL = registerBlock("light_blue_terracotta_wall",
            () -> new WallBlock(blockProps("light_blue_terracotta_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));

    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock("light_gray_terracotta_stairs",
            () -> new StairBlock(Blocks.LIGHT_GRAY_TERRACOTTA.defaultBlockState(),
                    blockProps("light_gray_terracotta_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock("light_gray_terracotta_slab",
            () -> new SlabBlock(blockProps("light_gray_terracotta_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_FENCE = registerBlock("light_gray_terracotta_fence",
            () -> new FenceBlock(blockProps("light_gray_terracotta_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_FENCE_DOOR = registerBlock("light_gray_terracotta_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("light_gray_terracotta_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> LIGHT_GRAY_TERRACOTTA_WALL = registerBlock("light_gray_terracotta_wall",
            () -> new WallBlock(blockProps("light_gray_terracotta_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));

    public static final RegistryObject<Block> RED_TERRACOTTA_STAIRS = registerBlock("red_terracotta_stairs",
            () -> new StairBlock(Blocks.RED_TERRACOTTA.defaultBlockState(),
                    blockProps("red_terracotta_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> RED_TERRACOTTA_SLAB = registerBlock("red_terracotta_slab",
            () -> new SlabBlock(blockProps("red_terracotta_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> RED_TERRACOTTA_FENCE = registerBlock("red_terracotta_fence",
            () -> new FenceBlock(blockProps("red_terracotta_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));
    public static final RegistryObject<Block> RED_TERRACOTTA_FENCE_DOOR = registerBlock("red_terracotta_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("red_terracotta_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> RED_TERRACOTTA_WALL = registerBlock("red_terracotta_wall",
            () -> new WallBlock(blockProps("red_terracotta_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));

    public static final RegistryObject<Block> BLACK_TERRACOTTA_STAIRS = registerBlock("black_terracotta_stairs",
            () -> new StairBlock(Blocks.BLACK_TERRACOTTA.defaultBlockState(),
                    blockProps("black_terracotta_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_SLAB = registerBlock("black_terracotta_slab",
            () -> new SlabBlock(blockProps("black_terracotta_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_FENCE = registerBlock("black_terracotta_fence",
            () -> new FenceBlock(blockProps("black_terracotta_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_FENCE_DOOR = registerBlock("black_terracotta_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("black_terracotta_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> BLACK_TERRACOTTA_WALL = registerBlock("black_terracotta_wall",
            () -> new WallBlock(blockProps("black_terracotta_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));


//  SMOOTH SANDSTONE
    public static final RegistryObject<Block> SMOOTH_SANDSTONE_WALL = registerBlock("smooth_sandstone_wall",
            () -> new WallBlock(blockProps("smooth_sandstone_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_SANDSTONE))));

    public static final RegistryObject<Block> SMOOTH_RED_SANDSTONE_WALL = registerBlock("smooth_red_sandstone_wall",
            () -> new WallBlock(blockProps("smooth_red_sandstone_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.SMOOTH_RED_SANDSTONE))));


//  FLOORS:
//  ====================================================================================================================
    public static final RegistryObject<Block> BLACK_FLOOR_TILE = registerBlock("black_floor_tile",
            () -> new RotatedPillarBlock(blockProps("black_floor_tile", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).strength(3f))));
    public static final RegistryObject<Block> BLACK_FLOOR_TILE_CORNER = registerBlock("black_floor_tile_corner",
            () -> new PlayerFacingBlock(blockProps("black_floor_tile_corner", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR))));

    public static final RegistryObject<Block> WHITE_DOT_TILE = registerBlock("white_dot_tile",
            () -> new RotatedPillarBlock(blockProps("white_dot_tile", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).strength(3f))));
    public static final RegistryObject<Block> WHITE_DOT_TILE_CORNER = registerBlock("white_dot_tile_corner",
            () -> new PlayerFacingBlock(blockProps("white_dot_tile_corner", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR))));

    public static final RegistryObject<Block> CIRCLE_BLACK_TILE = registerBlock("circle_black_tile",
            () -> new RotatedPillarBlock(blockProps("circle_black_tile", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).strength(3f))));
    public static final RegistryObject<Block> CIRCLE_BLACK_TILE_CORNER = registerBlock("circle_black_tile_corner",
            () -> new PlayerFacingBlock(blockProps("circle_black_tile_corner", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR))));

    public static final RegistryObject<Block> CIRCLE_WHITE_TILE = registerBlock("circle_white_tile",
            () -> new RotatedPillarBlock(blockProps("circle_white_tile", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).strength(3f))));
    public static final RegistryObject<Block> CIRCLE_WHITE_TILE_CORNER = registerBlock("circle_white_tile_corner",
            () -> new PlayerFacingBlock(blockProps("circle_white_tile_corner", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR))));

    public static final RegistryObject<Block> DIAMOND_BLACK_TILE = registerBlock("diamond_black_tile",
            () -> new RotatedPillarBlock(blockProps("diamond_black_tile", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).strength(3f))));
    public static final RegistryObject<Block> DIAMOND_BLACK_TILE_CORNER = registerBlock("diamond_black_tile_corner",
            () -> new PlayerFacingBlock(blockProps("diamond_black_tile_corner", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR))));

    public static final RegistryObject<Block> DIAMOND_WHITE_TILE = registerBlock("diamond_white_tile",
            () -> new RotatedPillarBlock(blockProps("diamond_white_tile", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).strength(3f))));
    public static final RegistryObject<Block> DIAMOND_WHITE_TILE_CORNER = registerBlock("diamond_white_tile_corner",
            () -> new PlayerFacingBlock(blockProps("diamond_white_tile_corner", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR))));

    public static final RegistryObject<Block> DIAMOND_BLACK_AND_YELLOW_TILE = registerBlock("diamond_black_and_yellow_tile",
            () -> new RotatedPillarBlock(blockProps("diamond_black_and_yellow_tile", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).strength(3f))));
    public static final RegistryObject<Block> DIAMOND_BLACK_AND_YELLOW_TILE_CORNER = registerBlock("diamond_black_and_yellow_tile_corner",
            () -> new PlayerFacingBlock(blockProps("diamond_black_and_yellow_tile_corner", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR))));

    public static final RegistryObject<Block> DIAMOND_PINK_TILE = registerBlock("diamond_pink_tile",
            () -> new RotatedPillarBlock(blockProps("diamond_pink_tile", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR).strength(3f))));
    public static final RegistryObject<Block> DIAMOND_PINK_TILE_CORNER = registerBlock("diamond_pink_tile_corner",
            () -> new PlayerFacingBlock(blockProps("diamond_pink_tile_corner", BlockBehaviour.Properties.ofFullCopy(Blocks.QUARTZ_PILLAR))));

//  TUFF:
//  ====================================================================================================================
    public static final RegistryObject<Block> TUFF_STAIRS = registerBlock("tuff_stairs",
            () -> new StairBlock(Blocks.TUFF.defaultBlockState(),
                    blockProps("tuff_stairs", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> TUFF_SLAB = registerBlock("tuff_slab",
            () -> new SlabBlock(blockProps("tuff_slab", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> TUFF_BUTTON = registerBlock("tuff_button",
            () -> new ButtonBlock(BlockSetType.IRON, 10, blockProps("tuff_button", BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BUTTON))));
    public static final RegistryObject<Block> TUFF_PRESSURE_PLATE = registerBlock("tuff_pressure_plate",
            () -> new PressurePlateBlock(BlockSetType.IRON, blockProps("tuff_pressure_plate", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));
    public static final RegistryObject<Block> TUFF_FENCE = registerBlock("tuff_fence",
            () -> new FenceBlock(blockProps("tuff_fence", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));
    public static final RegistryObject<Block> TUFF_FENCE_DOOR = registerBlock("tuff_fence_door",
            () -> new FenceGateBlock(WoodType.OAK, blockProps("tuff_fence_door", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE)), SoundEvents.WOODEN_DOOR_OPEN, SoundEvents.WOODEN_DOOR_CLOSE));
    public static final RegistryObject<Block> TUFF_WALL = registerBlock("tuff_wall",
            () -> new WallBlock(blockProps("tuff_wall", BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK))));

//  DEBUG:
//  ====================================================================================================================
    public static final RegistryObject<Block> TEST_BLOCK_1 = registerBlock("test_block_1",
            () -> new Block(blockProps("test_block_1", BlockBehaviour.Properties.ofFullCopy(Blocks.COBBLESTONE))));

    public static final RegistryObject<Block> PILLAR_TEST = registerBlock("pillar_test",
            () -> new RotatedPillarBlock(blockProps("pillar_test", BlockBehaviour.Properties.ofFullCopy(Blocks.OAK_LOG).strength(3f))));

    public static final RegistryObject<Block> ORIENTABLE_TEST = registerBlock("orientable_test",
            () -> new PlayerFacingBlock(blockProps("orientable_test", BlockBehaviour.Properties.ofFullCopy(Blocks.PISTON))));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerLichenLike(String name, Supplier<T> block) {
        // Register the lichen-like block
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        // Automatically register the associated block item
        ITEMS.register(name, () -> new BlockItem(toReturn.get(), blockItemProps(name)));

        // Return the block reference
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ITEMS.register(name, () -> new BlockItem(block.get(), blockItemProps(name)));
    }

    public static void register(BusGroup busGroup) {
        BLOCKS.register(busGroup);
    }
}
