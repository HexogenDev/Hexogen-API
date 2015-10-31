package net.cyanwool.api.inventory;

import java.util.List;

import net.cyanwool.api.entity.alive.player.Player;
import net.cyanwool.api.inventory.item.ItemStack;

public interface Inventory {

	public String getTitle();

	public List<Player> getViewers();

	public int getMaxSize();

	public int getSize();

	public ItemStack getItemStack(int index);

	public void setItemStack(int index, ItemStack item);
}
