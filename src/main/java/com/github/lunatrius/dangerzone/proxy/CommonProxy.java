package com.github.lunatrius.dangerzone.proxy;

import com.github.lunatrius.core.version.VersionChecker;
import com.github.lunatrius.dangerzone.reference.Reference;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;

public class CommonProxy {
    public void preInit(final FMLPreInitializationEvent event) {
        Reference.logger = event.getModLog();

        VersionChecker.registerMod(event.getModMetadata(), Reference.FORGE);
    }

    public void init(final FMLInitializationEvent event) {
    }

    public void postInit(final FMLPostInitializationEvent event) {
    }

    public void serverStarting(final FMLServerStartingEvent event) {
    }

    public void serverStopping(final FMLServerStoppingEvent event) {
    }
}
