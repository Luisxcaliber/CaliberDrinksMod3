package com.luisxcaliber.caliberdrinksmod.util.handlers;

import com.luisxcaliber.caliberdrinksmod.tileentity.TileEntityBlender;
import com.luisxcaliber.caliberdrinksmod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntity()
	{
		GameRegistry.registerTileEntity(TileEntityBlender.class, new ResourceLocation(Reference.MOD_ID + ":blender"));
	}
}
