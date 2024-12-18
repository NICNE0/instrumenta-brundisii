package net.nicneo.instrumenta_brundisii.item;

import net.minecraft.world.level.block.Blocks;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, instrumentaBrundisii.MOD_ID);

    public static final RegistryObject<CreativeModeTab> GENERAL_MOD_TAB = CREATIVE_MODE_TABS.register("instrumenta_brundisii",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOD_LOGO.get()))
                    .title(Component.translatable("instrumenta.brundisii_tab"))
                    .displayItems((pParameters, pOutput) -> {

//                      RETICULAS:
                        pOutput.accept(ModBlocks.RETICULA.get());
                        pOutput.accept(ModBlocks.LIGHT_RETICULA.get());
                        pOutput.accept(ModBlocks.MIXED_RETICULA.get());

//                      FLOORS:
                        pOutput.accept(ModBlocks.BLACK_FLOOR_TILE.get());
                        pOutput.accept(ModBlocks.BLACK_FLOOR_TILE_CORNER.get());

                        pOutput.accept(ModBlocks.WHITE_DOT_TILE.get());
                        pOutput.accept(ModBlocks.WHITE_DOT_TILE_CORNER.get());

                        pOutput.accept(ModBlocks.CIRCLE_BLACK_TILE.get());
                        pOutput.accept(ModBlocks.CIRCLE_BLACK_TILE_CORNER.get());

                        pOutput.accept(ModBlocks.CIRCLE_WHITE_TILE.get());
                        pOutput.accept(ModBlocks.CIRCLE_WHITE_TILE_CORNER.get());

                        pOutput.accept(ModBlocks.DIAMOND_BLACK_TILE.get());
                        pOutput.accept(ModBlocks.DIAMOND_BLACK_TILE_CORNER.get());

                        pOutput.accept(ModBlocks.DIAMOND_WHITE_TILE.get());
                        pOutput.accept(ModBlocks.DIAMOND_WHITE_TILE_CORNER.get());

                        pOutput.accept(ModBlocks.DIAMOND_BLACK_AND_YELLOW_TILE.get());
                        pOutput.accept(ModBlocks.DIAMOND_BLACK_AND_YELLOW_TILE_CORNER.get());

                        pOutput.accept(ModBlocks.DIAMOND_PINK_TILE.get());
                        pOutput.accept(ModBlocks.DIAMOND_PINK_TILE_CORNER.get());


//                      TUFF PLASTER:
                        pOutput.accept(ModBlocks.TUFF_SLAB.get());
                        pOutput.accept(ModBlocks.TUFF_STAIRS.get());
                        pOutput.accept(ModBlocks.TUFF_WALL.get());
                        pOutput.accept(ModBlocks.TUFF_FENCE.get());
                        pOutput.accept(ModBlocks.TUFF_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.TUFF_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.TUFF_BUTTON.get());

//                      LIMESTONE PLASTER:
                        pOutput.accept(ModBlocks.LIMESTONE_BRICKS.get());
                        pOutput.accept(ModBlocks.LIMESTONE_SLAB.get());
                        pOutput.accept(ModBlocks.LIMESTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.LIMESTONE_WALL.get());
                        pOutput.accept(ModBlocks.LIMESTONE_FENCE.get());
                        pOutput.accept(ModBlocks.LIMESTONE_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.LIMESTONE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.LIMESTONE_BUTTON.get());
                        pOutput.accept(ModBlocks.LIME_BRICK_MIX.get());

//                      TERRACOTTA:
                        pOutput.accept(ModBlocks.TERRACOTTA_SLAB.get());
                        pOutput.accept(ModBlocks.TERRACOTTA_STAIRS.get());
                        pOutput.accept(ModBlocks.TERRACOTTA_WALL.get());
                        pOutput.accept(ModBlocks.TERRACOTTA_FENCE.get());
                        pOutput.accept(ModBlocks.TERRACOTTA_FENCE_DOOR.get());
//                      WHITE TERRACOTTA:
                        pOutput.accept(ModBlocks.WHITE_TERRACOTTA_STAIRS.get());
                        pOutput.accept(ModBlocks.WHITE_TERRACOTTA_SLAB.get());
                        pOutput.accept(ModBlocks.WHITE_TERRACOTTA_WALL.get());
                        pOutput.accept(ModBlocks.WHITE_TERRACOTTA_FENCE.get());
                        pOutput.accept(ModBlocks.WHITE_TERRACOTTA_FENCE_DOOR.get());
//                      ORANGE TERRACOTTA:
                        pOutput.accept(ModBlocks.ORANGE_TERRACOTTA_STAIRS.get());
                        pOutput.accept(ModBlocks.ORANGE_TERRACOTTA_SLAB.get());
                        pOutput.accept(ModBlocks.ORANGE_TERRACOTTA_WALL.get());
                        pOutput.accept(ModBlocks.ORANGE_TERRACOTTA_FENCE.get());
                        pOutput.accept(ModBlocks.ORANGE_TERRACOTTA_FENCE_DOOR.get());
//                      LIGHT BLUE TERRACOTTA:
                        pOutput.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_DOOR.get());
//                      LIGHT GRAY TERRACOTTA:
                        pOutput.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE.get());
                        pOutput.accept(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_DOOR.get());
