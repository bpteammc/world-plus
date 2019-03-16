package com.bpteam.worldplus.common.world.biomes;

import com.bpteam.worldplus.init.ModBlocks;
import com.bpteam.worldplus.common.world.IBiomeDecorator;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

import java.util.Random;

public class BiomeSnowyPlains extends Biome {

    public BiomeSnowyPlains() {
        super(new BiomeProperties("Snowy Plains").setHeightVariation(0.00F).setBaseHeight(2F).setRainDisabled().setTemperature(0.4F));
        this.topBlock = ModBlocks.ICY_SNOW.getDefaultState();
        this.fillerBlock = Blocks.PACKED_ICE.getDefaultState();
        this.decorator = new IBiomeDecorator();
        this.spawnableCaveCreatureList.clear();
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.spawnableWaterCreatureList.clear();
        this.decorator.generateFalls = false;
    }

    @Override
    public void decorate(World worldIn, Random rand, BlockPos pos) {
    }

}
