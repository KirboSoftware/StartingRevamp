package com.joostmsoftware.startingrevamp.item;

import com.joostmsoftware.startingrevamp.StartingRevamp;
import com.joostmsoftware.startingrevamp.registry.StartingRevampItemRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;


public class StartingRevampItems {
    // items
    public static final Item ROCK = new Item(new FabricItemSettings().group(StartingRevamp.GROUP));
    public static final Item TWIG = new Item(new FabricItemSettings().group(StartingRevamp.GROUP));

    static {
        StartingRevampItemRegistry.registerItem("rock", ROCK);
        StartingRevampItemRegistry.registerItem("twig", TWIG);
    }


    public static void loadItems() {

    }
}
