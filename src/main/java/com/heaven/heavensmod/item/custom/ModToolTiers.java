package com.heaven.heavensmod.item.custom;

import com.heaven.heavensmod.util.ModTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier DAGGER = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_DAGGER_TOOL,
            2100, 3f, 11,28,()-> Ingredient.of(Items.NETHERITE_INGOT));

}
