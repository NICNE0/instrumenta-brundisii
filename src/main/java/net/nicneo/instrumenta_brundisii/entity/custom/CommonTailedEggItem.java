package net.nicneo.instrumenta_brundisii.item.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.nicneo.instrumenta_brundisii.entity.ModEntities;
import net.nicneo.instrumenta_brundisii.entity.custom.ThrownCommonTailedEgg;

public class CommonTailedEggItem extends Item {
    public CommonTailedEggItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        if (!level.isClientSide) {
            ThrownCommonTailedEgg egg = new ThrownCommonTailedEgg(ModEntities.THROWN_COMMON_TAILED_EGG.get(), level);
            egg.setOwner(player);
            egg.setPos(player.getX(), player.getEyeY() - (double) 0.1F, player.getZ());
            egg.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
            level.addFreshEntity(egg);
        }

        level.playSound(null, player.getX(), player.getY(), player.getZ(),
                SoundEvents.EGG_THROW, player.getSoundSource(), 1.0F, 0.8F + level.random.nextFloat() * 0.4F);
        player.awardStat(Stats.ITEM_USED.get(this));
        if (!player.getAbilities().instabuild) {
            itemstack.shrink(1);
        }
        return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
    }
}
