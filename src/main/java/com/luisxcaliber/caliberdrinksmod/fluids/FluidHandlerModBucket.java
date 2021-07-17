package com.luisxcaliber.caliberdrinksmod.fluids;

import net.minecraft.item.ItemStack;

import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.templates.FluidHandlerItemStackSimple;

public class FluidHandlerModBucket extends FluidHandlerItemStackSimple 
{	
	public FluidHandlerModBucket(ItemStack container, int capacity) 
	{
		super(container, capacity);
	}

	@Override
	public boolean canFillFluidType(FluidStack fluid) 
	{
		return fluid.getFluid() == FluidRegistry.WATER ||
				fluid.getFluid().getName().equals("milk") ||
				FluidRegistry.getBucketFluids().contains(fluid.getFluid());
	}
}
