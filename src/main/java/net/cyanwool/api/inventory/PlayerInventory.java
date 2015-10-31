package net.cyanwool.api.inventory;

import net.cyanwool.api.entity.alive.player.Player;
import net.cyanwool.api.inventory.item.ItemStack;

public interface PlayerInventory extends Inventory {

	public Player getPlayer();

	public int getSelectedSlot();

	public void setSelectedSlot(int slot);

	public ItemStack getItemInHand();

	public void setItemInHand(ItemStack item);
}
