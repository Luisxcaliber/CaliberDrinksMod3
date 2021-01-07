package com.luisxcaliber.caliberdrinksmod.blocks.plants;

import java.util.Random;

import com.luisxcaliber.caliberdrinksmod.init.ModBlocks;
import com.luisxcaliber.caliberdrinksmod.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockCranberryPlant extends BlockCrops
{
	public static final PropertyInteger CRANBERRY_AGE = PropertyInteger.create("age", 0, 2);
	private static final AxisAlignedBB[] CRANBERRY_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D)};
	
	public BlockCranberryPlant(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	protected Item getSeed()
	{
		return ModItems.CRANBERRY_SEED;
	}
	
	@Override
	protected Item getCrop()
	{
		return ModItems.CRANBERRY;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return CRANBERRY_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		return 3 + rand.nextInt(1);
	}
	
	@Override
    public int getMaxAge()
    {
        return 2;
    }
}
