package net.hexogendev.hexogen.api.world.biome;

import java.util.Random;

import net.hexogendev.hexogen.api.world.TreeType;

public class BiomeInfo {
	public static final BiomeInfo byId[] = new BiomeInfo[32];

	public String name;
	public float minHeight = 0.1f;
	public float maxHeight = 0.3f;
	public float temperature = 0.5f;
	public float rainfall = 0.5f;
	public byte topBlock = 2;
	public byte fillerBlock = 3;
	public int waterlilyPerChunk = 0;
	public int treesPerChunk = 0;
	public int flowersPerChunk = 2;
	public int grassPerChunk = 1;
	public int deadBushPerChunk = 0;
	public int mushroomsPerChunk = 0;
	public int reedsPerChunk = 0;
	public int cactiPerChunk = 0;
	public int sandPerChunk = 1;
	public int sandPerChunk2 = 3;
	public int clayPerChunk = 1;
	public int bigMushroomsPerChunk = 0;
	public int waterColorMultiplier = 0xffffff;
	public boolean generateLakes = true;
	public int color = 0xffffff;
	public int id = 0;

	protected BiomeInfo(int id) {
		this.id = id;
		byId[id] = this;
	}

	protected BiomeInfo setMinMaxHeight(float f, float f1) {
		minHeight = f;
		maxHeight = f1;
		return this;
	}

	protected BiomeInfo setBiomeName(String name) {
		this.name = name;
		return this;
	}

	protected BiomeInfo setTemperatureRainfall(float f, float f1) {
		temperature = f;
		rainfall = f1;
		return this;
	}

	protected BiomeInfo setColor(int i) {
		color = i;
		return this;
	}

	public static BiomeInfo fromName(String name) {
		name = name.toLowerCase();
		for (int dofor = 0; dofor < byId.length; dofor++) {
			if (byId[dofor] != null) {
				if (byId[dofor].name.toLowerCase() == name) {
					return byId[dofor];
				}
			}
		}
		return null;
	}

	public static BiomeInfo fromId(int id) {
		return byId[id];
	}

	public TreeType getRandomWorldGenForTrees(Random random) {
		if (random.nextInt(10) == 0) {
			return TreeType.BIG_TREE;
		} else {
			return TreeType.TREE;
		}
		// etc
	}

