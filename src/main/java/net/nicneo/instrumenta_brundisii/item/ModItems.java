package net.nicneo.instrumenta_brundisii.item;

import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.entity.ModEntities;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems{
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, instrumentaBrundisii.MOD_ID);

    public static final RegistryObject<Item> PINK_BOUGAINVILLEA_BUNCH = ITEMS.register("pink_bougainvillea_bunch",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> ORANGE_BOUGAINVILLEA_BUNCH = ITEMS.register("orange_bougainvillea_bunch",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final RegistryObject<Item> WHITE_BOUGAINVILLEA_BUNCH = ITEMS.register("white_bougainvillea_bunch",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> AURI = ITEMS.register("auri",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> MOD_LOGO = ITEMS.register("mod_logo",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> DENARI = ITEMS.register("denari",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> SESTERCI = ITEMS.register("sesterci",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> AS = ITEMS.register("as",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> SEMI = ITEMS.register("semi",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item>  COMMON_TAILED_SPAWN_EGG = ITEMS.register("common_tailed_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.COMMON_TAILED, 0x4f3d37, 0x015b69,
                    new Item.Properties()));
    public static final RegistryObject<Item> COMMON_TAILED_EGG = ITEMS.register("common_tailed_egg",
            () -> new net.nicneo.instrumenta_brundisii.item.custom.CommonTailedEggItem(new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> QUARTZ_SIGN = ITEMS.register("quartz_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.QUARTZ_SIGN.get(), ModBlocks.QUARTZ_WALL_SIGN.get()));
    public static final RegistryObject<Item> QUARTZ_HANGING_SIGN = ITEMS.register("quartz_hanging_sign",
            () -> new HangingSignItem(ModBlocks.QUARTZ_HANGING_SIGN.get(), ModBlocks.QUARTZ_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ANDESITE_SIGN = ITEMS.register("andesite_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ANDESITE_SIGN.get(), ModBlocks.ANDESITE_WALL_SIGN.get()));
    public static final RegistryObject<Item> ANDESITE_HANGING_SIGN = ITEMS.register("andesite_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ANDESITE_HANGING_SIGN.get(), ModBlocks.ANDESITE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> DIORITE_SIGN = ITEMS.register("diorite_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.DIORITE_SIGN.get(), ModBlocks.DIORITE_WALL_SIGN.get()));
    public static final RegistryObject<Item> DIORITE_HANGING_SIGN = ITEMS.register("diorite_hanging_sign",
            () -> new HangingSignItem(ModBlocks.DIORITE_HANGING_SIGN.get(), ModBlocks.DIORITE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> GRANITE_SIGN = ITEMS.register("granite_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GRANITE_SIGN.get(), ModBlocks.GRANITE_WALL_SIGN.get()));
    public static final RegistryObject<Item> GRANITE_HANGING_SIGN = ITEMS.register("granite_hanging_sign",
            () -> new HangingSignItem(ModBlocks.GRANITE_HANGING_SIGN.get(), ModBlocks.GRANITE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> CORN_COB = ITEMS.register("corn_cob",
            () -> new Item(new Item.Properties().food(ModFoods.CORN_COB)));
    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CORN_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> FLAX_SEEDS = ITEMS.register("flax_seeds",
            () -> new ItemNameBlockItem(ModBlocks.FLAX_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> FLAX_FIBERS = ITEMS.register("flax_fibers",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> BARLEY_SEEDS = ITEMS.register("barley_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BARLEY_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> BARLEY = ITEMS.register("barley",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> OAT_SEEDS = ITEMS.register("oat_seeds",
            () -> new ItemNameBlockItem(ModBlocks.OAT_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> OATS = ITEMS.register("oats",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> RYE_SEEDS = ITEMS.register("rye_seeds",
            () -> new ItemNameBlockItem(ModBlocks.RYE_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> RYE = ITEMS.register("rye",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> LEEK_SEEDS = ITEMS.register("leek_seeds",
            () -> new ItemNameBlockItem(ModBlocks.LEEK_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> LEEK = ITEMS.register("leek",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> GARLIC_SEEDS = ITEMS.register("garlic_seeds",
            () -> new ItemNameBlockItem(ModBlocks.GARLIC_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> ONION_SEEDS = ITEMS.register("onion_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ONION_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> ASPARAGUS_SEEDS = ITEMS.register("asparagus_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ASPARAGUS_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> ASPARAGUS = ITEMS.register("asparagus",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> PARSNIP_SEEDS = ITEMS.register("parsnip_seeds",
            () -> new ItemNameBlockItem(ModBlocks.PARSNIP_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> PARSNIP = ITEMS.register("parsnip",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> CABBAGE_SEEDS = ITEMS.register("cabbage_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CABBAGE_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> OPIUM_SEEDS = ITEMS.register("opium_seeds",
            () -> new ItemNameBlockItem(ModBlocks.OPIUM_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> OPIUM_BULB = ITEMS.register("opium_bulb",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TOMATO_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> SWEET_POTATO_SEEDS = ITEMS.register("sweet_potato_seeds",
            () -> new ItemNameBlockItem(ModBlocks.SWEET_POTATO_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> SWEET_POTATO = ITEMS.register("sweet_potato",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> TURNIP_SEEDS = ITEMS.register("turnip_seeds",
            () -> new ItemNameBlockItem(ModBlocks.TURNIP_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> TURNIP = ITEMS.register("turnip",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}