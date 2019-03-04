package com.bpteam.arcticmod.common.blocks;

import com.bpteam.arcticmod.ArcticMod;
import com.bpteam.arcticmod.init.ModBlocks;
import com.bpteam.arcticmod.init.ModItems;
import com.bpteam.arcticmod.util.IHasModel;
import net.minecraft.block.BlockIce;
import net.minecraft.block.SoundType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockIceIcleBig extends BlockIce implements IHasModel {

    public BlockIceIcleBig(String name) {
        setTranslationKey(name);
        setRegistryName(name);
        setCreativeTab(ArcticMod.blocks);
        setSoundType(SoundType.SNOW);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        ArcticMod.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}
