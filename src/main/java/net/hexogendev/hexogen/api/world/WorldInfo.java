package net.hexogendev.hexogen.api.world;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((path == null) ? 0 : path.hashCode());
		result = prime * result + (int) (seed ^ (seed >>> 32));
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
		WorldInfo other = (WorldInfo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (path == null) {
			if (other.path != null)
				return false;
		} else if (!path.equals(other.path))
			return false;
		if (seed != other.seed)
			return false;
		return true;
	}
	
}
