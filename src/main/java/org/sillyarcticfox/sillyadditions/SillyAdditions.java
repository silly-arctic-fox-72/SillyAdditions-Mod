package org.sillyarcticfox.sillyadditions;

import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import org.sillyarcticfox.sillyadditions.items.AllItems;
import org.sillyarcticfox.sillyadditions.blocks.AllBlocks;

@Mod(SillyAdditions.MODID)
public class SillyAdditions {
    public static final String MODID = "sillyadditions";
    public static final Logger LOGGER = LogUtils.getLogger();

    public SillyAdditions(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        AllBlocks.BLOCKS.register(modEventBus);
        AllItems.ITEMS.register(modEventBus);

        NeoForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Silly Additions (Common Setup)");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Silly Additions (Server Starting)");
    }
}
