package com.luisxcaliber.caliberdrinksmod.init;

import java.util.ArrayList;
import java.util.List;

import com.luisxcaliber.caliberdrinksmod.blocks.BlockFluid;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockCoconutBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockCoffeeBeanBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockCranberryBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockGrapeBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockGrapefruitBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockLemonBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockMangoBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockOrangeBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockPeachBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockPineappleBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockPomegranateBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockStrawberryBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockTeaLeafBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockTomatoBush;
import com.luisxcaliber.caliberdrinksmod.blocks.bushes.BlockWhiteGrapeBush;
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

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Bushes
	public static final Block GRAPE_BUSH = new BlockGrapeBush("grape_bush", Material.LEAVES);
	public static final Block ORANGE_BUSH = new BlockOrangeBush("orange_bush", Material.LEAVES);
	public static final Block LEMON_BUSH = new BlockLemonBush("lemon_bush", Material.LEAVES);
	public static final Block GRAPEFRUIT_BUSH = new BlockGrapefruitBush("grapefruit_bush", Material.LEAVES);
	public static final Block PINEAPPLE_BUSH = new BlockPineappleBush("pineapple_bush", Material.LEAVES);
	public static final Block STRAWBERRY_BUSH = new BlockStrawberryBush("strawberry_bush", Material.LEAVES);
	public static final Block COFFEE_BEAN_BUSH = new BlockCoffeeBeanBush("coffee_bean_bush", Material.LEAVES);
	public static final Block COCONUT_BUSH = new BlockCoconutBush("coconut_bush", Material.LEAVES);
	public static final Block TEA_LEAF_BUSH = new BlockTeaLeafBush("tea_leaf_bush", Material.LEAVES);
	public static final Block WHITE_GRAPE_BUSH = new BlockWhiteGrapeBush("white_grape_bush", Material.LEAVES);
	public static final Block CRANBERRY_BUSH = new BlockCranberryBush("cranberry_bush", Material.LEAVES);
	public static final Block TOMATO_BUSH = new BlockTomatoBush("tomato_bush", Material.LEAVES);
	public static final Block POMEGRANATE_BUSH = new BlockPomegranateBush("pomegranate_bush", Material.LEAVES);
	public static final Block PEACH_BUSH = new BlockPeachBush("peach_bush", Material.LEAVES);
	public static final Block MANGO_BUSH = new BlockMangoBush("mango_bush", Material.LEAVES);
	
	//Plants
	public static final Block GRAPE_PLANT = new BlockGrapePlant("grape_plant");
	public static final Block ORANGE_PLANT = new BlockOrangePlant("orange_plant");
	public static final Block LEMON_PLANT = new BlockLemonPlant("lemon_plant");
	public static final Block GRAPEFRUIT_PLANT = new BlockGrapefruitPlant("grapefruit_plant");
	public static final Block PINEAPPLE_PLANT = new BlockPineapplePlant("pineapple_plant");
	public static final Block STRAWBERRY_PLANT = new BlockStrawberryPlant("strawberry_plant");
	public static final Block COFFEE_BEAN_PLANT = new BlockCoffeeBeanPlant("coffee_bean_plant");
	public static final Block COCONUT_PLANT = new BlockCoconutPlant("coconut_plant");
	public static final Block TEA_LEAF_PLANT = new BlockTeaLeafPlant("tea_leaf_plant");
	public static final Block WHITE_GRAPE_PLANT = new BlockWhiteGrapePlant("white_grape_plant");
	public static final Block CRANBERRY_PLANT = new BlockCranberryPlant("cranberry_plant");
	public static final Block TOMATO_PLANT = new BlockTomatoPlant("tomato_plant");
	public static final Block POMEGRANATE_PLANT = new BlockPomegranatePlant("pomegranate_plant");
	public static final Block PEACH_PLANT = new BlockPeachPlant("peach_plant");
	public static final Block MANGO_PLANT = new BlockMangoPlant("mango_plant");
	
	//Fluids
	public static final Block APPLE_JUICE_BLOCK = new BlockFluid("apple_juice_fluid", ModFluids.APPLE_JUICE_FLUID, Material.WATER);
	public static final Block GRAPE_JUICE_BLOCK = new BlockFluid("grape_juice_fluid", ModFluids.GRAPE_JUICE_FLUID, Material.WATER);
	public static final Block ORANGE_JUICE_BLOCK = new BlockFluid("orange_juice_fluid", ModFluids.ORANGE_JUICE_FLUID, Material.WATER);
	public static final Block FRUIT_PUNCH_BLOCK = new BlockFluid("fruit_juice_fluid", ModFluids.FRUIT_PUNCH_FLUID, Material.WATER);
	public static final Block LEMONADE_BLOCK = new BlockFluid("lemonade_fluid", ModFluids.LEMONADE_FLUID, Material.WATER);
	public static final Block BEETROOT_JUICE_BLOCK = new BlockFluid("beetroot_juice_fluid", ModFluids.BEETROOT_JUICE_FLUID, Material.WATER);
	public static final Block PINK_LEMONADE_BLOCK = new BlockFluid("pink_lemonade_fluid", ModFluids.PINK_LEMONADE_FLUID, Material.WATER);
	public static final Block GRAPEFRUIT_JUICE_BLOCK = new BlockFluid("grapefruit_juice_fluid", ModFluids.GRAPEFRUIT_JUICE_FLUID, Material.WATER);
	public static final Block PINEAPPLE_JUICE_BLOCK = new BlockFluid("pineapple_juice_fluid", ModFluids.PINEAPPLE_JUICE_FLUID, Material.WATER);
	public static final Block MILK_BLOCK = new BlockFluid("milk_fluid", ModFluids.MILK_FLUID, Material.WATER);
	public static final Block CHOCOLATE_MILK_BLOCK = new BlockFluid("chocolate_milk_fluid", ModFluids.CHOCOLATE_MILK_FLUID, Material.WATER);
	public static final Block STRAWBERRY_MILK_BLOCK = new BlockFluid("strawberry_milk_fluid", ModFluids.STRAWBERRY_MILK_FLUID, Material.WATER);
	public static final Block CARROT_JUICE_BLOCK = new BlockFluid("carrot_milk_fluid", ModFluids.CARROT_JUICE_FLUID, Material.WATER);
	public static final Block STRAWBERRY_JUICE_BLOCK = new BlockFluid("strawberry_juice_fluid", ModFluids.STRAWBERRY_JUICE_FLUID, Material.WATER);
	public static final Block WATERMELON_JUICE_BLOCK = new BlockFluid("watermelon_juice_fluid", ModFluids.WATERMELON_JUICE_FLUID, Material.WATER);
	public static final Block HOT_CHOCOLATE_BLOCK = new BlockFluid("hot_chocolate_fluid", ModFluids.HOT_CHOCOLATE_FLUID, Material.WATER);
	public static final Block COCONUT_WATER_BLOCK = new BlockFluid("coconut_water_fluid", ModFluids.COCONUT_WATER_FLUID, Material.WATER);
	public static final Block TEA_BLOCK = new BlockFluid("tea_fluid", ModFluids.TEA_FLUID, Material.WATER);
	public static final Block ICED_TEA_BLOCK = new BlockFluid("iced_tea_fluid", ModFluids.ICED_TEA_FLUID, Material.WATER);
	public static final Block GREEN_TEA_BLOCK = new BlockFluid("green_tea_fluid", ModFluids.GREEN_TEA_FLUID, Material.WATER);
	public static final Block BLACK_TEA_BLOCK = new BlockFluid("black_tea_fluid", ModFluids.BLACK_TEA_FLUID, Material.WATER);
	public static final Block WHITE_TEA_BLOCK = new BlockFluid("white_tea_fluid", ModFluids.WHITE_TEA_FLUID, Material.WATER);
	public static final Block YELLOW_TEA_BLOCK = new BlockFluid("yellow_tea_fluid", ModFluids.YELLOW_TEA_FLUID, Material.WATER);
	public static final Block LEMON_TEA_BLOCK = new BlockFluid("lemon_tea_fluid", ModFluids.LEMON_TEA_FLUID, Material.WATER);
	public static final Block WHITE_GRAPE_JUICE_BLOCK = new BlockFluid("white_grape_juice_fluid", ModFluids.WHITE_GRAPE_JUICE_FLUID, Material.WATER);
	public static final Block CRANBERRY_JUICE_BLOCK = new BlockFluid("cranberry_juice_fluid", ModFluids.CRANBERRY_JUICE_FLUID, Material.WATER);
	public static final Block TOMATO_JUICE_BLOCK = new BlockFluid("tomato_juice_fluid", ModFluids.TOMATO_JUICE_FLUID, Material.WATER);
	public static final Block POMEGRANATE_JUICE_BLOCK = new BlockFluid("pomegranate_juice_fluid", ModFluids.POMEGRANATE_JUICE_FLUID, Material.WATER);
	public static final Block PEACH_JUICE_BLOCK = new BlockFluid("peach_juice_fluid", ModFluids.PEACH_JUICE_FLUID, Material.WATER);
	public static final Block MANGO_JUICE_BLOCK = new BlockFluid("mango_juice_fluid", ModFluids.MANGO_JUICE_FLUID, Material.WATER);
	public static final Block COFFEE_BLOCK = new BlockFluid("coffee_fluid", ModFluids.COFFEE_FLUID, Material.WATER);
	public static final Block ICED_COFFEE_BLOCK = new BlockFluid("iced_coffee_fluid", ModFluids.ICED_COFFEE_FLUID, Material.WATER);
}
