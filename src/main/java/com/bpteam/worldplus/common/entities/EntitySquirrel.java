package com.bpteam.worldplus.common.entities;

import com.bpteam.worldplus.util.handlers.LootTableHandler;
import com.bpteam.worldplus.util.handlers.SoundsHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EntitySquirrel extends EntityCow {
    public EntitySquirrel(World world) {
        super(world);
        setSize(0.4F,0.6F);
    }

    private static final DataParameter<Integer> TYPE = EntityDataManager.createKey(EntitySquirrel.class, DataSerializers.VARINT);

    @Override
    protected void initEntityAI() {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 1.5D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(5, new EntityAIWanderAvoidWater(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.tasks.addTask(8, new EntityAIWander(this, 1.0D));
    }

    @Override
    protected void jump() {
        super.jump();
    }

    @Override
    protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
    }

    @Override
    protected void updateAITasks() {
        super.updateAITasks();
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
    }

    @Override
    public float getEyeHeight() {
        return 0.6F;
    }

    @Override
    public EntityCow createChild(EntityAgeable ageable) {
        return new EntitySquirrel(this.world);
    }


    @Override
    protected void playStepSound(BlockPos pos, Block blockIn) {
        this.playSound(SoundEvents.BLOCK_STONE_STEP, 1, 1);
    }
}