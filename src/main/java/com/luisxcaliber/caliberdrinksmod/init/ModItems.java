package com.luisxcaliber.caliberdrinksmod.init;

import com.luisxcaliber.caliberdrinksmod.items.ItemBase;
import com.luisxcaliber.caliberdrinksmod.items.ItemDrinkSeed;
import com.luisxcaliber.caliberdrinksmod.items.food.DrinkBase;
import com.luisxcaliber.caliberdrinksmod.items.food.DrinkCoffee;
import com.luisxcaliber.caliberdrinksmod.items.food.DrinkMilk;
import com.luisxcaliber.caliberdrinksmod.items.food.FoodBase;
import com.luisxcaliber.caliberdrinksmod.items.tools.ItemFluidBucket;
import com.luisxcaliber.caliberdrinksmod.items.tools.ItemModBucket;
import com.luisxcaliber.caliberdrinksmod.util.handlers.RegistryHandler;

import net.minecraft.item.Item;

public class ModItems 
{	
	//Drinks
	public static final Item APPLE_JUICE;
	public static final Item GRAPE_JUICE;
	public static final Item ORANGE_JUICE;
	public static final Item FRUIT_PUNCH;
	public static final Item LEMONADE;
	public static final Item PINK_LEMONADE;
	public static final Item BEETROOT_JUICE;
	public static final Item GRAPEFRUIT_JUICE;
	public static final Item PINEAPPLE_JUICE;
	public static final Item MILK_BOTTLE;
	public static final Item CHOCOLATE_MILK;
	public static final Item STRAWBERRY_MILK;
	public static final Item HOT_CHOCOLATE;
	public static final Item CARROT_JUICE;
	public static final Item STRAWBERRY_JUICE;
	public static final Item WATERMELON_JUICE;
	public static final Item COCONUT_WATER;
	public static final Item TEA;
	public static final Item ICED_TEA;
	public static final Item GREEN_TEA;
	public static final Item BLACK_TEA;
	public static final Item WHITE_TEA;
	public static final Item YELLOW_TEA;
	public static final Item LEMON_TEA;
	public static final Item WHITE_GRAPE_JUICE;
	public static final Item CRANBERRY_JUICE;
	public static final Item TOMATO_JUICE;
	public static final Item POMEGRANATE_JUICE;
	public static final Item PEACH_JUICE;
	public static final Item MANGO_JUICE;
	public static final Item COFFEE;
	public static final Item ICED_COFFEE;
	
	//Foods
	public static final Item GRAPE;
	public static final Item ORANGE;
	public static final Item LEMON;
	public static final Item GRAPEFRUIT;
	public static final Item PINEAPPLE;
	public static final Item STRAWBERRY;
	public static final Item COCONUT;
	public static final Item TEA_LEAF;
	public static final Item WHITE_GRAPE;
	public static final Item CRANBERRY;
	public static final Item TOMATO;
	public static final Item POMEGRANATE;
	public static final Item PEACH;
	public static final Item MANGO;
	
	//Plant Seeds
	public static final Item GRAPE_SEED;
	public static final Item ORANGE_SEED;
	public static final Item LEMON_SEED;
	public static final Item GRAPEFRUIT_SEED;
	public static final Item PINEAPPLE_SEED;
	public static final Item STRAWBERRY_SEED;
	public static final Item COCONUT_SEED;
	public static final Item TEA_LEAF_SEED;
	public static final Item WHITE_GRAPE_SEED;
	public static final Item CRANBERRY_SEED;
	public static final Item TOMATO_SEED;
	public static final Item POMEGRANATE_SEED;
	public static final Item PEACH_SEED;
	public static final Item COFFEE_BEAN;
	public static final Item MANGO_SEED;
	
