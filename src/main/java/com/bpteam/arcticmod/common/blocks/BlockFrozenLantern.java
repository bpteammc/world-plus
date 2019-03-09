package com.bpteam.arcticmod.common.blocks;

import com.bpteam.arcticmod.ArcticPlus;
import com.bpteam.arcticmod.init.ModBlocks;
import com.bpteam.arcticmod.init.ModItems;
import com.bpteam.arcticmod.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockFrozenLantern extends Block implements IHasModel {
    public BlockFrozenLantern(String name, Material material) {
        super(material);
        setTranslationKey(name);
        setRegistryName(name);
        setLightLevel(1.0F);
        setCreativeTab(ArcticPlus.blocks);
        slipperiness = 0.98F;

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        ArcticPlus.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}
