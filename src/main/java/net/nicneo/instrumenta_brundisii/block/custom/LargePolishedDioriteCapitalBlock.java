
package net.nicneo.instrumenta_brundisii.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nicneo.instrumenta_brundisii.block.entity.PolishedDioriteLargeDoricCapitalBlockEntity;
import org.jetbrains.annotations.Nullable;

public class LargePolishedDioriteCapitalBlock extends BaseEntityBlock {

    public static final DirectionProperty FACING = DirectionProperty.create("facing", Direction.Plane.HORIZONTAL);


    // Define the custom shape of your column (adjust as needed)
    private static final VoxelShape SHAPE = Shapes.or(
            Block.box(0, 0, 0, 15, 16, 15) // Example: A column shape
    );

    public LargePolishedDioriteCapitalBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(FACING, Direction.NORTH)); // Set default facing
    }

    // Define the rendering shape as a model
    @Override
    public RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    // Use the custom shape for rendering the block's outline
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    // Use the custom shape for collision (physical interactions)
    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    // Ensure the block doesn't block light unnecessarily
    @Override
    public boolean useShapeForLightOcclusion(BlockState state) {
        return false;
    }

    // Override to set the block facing direction when placed
    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Player player = context.getPlayer();
        if (player != null) {
            Direction facing = player.getDirection(); // Get the direction the player is facing
            return this.defaultBlockState().setValue(FACING, facing.getOpposite()); // Set north face towards the player
        }
        return this.defaultBlockState();
    }

    // Create a new BlockEntity for this block
    @Nullable
    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new PolishedDioriteLargeDoricCapitalBlockEntity(pos, state);
    }

    // Add the FACING property to the block's state container
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
        