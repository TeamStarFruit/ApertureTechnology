package org.starfruit.aperturetech.init;


import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

import static org.starfruit.aperturetech.ApertureTechMod.REGISTRATE;

public class ModItems {
    public static final ItemEntry<Item> SNOW = REGISTRATE.item("snow", Item::new)
            .properties(p -> p.food(new FoodProperties.Builder().nutrition(6)
                    .saturationMod(0.3F)
                    .build()))
            .lang("snow")
            .tab(() -> ModTabs.APERTURETECH)
            .register();

    public static final ItemEntry<Item> HANDLED_PORTAL_DEVICE = REGISTRATE.item("handheld_portal_device", Item::new)
            .properties(p -> p.food(new FoodProperties.Builder().nutrition(6)
                    .saturationMod(0.3F)
                    .build()))
            .lang("Handheld Portal Device")
            .tab(() -> ModTabs.APERTURETECH)
            .register();

    public static void register() {}

}
