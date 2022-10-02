package com.joostmsoftware.startingrevamp;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StartingRevamp implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("Starting Revamp");

    private static final String MOD_ID = "startingrevamp";

    @Contract("_ -> new")
    public static @NotNull Identifier ID(String path) {
        return new Identifier(MOD_ID, path);
    }

    @Override
    public void onInitialize() {

        LOGGER.info("Loaded everything from " + MOD_ID);
    }
}
