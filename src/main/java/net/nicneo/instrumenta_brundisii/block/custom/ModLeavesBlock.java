package net.nicneo.instrumenta_brundisii.block.custom;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModLeavesBlock extends LeavesBlock {
    public static final MapCodec<ModLeavesBlock> CODEC = simpleCodec(ModLeavesBlock::new);

    public ModLeavesBlock(BlockBehaviour.Properties properties) {
        super(0.01F, properties);
    }

    @Override
    protected void spawnFallingLeavesParticle(Level level, BlockPos pos, RandomSource random) {
        // No custom falling leaves particles.
    }

    @Override
    public MapCodec<? extends LeavesBlock> codec() {
        return CODEC;
    }
}
