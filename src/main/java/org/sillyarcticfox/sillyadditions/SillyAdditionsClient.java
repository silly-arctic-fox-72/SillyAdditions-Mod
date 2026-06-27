package org.sillyarcticfox.sillyadditions;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;

@Mod(value = SillyAdditions.MODID, dist = Dist.CLIENT)
@EventBusSubscriber(modid = SillyAdditions.MODID, value = Dist.CLIENT)
public class SillyAdditionsClient {
    public SillyAdditionsClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        // Some client setup code
        SillyAdditions.LOGGER.info("Silly Additions (Client Setup)");
    }
}
