package com.luisxcaliber.caliberdrinksmod.items.tools;

import com.luisxcaliber.caliberdrinksmod.CaliberDrinksMod;
import com.luisxcaliber.caliberdrinksmod.init.ModItems;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBucket;

public class ItemDrinkBucket extends ItemBucket
{	
	public ItemDrinkBucket(String name, Block containedBlockIn)
	{
		super(containedBlockIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CaliberDrinksMod.tabCaliberDrinksMod);
		
		ModItems.ITEMS.add(this);
	}
}
