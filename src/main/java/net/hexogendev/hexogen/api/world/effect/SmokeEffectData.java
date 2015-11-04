package net.hexogendev.hexogen.api.world.effect;

public enum SmokeEffectData {

	SOUTH_EAST(0), SOUTH(1), SOUTH_WEST(2), EAST(3), UP_OR_MIDDLE(4), WEST(5), NORTH_EAST(6), NORTH(7), NORTH_WEST(8);

	private int id;

	SmokeEffectData(int id) {
		this.id = id;
	}

	public int getID() {
		return id;
	}

}
