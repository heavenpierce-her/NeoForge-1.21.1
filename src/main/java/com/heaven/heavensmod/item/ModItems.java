package com.heaven.heavensmod.item;

import com.heaven.heavensmod.HeavensMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(HeavensMod.MOD_ID);

    public static final DeferredItem<Item> FIRSTMODITEMYEAH = ITEMS.register("dagger",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JANEDOE = ITEMS.register("janedoe",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GETAJOB = ITEMS.register("job_application",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PAPER = ITEMS.register ("paper",
        () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> JOBMAKER = ITEMS.register ("the_jobber",
            () -> new Item (new Item.Properties().durability(128)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
