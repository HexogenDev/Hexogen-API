package net.cyanwool.api.inventory.item.meta;

public enum HideFlag {

	HIDE_ENCHANTMENTS(1), HIDE_ATTRIBUTES(2), HIDE_UNBREAKABLE(4), HIDE_CAN_DESTROY(8), HIDE_CAN_PLACE_ON(16), HIDE_OTHERS(32);

	private int id;

	private HideFlag(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
