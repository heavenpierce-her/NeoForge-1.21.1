package com.heaven.heavensmod.datagen;

import com.heaven.heavensmod.block.ModBlocks;
import com.heaven.heavensmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.ShapelessRecipe;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput RecipeOutput) {
        List<ItemLike> JOB_SMELTABLES = List.of(ModItems.GETAJOB.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.JOB_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModItems.GETAJOB.get())
                .unlockedBy("has_job_application", has(ModItems.GETAJOB)).save(RecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GETAJOB.get(), 9)
                .requires(ModBlocks.JOB_BLOCK)
                .unlockedBy("has_jobapp_block", has(ModBlocks.JOB_BLOCK))
                .save(RecipeOutput, "job_application_from_crafting");
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.JOBMAKER.get())
                        .pattern("  #")
                        .pattern(" # ")
                        .pattern("A  ")
                                .define('#', ModItems.GETAJOB.get())
                                        .define('A', Items.STICK)
                                                .unlockedBy("has_chisel", has(ModItems.JOBMAKER)).save(RecipeOutput);

        oreSmelting(RecipeOutput, JOB_SMELTABLES, RecipeCategory.MISC, ModItems.GETAJOB.get(), 2,100,"job_application");
        oreBlasting(RecipeOutput, JOB_SMELTABLES, RecipeCategory.MISC, ModItems.GETAJOB.get(), 2,50,"job_application");
    }
}
