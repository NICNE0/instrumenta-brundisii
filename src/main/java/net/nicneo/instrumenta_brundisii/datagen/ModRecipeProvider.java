package net.nicneo.instrumenta_brundisii.datagen;

import net.minecraft.tags.ItemTags;
import net.nicneo.instrumenta_brundisii.instrumentaBrundisii;
import net.nicneo.instrumenta_brundisii.block.ModBlocks;
import net.nicneo.instrumenta_brundisii.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> p_251297_) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_BLACK_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.BLACK_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.BLACK_TERRACOTTA), has(Items.BLACK_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_BLUE_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.BLUE_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.BLUE_TERRACOTTA), has(Items.BLUE_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_BROWN_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.BROWN_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.BROWN_TERRACOTTA), has(Items.BROWN_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_CYAN_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.CYAN_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.CYAN_TERRACOTTA), has(Items.CYAN_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_GRAY_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.GRAY_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.GRAY_TERRACOTTA), has(Items.GRAY_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_GREEN_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.GREEN_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.GREEN_TERRACOTTA), has(Items.GREEN_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_LIGHT_BLUE_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.LIGHT_BLUE_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.LIGHT_BLUE_TERRACOTTA), has(Items.LIGHT_BLUE_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_LIGHT_GRAY_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.LIGHT_GRAY_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.LIGHT_GRAY_TERRACOTTA), has(Items.LIGHT_GRAY_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_LIME_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.LIME_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.LIME_TERRACOTTA), has(Items.LIME_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_MAGENTA_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.MAGENTA_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.MAGENTA_TERRACOTTA), has(Items.MAGENTA_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_ORANGE_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.ORANGE_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.ORANGE_TERRACOTTA), has(Items.ORANGE_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_PINK_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.PINK_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.PINK_TERRACOTTA), has(Items.PINK_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_PURPLE_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.PURPLE_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.PURPLE_TERRACOTTA), has(Items.PURPLE_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_RED_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.RED_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.RED_TERRACOTTA), has(Items.RED_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.TERRACOTTA), has(Items.TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_WHITE_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.WHITE_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.WHITE_TERRACOTTA), has(Items.WHITE_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_YELLOW_TERRACOTTA.get())
                .define('#', Items.OAK_LOG)
                .define('O', Items.YELLOW_TERRACOTTA)
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(Items.YELLOW_TERRACOTTA), has(Items.YELLOW_TERRACOTTA))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_BLUE_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.BLUE_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.BLUE_PLASTER_BLOCK.get()), has(ModBlocks.BLUE_PLASTER_BLOCK.get()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_DARK_BLUE_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.DARK_BLUE_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get()), has(ModBlocks.DARK_BLUE_PLASTER_BLOCK.get()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_DARK_GREEN_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.DARK_GREEN_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()), has(ModBlocks.DARK_GREEN_PLASTER_BLOCK.get()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_GREEN_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.GREEN_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.GREEN_PLASTER_BLOCK.get()), has(ModBlocks.GREEN_PLASTER_BLOCK.get()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_LIGHT_BLUE_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get()), has(ModBlocks.LIGHT_BLUE_PLASTER_BLOCK.get()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_LIGHT_YELLOW_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get()), has(ModBlocks.LIGHT_YELLOW_PLASTER_BLOCK.get()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.PLASTER_BLOCK.get()), has(ModBlocks.PLASTER_BLOCK.get()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_RED_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.RED_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.RED_PLASTER_BLOCK.get()), has(ModBlocks.RED_PLASTER_BLOCK.get()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_SCARLET_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.SCARLET_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.SCARLET_PLASTER_BLOCK.get()), has(ModBlocks.SCARLET_PLASTER_BLOCK.get()))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.LINTEL_YELLOW_PLASTER_BLOCK.get())
                .define('#', Items.OAK_LOG)
                .define('O', ModBlocks.YELLOW_PLASTER_BLOCK.get())
                .pattern("   ")
                .pattern("  O")
                .pattern("  #")
                .unlockedBy(getHasName(ModBlocks.YELLOW_PLASTER_BLOCK.get()), has(ModBlocks.YELLOW_PLASTER_BLOCK.get()))
                .save(p_251297_);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AURI.get())
                .pattern(" # ")
                .pattern("###")
                .pattern(" # ")
                .define('#', Items.GOLD_NUGGET)
                .unlockedBy(getHasName(Items.GOLD_NUGGET), has(Items.GOLD_NUGGET))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.DENARI.get())
                .pattern(" # ")
                .pattern("###")
                .pattern(" # ")
                .define('#', Items.IRON_NUGGET)
                .unlockedBy(getHasName(Items.IRON_NUGGET), has(Items.IRON_NUGGET))
                .save(p_251297_);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SEMI.get())
                .define('#', Items.NETHERITE_SCRAP)
                .define('O', Items.COPPER_INGOT)
                .pattern(" # ")
                .pattern("#O#")
                .pattern(" # ")
                .unlockedBy(getHasName(Items.NETHERITE_SCRAP), has(Items.NETHERITE_SCRAP))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AS.get(), 2)
                .requires(Items.COPPER_INGOT)
                .unlockedBy(getHasName(Items.COPPER_INGOT), has(Items.COPPER_INGOT))
                .save(p_251297_);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SESTERCI.get(), 2)
                .requires(Items.NETHERITE_INGOT)
                .unlockedBy(getHasName(Items.NETHERITE_INGOT), has(Items.NETHERITE_INGOT))
                .save(p_251297_);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {

    }

}


























