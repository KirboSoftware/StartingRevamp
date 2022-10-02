package com.joostmsoftware.startingrevamp.registry;

import static com.joostmsoftware.startingrevamp.item.StartingRevampItems.loadItems;
import static com.joostmsoftware.startingrevamp.item.StartingRevampToolItems.loadTools;

public class StartingRevampItemRegistry {

    public static void registerItems() {
        loadItems();
        loadTools();
    }
}