	//Buckets
	public static final Item WOOD_BUCKET;
	public static final Item APPLE_JUICE_BUCKET;
	public static final Item GRAPE_JUICE_BUCKET;
	public static final Item ORANGE_JUICE_BUCKET;
	public static final Item FRUIT_PUNCH_BUCKET;
	public static final Item LEMONADE_BUCKET;
	public static final Item PINK_LEMONADE_BUCKET;
	public static final Item BEETROOT_JUICE_BUCKET;
	public static final Item GRAPEFRUIT_JUICE_BUCKET;
	public static final Item PINEAPPLE_JUICE_BUCKET;
	public static final Item CHOCOLATE_MILK_BUCKET;
	public static final Item STRAWBERRY_MILK_BUCKET;
	public static final Item HOT_CHOCOLATE_BUCKET;
	public static final Item CARROT_JUICE_BUCKET;
	public static final Item STRAWBERRY_JUICE_BUCKET;
	public static final Item WATERMELON_JUICE_BUCKET;
	public static final Item COCONUT_WATER_BUCKET;
	public static final Item TEA_BUCKET;
	public static final Item ICED_TEA_BUCKET;
	public static final Item GREEN_TEA_BUCKET;
	public static final Item BLACK_TEA_BUCKET;
	public static final Item WHITE_TEA_BUCKET;
	public static final Item YELLOW_TEA_BUCKET;
	public static final Item LEMON_TEA_BUCKET;
	public static final Item WHITE_GRAPE_JUICE_BUCKET;
	public static final Item CRANBERRY_JUICE_BUCKET;
	public static final Item TOMATO_JUICE_BUCKET;
	public static final Item POMEGRANATE_JUICE_BUCKET;
	public static final Item PEACH_JUICE_BUCKET;
	public static final Item MANGO_JUICE_BUCKET;
	public static final Item COFFEE_BUCKET;
	public static final Item ICED_COFFEE_BUCKET;
	
	//Blender Parts
	public static final Item BLENDER_JAR;
	
	public static final Item BLACK_BLENDER_LID;
	public static final Item RED_BLENDER_LID;
	public static final Item GREEN_BLENDER_LID;
	public static final Item BROWN_BLENDER_LID;
	public static final Item BLUE_BLENDER_LID;
	public static final Item PURPLE_BLENDER_LID;
	public static final Item CYAN_BLENDER_LID;
	public static final Item LIGHT_GRAY_BLENDER_LID;
	public static final Item GRAY_BLENDER_LID;
	public static final Item PINK_BLENDER_LID;
	public static final Item LIME_BLENDER_LID;
	public static final Item YELLOW_BLENDER_LID;
	public static final Item LIGHT_BLUE_BLENDER_LID;
	public static final Item MAGENTA_BLENDER_LID;
	public static final Item ORANGE_BLENDER_LID;
	public static final Item WHITE_BLENDER_LID;
	
	public static final Item BLACK_BLENDER_BASE;
	public static final Item RED_BLENDER_BASE;
	public static final Item GREEN_BLENDER_BASE;
	public static final Item BROWN_BLENDER_BASE;
	public static final Item BLUE_BLENDER_BASE;
	public static final Item PURPLE_BLENDER_BASE;
	public static final Item CYAN_BLENDER_BASE;
	public static final Item LIGHT_GRAY_BLENDER_BASE;
	public static final Item GRAY_BLENDER_BASE;
	public static final Item PINK_BLENDER_BASE;
	public static final Item LIME_BLENDER_BASE;
	public static final Item YELLOW_BLENDER_BASE;
	public static final Item LIGHT_BLUE_BLENDER_BASE;
	public static final Item MAGENTA_BLENDER_BASE;
	public static final Item ORANGE_BLENDER_BASE;
	public static final Item WHITE_BLENDER_BASE;
	
