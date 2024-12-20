package net.nicneo.instrumenta_brundisii.datagen;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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

        simpleItem(ModItems.CORN_SEEDS);
        simpleItem(ModItems.CORN_COB);

        simpleItem(ModItems.FLAX_SEEDS);
        simpleItem(ModItems.FLAX_FIBERS);

        simpleItem(ModItems.BARLEY_SEEDS);
        simpleItem(ModItems.BARLEY);

        simpleItem(ModItems.OAT_SEEDS);
        simpleItem(ModItems.OATS);

        simpleItem(ModItems.RYE_SEEDS);
        simpleItem(ModItems.RYE);

        simpleItem(ModItems.LEEK_SEEDS);
        simpleItem(ModItems.LEEK);

        simpleItem(ModItems.GARLIC_SEEDS);
        simpleItem(ModItems.GARLIC);

        simpleItem(ModItems.ONION_SEEDS);
        simpleItem(ModItems.ONION);

        simpleItem(ModItems.ASPARAGUS_SEEDS);
        simpleItem(ModItems.ASPARAGUS);

        simpleItem(ModItems.PARSNIP_SEEDS);
        simpleItem(ModItems.PARSNIP);

        simpleItem(ModItems.CABBAGE_SEEDS);
        simpleItem(ModItems.CABBAGE);

        simpleItem(ModItems.OPIUM_SEEDS);
        simpleItem(ModItems.OPIUM_BULB);

        simpleItem(ModItems.TOMATO_SEEDS);
        simpleItem(ModItems.TOMATO);

        simpleItem(ModItems.SWEET_POTATO_SEEDS);
        simpleItem(ModItems.SWEET_POTATO);

        simpleItem(ModItems.TURNIP_SEEDS);
        simpleItem(ModItems.TURNIP);

        simpleItem(ModItems.QUARTZ_SIGN);
        simpleItem(ModItems.QUARTZ_HANGING_SIGN);

        simpleItem(ModItems.ANDESITE_SIGN);
        simpleItem(ModItems.ANDESITE_HANGING_SIGN);

        simpleItem(ModItems.DIORITE_SIGN);
        simpleItem(ModItems.DIORITE_HANGING_SIGN);

        simpleItem(ModItems.GRANITE_SIGN);
        simpleItem(ModItems.GRANITE_HANGING_SIGN);
//      ========== FENCES ==========
        fenceItem(ModBlocks.PLASTER_FENCE, ModBlocks.PLASTER_BLOCK, false);
        fenceItem(ModBlocks.BLUE_PLASTER_FENCE, ModBlocks.BLUE_PLASTER_BLOCK, false);
        fenceItem(ModBlocks.DARK_BLUE_PLASTER_FENCE, ModBlocks.DARK_BLUE_PLASTER_BLOCK, false);
        fenceItem(ModBlocks.LIGHT_BLUE_PLASTER_FENCE, ModBlocks.LIGHT_BLUE_PLASTER_BLOCK, false);
        fenceItem(ModBlocks.GREEN_PLASTER_FENCE, ModBlocks.GREEN_PLASTER_BLOCK, false);
        fenceItem(ModBlocks.DARK_GREEN_PLASTER_FENCE, ModBlocks.DARK_GREEN_PLASTER_BLOCK, false);
        fenceItem(ModBlocks.RED_PLASTER_FENCE, ModBlocks.RED_PLASTER_BLOCK, false);
        fenceItem(ModBlocks.SCARLET_PLASTER_FENCE, ModBlocks.SCARLET_PLASTER_BLOCK, false);
        fenceItem(ModBlocks.YELLOW_PLASTER_FENCE, ModBlocks.YELLOW_PLASTER_BLOCK, false);
        fenceItem(ModBlocks.LIGHT_YELLOW_PLASTER_FENCE, ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK, false);
        fenceItem(ModBlocks.LIMESTONE_FENCE, ModBlocks.LIMESTONE_BRICKS, false);
        fenceItem(ModBlocks.TUFF_FENCE, Blocks.TUFF, true);
        fenceItem(ModBlocks.TERRACOTTA_FENCE, Blocks.TERRACOTTA, true);
        fenceItem(ModBlocks.WHITE_TERRACOTTA_FENCE, Blocks.WHITE_TERRACOTTA, true);
        fenceItem(ModBlocks.ORANGE_TERRACOTTA_FENCE, Blocks.ORANGE_TERRACOTTA, true);
        fenceItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE, Blocks.LIGHT_BLUE_TERRACOTTA, true);
        fenceItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE, Blocks.LIGHT_GRAY_TERRACOTTA, true);
        fenceItem(ModBlocks.RED_TERRACOTTA_FENCE, Blocks.RED_TERRACOTTA, true);
        fenceItem(ModBlocks.BLACK_TERRACOTTA_FENCE, Blocks.BLACK_TERRACOTTA, true);

