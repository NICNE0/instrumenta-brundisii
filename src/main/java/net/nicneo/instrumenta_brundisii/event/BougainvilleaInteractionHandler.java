package net.nicneo.instrumenta_brundisii.event;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.item.ModItems;

@Mod.EventBusSubscriber
public class BougainvilleaInteractionHandler {

    @SubscribeEvent
    public static void onBlockRightClick(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        if (level.isClientSide) return; // Only run on the server side

        Player player = event.getEntity();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);
        ItemStack heldItem = player.getItemInHand(event.getHand());

        // Handle bonemeal interaction
        if (heldItem.is(Items.BONE_MEAL)) {
            handleBonemealInteraction((ServerLevel) level, state, pos, player, event.getHand(), event);
        }

        // Handle stick interaction
        if (heldItem.is(Items.STICK)) {
            handleStickInteraction((ServerLevel) level, state, pos, player, event);
        }
    }

    private static void handleBonemealInteraction(ServerLevel level, BlockState state, BlockPos pos, Player player, InteractionHand hand, PlayerInteractEvent.RightClickBlock event) {
        RandomSource random = level.random;
        Block currentBlock = state.getBlock();

        // Upgrade logic using bonemeal
        if (currentBlock == ModBlocks.PINK_BOUGAINVILLEA.get()) {
            BlockState newState = random.nextBoolean()
                    ? ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_1.get().defaultBlockState()
                    : ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_2.get().defaultBlockState();
            level.setBlock(pos, copyProperties(state, newState), Block.UPDATE_ALL);
        } else if (currentBlock == ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_1.get() || currentBlock == ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_2.get()) {
            BlockState newState = random.nextBoolean()
                    ? ModBlocks.PINK_FLOWERING_BOUGAINVILLEA_1.get().defaultBlockState()
                    : ModBlocks.PINK_FLOWERING_BOUGAINVILLEA_2.get().defaultBlockState();
            level.setBlock(pos, copyProperties(state, newState), Block.UPDATE_ALL);
        }

        // Consume one bonemeal from the player
        ItemStack heldItem = player.getItemInHand(hand);
        if (!player.getAbilities().instabuild) {
            heldItem.shrink(1);
        }

        event.setCancellationResult(InteractionResult.SUCCESS);
        event.setCanceled(true);
    }

    private static void handleStickInteraction(ServerLevel level, BlockState state, BlockPos pos, Player player, PlayerInteractEvent.RightClickBlock event) {
        RandomSource random = level.random;
        Block currentBlock = state.getBlock();

        // Downgrade logic using stick
        if (currentBlock == ModBlocks.PINK_FLOWERING_BOUGAINVILLEA_1.get() || currentBlock == ModBlocks.PINK_FLOWERING_BOUGAINVILLEA_2.get()) {
            BlockState newState = random.nextBoolean()
                    ? ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_1.get().defaultBlockState()
                    : ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_2.get().defaultBlockState();
            level.setBlock(pos, copyProperties(state, newState), Block.UPDATE_ALL);
        } else if (currentBlock == ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_1.get() || currentBlock == ModBlocks.PINK_BLOOMING_BOUGAINVILLEA_2.get()) {
            BlockState newState = ModBlocks.PINK_BOUGAINVILLEA.get().defaultBlockState();
            level.setBlock(pos, copyProperties(state, newState), Block.UPDATE_ALL);
        }

        // Give the player one PINK_BOUGAINVILLEA_BUNCH item
        ItemStack drop = new ItemStack(ModItems.PINK_BOUGAINVILLEA_BUNCH.get());
        player.addItem(drop);

        event.setCancellationResult(InteractionResult.SUCCESS);
        event.setCanceled(true);
    }

    private static BlockState copyProperties(BlockState oldState, BlockState newState) {
        for (Property<?> property : oldState.getProperties()) {
            if (newState.hasProperty(property)) {
                newState = copyProperty(oldState, newState, property);
            }
        }
        return newState;
    }

    private static <T extends Comparable<T>> BlockState copyProperty(BlockState oldState, BlockState newState, Property<T> property) {
        return newState.setValue(property, oldState.getValue(property));
    }

}
