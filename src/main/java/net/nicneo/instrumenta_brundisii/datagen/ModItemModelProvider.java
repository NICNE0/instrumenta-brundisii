package net.nicneo.instrumenta_brundisii.datagen;

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
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(instrumentaBrundisii.MOD_ID,"item/" + item.getId().getPath()));
    }
}
