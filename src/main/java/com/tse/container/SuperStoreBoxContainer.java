package com.tse.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

import com.tse.tileentity.SuperStoreBoxTileEntity;

public class SuperStoreBoxContainer extends Container{

	private SuperStoreBoxTileEntity te;
	
	public SuperStoreBoxContainer(IInventory playerInv, SuperStoreBoxTileEntity te){
		this.te = te;
		//TileEntity Inventory ID#0-71                                                         
		for (int y = 0; y < 5; ++y)
		{
			for (int x = 0; x < 12; ++x)
			{
				this.addSlotToContainer(new Slot(te, x + y * 12, 8 + x * 18, 18 + y * 18));	            	
	        }
	    }
		
		//TileEntity Inventory ID#72-98
		for (int y = 0; y < 3; ++y) {
	        for (int x = 0; x < 9; ++x)
	        {
	            this.addSlotToContainer(new Slot(playerInv, x + y * 9 + 9, 34 + x * 18, 122 + y * 18));
	        }
	    }
		
		//TileEntity Inventory ID#0-8
		for (int x = 0; x < 9; ++x)
		{
	        this.addSlotToContainer(new Slot(playerInv, x, 34 + x * 18, 180));
	    }
		
		/*
		 * SLOTS:
		 * 
		 * Tile Entity 0-71 ........ 0 - 71
		 * Player Inventory 72-98 . 72 - 98
		 * Player Inventory 0-8 ... 99 - 107
		 */
	}
	@Override
	public ItemStack transferStackInSlot(EntityPlayer playerIn, int fromSlot) {
	    ItemStack previous = null;
	    Slot slot = (Slot) this.inventorySlots.get(fromSlot);

	    if (slot != null && slot.getHasStack()) {
	        ItemStack current = slot.getStack();
	        previous = current.copy();

	        if (fromSlot < 72) {
	            // From TE Inventory to Player Inventory
	            if (!this.mergeItemStack(current, 73, 99, true))
	                return null;
	        } else {
	            // From Player Inventory to TE Inventory
	            if (!this.mergeItemStack(current, 0, 72, false))
	                return null;
	        }

	        if (current.stackSize == 0)
	            slot.putStack((ItemStack) null);
	        else
	            slot.onSlotChanged();

	        if (current.stackSize == previous.stackSize)
	            return null;
	        slot.onPickupFromSlot(playerIn, current);
	    }
	    return previous;
	}
	
    
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.te.isUseableByPlayer(playerIn);
	}

}
