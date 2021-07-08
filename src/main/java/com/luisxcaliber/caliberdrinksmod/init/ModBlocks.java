package com.luisxcaliber.caliberdrinksmod.init;

import com.luisxcaliber.caliberdrinksmod.blocks.BlockBlender;
import com.luisxcaliber.caliberdrinksmod.blocks.BlockDrinkBush;
import com.luisxcaliber.caliberdrinksmod.blocks.BlockFluid;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockCoconutPlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockCoffeeBeanPlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockCranberryPlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockGrapePlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockGrapefruitPlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockLemonPlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockMangoPlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockOrangePlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockPeachPlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockPineapplePlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockPomegranatePlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockStrawberryPlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockTeaLeafPlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockTomatoPlant;
import com.luisxcaliber.caliberdrinksmod.blocks.plants.BlockWhiteGrapePlant;
import com.luisxcaliber.caliberdrinksmod.util.handlers.RegistryHandler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class ModBlocks 
{	
	//Bushes
	public static final Block GRAPE_BUSH;
	public static final Block ORANGE_BUSH;
	public static final Block LEMON_BUSH;
	public static final Block GRAPEFRUIT_BUSH;
	public static final Block PINEAPPLE_BUSH;
	public static final Block STRAWBERRY_BUSH;
	public static final Block COFFEE_BEAN_BUSH;
	public static final Block COCONUT_BUSH;
	public static final Block TEA_LEAF_BUSH;
	public static final Block WHITE_GRAPE_BUSH;
	public static final Block CRANBERRY_BUSH;
	public static final Block TOMATO_BUSH;
	public static final Block POMEGRANATE_BUSH;
	public static final Block PEACH_BUSH;
	public static final Block MANGO_BUSH;
	
	//Plants
	public static final Block GRAPE_PLANT;
	public static final Block ORANGE_PLANT;
	public static final Block LEMON_PLANT;
	public static final Block GRAPEFRUIT_PLANT;
	public static final Block PINEAPPLE_PLANT;
	public static final Block STRAWBERRY_PLANT;
	public static final Block COFFEE_BEAN_PLANT;
	public static final Block COCONUT_PLANT;
	public static final Block TEA_LEAF_PLANT;
	public static final Block WHITE_GRAPE_PLANT;
	public static final Block CRANBERRY_PLANT;
	public static final Block TOMATO_PLANT;
	public static final Block POMEGRANATE_PLANT;
	public static final Block PEACH_PLANT;
	public static final Block MANGO_PLANT;
	
	//Fluids
	public static final Block APPLE_JUICE_BLOCK;
	public static final Block GRAPE_JUICE_BLOCK;
	public static final Block ORANGE_JUICE_BLOCK;
	public static final Block FRUIT_PUNCH_BLOCK;
	public static final Block LEMONADE_BLOCK;
	public static final Block PINK_LEMONADE_BLOCK;
	public static final Block BEETROOT_JUICE_BLOCK;
	public static final Block GRAPEFRUIT_JUICE_BLOCK;
	public static final Block PINEAPPLE_JUICE_BLOCK;
	public static final Block MILK_BLOCK;
	public static final Block CHOCOLATE_MILK_BLOCK;
	public static final Block STRAWBERRY_MILK_BLOCK;
	public static final Block HOT_CHOCOLATE_BLOCK;
	public static final Block CARROT_JUICE_BLOCK;
	public static final Block STRAWBERRY_JUICE_BLOCK;
	public static final Block WATERMELON_JUICE_BLOCK;
	public static final Block COCONUT_WATER_BLOCK;
	public static final Block TEA_BLOCK;
	public static final Block ICED_TEA_BLOCK;
	public static final Block GREEN_TEA_BLOCK;
	public static final Block BLACK_TEA_BLOCK;
	public static final Block WHITE_TEA_BLOCK;
	public static final Block YELLOW_TEA_BLOCK;
	public static final Block LEMON_TEA_BLOCK;
	public static final Block WHITE_GRAPE_JUICE_BLOCK;
	public static final Block CRANBERRY_JUICE_BLOCK;
	public static final Block TOMATO_JUICE_BLOCK;
	public static final Block POMEGRANATE_JUICE_BLOCK;
	public static final Block PEACH_JUICE_BLOCK;
	public static final Block MANGO_JUICE_BLOCK;
	public static final Block COFFEE_BLOCK;
	public static final Block ICED_COFFEE_BLOCK;
	
	//Blenders
	public static final Block BLUE_BLENDER;
	
	static
	{
		//Bushes
		GRAPE_BUSH = new BlockDrinkBush("grape_bush", ModItems.GRAPE, Material.LEAVES);
		ORANGE_BUSH = new BlockDrinkBush("orange_bush", ModItems.ORANGE, Material.LEAVES);
		LEMON_BUSH = new BlockDrinkBush("lemon_bush", ModItems.LEMON, Material.LEAVES);
		GRAPEFRUIT_BUSH = new BlockDrinkBush("grapefruit_bush", ModItems.GRAPEFRUIT, Material.LEAVES);
		PINEAPPLE_BUSH = new BlockDrinkBush("pineapple_bush", ModItems.PINEAPPLE, Material.LEAVES);
		STRAWBERRY_BUSH = new BlockDrinkBush("strawberry_bush", ModItems.STRAWBERRY, Material.LEAVES);
		COFFEE_BEAN_BUSH = new BlockDrinkBush("coffee_bean_bush", ModItems.COFFEE_BEAN, Material.LEAVES);
		COCONUT_BUSH = new BlockDrinkBush("coconut_bush", ModItems.COCONUT, Material.LEAVES);
		TEA_LEAF_BUSH = new BlockDrinkBush("tea_leaf_bush", ModItems.TEA_LEAF, Material.LEAVES);
		WHITE_GRAPE_BUSH = new BlockDrinkBush("white_grape_bush", ModItems.WHITE_GRAPE, Material.LEAVES);
		CRANBERRY_BUSH = new BlockDrinkBush("cranberry_bush", ModItems.CRANBERRY, Material.LEAVES);
		TOMATO_BUSH = new BlockDrinkBush("tomato_bush", ModItems.TOMATO, Material.LEAVES);
		POMEGRANATE_BUSH = new BlockDrinkBush("pomegranate_bush", ModItems.POMEGRANATE, Material.LEAVES);
		PEACH_BUSH = new BlockDrinkBush("peach_bush", ModItems.PEACH, Material.LEAVES);
		MANGO_BUSH = new BlockDrinkBush("mango_bush", ModItems.MANGO, Material.LEAVES);
		
		//Plants
		GRAPE_PLANT = new BlockGrapePlant("grape_plant");
		ORANGE_PLANT = new BlockOrangePlant("orange_plant");
		LEMON_PLANT = new BlockLemonPlant("lemon_plant");
		GRAPEFRUIT_PLANT = new BlockGrapefruitPlant("grapefruit_plant");
		PINEAPPLE_PLANT = new BlockPineapplePlant("pineapple_plant");
		STRAWBERRY_PLANT = new BlockStrawberryPlant("strawberry_plant");
		COFFEE_BEAN_PLANT = new BlockCoffeeBeanPlant("coffee_bean_plant");
		COCONUT_PLANT = new BlockCoconutPlant("coconut_plant");
		TEA_LEAF_PLANT = new BlockTeaLeafPlant("tea_leaf_plant");
		WHITE_GRAPE_PLANT = new BlockWhiteGrapePlant("white_grape_plant");
		CRANBERRY_PLANT = new BlockCranberryPlant("cranberry_plant");
		TOMATO_PLANT = new BlockTomatoPlant("tomato_plant");
		POMEGRANATE_PLANT = new BlockPomegranatePlant("pomegranate_plant");
		PEACH_PLANT = new BlockPeachPlant("peach_plant");
		MANGO_PLANT = new BlockMangoPlant("mango_plant");
		
		//Fluids
		APPLE_JUICE_BLOCK = new BlockFluid("apple_juice_fluid", ModFluids.APPLE_JUICE_FLUID, Material.WATER);
		GRAPE_JUICE_BLOCK = new BlockFluid("grape_juice_fluid", ModFluids.GRAPE_JUICE_FLUID, Material.WATER);
		ORANGE_JUICE_BLOCK = new BlockFluid("orange_juice_fluid", ModFluids.ORANGE_JUICE_FLUID, Material.WATER);
		FRUIT_PUNCH_BLOCK = new BlockFluid("fruit_juice_fluid", ModFluids.FRUIT_PUNCH_FLUID, Material.WATER);
		LEMONADE_BLOCK = new BlockFluid("lemonade_fluid", ModFluids.LEMONADE_FLUID, Material.WATER);
		PINK_LEMONADE_BLOCK = new BlockFluid("pink_lemonade_fluid", ModFluids.PINK_LEMONADE_FLUID, Material.WATER);
		BEETROOT_JUICE_BLOCK = new BlockFluid("beetroot_juice_fluid", ModFluids.BEETROOT_JUICE_FLUID, Material.WATER);
		GRAPEFRUIT_JUICE_BLOCK = new BlockFluid("grapefruit_juice_fluid", ModFluids.GRAPEFRUIT_JUICE_FLUID, Material.WATER);
		PINEAPPLE_JUICE_BLOCK = new BlockFluid("pineapple_juice_fluid", ModFluids.PINEAPPLE_JUICE_FLUID, Material.WATER);
		MILK_BLOCK = new BlockFluid("milk_fluid", ModFluids.MILK_FLUID, Material.WATER);
		CHOCOLATE_MILK_BLOCK = new BlockFluid("chocolate_milk_fluid", ModFluids.CHOCOLATE_MILK_FLUID, Material.WATER);
		STRAWBERRY_MILK_BLOCK = new BlockFluid("strawberry_milk_fluid", ModFluids.STRAWBERRY_MILK_FLUID, Material.WATER);
		HOT_CHOCOLATE_BLOCK = new BlockFluid("hot_chocolate_fluid", ModFluids.HOT_CHOCOLATE_FLUID, Material.WATER);
		CARROT_JUICE_BLOCK = new BlockFluid("carrot_milk_fluid", ModFluids.CARROT_JUICE_FLUID, Material.WATER);
		STRAWBERRY_JUICE_BLOCK = new BlockFluid("strawberry_juice_fluid", ModFluids.STRAWBERRY_JUICE_FLUID, Material.WATER);
		WATERMELON_JUICE_BLOCK = new BlockFluid("watermelon_juice_fluid", ModFluids.WATERMELON_JUICE_FLUID, Material.WATER);
		COCONUT_WATER_BLOCK = new BlockFluid("coconut_water_fluid", ModFluids.COCONUT_WATER_FLUID, Material.WATER);
		TEA_BLOCK = new BlockFluid("tea_fluid", ModFluids.TEA_FLUID, Material.WATER);
		ICED_TEA_BLOCK = new BlockFluid("iced_tea_fluid", ModFluids.ICED_TEA_FLUID, Material.WATER);
		GREEN_TEA_BLOCK = new BlockFluid("green_tea_fluid", ModFluids.GREEN_TEA_FLUID, Material.WATER);
		BLACK_TEA_BLOCK = new BlockFluid("black_tea_fluid", ModFluids.BLACK_TEA_FLUID, Material.WATER);
		WHITE_TEA_BLOCK = new BlockFluid("white_tea_fluid", ModFluids.WHITE_TEA_FLUID, Material.WATER);
		YELLOW_TEA_BLOCK = new BlockFluid("yellow_tea_fluid", ModFluids.YELLOW_TEA_FLUID, Material.WATER);
		LEMON_TEA_BLOCK = new BlockFluid("lemon_tea_fluid", ModFluids.LEMON_TEA_FLUID, Material.WATER);
		WHITE_GRAPE_JUICE_BLOCK = new BlockFluid("white_grape_juice_fluid", ModFluids.WHITE_GRAPE_JUICE_FLUID, Material.WATER);
		CRANBERRY_JUICE_BLOCK = new BlockFluid("cranberry_juice_fluid", ModFluids.CRANBERRY_JUICE_FLUID, Material.WATER);
		TOMATO_JUICE_BLOCK = new BlockFluid("tomato_juice_fluid", ModFluids.TOMATO_JUICE_FLUID, Material.WATER);
		POMEGRANATE_JUICE_BLOCK = new BlockFluid("pomegranate_juice_fluid", ModFluids.POMEGRANATE_JUICE_FLUID, Material.WATER);
		PEACH_JUICE_BLOCK = new BlockFluid("peach_juice_fluid", ModFluids.PEACH_JUICE_FLUID, Material.WATER);
		MANGO_JUICE_BLOCK = new BlockFluid("mango_juice_fluid", ModFluids.MANGO_JUICE_FLUID, Material.WATER);
		COFFEE_BLOCK = new BlockFluid("coffee_fluid", ModFluids.COFFEE_FLUID, Material.WATER);
		ICED_COFFEE_BLOCK = new BlockFluid("iced_coffee_fluid", ModFluids.ICED_COFFEE_FLUID, Material.WATER);
		
		//Blenders
		BLUE_BLENDER = new BlockBlender("blue_blender", Material.GLASS);
	}
	
	public static void register()
	{
		//Bushes
		registerBlock(GRAPE_BUSH);
		registerBlock(ORANGE_BUSH);
		registerBlock(LEMON_BUSH);
		registerBlock(GRAPEFRUIT_BUSH);
		registerBlock(PINEAPPLE_BUSH);
		registerBlock(STRAWBERRY_BUSH);
		registerBlock(COFFEE_BEAN_BUSH);
		registerBlock(COCONUT_BUSH);
		registerBlock(TEA_LEAF_BUSH);
		registerBlock(WHITE_GRAPE_BUSH);
		registerBlock(CRANBERRY_BUSH);
		registerBlock(TOMATO_BUSH);
		registerBlock(POMEGRANATE_BUSH);
		registerBlock(PEACH_BUSH);
		registerBlock(MANGO_BUSH);
		
		//Plants
		registerBlock(GRAPE_PLANT);
		registerBlock(ORANGE_PLANT);
		registerBlock(LEMON_PLANT);
		registerBlock(GRAPEFRUIT_PLANT);
		registerBlock(PINEAPPLE_PLANT);
		registerBlock(STRAWBERRY_PLANT);
		registerBlock(COFFEE_BEAN_PLANT);
		registerBlock(COCONUT_PLANT);
		registerBlock(TEA_LEAF_PLANT);
		registerBlock(WHITE_GRAPE_PLANT);
		registerBlock(CRANBERRY_PLANT);
		registerBlock(TOMATO_PLANT);
		registerBlock(POMEGRANATE_PLANT);
		registerBlock(PEACH_PLANT);
		registerBlock(MANGO_PLANT);
		
		//Fluids
		registerBlock(APPLE_JUICE_BLOCK);
		registerBlock(GRAPE_JUICE_BLOCK);
		registerBlock(ORANGE_JUICE_BLOCK);
		registerBlock(FRUIT_PUNCH_BLOCK);
		registerBlock(LEMONADE_BLOCK);
		registerBlock(PINK_LEMONADE_BLOCK);
		registerBlock(BEETROOT_JUICE_BLOCK);
		registerBlock(GRAPEFRUIT_JUICE_BLOCK);
		registerBlock(PINEAPPLE_JUICE_BLOCK);
		registerBlock(MILK_BLOCK);
		registerBlock(CHOCOLATE_MILK_BLOCK);
		registerBlock(STRAWBERRY_MILK_BLOCK);
		registerBlock(HOT_CHOCOLATE_BLOCK);
		registerBlock(CARROT_JUICE_BLOCK);
		registerBlock(STRAWBERRY_JUICE_BLOCK);
		registerBlock(WATERMELON_JUICE_BLOCK);
		registerBlock(COCONUT_WATER_BLOCK);
		registerBlock(TEA_BLOCK);
		registerBlock(ICED_TEA_BLOCK);
		registerBlock(GREEN_TEA_BLOCK);
		registerBlock(BLACK_TEA_BLOCK);
		registerBlock(WHITE_TEA_BLOCK);
		registerBlock(YELLOW_TEA_BLOCK);
		registerBlock(LEMON_TEA_BLOCK);
		registerBlock(WHITE_GRAPE_JUICE_BLOCK);
		registerBlock(CRANBERRY_JUICE_BLOCK);
		registerBlock(TOMATO_JUICE_BLOCK);
		registerBlock(POMEGRANATE_JUICE_BLOCK);
		registerBlock(PEACH_JUICE_BLOCK);
		registerBlock(MANGO_JUICE_BLOCK);
		registerBlock(COFFEE_BLOCK);
		registerBlock(ICED_COFFEE_BLOCK);
		
		//Blenders
		registerBlock(BLUE_BLENDER);
	}
	
	private static void registerBlock(Block block)
	{
		registerBlock(block, new ItemBlock(block));
	}
	
	private static void registerBlock(Block block, ItemBlock item)
	{
		if(block.getRegistryName() == null)
			throw new IllegalArgumentException("A block being registered does not have a registry name and could be successfully registered.");
		
		RegistryHandler.Blocks.add(block);
		
		if(item != null)
		{
			item.setRegistryName(block.getRegistryName());
			RegistryHandler.Items.add(item);
		}
	}
}
