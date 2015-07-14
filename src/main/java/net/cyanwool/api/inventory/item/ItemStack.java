package net.cyanwool.api.inventory.item;

import net.cyanwool.api.material3.items.ItemMaterial;

public class ItemStack {

	private ItemMaterial itemType;
	private int durability;
	private int amount;
	private boolean update;

	public ItemStack(ItemMaterial type, int amount, int durability) {
		this.itemType = type;
		this.amount = amount;
		this.durability = durability;
	}

	public ItemStack(ItemMaterial type, int amount) {
		this(type, amount, 0);
	}

	public ItemStack(ItemMaterial type) {
		this(type, 1, 0);
	}

	public ItemMaterial getItemType() {
		return itemType;
	}

	public int getMinecraftData() {
		return getItemType().getMinecraftData();
	}

	public void setMinecraftData(int data) {
		getItemType().setMinecraftData(data);
	}

	public int getCustomData() {
		return getItemType().getCustomData();
	}

	public void setCustomData(int data) {
		getItemType().setCustomData(data);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		if (amount < 0) {
			amount = 0;
		}
		this.amount = amount;
	}

	// public int getMaxItemUseDuration() {
	// return getItemType().getMaxItemUseDuration(this);
	// }

	// public Action getItemUseAction() {
	// return getItemType().getItemUseAction(this);
	// }

	public int getDurability() {
		return durability;
	}

	public void setDurability(int durability) {
		this.durability = durability;
	}

	public boolean isNeedUpdate() {
		return update;
	}

	public void setNeedUpdate() {
		this.update = true;
	}
}
