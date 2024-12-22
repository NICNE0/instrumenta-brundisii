package net.nicneo.instrumenta_brundisii.entity.custom;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.nicneo.instrumenta_brundisii.entity.ModEntities;
import net.nicneo.instrumenta_brundisii.item.ModItems;

public class ThrownCommonTailedEgg extends ThrowableItemProjectile {

    public ThrownCommonTailedEgg(EntityType<? extends ThrownCommonTailedEgg> entityType, Level level) {
        super(entityType, level);
    }

    public ThrownCommonTailedEgg(Level level, Player player) {
        super(ModEntities.THROWN_COMMON_TAILED_EGG.get(), player, level);
    }

    @Override
    protected Item getDefaultItem() {
        // Returns the item representation of this projectile
        return ModItems.COMMON_TAILED_EGG.get();
    }

    @Override
    protected void onHitEntity(EntityHitResult hitResult) {
        // Plays a sound when the egg hits an entity
        super.onHitEntity(hitResult);
        this.playSound(SoundEvents.EGG_THROW, 1.0F, 1.0F);
    }

    @Override
    protected void onHit(HitResult hitResult) {
        super.onHit(hitResult);
        Level level = this.level();

        if (!level.isClientSide) {
            // Random chance to spawn one or two Common Tailed entities
            if (level.random.nextInt(8) == 0) { // 1 in 8 chance
                int count = level.random.nextInt(4) == 0 ? 2 : 1; // 25% chance to spawn two
                for (int i = 0; i < count; ++i) {
                    CommonTailedEntity entity = ModEntities.COMMON_TAILED.get().create(level);
                    if (entity != null) {
                        entity.setAge(-24000); // Spawn as a baby
                        entity.moveTo(this.getX(), this.getY(), this.getZ(), this.getYRot(), 0.0F);
                        level.addFreshEntity(entity);
                    }
                }
            }

            // Spawn particles on the server
            if (level instanceof ServerLevel serverLevel) {
                serverLevel.sendParticles(
                        ParticleTypes.ITEM_SNOWBALL, // The particle type
                        this.getX(), this.getY(), this.getZ(), // Position
                        6, // Number of particles
                        0.2, 0.2, 0.2, // Spread/delta
                        0.0 // Speed
                );
            }

            // Discard the thrown egg entity after impact
            this.discard();
        }
    }
}