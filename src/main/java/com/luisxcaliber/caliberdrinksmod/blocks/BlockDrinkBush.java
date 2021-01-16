package com.luisxcaliber.caliberdrinksmod.blocks;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IShearable;

public class BlockDrinkBush extends BlockBase implements IShearable
{
	private final Item itemdropIn;
	
	public BlockDrinkBush(String name, Item itemdrop, Material material)
	{
		super(name, material);
		
		setSoundType(SoundType.PLANT);
		setHardness(0.2f);
		setResistance(0.2f);
		setLightOpacity(1);
		itemdropIn = itemdrop;
	}

	@Override
	public boolean isShearable(ItemStack item, IBlockAccess world, BlockPos pos)
	{
		return false;
	}

	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune)
	{
		return Arrays.asList(new ItemStack(this, 1));
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return itemdropIn;
	}
	
	public int quantityDropped(Random rand)
	{
		return 3 + rand.nextInt(2);
	}
	
	public BlockRenderLayer getBlockLayer()
	{
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	public boolean isOpaqueCube(IBlockState state)
	{
		return false;
	}
	
	public boolean isFullCube(IBlockState state)
	{
		return true;
	}
}
