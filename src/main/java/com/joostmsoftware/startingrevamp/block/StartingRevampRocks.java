package com.joostmsoftware.startingrevamp.block;

import com.joostmsoftware.startingrevamp.block.custom.RockBlock;
import com.joostmsoftware.startingrevamp.registry.StartingRevampBlockRegistry;
import net.minecraft.block.Block;

public class StartingRevampRocks {

    public static Block ROCK;

    static {
       ROCK  = new RockBlock();
    }

    public static void loadRocks() {
        StartingRevampBlockRegistry.registerBlock("rock", ROCK);
    }
}
