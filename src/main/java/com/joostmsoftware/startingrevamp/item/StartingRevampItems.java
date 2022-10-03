package com.joostmsoftware.startingrevamp.item;

import com.joostmsoftware.startingrevamp.StartingRevamp;
import com.joostmsoftware.startingrevamp.block.StartingRevampRocks;
import com.joostmsoftware.startingrevamp.block.StartingRevampTwigs;
import com.joostmsoftware.startingrevamp.registry.StartingRevampItemRegistry;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

import java.util.HashMap;
import java.util.Map;


public class StartingRevampItems {
    public static final Map<String, Item> TWIGS = new HashMap<>();

    // items
    public static final Item ROCK;
    public static final Item GRASS_VIBER;

    public static final Item OAK_TWIG;
    public static final Item DARK_OAK_TWIG;
    public static final Item SPRUCE_TWIG;
    public static final Item ACACIA_TWIG;
    public static final Item BIRCH_TWIG;
    public static final Item MANGROVE_TWIG;
    public static final Item JUNGLE_TWIG;

    static {
        GRASS_VIBER = new Item(new FabricItemSettings().group(StartingRevamp.GROUP));
        ROCK = new BlockItem(StartingRevampRocks.ROCK, new FabricItemSettings().group(StartingRevamp.GROUP));

        ACACIA_TWIG = new BlockItem(StartingRevampTwigs.ACACIA_TWIG, new FabricItemSettings().group(StartingRevamp.GROUP));
        BIRCH_TWIG = new BlockItem(StartingRevampTwigs.BIRCH_TWIG, new FabricItemSettings().group(StartingRevamp.GROUP));
        DARK_OAK_TWIG = new BlockItem(StartingRevampTwigs.DARK_OAK_TWIG, new FabricItemSettings().group(StartingRevamp.GROUP));
        JUNGLE_TWIG = new BlockItem(StartingRevampTwigs.JUNGLE_TWIG, new FabricItemSettings().group(StartingRevamp.GROUP));
        MANGROVE_TWIG = new BlockItem(StartingRevampTwigs.MANGROVE_TWIG, new FabricItemSettings().group(StartingRevamp.GROUP));
        OAK_TWIG = new BlockItem(StartingRevampTwigs.OAK_TWIG, new FabricItemSettings().group(StartingRevamp.GROUP));
        SPRUCE_TWIG = new BlockItem(StartingRevampTwigs.SPRUCE_TWIG, new FabricItemSettings().group(StartingRevamp.GROUP));

        TWIGS.put("oak_twig", OAK_TWIG);
        TWIGS.put("dark_oak_twig", DARK_OAK_TWIG);
        TWIGS.put("birch_twig", BIRCH_TWIG);
        TWIGS.put("acacia_twig", ACACIA_TWIG);
        TWIGS.put("spruce_twig", SPRUCE_TWIG);
        TWIGS.put("mangrove_twig", MANGROVE_TWIG);
        TWIGS.put("jungle_twig", JUNGLE_TWIG);
    }

    public static void loadItems() {
        StartingRevampItemRegistry.registerItem("rock", ROCK);
        StartingRevampItemRegistry.registerItem("grass_viber", GRASS_VIBER);
        TWIGS.forEach(StartingRevampItemRegistry::registerItem);
    }
}