	// public static final BiomeInfo ocean = (new BiomeInfoOcean(0)).setColor(112).setBiomeName("Ocean").setMinMaxHeight(-1F, 0.4F);
	// public static final BiomeInfo plains = (new BiomeInfoPlains(1)).setColor(0x8db360).setBiomeName("Plains").setTemperatureRainfall(0.8F, 0.4F);
	// public static final BiomeInfo desert = (new BiomeInfoDesert(2)).setColor(0xfa9418).setBiomeName("Desert").setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.1F, 0.2F);
	// public static final BiomeInfo extremeHills = (new BiomeInfoHills(3)).setColor(0x606060).setBiomeName("Extreme Hills").setMinMaxHeight(0.2F, 1.3F).setTemperatureRainfall(0.2F, 0.3F);
	// public static final BiomeInfo forest = (new BiomeInfoForest(4)).setColor(0x56621).setBiomeName("Forest").setTemperatureRainfall(0.7F, 0.8F);
	// public static final BiomeInfo taiga = (new BiomeInfoTaiga(5)).setColor(0xb6659).setBiomeName("Taiga").setTemperatureRainfall(0.05F, 0.8F).setMinMaxHeight(0.1F, 0.4F);
	// public static final BiomeInfo swampland = (new BiomeInfoSwamp(6)).setColor(0x7f9b2).setBiomeName("Swampland").setMinMaxHeight(-0.2F, 0.1F).setTemperatureRainfall(0.8F, 0.9F);
	// public static final BiomeInfo river = (new BiomeInfoRiver(7)).setColor(255).setBiomeName("River").setMinMaxHeight(-0.5F, 0.0F);
	// public static final BiomeInfo hell = (new BiomeInfoHell(8)).setColor(0xff0000).setBiomeName("Hell").setTemperatureRainfall(2.0F, 0.0F);
	// public static final BiomeInfo sky = (new BiomeInfoEnd(9)).setColor(0x8080ff).setBiomeName("Sky");
	// public static final BiomeInfo frozenOcean = (new BiomeInfoOcean(10)).setColor(0x9090a0).setBiomeName("FrozenOcean").setMinMaxHeight(-1F, 0.5F).setTemperatureRainfall(0.0F, 0.5F);
	// public static final BiomeInfo frozenRiver = (new BiomeInfoRiver(11)).setColor(0xa0a0ff).setBiomeName("FrozenRiver").setMinMaxHeight(-0.5F, 0.0F).setTemperatureRainfall(0.0F, 0.5F);
	// public static final BiomeInfo icePlains = (new BiomeInfoSnow(12)).setColor(0xffffff).setBiomeName("Ice Plains").setTemperatureRainfall(0.0F, 0.5F);
	// public static final BiomeInfo iceMountains = (new BiomeInfoSnow(13)).setColor(0xa0a0a0).setBiomeName("Ice Mountains").setMinMaxHeight(0.2F, 1.2F).setTemperatureRainfall(0.0F, 0.5F);
	// public static final BiomeInfo mushroomIsland = (new BiomeInfoMushroom(14, Biome.MUSHROOM_ISLAND)).setColor(0xff00ff).setBiomeName("MushroomIsland").setTemperatureRainfall(0.9F, 1.0F).setMinMaxHeight(0.2F, 1.0F);
	// public static final BiomeInfo mushroomIslandShore = (new BiomeInfoMushroom(15, Biome.MUSHROOM_SHORE)).setColor(0xa000ff).setBiomeName("MushroomIslandShore").setTemperatureRainfall(0.9F, 1.0F).setMinMaxHeight(-1F, 0.1F);
	// public static final BiomeInfo beach = (new BiomeInfoBeach(16, Biome.BEACH)).setColor(0xfade55).setBiomeName("Beach").setTemperatureRainfall(0.8F, 0.4F).setMinMaxHeight(0.0F, 0.1F);
	// public static final BiomeInfo desertHills = (new BiomeInfoDesert(17, Biome.DESERT_HILLS)).setColor(0xd25f12).setBiomeName("DesertHills").setTemperatureRainfall(2.0F, 0.0F).setMinMaxHeight(0.2F, 0.7F);
	// public static final BiomeInfo forestHills = (new BiomeInfoForest(18, Biome.FOREST_HILLS)).setColor(0x22551c).setBiomeName("ForestHills").setTemperatureRainfall(0.7F, 0.8F).setMinMaxHeight(0.2F, 0.6F);
	// public static final BiomeInfo taigaHills = (new BiomeInfoTaiga(19, Biome.TAIGA_HILLS)).setColor(0x163933).setBiomeName("TaigaHills").setTemperatureRainfall(0.05F, 0.8F).setMinMaxHeight(0.2F, 0.7F);
	// public static final BiomeInfo extremeHillsEdge = (new BiomeInfoHills(20, Biome.SMALL_MOUNTAINS)).setColor(0x72789a).setBiomeName("Extreme Hills Edge").setMinMaxHeight(0.2F, 0.8F).setTemperatureRainfall(0.2F, 0.3F);
	// public static final BiomeInfo jungle = (new BiomeInfoJungle(21, Biome.FOREST)).setColor(0x537b09).setBiomeName("Jungle").setTemperatureRainfall(1.2F, 0.9F).setMinMaxHeight(0.2F, 0.4F);
	// public static final BiomeInfo jungleHills = (new BiomeInfoJungle(22, Biome.FOREST)).setColor(0x2c4205).setBiomeName("JungleHills").setTemperatureRainfall(1.2F, 0.9F).setMinMaxHeight(1.8F, 0.2F);
}
