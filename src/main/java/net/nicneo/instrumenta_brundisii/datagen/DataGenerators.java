package net.nicneo.instrumenta_brundisii.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = instrumentaBrundisii.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new RecipeProvider.Runner(packOutput, lookupProvider) {
            @Override
            protected RecipeProvider createRecipeProvider(HolderLookup.Provider registries, net.minecraft.data.recipes.RecipeOutput output) {
                return new ModRecipeProvider(registries, output);
            }

            @Override
            public String getName() {
                return "Instrumenta Brundisii Recipes";
            }
        });
        generator.addProvider(event.includeServer(), ModLootTableProvider.create(packOutput, lookupProvider));

        generator.addProvider(event.includeClient(), new ItemModelDefinitionProvider(packOutput, instrumentaBrundisii.MOD_ID));

        generator.addProvider(event.includeServer(), new ModBlockTagGenerator(packOutput, lookupProvider, existingFileHelper));
        generator.addProvider(event.includeServer(), new ModItemTagGenerator(packOutput, lookupProvider, existingFileHelper));
    }
}
