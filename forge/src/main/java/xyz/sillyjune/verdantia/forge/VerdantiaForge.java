package xyz.sillyjune.verdantia.forge;

import xyz.sillyjune.verdantia.Verdantia;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Verdantia.MOD_ID)
public final class VerdantiaForge {
    public VerdantiaForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(Verdantia.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Run our common setup.
        Verdantia.init();
    }
}
