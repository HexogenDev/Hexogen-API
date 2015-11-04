package net.hexogendev.hexogen.api.world;

public enum Difficulty {

	PEACEFUL(0), EASY(1), NORMAL(2), HARD(3);

	private int id;

	private Difficulty(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public Difficulty getDifficulty(int id) {
		switch (id) {
			case 0:
				return PEACEFUL;
			case 1:
				return EASY;
			case 2:
				return NORMAL;
			case 3:
				return HARD;
			default:
				break;
		}
		return PEACEFUL;
	}

}
