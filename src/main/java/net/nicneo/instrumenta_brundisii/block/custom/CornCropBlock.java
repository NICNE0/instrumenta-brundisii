package net.nicneo.instrumenta_brundisii.block.custom;

import net.nicneo.instrumenta_brundisii.item.ModItems;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.IPlantable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;


public class CornCropBlock extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 4);
    public static final int MAX_AGE = 4;
    private static final int DOUBLE_PLANT_AGE_INTERSECTION = 2;
    private static final VoxelShape[] SHAPE_BY_AGE = new VoxelShape[]{
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D),
            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)
    };

    public CornCropBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE_BY_AGE[this.getAge(pState)];
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isAreaLoaded(pos, 1)) return;
        int currentAge = state.getValue(AGE);

        if (currentAge < MAX_AGE && level.getRawBrightness(pos, 0) >= 9) {
            float growthSpeed = getGrowthSpeed(this, level, pos);

            if (ForgeHooks.onCropsGrowPre(level, pos, state, random.nextInt((int)(25.0F / growthSpeed) + 1) == 0)) {
                // Increment the age of the bottom block
                int newAge = currentAge + 1;
                if (newAge > MAX_AGE) {
                    newAge = MAX_AGE;
                }
                BlockState newState = state.setValue(AGE, newAge);
                level.setBlock(pos, newState, 2);

                // Check if it's time to manage the top block
                BlockPos posAbove = pos.above();
                BlockState stateAbove = level.getBlockState(posAbove);

                if (newAge >= DOUBLE_PLANT_AGE_INTERSECTION) {
                    if (stateAbove.is(Blocks.AIR)) {
                        // Place the top block with an initial age
                        level.setBlock(posAbove, this.defaultBlockState().setValue(AGE, 1), 2);
                    } else if (stateAbove.getBlock() == this && newAge - 1 > stateAbove.getValue(AGE)) {
                        // Only update the top block if the new age is greater than the top block's age
                        level.setBlock(posAbove, stateAbove.setValue(AGE, newAge - 1), 2);
                    }
                }
                ForgeHooks.onCropsGrowPost(level, pos, newState);
            }
        }
    }


    @Override
    public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction facing, IPlantable plantable) {
        return super.mayPlaceOn(state, world, pos);
    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        return super.canSurvive(pState, pLevel, pPos) || (pLevel.getBlockState(pPos.below(1)).is(this) &&
                pLevel.getBlockState(pPos.below(1)).getValue(AGE) == 4);
    }

    @Override
    public void growCrops(Level pLevel, BlockPos pPos, BlockState pState) {
        int currentAge = this.getAge(pState);
        if (currentAge < this.getMaxAge()) {
            int nextAge = currentAge + this.getBonemealAgeIncrease(pLevel);

            if (nextAge > this.getMaxAge()) {
                nextAge = this.getMaxAge();
            }

            pLevel.setBlock(pPos, pState.setValue(AGE, nextAge), 2);

            if (currentAge >= 1) {
                BlockPos posAbove = pPos.above();
                BlockState stateAbove = pLevel.getBlockState(posAbove);
                if (stateAbove.getBlock() == this) {  // Ensure top is already this block type or air for placing
                    pLevel.setBlock(posAbove, stateAbove.setValue(AGE, nextAge), 2);
                } else if (stateAbove.is(Blocks.AIR) && nextAge >= 2) {
                    pLevel.setBlock(posAbove, this.defaultBlockState().setValue(AGE, nextAge), 2);
                }
            }
        }
    }

    @Override
    public int getMaxAge() {
        return MAX_AGE;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.CORN_SEEDS.get();
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(AGE);
    }
}