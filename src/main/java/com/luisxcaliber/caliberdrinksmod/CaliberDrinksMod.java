package com.luisxcaliber.caliberdrinksmod;

import java.io.File;

import com.luisxcaliber.caliberdrinksmod.creativetabs.CaliberDrinksModTab;
import com.luisxcaliber.caliberdrinksmod.proxy.ProxyInterface;
import com.luisxcaliber.caliberdrinksmod.util.Reference;
import com.luisxcaliber.caliberdrinksmod.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
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
	public static File config;
	
	public static final CreativeTabs tabCaliberDrinksMod = new CaliberDrinksModTab("tab_caliber_drinks_mod");
	
	@Instance
	public static CaliberDrinksMod instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static ProxyInterface proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.preInit(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event)
	{
		RegistryHandler.init(event);
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}
