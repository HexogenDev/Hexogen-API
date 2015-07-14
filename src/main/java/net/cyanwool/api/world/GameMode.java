package net.cyanwool.api.world;

public enum GameMode {

	SURVIVAL(0), CREATIVE(1), ADVENTURE(2), SPECTATOR(3);

	private final int value;

	private GameMode(final int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static GameMode getGameMode(int value) {
		switch (value) {
			case 0:
				return SURVIVAL;
			case 1:
				return CREATIVE;
			case 2:
				return ADVENTURE;
			case 3:
				return SPECTATOR;
			default:
				break;
		}
		return SURVIVAL;
	}
}
