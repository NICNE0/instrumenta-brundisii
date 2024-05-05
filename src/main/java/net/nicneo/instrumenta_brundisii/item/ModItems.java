package net.nicneo.instrumenta_brundisii.item;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemNameBlockItem;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems{
    public static final DeferredRegister<Item> ITEMS =
        DeferredRegister.create(ForgeRegistries.ITEMS, instrumentaBrundisii.MOD_ID);

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

    public static final RegistryObject<Item> CORN_COB = ITEMS.register("corn_cob",
            () -> new Item(new Item.Properties().food(ModFoods.CORN_COB)));

    public static final RegistryObject<Item> CORN_SEEDS = ITEMS.register("corn_seeds",
            () -> new ItemNameBlockItem(ModBlocks.CORN_CROP.get(), new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}