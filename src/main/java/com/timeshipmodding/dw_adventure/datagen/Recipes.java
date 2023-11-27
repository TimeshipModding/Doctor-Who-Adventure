package com.timeshipmodding.dw_adventure.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

import static com.timeshipmodding.dw_adventure.content.block.registries.ModBlocks.*;
import static com.timeshipmodding.dw_adventure.content.item.registries.ModItems.*;

public class Recipes extends RecipeProvider implements IConditionBuilder {
    public Recipes(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

    }
}
