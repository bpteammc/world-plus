package com.bpteam.arcticmod;

import com.bpteam.arcticmod.init.ModBlocks;
import com.bpteam.arcticmod.init.ModItems;
import com.bpteam.arcticmod.proxy.CommonProxy;
import com.bpteam.arcticmod.util.Reference;
import com.bpteam.arcticmod.util.handlers.RegistryHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ArcticPlus.MODID, name = ArcticPlus.NAME, version = ArcticPlus.VERSION,dependencies = ArcticPlus.DEPENDENCIES, updateJSON = ArcticPlus.UPDATEURL)
public class ArcticPlus
{
    public static final String MODID = "arctic";
    public static final String NAME = "Arctic Mod";
    public static final String VERSION = "1.2";
    public static final String DEPENDENCIES = "required-after:forge@[14.23.2.2638,)";
    public static final String UPDATEURL = "https://raw.githubusercontent.com/bpteammc/arcticmod/master/update.json";

    @SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.COMMONPROXY)
    public static CommonProxy proxy;

    public static CreativeTabs items = new CreativeTabs("items")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.WEAKER_ICE_BALL);
        }
    };

    public static CreativeTabs blocks = new CreativeTabs("blocks")
    {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.RED_ICE);
        }
    };

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
        RegistryHandler.PreInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    }
}
