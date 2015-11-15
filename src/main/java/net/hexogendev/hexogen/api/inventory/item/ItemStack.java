package net.hexogendev.hexogen.api.inventory.item;

import net.hexogendev.hexogen.api.material.items.ItemMaterial;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + durability;
		result = prime * result + ((itemType == null) ? 0 : itemType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemStack other = (ItemStack) obj;
		if (amount != other.amount)
			return false;
		if (durability != other.durability)
			return false;
		if (itemType == null) {
			if (other.itemType != null)
				return false;
		} else if (!itemType.equals(other.itemType))
			return false;
		return true;
	}
}
