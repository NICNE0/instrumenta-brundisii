package net.nicneo.instrumenta_brundisii.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.util.RandomSource;

public class OrientableSlabBlock extends SlabBlock {
    // Add AXIS property for log-like orientation
    public static final EnumProperty<Direction.Axis> AXIS = BlockStateProperties.AXIS;

    public OrientableSlabBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(TYPE, SlabType.BOTTOM)
                .setValue(AXIS, Direction.Axis.Y) // Default axis
                .setValue(WATERLOGGED, false)); // Ensure WATERLOGGED is initialized
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState existingState = context.getLevel().getBlockState(context.getClickedPos());
        boolean waterlogged = context.getLevel().getFluidState(context.getClickedPos()).isSource();

        // Handle merging slabs into a DOUBLE slab
        if (existingState.is(this) && existingState.getValue(TYPE) != SlabType.DOUBLE) {
            return existingState.setValue(TYPE, SlabType.DOUBLE).setValue(WATERLOGGED, waterlogged);
        }

        // Determine slab type based on click position
        SlabType slabType = context.getClickLocation().y - context.getClickedPos().getY() > 0.5
                ? SlabType.TOP
                : SlabType.BOTTOM;

        // Determine axis based on the clicked face
        Direction.Axis axis = context.getClickedFace().getAxis();

        // Return the appropriate block state
        return this.defaultBlockState()
                .setValue(TYPE, slabType)
                .setValue(AXIS, axis)
                .setValue(WATERLOGGED, waterlogged);
    }

    @Override
    public BlockState updateShape(BlockState state, LevelReader level, ScheduledTickAccess tickAccess, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        if (state.getValue(WATERLOGGED)) {
            tickAccess.scheduleTick(pos, Fluids.WATER, Fluids.WATER.getTickDelay(level));
        }
        return super.updateShape(state, level, tickAccess, pos, direction, neighborPos, neighborState, random);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        // Add TYPE (SlabType), AXIS (log-like orientation), and WATERLOGGED properties
        builder.add(TYPE, AXIS, WATERLOGGED);
    }
}