	static
	{
		//Drinks
		APPLE_JUICE = new DrinkBase("apple_juice", 6, 6f, false);
		GRAPE_JUICE = new DrinkBase("grape_juice", 6, 6f, false);
		ORANGE_JUICE = new DrinkBase("orange_juice", 6, 6f, false);
		FRUIT_PUNCH = new DrinkBase("fruit_punch", 6, 6f, false);
		LEMONADE = new DrinkBase("lemonade", 6, 6f, false);
		PINK_LEMONADE = new DrinkBase("pink_lemonade", 6, 6f, false);
		BEETROOT_JUICE = new DrinkBase("beetroot_juice", 6, 6f, false);
		GRAPEFRUIT_JUICE = new DrinkBase("grapefruit_juice", 6, 6f, false);
		PINEAPPLE_JUICE = new DrinkBase("pineapple_juice", 6, 6f, false);
		MILK_BOTTLE = new DrinkMilk("milk_bottle", 6, 6f, false);
		CHOCOLATE_MILK = new DrinkMilk("chocolate_milk", 6, 6f, false);
		STRAWBERRY_MILK = new DrinkMilk("strawberry_milk", 6, 6f, false);
		HOT_CHOCOLATE = new DrinkMilk("hot_chocolate", 6, 6f, false);
		CARROT_JUICE = new DrinkBase("carrot_juice", 6, 6f, false);
		STRAWBERRY_JUICE = new DrinkBase("strawberry_juice", 6, 6f, false);
		WATERMELON_JUICE = new DrinkBase("watermelon_juice", 6, 6f, false);
		COCONUT_WATER = new DrinkBase("coconut_water", 6, 6f, false);
		TEA = new DrinkBase("tea", 6, 6f, false);
		ICED_TEA = new DrinkBase("iced_tea", 6, 6f, false);
		GREEN_TEA = new DrinkBase("green_tea", 6, 6f, false);
		BLACK_TEA = new DrinkBase("black_tea", 6, 6f, false);
		WHITE_TEA = new DrinkBase("white_tea", 6, 6f, false);
		YELLOW_TEA = new DrinkBase("yellow_tea", 6, 6f, false);
		LEMON_TEA = new DrinkBase("lemon_tea", 6, 6f, false);
		WHITE_GRAPE_JUICE = new DrinkBase("white_grape_juice", 6, 6f, false);
		CRANBERRY_JUICE = new DrinkBase("cranberry_juice", 6, 6f, false);
		TOMATO_JUICE = new DrinkBase("tomato_juice", 6, 6f, false);
		POMEGRANATE_JUICE = new DrinkBase("pomegranate_juice", 6, 6f, false);
		PEACH_JUICE = new DrinkBase("peach_juice", 6, 6f, false);
		MANGO_JUICE = new DrinkBase("mango_juice", 6, 6f, false);
		COFFEE = new DrinkCoffee("coffee", 6, 6f, false);
		ICED_COFFEE = new DrinkCoffee("iced_coffee", 6, 6f, false);
		
		//Foods
		GRAPE = new FoodBase("grape", 4, 2.4f, false);
		ORANGE = new FoodBase("orange", 4, 2.4f, false);
		LEMON = new FoodBase("lemon", 4, 2.4f, false);
		GRAPEFRUIT = new FoodBase("grapefruit", 4, 2.4f, false);
		PINEAPPLE = new FoodBase("pineapple", 4, 2.4f, false);
		STRAWBERRY = new FoodBase("strawberry", 4, 2.4f, false);
		COCONUT = new FoodBase("coconut", 6, 2.4f, false);
		TEA_LEAF = new FoodBase("tea_leaf", 2, 2.4f, false);
		WHITE_GRAPE = new FoodBase("white_grape", 4, 2.4f, false);
		CRANBERRY = new FoodBase("cranberry", 4, 2.4f, false);
		TOMATO = new FoodBase("tomato", 4, 2.4f, false);
		POMEGRANATE = new FoodBase("pomegranate", 4, 2.4f, false);
		PEACH = new FoodBase("peach", 4, 2.4f, false);
		MANGO = new FoodBase("mango", 6, 2.4f, false);
		
		//Plant Seeds
		GRAPE_SEED = new ItemDrinkSeed("grape_seed", ModBlocks.GRAPE_PLANT);
		ORANGE_SEED = new ItemDrinkSeed("orange_seed", ModBlocks.ORANGE_PLANT);
		LEMON_SEED = new ItemDrinkSeed("lemon_seed", ModBlocks.LEMON_PLANT);
		GRAPEFRUIT_SEED = new ItemDrinkSeed("grapefruit_seed", ModBlocks.GRAPEFRUIT_PLANT);
		PINEAPPLE_SEED = new ItemDrinkSeed("pineapple_seed", ModBlocks.PINEAPPLE_PLANT);
		STRAWBERRY_SEED = new ItemDrinkSeed("strawberry_seed", ModBlocks.STRAWBERRY_PLANT);
		COCONUT_SEED = new ItemDrinkSeed("coconut_seed", ModBlocks.COCONUT_PLANT);
		TEA_LEAF_SEED = new ItemDrinkSeed("tea_leaf_seed", ModBlocks.TEA_LEAF_PLANT);
		WHITE_GRAPE_SEED = new ItemDrinkSeed("white_grape_seed", ModBlocks.WHITE_GRAPE_PLANT);
		CRANBERRY_SEED = new ItemDrinkSeed("cranberry_seed", ModBlocks.CRANBERRY_PLANT);
		TOMATO_SEED = new ItemDrinkSeed("tomato_seed", ModBlocks.TOMATO_PLANT);
		POMEGRANATE_SEED = new ItemDrinkSeed("pomegranate_seed", ModBlocks.POMEGRANATE_PLANT);
		PEACH_SEED = new ItemDrinkSeed("peach_seed", ModBlocks.PEACH_PLANT);
		COFFEE_BEAN = new ItemDrinkSeed("coffee_bean", ModBlocks.COFFEE_BEAN_PLANT);
		MANGO_SEED = new ItemDrinkSeed("mango_seed", ModBlocks.MANGO_PLANT);
		
		//Buckets
		WOOD_BUCKET = new ItemModBucket("wood_bucket");
		APPLE_JUICE_BUCKET = new ItemFluidBucket("apple_juice_bucket", ModBlocks.APPLE_JUICE_BLOCK);
		GRAPE_JUICE_BUCKET = new ItemFluidBucket("grape_juice_bucket", ModBlocks.GRAPE_JUICE_BLOCK);
		ORANGE_JUICE_BUCKET = new ItemFluidBucket("orange_juice_bucket", ModBlocks.ORANGE_JUICE_BLOCK);
		FRUIT_PUNCH_BUCKET = new ItemFluidBucket("fruit_punch_bucket", ModBlocks.FRUIT_PUNCH_BLOCK);
		LEMONADE_BUCKET = new ItemFluidBucket("lemonade_bucket", ModBlocks.LEMONADE_BLOCK);
		PINK_LEMONADE_BUCKET = new ItemFluidBucket("pink_lemonade_bucket", ModBlocks.PINK_LEMONADE_BLOCK);
		BEETROOT_JUICE_BUCKET = new ItemFluidBucket("beetroot_juice_bucket", ModBlocks.BEETROOT_JUICE_BLOCK);
		GRAPEFRUIT_JUICE_BUCKET = new ItemFluidBucket("grapefruit_juice_bucket", ModBlocks.GRAPEFRUIT_JUICE_BLOCK);
		PINEAPPLE_JUICE_BUCKET = new ItemFluidBucket("pineapple_juice_bucket", ModBlocks.PINEAPPLE_JUICE_BLOCK);
		CHOCOLATE_MILK_BUCKET = new ItemFluidBucket("chocolate_milk_bucket", ModBlocks.CHOCOLATE_MILK_BLOCK);
		STRAWBERRY_MILK_BUCKET = new ItemFluidBucket("strawberry_milk_bucket", ModBlocks.STRAWBERRY_MILK_BLOCK);
		HOT_CHOCOLATE_BUCKET = new ItemFluidBucket("hot_chocolate_bucket", ModBlocks.HOT_CHOCOLATE_BLOCK);
		CARROT_JUICE_BUCKET = new ItemFluidBucket("carrot_juice_bucket", ModBlocks.CARROT_JUICE_BLOCK);
		STRAWBERRY_JUICE_BUCKET = new ItemFluidBucket("strawberry_juice_bucket", ModBlocks.STRAWBERRY_JUICE_BLOCK);
		WATERMELON_JUICE_BUCKET = new ItemFluidBucket("watermelon_juice_bucket", ModBlocks.WATERMELON_JUICE_BLOCK);
		COCONUT_WATER_BUCKET = new ItemFluidBucket("coconut_water_bucket", ModBlocks.COCONUT_WATER_BLOCK);
		TEA_BUCKET = new ItemFluidBucket("tea_bucket", ModBlocks.TEA_BLOCK);
		ICED_TEA_BUCKET = new ItemFluidBucket("iced_tea_bucket", ModBlocks.ICED_TEA_BLOCK);
		GREEN_TEA_BUCKET = new ItemFluidBucket("green_tea_bucket", ModBlocks.GREEN_TEA_BLOCK);
		BLACK_TEA_BUCKET = new ItemFluidBucket("black_tea_bucket", ModBlocks.BLACK_TEA_BLOCK);
		WHITE_TEA_BUCKET = new ItemFluidBucket("white_tea_bucket", ModBlocks.WHITE_TEA_BLOCK);
		YELLOW_TEA_BUCKET = new ItemFluidBucket("yellow_tea_bucket", ModBlocks.YELLOW_TEA_BLOCK);
		LEMON_TEA_BUCKET = new ItemFluidBucket("lemon_tea_bucket", ModBlocks.LEMON_TEA_BLOCK);
		WHITE_GRAPE_JUICE_BUCKET = new ItemFluidBucket("white_grape_juice_bucket", ModBlocks.WHITE_GRAPE_JUICE_BLOCK);
		CRANBERRY_JUICE_BUCKET = new ItemFluidBucket("cranberry_juice_bucket", ModBlocks.CRANBERRY_JUICE_BLOCK);
		TOMATO_JUICE_BUCKET = new ItemFluidBucket("tomato_juice_bucket", ModBlocks.TOMATO_JUICE_BLOCK);
		POMEGRANATE_JUICE_BUCKET = new ItemFluidBucket("pomegranate_juice_bucket", ModBlocks.POMEGRANATE_JUICE_BLOCK);
		PEACH_JUICE_BUCKET = new ItemFluidBucket("peach_juice_bucket", ModBlocks.PEACH_JUICE_BLOCK);
		MANGO_JUICE_BUCKET = new ItemFluidBucket("mango_juice_bucket", ModBlocks.MANGO_JUICE_BLOCK);
		COFFEE_BUCKET = new ItemFluidBucket("coffee_bucket", ModBlocks.COFFEE_BLOCK);
		ICED_COFFEE_BUCKET = new ItemFluidBucket("iced_coffee_bucket", ModBlocks.ICED_COFFEE_BLOCK);
		
		//Blender Parts
		BLENDER_JAR = new ItemBase("blender_jar");
		
		BLACK_BLENDER_LID = new ItemBase("black_blender_lid");
		RED_BLENDER_LID = new ItemBase("red_blender_lid");
		GREEN_BLENDER_LID = new ItemBase("green_blender_lid");
		BROWN_BLENDER_LID = new ItemBase("brown_blender_lid");
		BLUE_BLENDER_LID = new ItemBase("blue_blender_lid");
		PURPLE_BLENDER_LID = new ItemBase("purple_blender_lid");
		CYAN_BLENDER_LID = new ItemBase("cyan_blender_lid");
		LIGHT_GRAY_BLENDER_LID = new ItemBase("light_gray_blender_lid");
		GRAY_BLENDER_LID = new ItemBase("gray_blender_lid");
		PINK_BLENDER_LID = new ItemBase("pink_blender_lid");
		LIME_BLENDER_LID = new ItemBase("lime_blender_lid");
		YELLOW_BLENDER_LID = new ItemBase("yellow_blender_lid");
		LIGHT_BLUE_BLENDER_LID = new ItemBase("light_blue_blender_lid");
		MAGENTA_BLENDER_LID = new ItemBase("magenta_blender_lid");
		ORANGE_BLENDER_LID = new ItemBase("orange_blender_lid");
		WHITE_BLENDER_LID = new ItemBase("white_blender_lid");
		
		BLACK_BLENDER_BASE = new ItemBase("black_blender_base");
		RED_BLENDER_BASE = new ItemBase("red_blender_base");
		GREEN_BLENDER_BASE = new ItemBase("green_blender_base");
		BROWN_BLENDER_BASE = new ItemBase("brown_blender_base");
		BLUE_BLENDER_BASE = new ItemBase("blue_blender_base");
		PURPLE_BLENDER_BASE = new ItemBase("purple_blender_base");
		CYAN_BLENDER_BASE = new ItemBase("cyan_blender_base");
		LIGHT_GRAY_BLENDER_BASE = new ItemBase("light_gray_blender_base");
		GRAY_BLENDER_BASE = new ItemBase("gray_blender_base");
		PINK_BLENDER_BASE = new ItemBase("pink_blender_base");
		LIME_BLENDER_BASE = new ItemBase("lime_blender_base");
		YELLOW_BLENDER_BASE = new ItemBase("yellow_blender_base");
		LIGHT_BLUE_BLENDER_BASE = new ItemBase("light_blue_blender_base");
		MAGENTA_BLENDER_BASE = new ItemBase("magenta_blender_base");
		ORANGE_BLENDER_BASE = new ItemBase("orange_blender_base");
		WHITE_BLENDER_BASE = new ItemBase("white_blender_base");
	}
	
