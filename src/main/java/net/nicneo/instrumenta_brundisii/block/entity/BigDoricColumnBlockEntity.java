package net.nicneo.instrumenta_brundisii.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

public class BigDoricColumnBlockEntity extends BlockEntity {
    public BigDoricColumnBlockEntity(BlockPos p_155229_, BlockState p_155230_) {
        super(ModBlockEntities.BIG_DORIC_COLUMN.get(), p_155229_, p_155230_);
    }
}
