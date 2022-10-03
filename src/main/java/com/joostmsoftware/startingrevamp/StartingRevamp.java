package com.joostmsoftware.startingrevamp;

import com.joostmsoftware.startingrevamp.registry.StartingRevampBlockRegistry;
import com.joostmsoftware.startingrevamp.registry.StartingRevampItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.joostmsoftware.startingrevamp.item.StartingRevampItems.ROCK;

public class StartingRevamp implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("Starting Revamp");

    private static final String MOD_ID = "startingrevamp";

    @Contract("_ -> new")
    public static @NotNull Identifier ID(String path) {
        return new Identifier(MOD_ID, path);
    }
    public static @NotNull Identifier COMMON_ID(String path) {
        return new Identifier("c", path);
    }

    public static final ItemGroup GROUP = FabricItemGroupBuilder.build(ID("group"), ()-> new ItemStack(ROCK));

    @Override
    public void onInitialize() {
        StartingRevampItemRegistry.registerItems();
        StartingRevampBlockRegistry.registerBlocks();
        LOGGER.info("Loaded everything from " + MOD_ID);
    }
}
