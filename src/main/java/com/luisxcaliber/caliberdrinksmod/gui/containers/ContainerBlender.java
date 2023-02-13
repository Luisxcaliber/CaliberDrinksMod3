package com.luisxcaliber.caliberdrinksmod.gui.containers;

import com.luisxcaliber.caliberdrinksmod.gui.slots.SlotBlenderOutput;
import com.luisxcaliber.caliberdrinksmod.tileentity.TileEntityBlender;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.network.play.server.SPacketSetSlot;
import net.minecraft.world.World;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;

public class ContainerBlender extends Container 
{
	private final TileEntityBlender tileentity;
	public InventoryCrafting craftMatrix = new InventoryCrafting(this, 3, 3);
	public InventoryCraftResult craftResult = new InventoryCraftResult();
	private final World world;
	private final EntityPlayer player;
	
	public ContainerBlender(InventoryPlayer playerInventory, TileEntityBlender tileentityblender, World worldIn)
	{
		tileentity = tileentityblender;
		world = worldIn;
		player = playerInventory.player;
		IItemHandler handler = tileentity.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null);
		
		/*addSlotToContainer(new SlotItemHandler(handler, 0, 71, 14));
		addSlotToContainer(new SlotItemHandler(handler, 1, 89, 14));
		addSlotToContainer(new SlotItemHandler(handler, 2, 71, 32));
		addSlotToContainer(new SlotItemHandler(handler, 3, 89, 32));
		addSlotToContainer(new SlotItemHandler(handler, 4, 71, 50));
		addSlotToContainer(new SlotItemHandler(handler, 5, 89, 50));
		addSlotToContainer(new SlotBlenderOutput(handler, 6, 79, 73));*/
		addSlotToContainer(new SlotCrafting(playerInventory.player, craftMatrix, craftResult, 0, 80, 74));
		
		for (int i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 2; ++j)
            {
                addSlotToContainer(new Slot(craftMatrix, j + i * 3, 71 + j * 18, 14 + i * 18));
            }
        }
		
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
	public void onCraftMatrixChanged(IInventory inventoryIn) 
	{
		if (!world.isRemote)
		{
			EntityPlayerMP eplayer = (EntityPlayerMP) player;
			IRecipe recipe = CraftingManager.findMatchingRecipe(craftMatrix, world);
			
			ItemStack itemStack;
    		if (recipe == null)
    			{ 
    				itemStack = ItemStack.EMPTY;
    			}
    		
    		else 
    			{ 
    				itemStack = recipe.getCraftingResult(craftMatrix);
    			}
    		
    		craftResult.setInventorySlotContents(0, itemStack);
    		eplayer.connection.sendPacket(new SPacketSetSlot(windowId, 0, itemStack));
		}
	}
	
	@Override
	public void onContainerClosed(EntityPlayer playerIn) 
	{
		super.onContainerClosed(playerIn);
		
		if (!this.world.isRemote)
        {
            this.clearContainer(playerIn, this.world, this.craftMatrix);
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
