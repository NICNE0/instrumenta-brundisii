package net.nicneo.instrumenta_brundisii.datagen;

import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.nicneo.instrumenta_brundisii.item.ModItems;


public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, instrumentaBrundisii.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.AS);
        simpleItem(ModItems.AURI);
        simpleItem(ModItems.DENARI);
        simpleItem(ModItems.SEMI);
        simpleItem(ModItems.SESTERCI);

//      ========== FENCES ==========
        fenceItem(ModBlocks.PLASTER_FENCE, ModBlocks.PLASTER_BLOCK);
        fenceItem(ModBlocks.BLUE_PLASTER_FENCE, ModBlocks.BLUE_PLASTER_BLOCK);
        fenceItem(ModBlocks.DARK_BLUE_PLASTER_FENCE, ModBlocks.DARK_BLUE_PLASTER_BLOCK);
        fenceItem(ModBlocks.LIGHT_BLUE_PLASTER_FENCE, ModBlocks.LIGHT_BLUE_PLASTER_BLOCK);
        fenceItem(ModBlocks.GREEN_PLASTER_FENCE, ModBlocks.GREEN_PLASTER_BLOCK);
        fenceItem(ModBlocks.DARK_GREEN_PLASTER_FENCE, ModBlocks.DARK_GREEN_PLASTER_BLOCK);
        fenceItem(ModBlocks.RED_PLASTER_FENCE, ModBlocks.RED_PLASTER_BLOCK);
        fenceItem(ModBlocks.SCARLET_PLASTER_FENCE, ModBlocks.SCARLET_PLASTER_BLOCK);
        fenceItem(ModBlocks.YELLOW_PLASTER_FENCE, ModBlocks.YELLOW_PLASTER_BLOCK);
        fenceItem(ModBlocks.LIGHT_YELLOW_PLASTER_FENCE, ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK);
        fenceItem(ModBlocks.LIMESTONE_FENCE, ModBlocks.LIMESTONE_BRICKS);

//      ========== BUTTONS ==========
        buttonItem(ModBlocks.PLASTER_BUTTON, ModBlocks.PLASTER_BLOCK);
        buttonItem(ModBlocks.BLUE_PLASTER_BUTTON, ModBlocks.BLUE_PLASTER_BLOCK);
        buttonItem(ModBlocks.DARK_BLUE_PLASTER_BUTTON, ModBlocks.DARK_BLUE_PLASTER_BLOCK);
        buttonItem(ModBlocks.LIGHT_BLUE_PLASTER_BUTTON, ModBlocks.LIGHT_BLUE_PLASTER_BLOCK);
        buttonItem(ModBlocks.GREEN_PLASTER_BUTTON, ModBlocks.GREEN_PLASTER_BLOCK);
        buttonItem(ModBlocks.DARK_GREEN_PLASTER_BUTTON, ModBlocks.DARK_GREEN_PLASTER_BLOCK);
        buttonItem(ModBlocks.RED_PLASTER_BUTTON, ModBlocks.RED_PLASTER_BLOCK);
        buttonItem(ModBlocks.SCARLET_PLASTER_BUTTON, ModBlocks.SCARLET_PLASTER_BLOCK);
        buttonItem(ModBlocks.YELLOW_PLASTER_BUTTON, ModBlocks.YELLOW_PLASTER_BLOCK);
        buttonItem(ModBlocks.LIGHT_YELLOW_PLASTER_BUTTON, ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK);
        buttonItem(ModBlocks.LIMESTONE_BUTTON, ModBlocks.LIMESTONE_BRICKS);

