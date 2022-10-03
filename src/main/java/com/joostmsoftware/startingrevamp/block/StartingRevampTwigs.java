package com.joostmsoftware.startingrevamp.block;

import com.joostmsoftware.startingrevamp.registry.StartingRevampBlockRegistry;
import net.minecraft.block.Block;

public class StartingRevampTwigs {

    public static Block OAK_TWIG;

    static {
       OAK_TWIG = new TwigBlock();
    }

    public static void loadTwigs() {
        StartingRevampBlockRegistry.registerBlock("oak_twig", OAK_TWIG);
    }
}
