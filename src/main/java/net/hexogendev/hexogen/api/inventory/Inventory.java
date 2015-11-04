package net.hexogendev.hexogen.api.inventory;

import java.util.List;

import net.hexogendev.hexogen.api.entity.alive.player.Player;
import net.hexogendev.hexogen.api.inventory.item.ItemStack;

public interface Inventory {

	public String getTitle();

	public List<Player> getViewers();

	public int getMaxSize();

	public int getSize();

	public ItemStack getItemStack(int index);

	public void setItemStack(int index, ItemStack item);
}
