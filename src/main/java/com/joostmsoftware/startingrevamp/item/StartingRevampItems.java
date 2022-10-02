package com.joostmsoftware.startingrevamp.item;

import com.joostmsoftware.startingrevamp.StartingRevamp;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class StartingRevampItems {
    // items
    public static final Item ROCK = new Item(new FabricItemSettings().group(StartingRevamp.GROUP));
    public static final Item TWIG = new Item(new FabricItemSettings().group(StartingRevamp.GROUP));

    static {
        registerItem("rock", ROCK);
        registerItem("twig", TWIG);
    }

    private static void registerItem(String itemName, Item item) {
        Registry.register(Registry.ITEM, StartingRevamp.ID(itemName), item);
    }

    public static void loadItems() {

    }
}
