package com.luisxcaliber.caliberdrinksmod.gui.containers;

import com.luisxcaliber.caliberdrinksmod.gui.slots.SlotBlenderOutput;
import com.luisxcaliber.caliberdrinksmod.tileentity.TileEntityBlender;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerBlender extends Container 
{
	private final TileEntityBlender tileentity;
	
	public ContainerBlender(InventoryPlayer playerInventory, TileEntityBlender tileentityblender)
	{
		tileentity = tileentityblender;
		
		addSlotToContainer(new Slot(playerInventory, 0, 71, 14));
		addSlotToContainer(new Slot(playerInventory, 1, 89, 14));
		addSlotToContainer(new Slot(playerInventory, 2, 71, 32));
		addSlotToContainer(new Slot(playerInventory, 3, 89, 32));
		addSlotToContainer(new Slot(playerInventory, 4, 71, 50));
		addSlotToContainer(new Slot(playerInventory, 5, 89, 50));
		addSlotToContainer(new SlotBlenderOutput(playerInventory, 6, 79, 73));
		
		for(int y = 0; y < 3; y++)
		{
			for(int x = 0; x < 9; x++)
			{
				addSlotToContainer(new Slot(playerInventory, x + y*9 + 9, 8 + x*18, 124 + y*18));
			}
		}
		
		for(int x = 0; x < 9; x++)
		{
			addSlotToContainer(new Slot(playerInventory, x, 8 + x * 18, 182));
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) 
	{
		return tileentity.isUsableByPlayer(playerIn);
	}
	
}
