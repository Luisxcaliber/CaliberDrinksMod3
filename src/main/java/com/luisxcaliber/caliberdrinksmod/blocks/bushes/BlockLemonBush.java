package com.luisxcaliber.caliberdrinksmod.blocks.bushes;

import java.util.Random;

import com.luisxcaliber.caliberdrinksmod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockLemonBush extends BlockBush 
{
	public BlockLemonBush(String name, Material material) 
	{
		super(name, material);
		
		setSoundType(SoundType.PLANT);
		setHardness(0.2f);
		setResistance(0.2f);
		setLightOpacity(1);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{
		return ModItems.LEMON;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 3 + rand.nextInt(2);
	}
}
