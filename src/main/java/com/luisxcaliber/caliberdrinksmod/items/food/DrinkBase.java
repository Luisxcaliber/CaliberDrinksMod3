package com.luisxcaliber.caliberdrinksmod.items.food;

import com.luisxcaliber.caliberdrinksmod.CaliberDrinksMod;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class DrinkBase extends ItemFood 
{
	public DrinkBase(String name, int amount, float saturation, boolean isWolfFood)
	{
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CaliberDrinksMod.tabCaliberDrinksMod);
		setAlwaysEdible();
	}
	
	@Override
	 public EnumAction getItemUseAction(ItemStack stack)
   {
       return EnumAction.DRINK;
   }
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
	{
		super.onItemUseFinish(stack, worldIn, entityLiving);
		return new ItemStack(Items.GLASS_BOTTLE);
	}
}