//      ========== BUTTONS ==========
        buttonItem(ModBlocks.PLASTER_BUTTON, ModBlocks.PLASTER_BLOCK, false);
        buttonItem(ModBlocks.BLUE_PLASTER_BUTTON, ModBlocks.BLUE_PLASTER_BLOCK, false);
        buttonItem(ModBlocks.DARK_BLUE_PLASTER_BUTTON, ModBlocks.DARK_BLUE_PLASTER_BLOCK, false);
        buttonItem(ModBlocks.LIGHT_BLUE_PLASTER_BUTTON, ModBlocks.LIGHT_BLUE_PLASTER_BLOCK, false);
        buttonItem(ModBlocks.GREEN_PLASTER_BUTTON, ModBlocks.GREEN_PLASTER_BLOCK, false);
        buttonItem(ModBlocks.DARK_GREEN_PLASTER_BUTTON, ModBlocks.DARK_GREEN_PLASTER_BLOCK, false);
        buttonItem(ModBlocks.RED_PLASTER_BUTTON, ModBlocks.RED_PLASTER_BLOCK, false);
        buttonItem(ModBlocks.SCARLET_PLASTER_BUTTON, ModBlocks.SCARLET_PLASTER_BLOCK, false);
        buttonItem(ModBlocks.YELLOW_PLASTER_BUTTON, ModBlocks.YELLOW_PLASTER_BLOCK, false);
        buttonItem(ModBlocks.LIGHT_YELLOW_PLASTER_BUTTON, ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK, false);
        buttonItem(ModBlocks.LIMESTONE_BUTTON, ModBlocks.LIMESTONE_BRICKS, false);
        buttonItem(ModBlocks.TUFF_BUTTON, Blocks.TUFF, true);

