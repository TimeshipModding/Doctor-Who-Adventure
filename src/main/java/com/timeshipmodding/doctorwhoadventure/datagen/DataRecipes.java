package com.timeshipmodding.doctorwhoadventure.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.doctorwhoadventure.content.block.registry.planet.ModGallifreyBlocks.*;

public class DataRecipes extends RecipeProvider implements IConditionBuilder {
    public DataRecipes(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(packOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        // Shaped Recipes


        // Shapeless Recipes


        // Simple Cooking Recipe
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GALLIFREY_COBBLESTONE), RecipeCategory.BUILDING_BLOCKS, GALLIFREY_STONE.asItem(), 0.1F, 200)
                .unlockedBy(getHasName(GALLIFREY_COBBLESTONE.get()), has(GALLIFREY_COBBLESTONE)).save(recipeOutput);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GALLIFREY_STONE), RecipeCategory.BUILDING_BLOCKS, GALLIFREY_SMOOTH_STONE.asItem(), 0.1F, 200)
                .unlockedBy(getHasName(GALLIFREY_STONE), has(GALLIFREY_STONE)).save(recipeOutput);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GALLIFREY_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, GALLIFREY_CRACKED_STONE_BRICKS.asItem(), 0.1F, 200)
                .unlockedBy(getHasName(GALLIFREY_STONE_BRICKS), has(GALLIFREY_STONE_BRICKS)).save(recipeOutput);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GALLIFREY_COBBLED_DEEPSLATE), RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE.asItem(), 0.1F, 200)
                .unlockedBy(getHasName(GALLIFREY_COBBLED_DEEPSLATE.get()), has(GALLIFREY_COBBLED_DEEPSLATE)).save(recipeOutput);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GALLIFREY_DEEPSLATE_BRICKS), RecipeCategory.BUILDING_BLOCKS, GALLIFREY_CRACKED_DEEPSLATE_BRICKS.asItem(), 0.1F, 200)
                .unlockedBy(getHasName(GALLIFREY_DEEPSLATE_BRICKS), has(GALLIFREY_DEEPSLATE_BRICKS)).save(recipeOutput);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(GALLIFREY_DEEPSLATE_TILES), RecipeCategory.BUILDING_BLOCKS, GALLIFREY_CRACKED_DEEPSLATE_TILES.asItem(), 0.1F, 200)
                .unlockedBy(getHasName(GALLIFREY_DEEPSLATE_TILES), has(GALLIFREY_DEEPSLATE_TILES)).save(recipeOutput);

        // Two by Two Packer Recipes
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_STONE_BRICKS, GALLIFREY_STONE);
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_POLISHED_DEEPSLATE, GALLIFREY_COBBLED_DEEPSLATE);
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_BRICKS, GALLIFREY_POLISHED_DEEPSLATE);
        twoByTwoPacker(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILES, GALLIFREY_DEEPSLATE_BRICKS);

        // Stonecutter Recipes
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_STONE_BRICKS, GALLIFREY_STONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_STONE_STAIRS, GALLIFREY_STONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_COBBLESTONE_STAIRS, GALLIFREY_COBBLESTONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_STONE_BRICK_STAIRS, GALLIFREY_STONE_BRICKS);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_STONE_BRICK_STAIRS, GALLIFREY_STONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_STONE_SLAB, GALLIFREY_STONE, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_SMOOTH_STONE_SLAB, GALLIFREY_SMOOTH_STONE, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_COBBLESTONE_SLAB, GALLIFREY_COBBLESTONE, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_STONE_BRICK_SLAB, GALLIFREY_STONE_BRICKS, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_STONE_BRICK_SLAB, GALLIFREY_STONE, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_COBBLESTONE_WALL, GALLIFREY_COBBLESTONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_STONE_BRICK_WALL, GALLIFREY_STONE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_STONE_BRICK_WALL, GALLIFREY_STONE_BRICKS);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_COBBLED_DEEPSLATE_STAIRS, GALLIFREY_COBBLED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_COBBLED_DEEPSLATE_SLAB, GALLIFREY_COBBLED_DEEPSLATE, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_COBBLED_DEEPSLATE_WALL, GALLIFREY_COBBLED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_POLISHED_DEEPSLATE, GALLIFREY_COBBLED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_POLISHED_DEEPSLATE_STAIRS, GALLIFREY_POLISHED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_POLISHED_DEEPSLATE_SLAB, GALLIFREY_POLISHED_DEEPSLATE, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_POLISHED_DEEPSLATE_WALL, GALLIFREY_POLISHED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_POLISHED_DEEPSLATE_STAIRS, GALLIFREY_COBBLED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_POLISHED_DEEPSLATE_SLAB, GALLIFREY_COBBLED_DEEPSLATE, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_POLISHED_DEEPSLATE_WALL, GALLIFREY_COBBLED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_BRICKS, GALLIFREY_COBBLED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_BRICKS, GALLIFREY_POLISHED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_BRICK_STAIRS, GALLIFREY_COBBLED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_BRICK_STAIRS, GALLIFREY_POLISHED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_BRICK_STAIRS, GALLIFREY_DEEPSLATE_BRICKS);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_BRICK_SLAB, GALLIFREY_COBBLED_DEEPSLATE, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_BRICK_SLAB, GALLIFREY_POLISHED_DEEPSLATE, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_BRICK_SLAB, GALLIFREY_DEEPSLATE_BRICKS, 2);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_DEEPSLATE_BRICK_WALL, GALLIFREY_COBBLED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_DEEPSLATE_BRICK_WALL, GALLIFREY_POLISHED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_DEEPSLATE_BRICK_WALL, GALLIFREY_DEEPSLATE_BRICKS);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILES, GALLIFREY_COBBLED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILES, GALLIFREY_POLISHED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILES, GALLIFREY_DEEPSLATE_BRICKS);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILE_STAIRS, GALLIFREY_COBBLED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILE_STAIRS, GALLIFREY_POLISHED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILE_STAIRS, GALLIFREY_DEEPSLATE_BRICKS);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILE_STAIRS, GALLIFREY_DEEPSLATE_TILES);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILE_SLAB, GALLIFREY_COBBLED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILE_SLAB, GALLIFREY_POLISHED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILE_SLAB, GALLIFREY_DEEPSLATE_BRICKS);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILE_SLAB, GALLIFREY_DEEPSLATE_TILES);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILE_WALL, GALLIFREY_COBBLED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILE_WALL, GALLIFREY_POLISHED_DEEPSLATE);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILE_WALL, GALLIFREY_DEEPSLATE_BRICKS);
        stonecutterResultFromBase(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILE_WALL, GALLIFREY_DEEPSLATE_TILES);

        // Stair Recipes
        stairBuilder(GALLIFREY_STONE_STAIRS, Ingredient.of(GALLIFREY_STONE)).unlockedBy(getHasName(GALLIFREY_STONE), has(GALLIFREY_STONE.get())).save(recipeOutput);
        stairBuilder(GALLIFREY_COBBLESTONE_STAIRS, Ingredient.of(GALLIFREY_COBBLESTONE)).unlockedBy(getHasName(GALLIFREY_COBBLESTONE), has(GALLIFREY_COBBLESTONE)).save(recipeOutput);
        stairBuilder(GALLIFREY_STONE_BRICK_STAIRS, Ingredient.of(GALLIFREY_STONE_BRICKS)).unlockedBy(getHasName(GALLIFREY_STONE_BRICKS), has(GALLIFREY_STONE_BRICKS)).save(recipeOutput);
        stairBuilder(GALLIFREY_COBBLED_DEEPSLATE_STAIRS, Ingredient.of(GALLIFREY_COBBLED_DEEPSLATE)).unlockedBy(getHasName(GALLIFREY_COBBLED_DEEPSLATE), has(GALLIFREY_COBBLED_DEEPSLATE)).save(recipeOutput);
        stairBuilder(GALLIFREY_POLISHED_DEEPSLATE_STAIRS, Ingredient.of(GALLIFREY_POLISHED_DEEPSLATE)).unlockedBy(getHasName(GALLIFREY_POLISHED_DEEPSLATE), has(GALLIFREY_POLISHED_DEEPSLATE)).save(recipeOutput);
        stairBuilder(GALLIFREY_DEEPSLATE_BRICK_STAIRS, Ingredient.of(GALLIFREY_DEEPSLATE_BRICKS)).unlockedBy(getHasName(GALLIFREY_DEEPSLATE_BRICKS), has(GALLIFREY_DEEPSLATE_BRICKS)).save(recipeOutput);
        stairBuilder(GALLIFREY_DEEPSLATE_TILE_STAIRS, Ingredient.of(GALLIFREY_DEEPSLATE_TILES)).unlockedBy(getHasName(GALLIFREY_DEEPSLATE_TILES), has(GALLIFREY_DEEPSLATE_TILES)).save(recipeOutput);

        // Slab Recipes
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_STONE_SLAB, GALLIFREY_STONE);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_SMOOTH_STONE_SLAB, GALLIFREY_SMOOTH_STONE_SLAB);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_COBBLESTONE_SLAB, GALLIFREY_COBBLESTONE);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_STONE_BRICK_SLAB, GALLIFREY_STONE_BRICKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_COBBLED_DEEPSLATE_SLAB, GALLIFREY_COBBLED_DEEPSLATE);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_POLISHED_DEEPSLATE_SLAB, GALLIFREY_POLISHED_DEEPSLATE);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_BRICK_SLAB, GALLIFREY_DEEPSLATE_BRICKS);
        slab(recipeOutput, RecipeCategory.BUILDING_BLOCKS, GALLIFREY_DEEPSLATE_TILE_SLAB, GALLIFREY_DEEPSLATE_TILES);

        // Wall Recipes
        wall(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_COBBLESTONE_WALL, GALLIFREY_COBBLESTONE);
        wall(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_STONE_BRICK_WALL, GALLIFREY_STONE_BRICKS);
        wall(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_COBBLED_DEEPSLATE_WALL, GALLIFREY_COBBLED_DEEPSLATE);
        wall(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_POLISHED_DEEPSLATE_WALL, GALLIFREY_POLISHED_DEEPSLATE);
        wall(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_DEEPSLATE_BRICK_WALL, GALLIFREY_DEEPSLATE_BRICKS);
        wall(recipeOutput, RecipeCategory.DECORATIONS, GALLIFREY_DEEPSLATE_TILE_WALL, GALLIFREY_DEEPSLATE_TILES);

        // Pressure Plate Recipes
        pressurePlate(recipeOutput, GALLIFREY_STONE_PRESSURE_PLATE, GALLIFREY_STONE);

        // Button Recipes
        buttonBuilder(GALLIFREY_STONE_BUTTON, Ingredient.of(GALLIFREY_STONE)).unlockedBy(getHasName(GALLIFREY_STONE), has(GALLIFREY_STONE)).save(recipeOutput);
    }
}
