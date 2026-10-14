package com.humanepic01.naturalslabsmod.registry;

import com.humanepic01.naturalslabsmod.NaturalSlabsMod;
import com.humanepic01.naturalslabsmod.blocks.NaturalSlabBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Registry;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

public class ModBlocks {
    public static final Block NATURAL_SLAB_BLOCK = new NaturalSlabBlock(Material.STONE, 2.0f, 6.0f);

    public static void register() {
        Registry.register(Registry.BLOCK, new ResourceLocation(NaturalSlabsMod.MOD_ID, "natural_slab_block"), NATURAL_SLAB_BLOCK);
        Registry.register(Registry.ITEM, new ResourceLocation(NaturalSlabsMod.MOD_ID, "natural_slab_block"), new BlockItem(NATURAL_SLAB_BLOCK, new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
    }
}