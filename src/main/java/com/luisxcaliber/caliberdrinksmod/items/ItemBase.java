package com.luisxcaliber.caliberdrinksmod.items;

import com.luisxcaliber.caliberdrinksmod.CaliberDrinksMod;
import net.minecraft.item.Item;

public class ItemBase extends Item 
{
	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CaliberDrinksMod.tabCaliberDrinksMod);
	}
}