//      ========== WALLS ==========
        wallItem(ModBlocks.PLASTER_WALL, ModBlocks.PLASTER_BLOCK);
        wallItem(ModBlocks.BLUE_PLASTER_WALL, ModBlocks.BLUE_PLASTER_BLOCK);
        wallItem(ModBlocks.DARK_BLUE_PLASTER_WALL, ModBlocks.DARK_BLUE_PLASTER_BLOCK);
        wallItem(ModBlocks.LIGHT_BLUE_PLASTER_WALL, ModBlocks.LIGHT_BLUE_PLASTER_BLOCK);
        wallItem(ModBlocks.GREEN_PLASTER_WALL, ModBlocks.GREEN_PLASTER_BLOCK);
        wallItem(ModBlocks.DARK_GREEN_PLASTER_WALL, ModBlocks.DARK_GREEN_PLASTER_BLOCK);
        wallItem(ModBlocks.RED_PLASTER_WALL, ModBlocks.RED_PLASTER_BLOCK);
        wallItem(ModBlocks.SCARLET_PLASTER_WALL, ModBlocks.SCARLET_PLASTER_BLOCK);
        wallItem(ModBlocks.YELLOW_PLASTER_WALL, ModBlocks.YELLOW_PLASTER_BLOCK);
        wallItem(ModBlocks.LIGHT_YELLOW_PLASTER_WALL, ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK);
        wallItem(ModBlocks.LIMESTONE_WALL, ModBlocks.LIMESTONE_BRICKS);

//      ========== STAIRS ==========
        evenSimplerBlockItem(ModBlocks.PLASTER_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLUE_PLASTER_STAIRS);
        evenSimplerBlockItem(ModBlocks.DARK_BLUE_PLASTER_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_PLASTER_STAIRS);
        evenSimplerBlockItem(ModBlocks.GREEN_PLASTER_STAIRS);
        evenSimplerBlockItem(ModBlocks.DARK_GREEN_PLASTER_STAIRS);
        evenSimplerBlockItem(ModBlocks.RED_PLASTER_STAIRS);
        evenSimplerBlockItem(ModBlocks.SCARLET_PLASTER_STAIRS);
        evenSimplerBlockItem(ModBlocks.YELLOW_PLASTER_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_YELLOW_PLASTER_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIMESTONE_STAIRS);

//      ========== SLABS ==========
        evenSimplerBlockItem(ModBlocks.PLASTER_SLAB);
        evenSimplerBlockItem(ModBlocks.BLUE_PLASTER_SLAB);
        evenSimplerBlockItem(ModBlocks.DARK_BLUE_PLASTER_SLAB);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_PLASTER_SLAB);
        evenSimplerBlockItem(ModBlocks.GREEN_PLASTER_SLAB);
        evenSimplerBlockItem(ModBlocks.DARK_GREEN_PLASTER_SLAB);
        evenSimplerBlockItem(ModBlocks.RED_PLASTER_SLAB);
        evenSimplerBlockItem(ModBlocks.SCARLET_PLASTER_SLAB);
        evenSimplerBlockItem(ModBlocks.YELLOW_PLASTER_SLAB);
        evenSimplerBlockItem(ModBlocks.LIGHT_YELLOW_PLASTER_SLAB);
        evenSimplerBlockItem(ModBlocks.LIMESTONE_SLAB);

//      ========== PRESSURE PLATES ==========
        evenSimplerBlockItem(ModBlocks.PLASTER_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.BLUE_PLASTER_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.DARK_BLUE_PLASTER_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_PLASTER_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.GREEN_PLASTER_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.DARK_GREEN_PLASTER_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.RED_PLASTER_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.SCARLET_PLASTER_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.YELLOW_PLASTER_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.LIGHT_YELLOW_PLASTER_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.LIMESTONE_PRESSURE_PLATE);

//      ========== FENCE DOORS ==========
        evenSimplerBlockItem(ModBlocks.PLASTER_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.BLUE_PLASTER_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.DARK_BLUE_PLASTER_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_PLASTER_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.GREEN_PLASTER_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.DARK_GREEN_PLASTER_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.RED_PLASTER_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.SCARLET_PLASTER_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.YELLOW_PLASTER_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.LIGHT_YELLOW_PLASTER_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.LIMESTONE_FENCE_DOOR);
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(instrumentaBrundisii.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }


    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(instrumentaBrundisii.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(instrumentaBrundisii.MOD_ID,"item/" + item.getId().getPath()));
    }

}
