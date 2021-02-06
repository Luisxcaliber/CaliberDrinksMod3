package com.luisxcaliber.caliberdrinksmod.items.food;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DrinkMilk extends DrinkBase 
{
	public DrinkMilk(String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(name, amount, saturation, isWolfFood);
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
	{
	    entityLiving.clearActivePotions();
		return new ItemStack(Items.GLASS_BOTTLE);
	}
}
