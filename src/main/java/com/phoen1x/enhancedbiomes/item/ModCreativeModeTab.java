package com.phoen1x.enhancedbiomes.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public  static final CreativeModeTab ENHANCEDOCEANS_TAB = new CreativeModeTab("enhancedoceanstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.PRISMARINESHEET.get());
        }
    };
}
