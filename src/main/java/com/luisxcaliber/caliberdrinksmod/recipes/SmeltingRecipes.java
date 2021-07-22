package com.luisxcaliber.caliberdrinksmod.recipes;

import com.luisxcaliber.caliberdrinksmod.init.ModItems;

import net.minecraft.item.ItemStack;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingRecipes 
{
	public static void init()
	{
		GameRegistry.addSmelting(ModItems.CHOCOLATE_MILK, new ItemStack(ModItems.HOT_CHOCOLATE, 1), 1.5f);
	}
}
