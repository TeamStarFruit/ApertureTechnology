package org.starfruit.aperturetech.init;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import org.starfruit.aperturetech.ApertureTechMod;

public class ModTabs {
    public static final CreativeModeTab APERTURETECH = new CreativeModeTab(ApertureTechMod.MOD_ID + ".aperturetech") {
        @NotNull
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.HANDLED_PORTAL_DEVICE.get());
        }
    };

}
