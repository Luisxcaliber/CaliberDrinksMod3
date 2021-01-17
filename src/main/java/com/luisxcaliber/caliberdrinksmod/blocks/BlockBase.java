package com.luisxcaliber.caliberdrinksmod.blocks;

import com.luisxcaliber.caliberdrinksmod.CaliberDrinksMod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBase extends Block 
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CaliberDrinksMod.tabCaliberDrinksMod);
	}
}
