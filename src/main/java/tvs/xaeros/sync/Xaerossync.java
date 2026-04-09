package tvs.xaeros.sync;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.text.Text;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.network.ServerPlayerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tvs.xaeros.sync.items.ModItems;

public class Xaerossync implements ModInitializer {
    public static final String MOD_ID = "xaeros_sync";

    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final String Version = "0.1.0";

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("Init XaerosSync " + Xaerossync.Version);

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            dispatcher.register(CommandManager.literal("xaeros-sync")
                    .executes(context -> {
                        // Command execution logic
                        context.getSource().sendMessage(Text.literal("Xaeros Sync V" + Xaerossync.Version));
                        return 1; // Return a success value (usually 1)
                    })
            );

        });

        ModItems.initialize();
        //ModBlocks.initialize();

        LOGGER.info("Init Finished");

    }
}