package com.luisxcaliber.caliberdrinksmod.util.handlers;

import java.io.File;

import com.luisxcaliber.caliberdrinksmod.CaliberDrinksMod;
import com.luisxcaliber.caliberdrinksmod.util.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ConfigHandler 
{
	public static Configuration config;
	
	public static boolean enableGrapeBushGen;
	public static boolean enableOrangeBushGen;
	public static boolean enableLemonBushGen;
	public static boolean enableGrapefruitBushGen;
	public static boolean enablePineappleBushGen;
	public static boolean enableStrawberryBushGen;
	public static boolean enableCoffeeBeanBushGen;
	public static boolean enableCoconutBushGen;
	public static boolean enableTeaLeafBushGen;
	public static boolean enableWhiteGrapeBushGen;
	public static boolean enableCranberryBushGen;
	public static boolean enableTomatoBushGen;
	public static boolean enablePomegranateBushGen;
	public static boolean enablePeachBushGen;
	public static boolean enableMangoBushGen;
	
	public static void init(File file)
	{
		config = new Configuration(file);
		
		String category;
		
		category = "Bush Generation";
		config.addCustomCategoryComment(category, "Enable/Disable Bush World Generation");
		enableGrapeBushGen = config.getBoolean("Enable Grape Bush Generation", category, true, "Decide to have grapebushes generate in world.");
		enableOrangeBushGen = config.getBoolean("Enable Orange Bush Generation", category, true, "Decide to have orangebushes generate in world.");
		enableLemonBushGen = config.getBoolean("Enable Lemon Bush Generation", category, true, "Decide to have lemonbushes generate in world.");
		enableGrapefruitBushGen = config.getBoolean("Enable Grapefruit Bush Generation", category, true, "Decide to have grapefruitbushes generate in world.");
		enablePineappleBushGen = config.getBoolean("Enable Pineapple Bush Generation", category, true, "Decide to have pineapplebushes generate in world.");
		enableStrawberryBushGen = config.getBoolean("Enable Strawberry Bush Generation", category, true, "Decide to have strawberrybushes generate in world.");
		enableCoffeeBeanBushGen = config.getBoolean("Enable CoffeeBean Bush Generation", category, true, "Decide to have coffeebeanbushes generate in world.");
		enableCoconutBushGen = config.getBoolean("Enable Coconut Bush Generation", category, true, "Decide to have coconutbushes generate in world.");
		enableTeaLeafBushGen = config.getBoolean("Enable TeaLeaf Bush Generation", category, true, "Decide to have tealeafbushes generate in world.");
		enableWhiteGrapeBushGen = config.getBoolean("Enable WhiteGrape Bush Generation", category, true, "Decide to have whitegrapebushes generate in world.");
		enableCranberryBushGen = config.getBoolean("Enable Cranberry Bush Generation", category, true, "Decide to have cranberrybushes generate in world.");
		enableTomatoBushGen = config.getBoolean("Enable Tomato Bush Generation", category, true, "Decide to have tomatobushes generate in world.");
		enablePomegranateBushGen = config.getBoolean("Enable Pomegranate Bush Generation", category, true, "Decide to have pomegranatebushes generate in world.");
		enablePeachBushGen = config.getBoolean("Enable Peach Bush Generation", category, true, "Decide to have peachbushes generate in world.");
		enableMangoBushGen = config.getBoolean("Enable Mango Bush Generation", category, true, "Decide to have mangobushes generate in world.");
		
		config.save();
	}
	
	public static void registerConfig(FMLPreInitializationEvent event)
	{
		CaliberDrinksMod.config = new File(event.getModConfigurationDirectory() + "/" + Reference.MOD_ID);
		CaliberDrinksMod.config.mkdirs();
		init(new File(CaliberDrinksMod.config.getPath(), Reference.MOD_ID + ".cfg"));
	}
}
