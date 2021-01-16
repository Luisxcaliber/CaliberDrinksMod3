package com.luisxcaliber.caliberdrinksmod.init;

import java.awt.Color;

import com.luisxcaliber.caliberdrinksmod.fluids.FluidBase;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class ModFluids 
{	
	public static final Fluid APPLE_JUICE_FLUID;
	public static final Fluid GRAPE_JUICE_FLUID;
	public static final Fluid ORANGE_JUICE_FLUID;
	public static final Fluid FRUIT_PUNCH_FLUID;
	public static final Fluid LEMONADE_FLUID;
	public static final Fluid BEETROOT_JUICE_FLUID;
	public static final Fluid PINK_LEMONADE_FLUID;
	public static final Fluid GRAPEFRUIT_JUICE_FLUID;
	public static final Fluid PINEAPPLE_JUICE_FLUID;
	public static final Fluid MILK_FLUID;
	public static final Fluid CHOCOLATE_MILK_FLUID;
	public static final Fluid STRAWBERRY_MILK_FLUID;
	public static final Fluid CARROT_JUICE_FLUID;
	public static final Fluid STRAWBERRY_JUICE_FLUID;
	public static final Fluid WATERMELON_JUICE_FLUID;
	public static final Fluid HOT_CHOCOLATE_FLUID;
	public static final Fluid COCONUT_WATER_FLUID;
	public static final Fluid TEA_FLUID;
	public static final Fluid ICED_TEA_FLUID;
	public static final Fluid GREEN_TEA_FLUID;
	public static final Fluid BLACK_TEA_FLUID;
	public static final Fluid WHITE_TEA_FLUID;
	public static final Fluid YELLOW_TEA_FLUID;
	public static final Fluid LEMON_TEA_FLUID;
	public static final Fluid WHITE_GRAPE_JUICE_FLUID;
	public static final Fluid CRANBERRY_JUICE_FLUID;
	public static final Fluid TOMATO_JUICE_FLUID;
	public static final Fluid POMEGRANATE_JUICE_FLUID;
	public static final Fluid PEACH_JUICE_FLUID;
	public static final Fluid MANGO_JUICE_FLUID;
	public static final Fluid COFFEE_FLUID;
	public static final Fluid ICED_COFFEE_FLUID;
	
	static
	{
		APPLE_JUICE_FLUID = new FluidBase("apple_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(255, 225, 0));
		GRAPE_JUICE_FLUID = new FluidBase("grape_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(69, 10, 118));
		ORANGE_JUICE_FLUID = new FluidBase("orange_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(255, 135, 0));
		FRUIT_PUNCH_FLUID = new FluidBase("fruit_punch_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(217, 22, 22));
		LEMONADE_FLUID = new FluidBase("lemonade_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(196, 197, 123));
		BEETROOT_JUICE_FLUID = new FluidBase("beetroot_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(101, 0, 0));
		PINK_LEMONADE_FLUID = new FluidBase("pink_lemonade_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(219, 166, 199));
		GRAPEFRUIT_JUICE_FLUID = new FluidBase("grapefruit_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(202, 97, 91));
		PINEAPPLE_JUICE_FLUID = new FluidBase("pineapple_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(235, 249, 6));
		MILK_FLUID = new FluidBase("milk_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(255, 255, 255));
		CHOCOLATE_MILK_FLUID = new FluidBase("chocolate_milk_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(56, 30, 30));
		STRAWBERRY_MILK_FLUID = new FluidBase("strawberry_milk_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(214, 157, 200));
		CARROT_JUICE_FLUID = new FluidBase("carrot_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(208, 147, 49));
		STRAWBERRY_JUICE_FLUID = new FluidBase("strawberry_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(208, 44, 44));
		WATERMELON_JUICE_FLUID = new FluidBase("watermelon_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(255, 33, 33));
		HOT_CHOCOLATE_FLUID = new FluidBase("hot_chocolate_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(51, 33, 33));
		COCONUT_WATER_FLUID = new FluidBase("coconut_water_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(223, 233, 233));
		TEA_FLUID = new FluidBase("tea_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(122, 76, 14));
		ICED_TEA_FLUID = new FluidBase("iced_tea_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(184, 138, 0));
		GREEN_TEA_FLUID = new FluidBase("green_tea_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(141, 240, 0));
		BLACK_TEA_FLUID = new FluidBase("black_tea_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(142, 58, 12));
		WHITE_TEA_FLUID = new FluidBase("white_tea_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(236, 208, 123));
		YELLOW_TEA_FLUID = new FluidBase("yellow_tea_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(229, 212, 0));
		LEMON_TEA_FLUID = new FluidBase("lemon_tea_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(189, 161, 20));
		WHITE_GRAPE_JUICE_FLUID = new FluidBase("white_grape_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(237, 238, 128));
		CRANBERRY_JUICE_FLUID = new FluidBase("cranberry_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(111, 0, 0));
		TOMATO_JUICE_FLUID = new FluidBase("tomato_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(255, 47, 47));
		POMEGRANATE_JUICE_FLUID = new FluidBase("pomegranate_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(135, 13, 13));
		PEACH_JUICE_FLUID = new FluidBase("peach_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(216, 190, 0));
		MANGO_JUICE_FLUID = new FluidBase("mango_juice_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(255, 165, 19));
		COFFEE_FLUID = new FluidBase("coffee_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(26, 11, 11));
		ICED_COFFEE_FLUID = new FluidBase("iced_coffee_fluid", new ResourceLocation("caliberdm:blocks/fluid_drink_still"), new ResourceLocation("caliberdm:blocks/fluid_drink_flow"), null, new Color(133, 100, 64));
	}
	
	public static void register()
	{
		registerFluid(APPLE_JUICE_FLUID);
		registerFluid(GRAPE_JUICE_FLUID);
		registerFluid(ORANGE_JUICE_FLUID);
		registerFluid(FRUIT_PUNCH_FLUID);
		registerFluid(LEMONADE_FLUID);
		registerFluid(BEETROOT_JUICE_FLUID);
		registerFluid(PINK_LEMONADE_FLUID);
		registerFluid(GRAPEFRUIT_JUICE_FLUID);
		registerFluid(PINEAPPLE_JUICE_FLUID);
		registerFluid(MILK_FLUID);
		registerFluid(CHOCOLATE_MILK_FLUID);
		registerFluid(STRAWBERRY_MILK_FLUID);
		registerFluid(CARROT_JUICE_FLUID);
		registerFluid(STRAWBERRY_JUICE_FLUID);
		registerFluid(WATERMELON_JUICE_FLUID);
		registerFluid(HOT_CHOCOLATE_FLUID);
		registerFluid(COCONUT_WATER_FLUID);
		registerFluid(TEA_FLUID);
		registerFluid(ICED_TEA_FLUID);
		registerFluid(GREEN_TEA_FLUID);
		registerFluid(BLACK_TEA_FLUID);
		registerFluid(WHITE_TEA_FLUID);
		registerFluid(YELLOW_TEA_FLUID);
		registerFluid(LEMON_TEA_FLUID);
		registerFluid(WHITE_GRAPE_JUICE_FLUID);
		registerFluid(CRANBERRY_JUICE_FLUID);
		registerFluid(TOMATO_JUICE_FLUID);
		registerFluid(POMEGRANATE_JUICE_FLUID);
		registerFluid(PEACH_JUICE_FLUID);
		registerFluid(MANGO_JUICE_FLUID);
		registerFluid(COFFEE_FLUID);
		registerFluid(ICED_COFFEE_FLUID);
	}
	
	private static void registerFluid(Fluid fluid)
	{
		FluidRegistry.registerFluid(fluid);
	}
}
