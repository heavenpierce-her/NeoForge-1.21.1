package com.heaven.heavensmod.datagen;

import com.heaven.heavensmod.HeavensMod;
import com.heaven.heavensmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HeavensMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.FIRSTMODITEMYEAH.get());
        basicItem(ModItems.JANEDOE.get());
        basicItem(ModItems.GETAJOB.get());
        basicItem(ModItems.JOBMAKER.get());
        basicItem(ModItems.PAPER.get());

        handheldItem(ModItems.JANEKNIFE.get());

    }
}
