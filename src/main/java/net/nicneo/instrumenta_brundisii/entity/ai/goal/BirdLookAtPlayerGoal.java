package net.nicneo.instrumenta_brundisii.entity.ai.goal;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.animal.Animal;

import java.util.EnumSet;

public class BirdLookAtPlayerGoal extends Goal {
    private final Animal bird; // Your bird entity
    private LivingEntity target;
    private final float sideAngle; // Side-view angle (in degrees)
    private final float maxDistance;

    public BirdLookAtPlayerGoal(Animal bird, float maxDistance, float sideAngle) {
        this.bird = bird;
        this.maxDistance = maxDistance;
        this.sideAngle = sideAngle; // Side angle to "look at" the player
        this.setFlags(EnumSet.of(Goal.Flag.LOOK));
    }

    @Override
    public boolean canUse() {
        // Check if there's a nearby player to look at
        LivingEntity potentialTarget = this.bird.level().getNearestPlayer(this.bird, this.maxDistance);
        if (potentialTarget == null) {
            return false;
        } else {
            this.target = potentialTarget;
            return true;
        }
    }

    @Override
    public boolean canContinueToUse() {
        return this.target != null && this.target.isAlive() && this.bird.distanceToSqr(this.target) <= (this.maxDistance * this.maxDistance);
    }

    @Override
    public void stop() {
        this.target = null;
    }

    @Override
    public void tick() {
        if (this.target != null) {
            // Get the direction to the player
            double dx = this.target.getX() - this.bird.getX();
            double dz = this.target.getZ() - this.bird.getZ();

            // Calculate yaw to face the side toward the player
            double angleToPlayer = Math.toDegrees(Math.atan2(dz, dx)) - 90.0D; // Rotate 90 degrees to the side
            double sideViewAngle = angleToPlayer + this.sideAngle; // Adjust by the custom side angle

            this.bird.setYRot((float) sideViewAngle); // Rotate the body
            this.bird.yHeadRot = (float) sideViewAngle; // Rotate the head
        }
    }
}
