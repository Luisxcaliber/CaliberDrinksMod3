package com.luisxcaliber.caliberdrinksmod.blocks.plants;

import com.luisxcaliber.caliberdrinksmod.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockStrawberryPlant extends BlockCrops 
{
	public static final PropertyInteger STRAWBERRY_AGE = PropertyInteger.create("age", 0, 2);
	private static final AxisAlignedBB[] STRAWBERRY_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D)};
	
	public BlockStrawberryPlant(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	protected Item getSeed()
	{
		return ModItems.STRAWBERRY_SEED;
	}
	
	@Override
	protected Item getCrop()
	{
		return ModItems.STRAWBERRY;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return STRAWBERRY_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
	}
	
	@Override
    public int getMaxAge()
    {
        return 2;
    }
}
