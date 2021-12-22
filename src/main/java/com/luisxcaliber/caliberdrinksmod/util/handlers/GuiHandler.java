package com.luisxcaliber.caliberdrinksmod.util.handlers;

import com.luisxcaliber.caliberdrinksmod.gui.GuiBlender;
import com.luisxcaliber.caliberdrinksmod.gui.containers.ContainerBlender;
import com.luisxcaliber.caliberdrinksmod.tileentity.TileEntityBlender;
import com.luisxcaliber.caliberdrinksmod.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler 
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_BLENDER) return new ContainerBlender(player.inventory, (TileEntityBlender)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_BLENDER) return new GuiBlender(player.inventory, (TileEntityBlender)world.getTileEntity(new BlockPos(x,y,z)), null);
		return null;
	}
}
