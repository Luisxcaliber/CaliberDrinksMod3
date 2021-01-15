package com.luisxcaliber.caliberdrinksmod;

import com.luisxcaliber.caliberdrinksmod.init.ModItems;
import com.luisxcaliber.caliberdrinksmod.proxy.CommonProxy;
import com.luisxcaliber.caliberdrinksmod.util.Reference;
import com.luisxcaliber.caliberdrinksmod.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_MC_VERSIONS)
public class CaliberDrinksMod
{
	@Instance
	public static CaliberDrinksMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInitRegistries(event);
	}
	
	@EventHandler
	public static void Init(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event)
	{
		
	}
	
    public static CreativeTabs tabCaliberDrinksMod = new CreativeTabs("tab_caliber_drinks_mod")
    {	
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.APPLE_JUICE);
		}
	};
}
