package com.luisxcaliber.caliberdrinksmod.blocks.plants;

import com.luisxcaliber.caliberdrinksmod.init.ModItems;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockGrapePlant extends BlockCrops 
{
	public static final PropertyInteger GRAPE_AGE = PropertyInteger.create("age", 0, 3);
	private static final AxisAlignedBB[] GRAPE_AABB = new AxisAlignedBB[] {new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.125D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.25D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.375D, 1.0D), new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.6D, 1.0D)};
	
	public BlockGrapePlant(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	protected Item getSeed()
	{
		return ModItems.GRAPE_SEED;
	}
	
	protected Item getCrop()
	{
		return ModItems.GRAPE;
	}
	
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
	{
		return GRAPE_AABB[((Integer)state.getValue(this.getAgeProperty())).intValue()];
	}
	
    public int getMaxAge()
    {
        return 3;
    }
}
