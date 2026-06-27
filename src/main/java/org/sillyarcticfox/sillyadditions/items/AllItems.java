package org.sillyarcticfox.sillyadditions.items;

import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import static org.sillyarcticfox.sillyadditions.SillyAdditions.MODID;

public class AllItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    public static final DeferredItem<BlueQuartzItem> BLUE_QUARTZ_ITEM =
            ITEMS.register(
                    "blue_quartz",
                    () -> new BlueQuartzItem(
                            new Item.Properties()
                    )
            );
}
