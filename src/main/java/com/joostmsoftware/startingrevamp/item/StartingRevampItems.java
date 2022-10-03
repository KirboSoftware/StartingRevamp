package com.joostmsoftware.startingrevamp.item;

import com.joostmsoftware.startingrevamp.StartingRevamp;
import com.joostmsoftware.startingrevamp.block.StartingRevampRocks;
import com.joostmsoftware.startingrevamp.registry.StartingRevampItemRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;


public class StartingRevampItems {
    // items
    public static final Item ROCK;
    public static final Item TWIG;

    static {
        ROCK = new BlockItem(StartingRevampRocks.ROCK, new FabricItemSettings().group(StartingRevamp.GROUP));
        TWIG = new Item(new FabricItemSettings().group(StartingRevamp.GROUP));
    }

    public static void loadItems() {
        StartingRevampItemRegistry.registerItem("rock", ROCK);
        StartingRevampItemRegistry.registerItem("twig", TWIG);
    }
}
