package net.nicneo.instrumenta_brundisii.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, instrumentaBrundisii.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
//      PLASTER:
        blockWithItem(ModBlocks.PLASTER_BLOCK);
        blockWithItem(ModBlocks.BLUE_PLASTER_BLOCK);
        blockWithItem(ModBlocks.DARK_BLUE_PLASTER_BLOCK);
        blockWithItem(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK);
        blockWithItem(ModBlocks.GREEN_PLASTER_BLOCK);
        blockWithItem(ModBlocks.DARK_GREEN_PLASTER_BLOCK);
        blockWithItem(ModBlocks.RED_PLASTER_BLOCK);
        blockWithItem(ModBlocks.SCARLET_PLASTER_BLOCK);
        blockWithItem(ModBlocks.YELLOW_PLASTER_BLOCK);
        blockWithItem(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK);


        blockWithItem(ModBlocks.RETICULA);
    }

//    This lets you pass the registry Object and creates a custom block and an item for it
    private void  blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

}
