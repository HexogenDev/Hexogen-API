package net.hexogendev.hexogen.api.inventory;

import net.hexogendev.hexogen.api.entity.alive.player.Player;
import net.hexogendev.hexogen.api.inventory.item.ItemStack;

public interface PlayerInventory extends Inventory {

	public Player getPlayer();

	public int getSelectedSlot();

	public void setSelectedSlot(int slot);

	public ItemStack getItemInHand();

	public void setItemInHand(ItemStack item);
}