//                      RED TERRACOTTA:
                        pOutput.accept(ModBlocks.RED_TERRACOTTA_STAIRS.get());
                        pOutput.accept(ModBlocks.RED_TERRACOTTA_SLAB.get());
                        pOutput.accept(ModBlocks.RED_TERRACOTTA_WALL.get());
                        pOutput.accept(ModBlocks.RED_TERRACOTTA_FENCE.get());
                        pOutput.accept(ModBlocks.RED_TERRACOTTA_FENCE_DOOR.get());
//                      BLACK TERRACOTTA:
                        pOutput.accept(ModBlocks.BLACK_TERRACOTTA_STAIRS.get());
                        pOutput.accept(ModBlocks.BLACK_TERRACOTTA_SLAB.get());
                        pOutput.accept(ModBlocks.BLACK_TERRACOTTA_WALL.get());
                        pOutput.accept(ModBlocks.BLACK_TERRACOTTA_FENCE.get());
                        pOutput.accept(ModBlocks.BLACK_TERRACOTTA_FENCE_DOOR.get());

//                      RED PLASTER:
                        pOutput.accept(ModBlocks.RED_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_BUTTON.get());
//                      SCARLET PLASTER:
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_BUTTON.get());
//                      LIGHT YELLOW PLASTER:
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_BUTTON.get());
//                      YELLOW PLASTER:
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_BUTTON.get());
//                      PLASTER:
                        pOutput.accept(ModBlocks.PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.PLASTER_BUTTON.get());
//                      LIGHT BLUE PLASTER:
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_BUTTON.get());
//                      BLUE PLASTER:
                        pOutput.accept(ModBlocks.BLUE_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_BUTTON.get());
//                      DARK BLUE PLASTER:
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_BUTTON.get());
//                      GREEN PLASTER:
                        pOutput.accept(ModBlocks.GREEN_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_BUTTON.get());
//                      DARK GREEN PLASTER:
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_BUTTON.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> COINS_MOD_TAB = CREATIVE_MODE_TABS.register("instrumenta_brundisii_coins",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AURI.get()))
                    .title(Component.translatable("instrumenta.brundisii_coins_tab"))
                    .displayItems((pParameters, pOutput) -> {

//                      COINS:
                        pOutput.accept(ModItems.AURI.get());
                        pOutput.accept(ModItems.DENARI.get());
                        pOutput.accept(ModItems.SESTERCI.get());
                        pOutput.accept(ModItems.AS.get());
                        pOutput.accept(ModItems.SEMI.get());

                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> DE_RE_COQUINARIA = CREATIVE_MODE_TABS.register("de_re_coquinaria",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(Blocks.CAULDRON))
                    .title(Component.translatable("instrumenta.brundisii_de_re_coquinaria"))
                    .displayItems((pParameters, pOutput) -> {

//                      CORN:
                        pOutput.accept(ModItems.CORN_COB.get());
                        pOutput.accept(ModItems.CORN_SEEDS.get());

//                      FLAX:
                        pOutput.accept(ModItems.FLAX_FIBERS.get());
                        pOutput.accept(ModItems.FLAX_SEEDS.get());

//                      BARLEY:
                        pOutput.accept(ModItems.BARLEY.get());
                        pOutput.accept(ModItems.BARLEY_SEEDS.get());

//                      OATS:
                        pOutput.accept(ModItems.OATS.get());
                        pOutput.accept(ModItems.OAT_SEEDS.get());

//                      RYE:
                        pOutput.accept(ModItems.RYE.get());
                        pOutput.accept(ModItems.RYE_SEEDS.get());

//                      LEEK:
                        pOutput.accept(ModItems.LEEK.get());
                        pOutput.accept(ModItems.LEEK_SEEDS.get());

//                      GARLIC:
                        pOutput.accept(ModItems.GARLIC.get());
                        pOutput.accept(ModItems.GARLIC_SEEDS.get());

//                      ONION:
                        pOutput.accept(ModItems.ONION.get());
                        pOutput.accept(ModItems.ONION_SEEDS.get());

//                      ASPARAGUS:
                        pOutput.accept(ModItems.ASPARAGUS.get());
                        pOutput.accept(ModItems.ASPARAGUS_SEEDS.get());

//                      PARSNIP:
                        pOutput.accept(ModItems.PARSNIP.get());
                        pOutput.accept(ModItems.PARSNIP_SEEDS.get());

//                      CABBAGE:
                        pOutput.accept(ModItems.CABBAGE.get());
                        pOutput.accept(ModItems.CABBAGE_SEEDS.get());

//                      OPIUM:
                        pOutput.accept(ModItems.OPIUM_BULB.get());
                        pOutput.accept(ModItems.OPIUM_SEEDS.get());

//                      TOMATO:
                        pOutput.accept(ModItems.TOMATO.get());
                        pOutput.accept(ModItems.TOMATO_SEEDS.get());

//                      SWEET POTATO:
                        pOutput.accept(ModItems.SWEET_POTATO.get());
                        pOutput.accept(ModItems.SWEET_POTATO_SEEDS.get());

//                      TURNIP:
                        pOutput.accept(ModItems.TURNIP.get());
                        pOutput.accept(ModItems.TURNIP_SEEDS.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
