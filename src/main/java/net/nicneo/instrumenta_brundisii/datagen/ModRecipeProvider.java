package net.nicneo.instrumenta_brundisii.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.nicneo.instrumenta_brundisii.item.ModItems;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    @Override
    protected void buildRecipes() {

        RecipeOutput output = this.output;


        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_BLACK_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.BLACK_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.BLACK_TERRACOTTA), has(Items.BLACK_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_BLACK_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_BLUE_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.BLUE_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.BLUE_TERRACOTTA), has(Items.BLUE_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_BLUE_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_BROWN_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.BROWN_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.BROWN_TERRACOTTA), has(Items.BROWN_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_BROWN_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_CYAN_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.CYAN_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.CYAN_TERRACOTTA), has(Items.CYAN_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_CYAN_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_GRAY_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.GRAY_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.GRAY_TERRACOTTA), has(Items.GRAY_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_GRAY_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_GREEN_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.GREEN_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.GREEN_TERRACOTTA), has(Items.GREEN_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_GREEN_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_LIGHT_BLUE_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.LIGHT_BLUE_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.LIGHT_BLUE_TERRACOTTA), has(Items.LIGHT_BLUE_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_LIGHT_BLUE_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_LIGHT_GRAY_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.LIGHT_GRAY_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.LIGHT_GRAY_TERRACOTTA), has(Items.LIGHT_GRAY_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_LIGHT_GRAY_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_LIME_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.LIME_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.LIME_TERRACOTTA), has(Items.LIME_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_LIME_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_MAGENTA_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.MAGENTA_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.MAGENTA_TERRACOTTA), has(Items.MAGENTA_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_MAGENTA_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_ORANGE_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.ORANGE_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.ORANGE_TERRACOTTA), has(Items.ORANGE_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_ORANGE_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_PINK_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.PINK_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.PINK_TERRACOTTA), has(Items.PINK_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_PINK_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_PURPLE_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.PURPLE_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.PURPLE_TERRACOTTA), has(Items.PURPLE_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_PURPLE_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_RED_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.RED_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.RED_TERRACOTTA), has(Items.RED_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_RED_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.TERRACOTTA), has(Items.TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_WHITE_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.WHITE_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.WHITE_TERRACOTTA), has(Items.WHITE_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_WHITE_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_YELLOW_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.YELLOW_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.YELLOW_TERRACOTTA), has(Items.YELLOW_TERRACOTTA))
                .save(output, recipeKey(ModBlocks.LINTEL_YELLOW_TERRACOTTA.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_BLUE_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.BLUE_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.BLUE_PLASTER_BLOCK.get()), has(ModBlocks.BLUE_PLASTER_BLOCK.get()))
                .save(output, recipeKey(ModBlocks.LINTEL_BLUE_PLASTER_BLOCK.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_DARK_BLUE_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.DARK_BLUE_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get()), has(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get()))
                .save(output, recipeKey(ModBlocks.LINTEL_DARK_BLUE_PLASTER_BLOCK.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_DARK_GREEN_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.DARK_GREEN_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()), has(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()))
                .save(output, recipeKey(ModBlocks.LINTEL_DARK_GREEN_PLASTER_BLOCK.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_GREEN_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.GREEN_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.GREEN_PLASTER_BLOCK.get()), has(ModBlocks.GREEN_PLASTER_BLOCK.get()))
                .save(output, recipeKey(ModBlocks.LINTEL_GREEN_PLASTER_BLOCK.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_LIGHT_BLUE_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get()), has(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get()))
                .save(output, recipeKey(ModBlocks.LINTEL_LIGHT_BLUE_PLASTER_BLOCK.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_LIGHT_YELLOW_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get()), has(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get()))
                .save(output, recipeKey(ModBlocks.LINTEL_LIGHT_YELLOW_PLASTER_BLOCK.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.PLASTER_BLOCK.get()), has(ModBlocks.PLASTER_BLOCK.get()))
                .save(output, recipeKey(ModBlocks.LINTEL_PLASTER_BLOCK.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_RED_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.RED_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.RED_PLASTER_BLOCK.get()), has(ModBlocks.RED_PLASTER_BLOCK.get()))
                .save(output, recipeKey(ModBlocks.LINTEL_RED_PLASTER_BLOCK.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_SCARLET_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.SCARLET_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.SCARLET_PLASTER_BLOCK.get()), has(ModBlocks.SCARLET_PLASTER_BLOCK.get()))
                .save(output, recipeKey(ModBlocks.LINTEL_SCARLET_PLASTER_BLOCK.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_YELLOW_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.YELLOW_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.YELLOW_PLASTER_BLOCK.get()), has(ModBlocks.YELLOW_PLASTER_BLOCK.get()))
                .save(output, recipeKey(ModBlocks.LINTEL_YELLOW_PLASTER_BLOCK.get()));

        shaped(RecipeCategory.MISC, ModBlocks.LINTEL_BRICKS.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.BRICKS)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.BRICKS), has(Items.BRICKS))
                .save(output, recipeKey(ModBlocks.LINTEL_BRICKS.get()));


        shaped(RecipeCategory.MISC, ModItems.AURI.get())
                .pattern(" # ")
                .pattern("###")
                .pattern(" # ")
                .define('#', Items.GOLD_NUGGET)
                .unlockedBy(getHasName(Items.GOLD_NUGGET), has(Items.GOLD_NUGGET))
                .save(output, recipeKey(ModItems.AURI.get()));

        shaped(RecipeCategory.MISC, ModItems.DENARI.get())
                .pattern(" # ")
                .pattern("###")
                .pattern(" # ")
                .define('#', Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(output, recipeKey(ModItems.DENARI.get()));

        shaped(RecipeCategory.MISC, ModItems.SEMI.get())
                .define('#', Items.NETHERITE_SCRAP)
                .define('O', Items.COPPER_INGOT)
                .pattern(" # ")
                .pattern("#O#")
                .pattern(" # ")
                .unlockedBy(getHasName(Items.NETHERITE_SCRAP), has(Items.NETHERITE_SCRAP))
                .save(output, recipeKey(ModItems.SEMI.get()));

        shapeless(RecipeCategory.MISC, ModItems.AS.get(), 2)
                .requires(Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(output, recipeKey(ModItems.AS.get()));

        shapeless(RecipeCategory.MISC, ModItems.SESTERCI.get(), 2)
                .requires(Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(output, recipeKey(ModItems.SESTERCI.get()));
    }

    private ResourceKey<net.minecraft.world.item.crafting.Recipe<?>> recipeKey(ItemLike result) {
        return ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(instrumentaBrundisii.MOD_ID, getSimpleRecipeName(result)));
    }

}
























