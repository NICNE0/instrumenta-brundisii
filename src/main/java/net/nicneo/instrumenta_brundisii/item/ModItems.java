package net.nicneo.instrumenta_brundisii.item;

import net.minecraft.world.item.*;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.entity.ModEntities;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems{
    private static Item.Properties itemProps(String name) {
        return new Item.Properties().setId(ITEMS.key(name));
    }

    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, instrumentaBrundisii.MOD_ID);

    public static final RegistryObject<Item> PINK_BOUGAINVILLEA_BUNCH = ITEMS.register("pink_bougainvillea_bunch",
            () -> new Item(itemProps("pink_bougainvillea_bunch").stacksTo(64)));
    public static final RegistryObject<Item> ORANGE_BOUGAINVILLEA_BUNCH = ITEMS.register("orange_bougainvillea_bunch",
            () -> new Item(itemProps("orange_bougainvillea_bunch").stacksTo(64)));
    public static final RegistryObject<Item> WHITE_BOUGAINVILLEA_BUNCH = ITEMS.register("white_bougainvillea_bunch",
            () -> new Item(itemProps("white_bougainvillea_bunch").stacksTo(64)));

    public static final RegistryObject<Item> AURI = ITEMS.register("auri",
            () -> new Item(itemProps("auri").stacksTo(64)));

    public static final RegistryObject<Item> MOD_LOGO = ITEMS.register("mod_logo",
            () -> new Item(itemProps("mod_logo").stacksTo(64)));

    public static final RegistryObject<Item> DENARI = ITEMS.register("denari",
            () -> new Item(itemProps("denari").stacksTo(64)));

    public static final RegistryObject<Item> SESTERCI = ITEMS.register("sesterci",
            () -> new Item(itemProps("sesterci").stacksTo(64)));

    public static final RegistryObject<Item> AS = ITEMS.register("as",
            () -> new Item(itemProps("as").stacksTo(64)));

    public static final RegistryObject<Item> SEMI = ITEMS.register("semi",
            () -> new Item(itemProps("semi").stacksTo(64)));

    public static final RegistryObject<Item>  COMMON_TAILED_SPAWN_EGG = ITEMS.register("common_tailed_spawn_egg",
            () -> new SpawnEggItem(itemProps("common_tailed_spawn_egg").spawnEgg(ModEntities.COMMON_TAILED.get())));
    public static final RegistryObject<Item> COMMON_TAILED_EGG = ITEMS.register("common_tailed_egg",
            () -> new net.nicneo.instrumenta_brundisii.item.custom.CommonTailedEggItem(itemProps("common_tailed_egg").stacksTo(16)));

    public static final RegistryObject<Item> QUARTZ_SIGN = ITEMS.register("quartz_sign",
            () -> new SignItem(ModBlocks.QUARTZ_SIGN.get(), ModBlocks.QUARTZ_WALL_SIGN.get(), itemProps("quartz_sign").stacksTo(16)));
    public static final RegistryObject<Item> QUARTZ_HANGING_SIGN = ITEMS.register("quartz_hanging_sign",
            () -> new HangingSignItem(ModBlocks.QUARTZ_HANGING_SIGN.get(), ModBlocks.QUARTZ_WALL_HANGING_SIGN.get(), itemProps("quartz_hanging_sign").stacksTo(16)));

    public static final RegistryObject<Item> ANDESITE_SIGN = ITEMS.register("andesite_sign",
            () -> new SignItem(ModBlocks.ANDESITE_SIGN.get(), ModBlocks.ANDESITE_WALL_SIGN.get(), itemProps("andesite_sign").stacksTo(16)));
    public static final RegistryObject<Item> ANDESITE_HANGING_SIGN = ITEMS.register("andesite_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ANDESITE_HANGING_SIGN.get(), ModBlocks.ANDESITE_WALL_HANGING_SIGN.get(), itemProps("andesite_hanging_sign").stacksTo(16)));

    public static final RegistryObject<Item> DIORITE_SIGN = ITEMS.register("diorite_sign",
            () -> new SignItem(ModBlocks.DIORITE_SIGN.get(), ModBlocks.DIORITE_WALL_SIGN.get(), itemProps("diorite_sign").stacksTo(16)));
    public static final RegistryObject<Item> DIORITE_HANGING_SIGN = ITEMS.register("diorite_hanging_sign",
            () -> new HangingSignItem(ModBlocks.DIORITE_HANGING_SIGN.get(), ModBlocks.DIORITE_WALL_HANGING_SIGN.get(), itemProps("diorite_hanging_sign").stacksTo(16)));

    public static final RegistryObject<Item> GRANITE_SIGN = ITEMS.register("granite_sign",
            () -> new SignItem(ModBlocks.GRANITE_SIGN.get(), ModBlocks.GRANITE_WALL_SIGN.get(), itemProps("granite_sign").stacksTo(16)));
    public static final RegistryObject<Item> GRANITE_HANGING_SIGN = ITEMS.register("granite_hanging_sign",
            () -> new HangingSignItem(ModBlocks.GRANITE_HANGING_SIGN.get(), ModBlocks.GRANITE_WALL_HANGING_SIGN.get(), itemProps("granite_hanging_sign").stacksTo(16)));

    public static final RegistryObject<Item> CORN_COB = ITEMS.register("corn_cob",
            () -> new Item(itemProps("corn_cob").food(ModFoods.CORN_COB)));
    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new BlockItem(ModBlocks.CORN_CROP.get(), itemProps("corn_seeds")));

    public static final RegistryObject<Item> FLAX_SEEDS = ITEMS.register("flax_seeds",
            () -> new BlockItem(ModBlocks.FLAX_CROP.get(), itemProps("flax_seeds")));
    public static final RegistryObject<Item> FLAX_FIBERS = ITEMS.register("flax_fibers",
            () -> new Item(itemProps("flax_fibers").stacksTo(64)));

    public static final RegistryObject<Item> BARLEY_SEEDS = ITEMS.register("barley_seeds",
            () -> new BlockItem(ModBlocks.BARLEY_CROP.get(), itemProps("barley_seeds")));
    public static final RegistryObject<Item> BARLEY = ITEMS.register("barley",
            () -> new Item(itemProps("barley").stacksTo(64)));

    public static final RegistryObject<Item> OAT_SEEDS = ITEMS.register("oat_seeds",
            () -> new BlockItem(ModBlocks.OAT_CROP.get(), itemProps("oat_seeds")));
    public static final RegistryObject<Item> OATS = ITEMS.register("oats",
            () -> new Item(itemProps("oats").stacksTo(64)));

    public static final RegistryObject<Item> RYE_SEEDS = ITEMS.register("rye_seeds",
            () -> new BlockItem(ModBlocks.RYE_CROP.get(), itemProps("rye_seeds")));
    public static final RegistryObject<Item> RYE = ITEMS.register("rye",
            () -> new Item(itemProps("rye").stacksTo(64)));

    public static final RegistryObject<Item> LEEK_SEEDS = ITEMS.register("leek_seeds",
            () -> new BlockItem(ModBlocks.LEEK_CROP.get(), itemProps("leek_seeds")));
    public static final RegistryObject<Item> LEEK = ITEMS.register("leek",
            () -> new Item(itemProps("leek").stacksTo(64)));

    public static final RegistryObject<Item> GARLIC_SEEDS = ITEMS.register("garlic_seeds",
            () -> new BlockItem(ModBlocks.GARLIC_CROP.get(), itemProps("garlic_seeds")));
    public static final RegistryObject<Item> GARLIC = ITEMS.register("garlic",
            () -> new Item(itemProps("garlic").stacksTo(64)));

    public static final RegistryObject<Item> ONION_SEEDS = ITEMS.register("onion_seeds",
            () -> new BlockItem(ModBlocks.ONION_CROP.get(), itemProps("onion_seeds")));
    public static final RegistryObject<Item> ONION = ITEMS.register("onion",
            () -> new Item(itemProps("onion").stacksTo(64)));

    public static final RegistryObject<Item> ASPARAGUS_SEEDS = ITEMS.register("asparagus_seeds",
            () -> new BlockItem(ModBlocks.ASPARAGUS_CROP.get(), itemProps("asparagus_seeds")));
    public static final RegistryObject<Item> ASPARAGUS = ITEMS.register("asparagus",
            () -> new Item(itemProps("asparagus").stacksTo(64)));

    public static final RegistryObject<Item> PARSNIP_SEEDS = ITEMS.register("parsnip_seeds",
            () -> new BlockItem(ModBlocks.PARSNIP_CROP.get(), itemProps("parsnip_seeds")));
    public static final RegistryObject<Item> PARSNIP = ITEMS.register("parsnip",
            () -> new Item(itemProps("parsnip").stacksTo(64)));

    public static final RegistryObject<Item> CABBAGE_SEEDS = ITEMS.register("cabbage_seeds",
            () -> new BlockItem(ModBlocks.CABBAGE_CROP.get(), itemProps("cabbage_seeds")));
    public static final RegistryObject<Item> CABBAGE = ITEMS.register("cabbage",
            () -> new Item(itemProps("cabbage").stacksTo(64)));

    public static final RegistryObject<Item> OPIUM_SEEDS = ITEMS.register("opium_seeds",
            () -> new BlockItem(ModBlocks.OPIUM_CROP.get(), itemProps("opium_seeds")));
    public static final RegistryObject<Item> OPIUM_BULB = ITEMS.register("opium_bulb",
            () -> new Item(itemProps("opium_bulb").stacksTo(64)));

    public static final RegistryObject<Item> TOMATO_SEEDS = ITEMS.register("tomato_seeds",
            () -> new BlockItem(ModBlocks.TOMATO_CROP.get(), itemProps("tomato_seeds")));
    public static final RegistryObject<Item> TOMATO = ITEMS.register("tomato",
            () -> new Item(itemProps("tomato").stacksTo(64)));

    public static final RegistryObject<Item> SWEET_POTATO_SEEDS = ITEMS.register("sweet_potato_seeds",
            () -> new BlockItem(ModBlocks.SWEET_POTATO_CROP.get(), itemProps("sweet_potato_seeds")));
    public static final RegistryObject<Item> SWEET_POTATO = ITEMS.register("sweet_potato",
            () -> new Item(itemProps("sweet_potato").stacksTo(64)));

    public static final RegistryObject<Item> TURNIP_SEEDS = ITEMS.register("turnip_seeds",
            () -> new BlockItem(ModBlocks.TURNIP_CROP.get(), itemProps("turnip_seeds")));
    public static final RegistryObject<Item> TURNIP = ITEMS.register("turnip",
            () -> new Item(itemProps("turnip").stacksTo(64)));

    public static final RegistryObject<Item> COTTON_SEEDS = ITEMS.register("cotton_seeds",
            () -> new BlockItem(ModBlocks.COTTON_CROP.get(), itemProps("cotton_seeds")));
    public static final RegistryObject<Item> COTTON = ITEMS.register("cotton",
            () -> new Item(itemProps("cotton").stacksTo(64)));

    public static void register(BusGroup busGroup) {
        ITEMS.register(busGroup);
    }
}
