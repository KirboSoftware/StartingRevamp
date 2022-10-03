package com.joostmsoftware.startingrevamp.registry;

import com.joostmsoftware.startingrevamp.StartingRevamp;
import net.minecraft.block.Block;
import net.minecraft.util.registry.Registry;

import static com.joostmsoftware.startingrevamp.block.StartingRevampRocks.loadRocks;
import static com.joostmsoftware.startingrevamp.block.StartingRevampTwigs.loadTwigs;

public class StartingRevampBlockRegistry {

    public static void registerBlocks() {
        loadRocks();
        loadTwigs();
    }

    public static void registerBlock(String path, Block block) {
        Registry.register(Registry.BLOCK, StartingRevamp.ID(path), block);
    }
}