	public static void register()
	{
		//Drinks
		registerItem(APPLE_JUICE);
		registerItem(GRAPE_JUICE);
		registerItem(ORANGE_JUICE);
		registerItem(FRUIT_PUNCH);
		registerItem(LEMONADE);
		registerItem(PINK_LEMONADE);
		registerItem(BEETROOT_JUICE);
		registerItem(GRAPEFRUIT_JUICE);
		registerItem(PINEAPPLE_JUICE);
		registerItem(MILK_BOTTLE);
		registerItem(CHOCOLATE_MILK);
		registerItem(STRAWBERRY_MILK);
		registerItem(HOT_CHOCOLATE);
		registerItem(CARROT_JUICE);
		registerItem(STRAWBERRY_JUICE);
		registerItem(WATERMELON_JUICE);
		registerItem(COCONUT_WATER);
		registerItem(TEA);
		registerItem(ICED_TEA);
		registerItem(GREEN_TEA);
		registerItem(BLACK_TEA);
		registerItem(WHITE_TEA);
		registerItem(YELLOW_TEA);
		registerItem(LEMON_TEA);
		registerItem(WHITE_GRAPE_JUICE);
		registerItem(CRANBERRY_JUICE);
		registerItem(TOMATO_JUICE);
		registerItem(POMEGRANATE_JUICE);
		registerItem(PEACH_JUICE);
		registerItem(MANGO_JUICE);
		registerItem(COFFEE);
		registerItem(ICED_COFFEE);
		
		//Foods
		registerItem(GRAPE);
		registerItem(ORANGE);
		registerItem(LEMON);
		registerItem(GRAPEFRUIT);
		registerItem(PINEAPPLE);
		registerItem(STRAWBERRY);
		registerItem(COCONUT);
		registerItem(TEA_LEAF);
		registerItem(WHITE_GRAPE);
		registerItem(CRANBERRY);
		registerItem(TOMATO);
		registerItem(POMEGRANATE);
		registerItem(PEACH);
		registerItem(MANGO);
		
		//Plant Seeds
		registerItem(GRAPE_SEED);
		registerItem(ORANGE_SEED);
		registerItem(LEMON_SEED);
		registerItem(GRAPEFRUIT_SEED);
		registerItem(PINEAPPLE_SEED);
		registerItem(STRAWBERRY_SEED);
		registerItem(COCONUT_SEED);
		registerItem(TEA_LEAF_SEED);
		registerItem(WHITE_GRAPE_SEED);
		registerItem(CRANBERRY_SEED);
		registerItem(TOMATO_SEED);
		registerItem(POMEGRANATE_SEED);
		registerItem(PEACH_SEED);
		registerItem(COFFEE_BEAN);
		registerItem(MANGO_SEED);
		
		//Buckets
		registerItem(WOOD_BUCKET);
		registerItem(APPLE_JUICE_BUCKET);
		registerItem(GRAPE_JUICE_BUCKET);
		registerItem(ORANGE_JUICE_BUCKET);
		registerItem(FRUIT_PUNCH_BUCKET);
		registerItem(LEMONADE_BUCKET);
		registerItem(PINK_LEMONADE_BUCKET);
		registerItem(BEETROOT_JUICE_BUCKET);
		registerItem(GRAPEFRUIT_JUICE_BUCKET);
		registerItem(PINEAPPLE_JUICE_BUCKET);
		registerItem(CHOCOLATE_MILK_BUCKET);
		registerItem(STRAWBERRY_MILK_BUCKET);
		registerItem(HOT_CHOCOLATE);
		registerItem(CARROT_JUICE_BUCKET);
		registerItem(STRAWBERRY_JUICE_BUCKET);
		registerItem(WATERMELON_JUICE_BUCKET);
		registerItem(COCONUT_WATER_BUCKET);
		registerItem(TEA_BUCKET);
		registerItem(ICED_TEA_BUCKET);
		registerItem(GREEN_TEA_BUCKET);
		registerItem(BLACK_TEA_BUCKET);
		registerItem(WHITE_TEA_BUCKET);
		registerItem(YELLOW_TEA_BUCKET);
		registerItem(LEMON_TEA_BUCKET);
		registerItem(WHITE_GRAPE_JUICE_BUCKET);
		registerItem(CRANBERRY_JUICE_BUCKET);
		registerItem(TOMATO_JUICE_BUCKET);
		registerItem(POMEGRANATE_JUICE_BUCKET);
		registerItem(PEACH_JUICE_BUCKET);
		registerItem(MANGO_JUICE_BUCKET);
		registerItem(COFFEE_BUCKET);
		registerItem(ICED_COFFEE_BUCKET);
		
		//Blender Parts
		registerItem(BLENDER_JAR);
		
		registerItem(BLACK_BLENDER_LID);
		registerItem(RED_BLENDER_LID);
		registerItem(GREEN_BLENDER_LID);
		registerItem(BROWN_BLENDER_LID);
		registerItem(BLUE_BLENDER_LID);
		registerItem(PURPLE_BLENDER_LID);
		registerItem(CYAN_BLENDER_LID);
		registerItem(LIGHT_GRAY_BLENDER_LID);
		registerItem(GRAY_BLENDER_LID);
		registerItem(PINK_BLENDER_LID);
		registerItem(LIME_BLENDER_LID);
		registerItem(YELLOW_BLENDER_LID);
		registerItem(LIGHT_BLUE_BLENDER_LID);
		registerItem(MAGENTA_BLENDER_LID);
		registerItem(ORANGE_BLENDER_LID);
		registerItem(WHITE_BLENDER_LID);
		
		registerItem(BLACK_BLENDER_BASE);
		registerItem(RED_BLENDER_BASE);
		registerItem(GREEN_BLENDER_BASE);
		registerItem(BROWN_BLENDER_BASE);
		registerItem(BLUE_BLENDER_BASE);
		registerItem(PURPLE_BLENDER_BASE);
		registerItem(CYAN_BLENDER_BASE);
		registerItem(LIGHT_GRAY_BLENDER_BASE);
		registerItem(GRAY_BLENDER_BASE);
		registerItem(LIME_BLENDER_BASE);
		registerItem(YELLOW_BLENDER_BASE);
		registerItem(LIGHT_BLUE_BLENDER_BASE);
		registerItem(MAGENTA_BLENDER_BASE);
		registerItem(ORANGE_BLENDER_BASE);
		registerItem(WHITE_BLENDER_BASE);
	}
	
	private static void registerItem(Item item)
	{
		RegistryHandler.Items.add(item);
	}
}
