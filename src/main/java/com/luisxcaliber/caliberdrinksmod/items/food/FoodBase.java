package com.luisxcaliber.caliberdrinksmod.items.food;

import com.luisxcaliber.caliberdrinksmod.CaliberDrinksMod;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood 
{
	public FoodBase(String name, int amount, float saturation, boolean isWolfFood)
	{
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CaliberDrinksMod.tabCaliberDrinksMod);
	}
}
