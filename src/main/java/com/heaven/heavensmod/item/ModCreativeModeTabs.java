package com.heaven.heavensmod.item;

import com.heaven.heavensmod.HeavensMod;
import com.heaven.heavensmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HeavensMod.MOD_ID);

    public static final Supplier<CreativeModeTab> HEAVENS_BLOCKS_TAB = CREATIVE_MODE_TAB.register("heavens_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GETAJOB.get()))
    .title(Component.translatable("creativetab.heavensmod.heavens_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModBlocks.JOB_BLOCK);
                    output.accept(ModBlocks.PAPER_BLOCK);
                    output.accept(ModBlocks.JOBAPPLICATIONORE);

                    }) .build());

public static final Supplier<CreativeModeTab> HEAVENS_ITEMS_TAB = CREATIVE_MODE_TAB.register("heavens_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.JANEDOE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(HeavensMod.MOD_ID,"heavens_blocks_tab"))
    .title(Component.translatable("creativetab.heavensmod.heavens_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                    output.accept(ModItems.FIRSTMODITEMYEAH);
                        output.accept(ModItems.PAPER);
                        output.accept(ModItems.GETAJOB);
                        output.accept(ModItems.JANEDOE);
                        output.accept(ModItems.JOBMAKER);
                    }) .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
