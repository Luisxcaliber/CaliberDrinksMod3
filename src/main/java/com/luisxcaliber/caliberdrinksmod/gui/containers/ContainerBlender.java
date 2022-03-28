package com.luisxcaliber.caliberdrinksmod.gui.containers;

import com.luisxcaliber.caliberdrinksmod.gui.slots.SlotBlenderOutput;
import com.luisxcaliber.caliberdrinksmod.tileentity.TileEntityBlender;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerBlender extends Container 
{
	private final TileEntityBlender tileentity;
	
	public ContainerBlender(InventoryPlayer playerInventory, TileEntityBlender tileentityblender)
	{
		tileentity = tileentityblender;
		IItemHandler handler = tileentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		
		addSlotToContainer(new SlotItemHandler(handler, 0, 71, 14));
		addSlotToContainer(new SlotItemHandler(handler, 1, 89, 14));
		addSlotToContainer(new SlotItemHandler(handler, 2, 71, 32));
		addSlotToContainer(new SlotItemHandler(handler, 3, 89, 32));
		addSlotToContainer(new SlotItemHandler(handler, 4, 71, 50));
		addSlotToContainer(new SlotItemHandler(handler, 5, 89, 50));
		addSlotToContainer(new SlotBlenderOutput(handler, 6, 79, 73));
		
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
	
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int index)
    {
		ItemStack stack = ItemStack.EMPTY;
        Slot slot = inventorySlots.get(index);

        if (slot != null && slot.getHasStack()) 
        {
            ItemStack stackInSlot = slot.getStack();
            stack = stackInSlot.copy();

            int containerSlots = inventorySlots.size() - playerIn.inventory.mainInventory.size();

            if (index < containerSlots) 
            {
                if (!this.mergeItemStack(stackInSlot, containerSlots, inventorySlots.size(), true)) 
                {
                    return ItemStack.EMPTY;
                }
                
            }
            
            else if (!this.mergeItemStack(stackInSlot, 0, containerSlots, false)) 
            {
                return ItemStack.EMPTY;
            }

            if (stackInSlot.getCount() == 0) 
            {
                slot.putStack(ItemStack.EMPTY);
            }
            
            else 
            {
                slot.onSlotChanged();
            }

            slot.onTake(playerIn, stackInSlot);
            
        }
        return stack;
    }
}
