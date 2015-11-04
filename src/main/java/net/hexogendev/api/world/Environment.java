package net.hexogendev.api.world;

public enum Environment {

	NORMAL(0), NETHER(-1), THE_END(1);

	private final int id;

	private Environment(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public static Environment getEnvironment(int value) {
		switch (value) {
			case 0:
				return NORMAL;
			case -1:
				return NETHER;
			case 1:
				return THE_END;
			default:
				break;
		}
		return NORMAL;
	}
}
