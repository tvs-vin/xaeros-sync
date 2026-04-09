package tvs.xaeros.sync;

import net.fabricmc.api.DedicatedServerModInitializer;

public class XaerossyncServer implements DedicatedServerModInitializer {
    @Override
    public void onInitializeServer() {
        Xaerossync.LOGGER.info("Init Xaeros Sync (Server)");
    }
}
