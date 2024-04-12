package net.nicneo.instrumenta_brundisii.item;

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


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}



