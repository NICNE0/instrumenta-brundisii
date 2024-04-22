package net.nicneo.instrumenta_brundisii.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.nicneo.instrumenta_brundisii.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, instrumentaBrundisii.MOD_ID);

//  This Section defines the new block, in this case it is copying the properties of another block, cobblestone,
//    just as in other cases, the name is defined first as a method using upper case and then it's internal
//    identifier in the registerBlock argument.
    public static final RegistryObject<Block> PLASTER_BLOCK = registerBlock("plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> RED_PLASTER_BLOCK = registerBlock("red_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> SCARLET_PLASTER_BLOCK = registerBlock("scarlet_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> BLUE_PLASTER_BLOCK = registerBlock("blue_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> LIGHT_BLUE_PLASTER_BLOCK = registerBlock("light_blue_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> DARK_BLUE_PLASTER_BLOCK = registerBlock("dark_blue_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> YELLOW_PLASTER_BLOCK = registerBlock("yellow_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> LIGHT_YELLOW_PLASTER_BLOCK = registerBlock("light_yellow_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> GREEN_PLASTER_BLOCK = registerBlock("green_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> DARK_GREEN_PLASTER_BLOCK = registerBlock("dark_green_plaster_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));

    public static final RegistryObject<Block> RETICULA = registerBlock("reticula",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COBBLESTONE)));



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
