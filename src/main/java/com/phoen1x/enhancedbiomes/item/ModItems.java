package com.phoen1x.enhancedbiomes.item;

import com.phoen1x.enhancedbiomes.EnhancedBiomes;
import com.phoen1x.enhancedbiomes.item.custom.ModArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EnhancedBiomes.MOD_ID);

    public static final RegistryObject<Item> PRISMARINESHEET = ITEMS.register("prismarine_sheet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ENHANCEDOCEANS_TAB)));

    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ENHANCEDOCEANS_TAB)));

    public static final RegistryObject<Item> PRISMARINEHELMET = ITEMS.register("prismarine_helmet",
            () -> new ModArmorItem(ModArmorMaterials.PRISMARINE, EquipmentSlot.HEAD,
                  new Item.Properties().tab(ModCreativeModeTab.ENHANCEDOCEANS_TAB)));
    public static final RegistryObject<Item> PRISMARINECHESTPLATE = ITEMS.register("prismarine_chestplate",
            () -> new ArmorItem(ModArmorMaterials.PRISMARINE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ENHANCEDOCEANS_TAB)));
    public static final RegistryObject<Item> PRISMARINELEGGINGS = ITEMS.register("prismarine_leggings",
            () -> new ArmorItem(ModArmorMaterials.PRISMARINE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ENHANCEDOCEANS_TAB)));
    public static final RegistryObject<Item> PRISMARINEBOOTS = ITEMS.register("prismarine_boots",
            () -> new ArmorItem(ModArmorMaterials.PRISMARINE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ENHANCEDOCEANS_TAB)));

    public static void register(IEventBus eventBus) {

        ITEMS.register(eventBus);
    }
}
