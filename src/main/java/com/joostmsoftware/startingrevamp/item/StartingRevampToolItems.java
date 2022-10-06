package com.joostmsoftware.startingrevamp.item;

import com.joostmsoftware.startingrevamp.StartingRevamp;
import com.joostmsoftware.startingrevamp.item.custom.*;
import com.joostmsoftware.startingrevamp.item.materials.StartingRevampToolMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;

import java.util.HashMap;
import java.util.Map;

public class StartingRevampToolItems {

    public static final Map<String, Item> FLINT_TOOLS = new HashMap<>();

    public static Item FLINT_HOE = new StartingRevampHoeItem(StartingRevampToolMaterials.FLINT, 1, -3.0F, new FabricItemSettings().group(StartingRevamp.GROUP));
    public static Item FLINT_AXE = new StartingRevampAxeItem(StartingRevampToolMaterials.FLINT, 1.0f, -3.2F, new FabricItemSettings().group(StartingRevamp.GROUP));
    public static Item FLINT_PICKAXE = new StartingRevampPickaxeItem(StartingRevampToolMaterials.FLINT, 1, -2.8F, new FabricItemSettings().group(StartingRevamp.GROUP));
    public static Item FLINT_SHOVEL = new StartingRevampShovelItem(StartingRevampToolMaterials.FLINT, 1.0f, -3.0F, new FabricItemSettings().group(StartingRevamp.GROUP));
    public static Item FLINT_SWORD = new StartingRevampSwordItem(StartingRevampToolMaterials.FLINT, 1, -2.4F, new FabricItemSettings().group(StartingRevamp.GROUP));
    public static Item FLINT_GRASS_CUTTERS = new StartingRevampGrassCutterItem(new FabricItemSettings().group(StartingRevamp.GROUP));

    static {
        FLINT_TOOLS.put("flint_axe", FLINT_AXE);
        FLINT_TOOLS.put("flint_hoe", FLINT_HOE);
        FLINT_TOOLS.put("flint_pickaxe", FLINT_PICKAXE);
        FLINT_TOOLS.put("flint_shovel", FLINT_SHOVEL);
        FLINT_TOOLS.put("flint_sword", FLINT_SWORD);
        FLINT_TOOLS.put("flint_grass_cutters", FLINT_GRASS_CUTTERS);
    }

    public static void loadTools() {
        FLINT_TOOLS.forEach((String name, Item item) -> Registry.register(Registry.ITEM, StartingRevamp.ID(name), item));
    }
}
