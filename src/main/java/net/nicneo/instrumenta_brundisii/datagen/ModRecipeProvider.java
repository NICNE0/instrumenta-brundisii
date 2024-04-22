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


























