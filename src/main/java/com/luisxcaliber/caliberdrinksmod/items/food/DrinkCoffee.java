package com.luisxcaliber.caliberdrinksmod.items.food;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class DrinkCoffee extends DrinkBase 
{
	public DrinkCoffee(String name, int amount, float saturation, boolean isWolfFood)
	{
		super(name, amount, saturation, isWolfFood);
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
	{
		super.onItemUseFinish(stack, worldIn, entityLiving);
		if(!worldIn.isRemote)
		{
			entityLiving.addPotionEffect(new PotionEffect(MobEffects.SPEED, (60*20), 0, false, true));
			entityLiving.addPotionEffect(new PotionEffect(MobEffects.HASTE, (60*20), 0, false, true));
		}
		return new ItemStack(Items.GLASS_BOTTLE);
	}
}
