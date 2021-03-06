package com.bpteam.worldplus.common.blocks;

import com.bpteam.worldplus.WorldPlus;
import com.bpteam.worldplus.init.ModBlocks;
import com.bpteam.worldplus.init.ModItems;
import com.bpteam.worldplus.util.IHasModel;
import jdk.nashorn.internal.ir.annotations.Ignore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class ABlockFrozenLantern extends Block implements IHasModel {

    public ABlockFrozenLantern(String name, Material material) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setLightLevel(1.0F);
        setCreativeTab(WorldPlus.arctic);
        slipperiness = 0.98F;

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        WorldPlus.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}
