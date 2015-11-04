package net.hexogendev.api.world;

public class WorldInfo {

	private String name;
	private String path;
	private Environment environment;
	private long seed;
	private GameMode gameMode;
	private WorldType type;
	private boolean generateStructures;

	public WorldInfo(String name, String path, Environment environment, long seed, GameMode gamemode, WorldType type, boolean generateStructures) {
		this.name = name;
		this.path = path;
		this.environment = environment;
		this.seed = seed;
		this.gameMode = gamemode;
		this.type = type;
		this.generateStructures = generateStructures;
	}

	public String getName() {
		return name;
	}

	public String getPath() {
		return path;
	}

	public Environment getEnvironment() {
		return environment;
	}

	public long getSeed() {
		return seed;
	}

	public GameMode getDefaultGamemode() {
		return gameMode;
	}

	public void setDefaultGamemode(GameMode mode) {
		this.gameMode = mode;
	}

	public WorldType getWorldType() {
		return type;
	}

	public void setWorldType(WorldType type) {
		this.type = type;
	}

	public boolean canGenerateStructures() {
		return generateStructures;
	}

	public void setGenerateStructures(boolean flag) {
		this.generateStructures = flag;
	}
}
