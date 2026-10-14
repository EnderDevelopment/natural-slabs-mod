package com.humanepic01.naturalslabsmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NaturalSlabsMod implements ModInitializer {
    public static final String MOD_ID = "naturalslabsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModItems.register();
        LOGGER.info("Natural Slabs Mod has been initialized!");
    }
}