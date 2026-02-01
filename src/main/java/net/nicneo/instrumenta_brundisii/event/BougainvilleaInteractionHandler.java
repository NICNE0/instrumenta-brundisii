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
import net.minecraftforge.common.util.Result;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.item.ModItems;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = "instrumenta_brundisii", bus = Mod.EventBusSubscriber.Bus.FORGE)
public class BougainvilleaInteractionHandler {

    // Store Bougainvillea block variants by color
    private static final Map<String, BougainvilleaVariants> VARIANT_MAP = new HashMap<>();

    @SubscribeEvent
    public static void onBlockRightClick(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        if (level.isClientSide()) return; // Only run on the server side

        Player player = event.getEntity();
        BlockPos pos = event.getPos();
        BlockState state = level.getBlockState(pos);
        ItemStack heldItem = player.getItemInHand(event.getHand());

        // Determine the color of the block
        String color = getColorFromBlock(state.getBlock());
        if (color == null) return; // If the block is not a Bougainvillea variant, do nothing

        // Handle bonemeal interaction
        if (heldItem.is(Items.BONE_MEAL)) {
            handleBonemealInteraction(color, (ServerLevel) level, state, pos, player, event.getHand(), event);
        }

        // Handle stick interaction
        if (heldItem.is(Items.STICK)) {
            handleStickInteraction(color, (ServerLevel) level, state, pos, player, event);
        }
    }

    private static void handleBonemealInteraction(String color, ServerLevel level, BlockState state, BlockPos pos, Player player, InteractionHand hand, PlayerInteractEvent.RightClickBlock event) {
        RandomSource random = level.random;
        BougainvilleaVariants variants = VARIANT_MAP.get(color);
        Block currentBlock = state.getBlock();

        // Upgrade logic using bonemeal
        if (currentBlock == variants.base) {
            BlockState newState = random.nextBoolean()
                    ? variants.blooming1.defaultBlockState()
                    : variants.blooming2.defaultBlockState();
            level.setBlock(pos, copyProperties(state, newState), Block.UPDATE_ALL);
        } else if (currentBlock == variants.blooming1 || currentBlock == variants.blooming2) {
            BlockState newState = random.nextBoolean()
                    ? variants.flowering1.defaultBlockState()
                    : variants.flowering2.defaultBlockState();
            level.setBlock(pos, copyProperties(state, newState), Block.UPDATE_ALL);
        }

        // Consume one bonemeal from the player
        ItemStack heldItem = player.getItemInHand(hand);
        if (!player.getAbilities().instabuild) {
            heldItem.shrink(1);
        }

        event.setCancellationResult(InteractionResult.SUCCESS);
        event.setUseBlock(Result.DENY);
        event.setUseItem(Result.DENY);
    }

    private static void handleStickInteraction(String color, ServerLevel level, BlockState state, BlockPos pos, Player player, PlayerInteractEvent.RightClickBlock event) {
        RandomSource random = level.random;
        BougainvilleaVariants variants = VARIANT_MAP.get(color);
        Block currentBlock = state.getBlock();

        // Downgrade logic using stick
        if (currentBlock == variants.flowering1 || currentBlock == variants.flowering2) {
            BlockState newState = random.nextBoolean()
                    ? variants.blooming1.defaultBlockState()
                    : variants.blooming2.defaultBlockState();
            level.setBlock(pos, copyProperties(state, newState), Block.UPDATE_ALL);
        } else if (currentBlock == variants.blooming1 || currentBlock == variants.blooming2) {
            BlockState newState = variants.base.defaultBlockState();
            level.setBlock(pos, copyProperties(state, newState), Block.UPDATE_ALL);
        }

        // Give the player one Bougainvillea bunch item
        ItemStack drop = new ItemStack(ModItems.PINK_BOUGAINVILLEA_BUNCH.get()); // Use a single type of bunch for now
        player.addItem(drop);

        event.setCancellationResult(InteractionResult.SUCCESS);
        event.setUseBlock(Result.DENY);
        event.setUseItem(Result.DENY);
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

    static void registerColor(String color, Block base, Block blooming1, Block blooming2, Block flowering1, Block flowering2) {
        VARIANT_MAP.put(color, new BougainvilleaVariants(base, blooming1, blooming2, flowering1, flowering2));
    }

    private static String getColorFromBlock(Block block) {
        for (Map.Entry<String, BougainvilleaVariants> entry : VARIANT_MAP.entrySet()) {
            BougainvilleaVariants variants = entry.getValue();
            if (block == variants.base || block == variants.blooming1 || block == variants.blooming2 || block == variants.flowering1 || block == variants.flowering2) {
                return entry.getKey();
            }
        }
        return null; // Block is not a Bougainvillea variant
    }

    private static class BougainvilleaVariants {
        final Block base;
        final Block blooming1;
        final Block blooming2;
        final Block flowering1;
        final Block flowering2;

        BougainvilleaVariants(Block base, Block blooming1, Block blooming2, Block flowering1, Block flowering2) {
            this.base = base;
            this.blooming1 = blooming1;
            this.blooming2 = blooming2;
            this.flowering1 = flowering1;
            this.flowering2 = flowering2;
        }
    }
}
