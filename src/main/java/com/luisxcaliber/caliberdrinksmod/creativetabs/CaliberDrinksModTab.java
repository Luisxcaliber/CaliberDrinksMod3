package com.luisxcaliber.caliberdrinksmod.creativetabs;

import com.luisxcaliber.caliberdrinksmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CaliberDrinksModTab extends CreativeTabs
{
	public CaliberDrinksModTab(String label) 
	{
		super(label);
	}
	
	@Override
	public ItemStack getTabIconItem() 
	{
		return new ItemStack(ModItems.APPLE_JUICE);
	}
}