//      ========== WALLS ==========
        wallItem(ModBlocks.PLASTER_WALL, ModBlocks.PLASTER_BLOCK, false);
        wallItem(ModBlocks.BLUE_PLASTER_WALL, ModBlocks.BLUE_PLASTER_BLOCK, false);
        wallItem(ModBlocks.DARK_BLUE_PLASTER_WALL, ModBlocks.DARK_BLUE_PLASTER_BLOCK, false);
        wallItem(ModBlocks.LIGHT_BLUE_PLASTER_WALL, ModBlocks.LIGHT_BLUE_PLASTER_BLOCK, false);
        wallItem(ModBlocks.GREEN_PLASTER_WALL, ModBlocks.GREEN_PLASTER_BLOCK, false);
        wallItem(ModBlocks.DARK_GREEN_PLASTER_WALL, ModBlocks.DARK_GREEN_PLASTER_BLOCK, false);
        wallItem(ModBlocks.RED_PLASTER_WALL, ModBlocks.RED_PLASTER_BLOCK, false);
        wallItem(ModBlocks.SCARLET_PLASTER_WALL, ModBlocks.SCARLET_PLASTER_BLOCK, false);
        wallItem(ModBlocks.YELLOW_PLASTER_WALL, ModBlocks.YELLOW_PLASTER_BLOCK, false);
        wallItem(ModBlocks.LIGHT_YELLOW_PLASTER_WALL, ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK, false);
        wallItem(ModBlocks.LIMESTONE_WALL, ModBlocks.LIMESTONE_BRICKS, false);
        wallItem(ModBlocks.TUFF_WALL, Blocks.TUFF, true);
        wallItem(ModBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA, true);
        wallItem(ModBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA, true);
        wallItem(ModBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA, true);
        wallItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA, true);
        wallItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA, true);
        wallItem(ModBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA, true);
        wallItem(ModBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA, true);

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
        evenSimplerBlockItem(ModBlocks.TERRACOTTA_STAIRS);
        evenSimplerBlockItem(ModBlocks.WHITE_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(ModBlocks.ORANGE_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(ModBlocks.RED_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLACK_TERRACOTTA_STAIRS);
        evenSimplerBlockItem(ModBlocks.TUFF_STAIRS);

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
        evenSimplerBlockItem(ModBlocks.TERRACOTTA_SLAB);
        evenSimplerBlockItem(ModBlocks.WHITE_TERRACOTTA_SLAB);
        evenSimplerBlockItem(ModBlocks.ORANGE_TERRACOTTA_SLAB);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
        evenSimplerBlockItem(ModBlocks.RED_TERRACOTTA_SLAB);
        evenSimplerBlockItem(ModBlocks.BLACK_TERRACOTTA_SLAB);
        evenSimplerBlockItem(ModBlocks.TUFF_SLAB);

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
        evenSimplerBlockItem(ModBlocks.TUFF_PRESSURE_PLATE);

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
        evenSimplerBlockItem(ModBlocks.TUFF_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.TERRACOTTA_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.WHITE_TERRACOTTA_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.ORANGE_TERRACOTTA_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.LIGHT_BLUE_TERRACOTTA_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.LIGHT_GRAY_TERRACOTTA_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.RED_TERRACOTTA_FENCE_DOOR);
        evenSimplerBlockItem(ModBlocks.BLACK_TERRACOTTA_FENCE_DOOR);
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(instrumentaBrundisii.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void fenceItem(RegistryObject<Block> block, Object baseBlock, boolean vanilla) {
        ResourceLocation textureLocation;

        if (vanilla) {
            if (baseBlock instanceof Block) {
                textureLocation = new ResourceLocation("minecraft", "block/" + ForgeRegistries.BLOCKS.getKey((Block) baseBlock).getPath());
            } else {
                throw new IllegalArgumentException("Expected a Block for baseBlock when vanilla is true.");
            }
        } else {
            if (baseBlock instanceof RegistryObject) {
                textureLocation = new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(((RegistryObject<Block>) baseBlock).get()).getPath());
            } else {
                throw new IllegalArgumentException("Expected a RegistryObject<Block> for baseBlock when vanilla is false.");
            }
        }

        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", textureLocation);
    }

    public void buttonItem(RegistryObject<Block> block, Object baseBlock, boolean vanilla) {
        ResourceLocation textureLocation;

        if (vanilla) {
            if (baseBlock instanceof Block) {
                textureLocation = new ResourceLocation("minecraft", "block/" + ForgeRegistries.BLOCKS.getKey((Block) baseBlock).getPath());
            } else {
                throw new IllegalArgumentException("Expected a Block for baseBlock when vanilla is true.");
            }
        } else {
            if (baseBlock instanceof RegistryObject) {
                textureLocation = new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(((RegistryObject<Block>) baseBlock).get()).getPath());
            } else {
                throw new IllegalArgumentException("Expected a RegistryObject<Block> for baseBlock when vanilla is false.");
            }
        }

        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", textureLocation);
    }

    public void wallItem(RegistryObject<Block> block, Object baseBlock, boolean vanilla) {
        ResourceLocation textureLocation;

        if (vanilla) {
            if (baseBlock instanceof Block) {
                textureLocation = new ResourceLocation("minecraft", "block/" + ForgeRegistries.BLOCKS.getKey((Block) baseBlock).getPath());
            } else {
                throw new IllegalArgumentException("Expected a Block for baseBlock when vanilla is true.");
            }
        } else {
            if (baseBlock instanceof RegistryObject) {
                textureLocation = new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(((RegistryObject<Block>) baseBlock).get()).getPath());
            } else {
                throw new IllegalArgumentException("Expected a RegistryObject<Block> for baseBlock when vanilla is false.");
            }
        }

        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", textureLocation);
    }

//    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
//        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
//                .texture("texture",  new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
//    }

//    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
//        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
//                .texture("wall",  new ResourceLocation(instrumentaBrundisii.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
//    }

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
