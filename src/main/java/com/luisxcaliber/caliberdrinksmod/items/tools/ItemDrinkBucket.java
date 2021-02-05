package com.luisxcaliber.caliberdrinksmod.items.tools;

import com.luisxcaliber.caliberdrinksmod.CaliberDrinksMod;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlockSpecial;

public class ItemDrinkBucket extends ItemBlockSpecial 
{	
	public ItemDrinkBucket(String name, Block containedBlockIn) 
	{
		super(containedBlockIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CaliberDrinksMod.tabCaliberDrinksMod);
	}
	//Note: Make so after block is placed return a bucket to the player and change placement sound
	//Also make milk bucket place milk fluid
}
