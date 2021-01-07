package com.luisxcaliber.caliberdrinksmod.fluids;

import java.awt.Color;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.Fluid;

public class FluidBase extends Fluid 
{
	public FluidBase(String fluidName, ResourceLocation still, ResourceLocation flowing, ResourceLocation overlay, Color color) 
	{
		super(fluidName, still, flowing, overlay, color);
	}
}
