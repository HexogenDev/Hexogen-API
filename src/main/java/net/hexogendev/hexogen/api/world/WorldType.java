package net.hexogendev.hexogen.api.world;

public enum WorldType {
	NORMAL("DEFAULT"), FLAT("FLAT"), LARGE_BIOMES("LARGEBIOMES"), AMPLIFIED("AMPLIFIED");

	private final String name;

	private WorldType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static WorldType getByName(String name) {
		switch (name) {
			case "DEFAULT":
				return WorldType.NORMAL;
			case "FLAT":
				return WorldType.FLAT;
			case "LARGEBIOMES":
				return WorldType.LARGE_BIOMES;
			case "AMPLIFIED":
				return WorldType.AMPLIFIED;
		}
		return WorldType.NORMAL;
	}
}
