package com.luisxcaliber.caliberdrinksmod.items.food;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class DrinkMilk extends DrinkBase 
{
	public DrinkMilk(String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(name, amount, saturation, isWolfFood);
	}
	
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityLivingBase entityLiving)
	{
		super.onItemUseFinish(stack, worldIn, entityLiving);
	    for(PotionEffect effect : entityLiving.getActivePotionEffects())
	    {
	        entityLiving.removePotionEffect(effect.getPotion());
	    }
	    
		return new ItemStack(Items.GLASS_BOTTLE);
	}
}
