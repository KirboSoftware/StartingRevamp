package com.joostmsoftware.startingrevamp.registry;

import com.joostmsoftware.startingrevamp.StartingRevamp;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import static com.joostmsoftware.startingrevamp.item.StartingRevampItems.loadItems;
import static com.joostmsoftware.startingrevamp.item.StartingRevampToolItems.loadTools;

public class StartingRevampItemRegistry {
    public static void registerItems() {
        loadItems();
        loadTools();
    }

    public static void registerItem(String itemName, Item item) {
        Registry.register(Registry.ITEM, StartingRevamp.ID(itemName), item);
    }
}
