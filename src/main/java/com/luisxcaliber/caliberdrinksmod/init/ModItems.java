package com.luisxcaliber.caliberdrinksmod.init;

import java.util.ArrayList;
import java.util.List;

import com.luisxcaliber.caliberdrinksmod.items.food.DrinkBase;
import com.luisxcaliber.caliberdrinksmod.items.food.DrinkCoffee;
import com.luisxcaliber.caliberdrinksmod.items.food.DrinkMilk;
import com.luisxcaliber.caliberdrinksmod.items.food.FoodBase;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemCoconutSeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemCoffeeBeanSeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemCranberrySeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemGrapeSeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemGrapefruitSeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemLemonSeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemMangoSeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemOrangeSeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemPeachSeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemPineappleSeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemPomegranateSeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemStrawberrySeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemTeaLeafSeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemTomatoSeed;
import com.luisxcaliber.caliberdrinksmod.items.seeds.ItemWhiteGrapeSeed;
import com.luisxcaliber.caliberdrinksmod.items.tools.ItemDrinkBucket;

import net.minecraft.item.Item;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Drinks
	public static final Item APPLE_JUICE = new DrinkBase("apple_juice", 6, 6f, false);
	public static final Item GRAPE_JUICE = new DrinkBase("grape_juice", 6, 6f, false);
	public static final Item ORANGE_JUICE = new DrinkBase("orange_juice", 6, 6f, false);
	public static final Item FRUIT_PUNCH = new DrinkBase("fruit_punch", 6, 6f, false);
	public static final Item LEMONADE = new DrinkBase("lemonade", 6, 6f, false);
	public static final Item BEETROOT_JUICE = new DrinkBase("beetroot_juice", 6, 6f, false);
	public static final Item PINK_LEMONADE = new DrinkBase("pink_lemonade", 6, 6f, false);
	public static final Item GRAPEFRUIT_JUICE = new DrinkBase("grapefruit_juice", 6, 6f, false);
	public static final Item PINEAPPLE_JUICE = new DrinkBase("pineapple_juice", 6, 6f, false);
	public static final Item MILK_BOTTLE = new DrinkMilk("milk_bottle", 6, 6f, false);
	public static final Item CHOCOLATE_MILK = new DrinkMilk("chocolate_milk", 6, 6f, false);
	public static final Item STRAWBERRY_MILK = new DrinkMilk("strawberry_milk", 6, 6f, false);
	public static final Item CARROT_JUICE = new DrinkBase("carrot_juice", 6, 6f, false);
	public static final Item STRAWBERRY_JUICE = new DrinkBase("strawberry_juice", 6, 6f, false);
	public static final Item WATERMELON_JUICE = new DrinkBase("watermelon_juice", 6, 6f, false);
	public static final Item HOT_CHOCOLATE = new DrinkBase("hot_chocolate", 6, 6f, false);
	public static final Item COCONUT_WATER = new DrinkBase("coconut_water", 6, 6f, false);
	public static final Item TEA = new DrinkBase("tea", 6, 6f, false);
	public static final Item ICED_TEA = new DrinkBase("iced_tea", 6, 6f, false);
	public static final Item GREEN_TEA = new DrinkBase("green_tea", 6, 6f, false);
	public static final Item BLACK_TEA = new DrinkBase("black_tea", 6, 6f, false);
	public static final Item WHITE_TEA = new DrinkBase("white_tea", 6, 6f, false);
	public static final Item YELLOW_TEA = new DrinkBase("yellow_tea", 6, 6f, false);
	public static final Item LEMON_TEA = new DrinkBase("lemon_tea", 6, 6f, false);
	public static final Item WHITE_GRAPE_JUICE = new DrinkBase("white_grape_juice", 6, 6f, false);
	public static final Item CRANBERRY_JUICE = new DrinkBase("cranberry_juice", 6, 6f, false);
	public static final Item TOMATO_JUICE = new DrinkBase("tomato_juice", 6, 6f, false);
	public static final Item POMEGRANATE_JUICE = new DrinkBase("pomegranate_juice", 6, 6f, false);
	public static final Item PEACH_JUICE = new DrinkBase("peach_juice", 6, 6f, false);
	public static final Item MANGO_JUICE = new DrinkBase("mango_juice", 6, 6f, false);
	public static final Item COFFEE = new DrinkCoffee("coffee", 6, 6f, false);
	public static final Item ICED_COFFEE = new DrinkCoffee("iced_coffee", 6, 6f, false);
	
	//Foods
	public static final Item GRAPE = new FoodBase("grape", 4, 2.4f, false);
	public static final Item ORANGE = new FoodBase("orange", 4, 2.4f, false);
	public static final Item LEMON = new FoodBase("lemon", 4, 2.4f, false);
	public static final Item GRAPEFRUIT = new FoodBase("grapefruit", 4, 2.4f, false);
	public static final Item PINEAPPLE = new FoodBase("pineapple", 4, 2.4f, false);
	public static final Item STRAWBERRY = new FoodBase("strawberry", 4, 2.4f, false);
	public static final Item COCONUT = new FoodBase("coconut", 6, 2.4f, false);
	public static final Item TEA_LEAF = new FoodBase("tea_leaf", 2, 2.4f, false);
	public static final Item WHITE_GRAPE = new FoodBase("white_grape", 4, 2.4f, false);
	public static final Item CRANBERRY = new FoodBase("cranberry", 4, 2.4f, false);
	public static final Item TOMATO = new FoodBase("tomato", 4, 2.4f, false);
	public static final Item POMEGRANATE = new FoodBase("pomegranate", 4, 2.4f, false);
	public static final Item PEACH = new FoodBase("peach", 4, 2.4f, false);
	public static final Item MANGO = new FoodBase("mango", 6, 2.4f, false);
	
	//Plant Seeds
	public static final Item GRAPE_SEED = new ItemGrapeSeed("grape_seed");
	public static final Item ORANGE_SEED = new ItemOrangeSeed("orange_seed");
	public static final Item LEMON_SEED = new ItemLemonSeed("lemon_seed");
	public static final Item GRAPEFRUIT_SEED = new ItemGrapefruitSeed("grapefruit_seed");
	public static final Item PINEAPPLE_SEED = new ItemPineappleSeed("pineapple_seed");
	public static final Item STRAWBERRY_SEED = new ItemStrawberrySeed("strawberry_seed");
	public static final Item COCONUT_SEED = new ItemCoconutSeed("coconut_seed");
	public static final Item TEA_LEAF_SEED = new ItemTeaLeafSeed("tea_leaf_seed");
	public static final Item WHITE_GRAPE_SEED = new ItemWhiteGrapeSeed("white_grape_seed");
	public static final Item CRANBERRY_SEED = new ItemCranberrySeed("cranberry_seed");
	public static final Item TOMATO_SEED = new ItemTomatoSeed("tomato_seed");
	public static final Item POMEGRANATE_SEED = new ItemPomegranateSeed("pomegranate_seed");
	public static final Item PEACH_SEED = new ItemPeachSeed("peach_seed");
	public static final Item COFFEE_BEAN = new ItemCoffeeBeanSeed("coffee_bean");
	public static final Item MANGO_SEED = new ItemMangoSeed("mango_seed");
	
	//Buckets
	public static final Item APPLE_JUICE_BUCKET = new ItemDrinkBucket("apple_juice_bucket", ModBlocks.APPLE_JUICE_BLOCK);
}
