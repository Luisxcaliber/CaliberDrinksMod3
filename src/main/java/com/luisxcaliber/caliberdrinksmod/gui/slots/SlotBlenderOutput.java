package com.luisxcaliber.caliberdrinksmod.gui.slots;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class SlotBlenderOutput extends SlotItemHandler 
{
	public SlotBlenderOutput(IItemHandler itemHandler, int index, int xPosition, int yPosition)
	{
		super(itemHandler, index, xPosition, yPosition);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) 
	{
		if(stack.getItem() == Items.GLASS_BOTTLE) return true;
		return false;
	}
}
