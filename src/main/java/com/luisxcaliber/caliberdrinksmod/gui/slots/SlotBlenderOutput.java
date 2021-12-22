package com.luisxcaliber.caliberdrinksmod.gui.slots;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotBlenderOutput extends Slot 
{
	public SlotBlenderOutput(IInventory inventoryIn, int index, int x, int y) 
	{
		super(inventoryIn, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return false;
	}
}
