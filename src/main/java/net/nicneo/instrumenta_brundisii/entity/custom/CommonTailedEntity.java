package net.nicneo.instrumenta_brundisii.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.nicneo.instrumenta_brundisii.entity.ModEntities;
import net.nicneo.instrumenta_brundisii.entity.ai.goal.BirdLookAtPlayerGoal;
import net.nicneo.instrumenta_brundisii.item.ModItems;
import net.nicneo.instrumenta_brundisii.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

public class CommonTailedEntity extends Animal {

    // Ambient sound cooldown (for quacking less often)
    private int ambientSoundCooldown = 0;

    // Egg-laying timer
    private int eggTime = this.random.nextInt(6000) + 4000; // Random time between 5 and 10 minutes

    public CommonTailedEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new PanicGoal(this, 2.0D)); // Run faster when hurt
        this.goalSelector.addGoal(1, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(2, new TemptGoal(this, 1.25D, Ingredient.of(Items.WHEAT_SEEDS), false));
        this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(4, new BirdLookAtPlayerGoal(this, 10.0F, 60.0F)); // Look at the player with a 60-degree side view
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
    }


    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 5.0D)
                .add(Attributes.FOLLOW_RANGE, 16.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D)
                .add(Attributes.TEMPT_RANGE, 10.0D);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return ModEntities.COMMON_TAILED.get().create(level, EntitySpawnReason.BREEDING);
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(Items.WHEAT_SEEDS);
    }

    @Override
    public void aiStep() {
        super.aiStep();

        // Ambient sound cooldown logic
        if (ambientSoundCooldown > 0) {
            ambientSoundCooldown--;
        }

        // Egg-laying logic
        if (!this.level().isClientSide() && !this.isBaby() && --this.eggTime <= 0) {
            this.playSound(SoundEvents.CHICKEN_EGG, 1.0F, (this.random.nextFloat() - this.random.nextFloat()) * 0.2F + 1.0F);
            if (this.level() instanceof ServerLevel serverLevel) {
                this.spawnAtLocation(serverLevel, ModItems.COMMON_TAILED_EGG.get());
            }
            this.eggTime = this.random.nextInt(6000) + 3000; // Reset egg timer
        }
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        // Only play ambient sound if cooldown is 0
        if (ambientSoundCooldown == 0) {
            // Reset cooldown to a random value (similar to chickens)
            ambientSoundCooldown = this.random.nextInt(400) + 200; // Between 10 and 30 seconds
            return ModSounds.COMMON_TAILED_AMBIENT.get();
        }
        return null; // No sound if cooldown is active
    }

    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSource) {
        return ModSounds.COMMON_TAILED_HURT.get();
    }

    @Nullable
    @Override
    protected SoundEvent getDeathSound() {
        return ModSounds.COMMON_TAILED_DEATH.get();
    }
}
