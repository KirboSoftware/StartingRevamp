package com.joostmsoftware.startingrevamp.block;

import com.joostmsoftware.startingrevamp.block.custom.TwigBlock;
import com.joostmsoftware.startingrevamp.registry.StartingRevampBlockRegistry;
import net.minecraft.block.Block;

import java.util.HashMap;
import java.util.Map;

public class StartingRevampTwigs {
    public static final Map<String, Block> TWIGS = new HashMap<>();

    public static Block OAK_TWIG;
    public static Block DARK_OAK_TWIG;
    public static Block SPRUCE_TWIG;
    public static Block ACACIA_TWIG;
    public static Block BIRCH_TWIG;
    public static Block MANGROVE_TWIG;
    public static Block JUNGLE_TWIG;

    static {
        // vanilla twigs
        OAK_TWIG = new TwigBlock();
        DARK_OAK_TWIG = new TwigBlock();
        SPRUCE_TWIG = new TwigBlock();
        ACACIA_TWIG = new TwigBlock();
        BIRCH_TWIG = new TwigBlock();
        MANGROVE_TWIG = new TwigBlock();
        JUNGLE_TWIG = new TwigBlock();

        // biome compat later?


        TWIGS.put("oak_twig", OAK_TWIG);
        TWIGS.put("dark_oak_twig", DARK_OAK_TWIG);
        TWIGS.put("spruce_twig", SPRUCE_TWIG);
        TWIGS.put("acacia_twig", ACACIA_TWIG);
        TWIGS.put("birch_twig", BIRCH_TWIG);
        TWIGS.put("mangrove_twig", MANGROVE_TWIG);
        TWIGS.put("jungle_twig", JUNGLE_TWIG);
    }

    public static void loadTwigs() {
        TWIGS.forEach(StartingRevampBlockRegistry::registerBlock);
    }
}
