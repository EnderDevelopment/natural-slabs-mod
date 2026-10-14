package com.humanepic01.naturalslabsmod.registry;

import com.humanepic01.naturalslabsmod.NaturalSlabsMod;
import com.humanepic01.naturalslabsmod.items.NaturalSlabItem;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;

public class ModItems {
    public static final Item NATURAL_SLAB_ITEM = new NaturalSlabItem(ModBlocks.NATURAL_SLAB_BLOCK, new Item.Properties());

    public static void register() {
        Registry.register(Registry.ITEM, new ResourceLocation(NaturalSlabsMod.MOD_ID, "natural_slab_item"), NATURAL_SLAB_ITEM);
    }
}