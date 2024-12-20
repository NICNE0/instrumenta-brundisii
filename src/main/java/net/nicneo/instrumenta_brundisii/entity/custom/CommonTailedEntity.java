package net.nicneo.instrumenta_brundisii.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
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
import net.nicneo.instrumenta_brundisii.sound.ModSounds;
import org.jetbrains.annotations.Nullable;

public class CommonTailedEntity extends Animal {
    public CommonTailedEntity(EntityType<? extends Animal> entityType, Level level) {
        super(entityType, level);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0, new PanicGoal(this, 2.0D)); // Run faster when hurt
        this.goalSelector.addGoal(1, new BreedGoal(this, 1.0D));
        this.goalSelector.addGoal(2, new TemptGoal(this, 1.25D, Ingredient.of(Items.WHEAT_SEEDS), false));
        this.goalSelector.addGoal(3, new RandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(4, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(5, new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 10.0D)
                .add(Attributes.FOLLOW_RANGE, 16.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.25D);
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel level, AgeableMob otherParent) {
        return ModEntities.COMMON_TAILED.get().create(level);
    }

    @Override
    public boolean isFood(ItemStack stack) {
        return stack.is(Items.WHEAT_SEEDS);
    }

    @Nullable
    @Override
    protected SoundEvent getAmbientSound() {
        return ModSounds.COMMON_TAILED_AMBIENT.get();
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