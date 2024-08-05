package de.erdbeerbaerlp.bm_mf.quilt;

import de.erdbeerbaerlp.bm_mf.BluemapFrontiers;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;

import de.erdbeerbaerlp.bm_mf.fabriclike.BluemapFrontiersFabricLike;

public final class BluemapFrontiersQuilt implements ModInitializer {
    @Override
    public void onInitialize() {
        ServerLifecycleEvents.SERVER_STARTED.register(BluemapFrontiersFabricLike::init);
        ServerLifecycleEvents.SERVER_STOPPING.register(BluemapFrontiers::stop);
    }
}