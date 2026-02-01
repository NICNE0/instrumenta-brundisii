package net.nicneo.instrumenta_brundisii.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.ScheduledTickAccess;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.MultifaceBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.util.RandomSource;

import javax.annotation.Nullable;

public class BougainvilleaBlock extends MultifaceBlock {

    public BougainvilleaBlock(Properties properties) {
        super(properties);
    }

    /**
     * Adjust the placement logic for your custom block.
     */
    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState state = super.getStateForPlacement(context);
        if (state != null) {
            // Additional placement logic can go here
            return state;
        }
        return null;
    }

    /**
     * Adjusts how the block behaves when the shape updates in the world.
     */
    @Override
    public BlockState updateShape(BlockState state, LevelReader level, ScheduledTickAccess tickAccess, BlockPos pos, Direction direction, BlockPos neighborPos, BlockState neighborState, RandomSource random) {
        // Check if the face is no longer valid
        if (hasFace(state, direction) && !canAttachTo(level, direction, neighborPos, neighborState)) {
            // Remove the invalid face
            return removeFaceManually(state, getFaceProperty(direction));
        }

        return super.updateShape(state, level, tickAccess, pos, direction, neighborPos, neighborState, random);
    }

    /**
     * Custom method to replicate the private removeFace method.
     */
    private BlockState removeFaceManually(BlockState state, BooleanProperty faceProperty) {
        // Set the specified face to false
        BlockState updatedState = state.setValue(faceProperty, false);

        // If no faces remain, replace the block with AIR
        if (!MultifaceBlock.hasAnyFace(updatedState)) {
            return Blocks.AIR.defaultBlockState();
        }

        return updatedState;
    }

    /**
     * Custom shape definition (optional, but the default shape logic should suffice for most use cases).
     */
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return super.getShape(state, level, pos, context); // Uses the cached voxel shape logic
    }


}
