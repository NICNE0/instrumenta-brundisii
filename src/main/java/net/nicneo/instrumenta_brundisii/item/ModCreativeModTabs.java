package net.nicneo.instrumenta_brundisii.item;

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

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("instrumenta_brundisii",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MOD_LOGO.get()))
                    .title(Component.translatable("instrumenta.brundisii_tab"))
                    .displayItems((pParameters, pOutput) -> {

//                      BLOCKS:
                        pOutput.accept(ModBlocks.PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_BLOCK.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get());

                        pOutput.accept(ModBlocks.RETICULA.get());
                        pOutput.accept(ModBlocks.LIGHT_RETICULA.get());
                        pOutput.accept(ModBlocks.MIXED_RETICULA.get());
                        pOutput.accept(ModBlocks.LIME_BRICK_MIX.get());
                        pOutput.accept(ModBlocks.LIMESTONE_BRICKS.get());

//                      SLABS:
                        pOutput.accept(ModBlocks.LIMESTONE_SLAB.get());
                        pOutput.accept(ModBlocks.PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_SLAB.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_SLAB.get());

//                      STAIRS:
                        pOutput.accept(ModBlocks.LIMESTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_STAIRS.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_STAIRS.get());

//                      STAIRS:
                        pOutput.accept(ModBlocks.LIMESTONE_WALL.get());
                        pOutput.accept(ModBlocks.PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_WALL.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_WALL.get());

//                      FENCE:
                        pOutput.accept(ModBlocks.LIMESTONE_FENCE.get());
                        pOutput.accept(ModBlocks.PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_FENCE.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_FENCE.get());

//                      FENCE_GATE:
                        pOutput.accept(ModBlocks.LIMESTONE_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_FENCE_DOOR.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_FENCE_DOOR.get());

//                      PRESSURE PLATES:
                        pOutput.accept(ModBlocks.LIMESTONE_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_PRESSURE_PLATE.get());

//                      BUTTONS:
                        pOutput.accept(ModBlocks.LIMESTONE_BUTTON.get());
                        pOutput.accept(ModBlocks.PLASTER_BUTTON.get());
                        pOutput.accept(ModBlocks.BLUE_PLASTER_BUTTON.get());
                        pOutput.accept(ModBlocks.DARK_BLUE_PLASTER_BUTTON.get());
                        pOutput.accept(ModBlocks.LIGHT_BLUE_PLASTER_BUTTON.get());
                        pOutput.accept(ModBlocks.GREEN_PLASTER_BUTTON.get());
                        pOutput.accept(ModBlocks.DARK_GREEN_PLASTER_BUTTON.get());
                        pOutput.accept(ModBlocks.RED_PLASTER_BUTTON.get());
                        pOutput.accept(ModBlocks.SCARLET_PLASTER_BUTTON.get());
                        pOutput.accept(ModBlocks.YELLOW_PLASTER_BUTTON.get());
                        pOutput.accept(ModBlocks.LIGHT_YELLOW_PLASTER_BUTTON.get());







//                      COINS:
                        pOutput.accept(ModItems.AURI.get());
                        pOutput.accept(ModItems.DENARI.get());
                        pOutput.accept(ModItems.SESTERCI.get());
                        pOutput.accept(ModItems.AS.get());
                        pOutput.accept(ModItems.SEMI.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
