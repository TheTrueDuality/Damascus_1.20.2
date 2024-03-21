package net.duality.damascus.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.duality.damascus.Damascus;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class ModScreenHandlers {
    public static final ScreenHandlerType<ForgeScreenHandler> FORGE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, new Identifier(Damascus.MOD_ID, "forge_screen_handler"),
                    new ExtendedScreenHandlerType<>(ForgeScreenHandler::new));


    public static void registerScreenHandler() {
        Damascus.LOGGER.info("Registering Screen Handlers for " + Damascus.MOD_ID);
    }
}
