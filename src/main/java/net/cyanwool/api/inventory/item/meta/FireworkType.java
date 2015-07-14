package net.cyanwool.api.inventory.item.meta;

public enum FireworkType {

	SMALL(0), LARGE(1), STAR_SHAPE(2), CREEPER_SHAPED(3), BURST(4), UNKNOWN(5);

	private int id;

	private FireworkType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public FireworkType getFireworkType(int id) {
		switch (id) {
			case 0:
				return SMALL;
			case 1:
				return LARGE;
			case 2:
				return STAR_SHAPE;
			case 3:
				return CREEPER_SHAPED;
			case 4:
				return BURST;
			default:
				break;
		}
		return UNKNOWN;// Unknown
	}
}
