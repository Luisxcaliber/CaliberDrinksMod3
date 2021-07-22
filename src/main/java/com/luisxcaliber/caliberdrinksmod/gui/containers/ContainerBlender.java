package com.luisxcaliber.caliberdrinksmod.gui.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class ContainerBlender extends Container 
{
	private InventoryPlayer playerInventory;
	
	public ContainerBlender(InventoryPlayer playerInventory)
	{
		addSlotToContainer(new Slot(playerInventory, 0, 72, 15));
		addSlotToContainer(new Slot(playerInventory, 1, 90, 15));
		addSlotToContainer(new Slot(playerInventory, 2, 72, 33));
		addSlotToContainer(new Slot(playerInventory, 3, 90, 33));
		addSlotToContainer(new Slot(playerInventory, 4, 72, 51));
		addSlotToContainer(new Slot(playerInventory, 5, 90, 51));
		addSlotToContainer(new Slot(playerInventory, 6, 81, 75));
		
		for(int y = 0; y < 3; y++)
		{
			for(int x = 0; x < 9; x++)
			{
				addSlotToContainer(new Slot(playerInventory, x + y*9 + 9, 8 + x*18, 84 + y*18));
			}
		}
		
		for(int x = 0; x < 9; x++)
		{
			addSlotToContainer(new Slot(playerInventory, x, 8 + x * 18, 142));
		}
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) 
	{
		return playerInventory.isUsableByPlayer(playerIn);
	}
	
}
