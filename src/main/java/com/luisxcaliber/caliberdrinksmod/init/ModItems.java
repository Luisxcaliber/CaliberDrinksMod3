package com.luisxcaliber.caliberdrinksmod.init;

import com.luisxcaliber.caliberdrinksmod.items.ItemDrinkSeed;
import com.luisxcaliber.caliberdrinksmod.items.food.DrinkBase;
import com.luisxcaliber.caliberdrinksmod.items.food.DrinkCoffee;
import com.luisxcaliber.caliberdrinksmod.items.food.DrinkMilk;
import com.luisxcaliber.caliberdrinksmod.items.food.FoodBase;
import com.luisxcaliber.caliberdrinksmod.items.tools.ItemDrinkBucket;
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
	public static final Item BEETROOT_JUICE;
	public static final Item PINK_LEMONADE;
	public static final Item GRAPEFRUIT_JUICE;
	public static final Item PINEAPPLE_JUICE;
	public static final Item MILK_BOTTLE;
	public static final Item CHOCOLATE_MILK;
	public static final Item STRAWBERRY_MILK;
	public static final Item CARROT_JUICE;
	public static final Item STRAWBERRY_JUICE;
	public static final Item WATERMELON_JUICE;
	public static final Item HOT_CHOCOLATE;
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
	public static final Item APPLE_JUICE_BUCKET;
	
	static
	{
		//Drinks
		APPLE_JUICE = new DrinkBase("apple_juice", 6, 6f, false);
		GRAPE_JUICE = new DrinkBase("grape_juice", 6, 6f, false);
		ORANGE_JUICE = new DrinkBase("orange_juice", 6, 6f, false);
		FRUIT_PUNCH = new DrinkBase("fruit_punch", 6, 6f, false);
		LEMONADE = new DrinkBase("lemonade", 6, 6f, false);
		BEETROOT_JUICE = new DrinkBase("beetroot_juice", 6, 6f, false);
		PINK_LEMONADE = new DrinkBase("pink_lemonade", 6, 6f, false);
		GRAPEFRUIT_JUICE = new DrinkBase("grapefruit_juice", 6, 6f, false);
		PINEAPPLE_JUICE = new DrinkBase("pineapple_juice", 6, 6f, false);
		MILK_BOTTLE = new DrinkMilk("milk_bottle", 6, 6f, false);
		CHOCOLATE_MILK = new DrinkMilk("chocolate_milk", 6, 6f, false);
		STRAWBERRY_MILK = new DrinkMilk("strawberry_milk", 6, 6f, false);
		CARROT_JUICE = new DrinkBase("carrot_juice", 6, 6f, false);
		STRAWBERRY_JUICE = new DrinkBase("strawberry_juice", 6, 6f, false);
		WATERMELON_JUICE = new DrinkBase("watermelon_juice", 6, 6f, false);
		HOT_CHOCOLATE = new DrinkBase("hot_chocolate", 6, 6f, false);
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
		APPLE_JUICE_BUCKET = new ItemDrinkBucket("apple_juice_bucket", ModBlocks.APPLE_JUICE_BLOCK);
	}
	
	public static void register()
	{
		//Drinks
		registerItem(APPLE_JUICE);
		registerItem(GRAPE_JUICE);
		registerItem(ORANGE_JUICE);
		registerItem(FRUIT_PUNCH);
		registerItem(LEMONADE);
		registerItem(BEETROOT_JUICE);
		registerItem(PINK_LEMONADE);
		registerItem(GRAPEFRUIT_JUICE);
		registerItem(PINEAPPLE_JUICE);
		registerItem(MILK_BOTTLE);
		registerItem(CHOCOLATE_MILK);
		registerItem(STRAWBERRY_MILK);
		registerItem(CARROT_JUICE);
		registerItem(STRAWBERRY_JUICE);
		registerItem(WATERMELON_JUICE);
		registerItem(HOT_CHOCOLATE);
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
		registerItem(APPLE_JUICE_BUCKET);
	}
	
	private static void registerItem(Item item)
	{
		RegistryHandler.Items.add(item);
	}
}
