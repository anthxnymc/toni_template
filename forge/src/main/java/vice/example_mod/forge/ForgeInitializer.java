package vice.example_mod.forge;

import dev.architectury.platform.forge.EventBuses;
import vice.example_mod.ExampleMod;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExampleMod.MOD_ID)
public class ForgeInitializer
{
    public ForgeInitializer() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(ExampleMod.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        ExampleMod.init();
    }
}