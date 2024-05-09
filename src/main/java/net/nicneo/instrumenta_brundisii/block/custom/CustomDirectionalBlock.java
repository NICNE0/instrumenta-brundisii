package net.nicneo.instrumenta_brundisii.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;

public class CustomDirectionalBlock extends RotatedPillarBlock {
    public static final EnumProperty<DiagonalAxis> DIAGONAL_AXIS = EnumProperty.create("diagonal", DiagonalAxis.class);

    public CustomDirectionalBlock(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState().setValue(DIAGONAL_AXIS, DiagonalAxis.NONE));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(DIAGONAL_AXIS);  // Add the diagonal axis property
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return super.getStateForPlacement(context).setValue(DIAGONAL_AXIS, DiagonalAxis.NONE);
    }

    @Override
    public InteractionResult use(BlockState state, Level world, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        ItemStack itemStack = player.getItemInHand(hand);
        if (itemStack.getItem() instanceof PickaxeItem) { // Check if the tool is a pickaxe.
            if (!world.isClientSide) {
                world.setBlock(pos, state.rotate(Rotation.CLOCKWISE_90), 3); // Rotate the block clockwise by 90 degrees.
                return InteractionResult.SUCCESS;
            }
        }
        return InteractionResult.PASS;
    }

    public enum DiagonalAxis implements StringRepresentable {
        NONE("none");

        private final String name;

        DiagonalAxis(String name) {
            this.name = name;
        }

        @Override
        public String getSerializedName() {
            return this.name;
        }
    }

}
