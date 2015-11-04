package net.hexogendev.api.world.biome;

import net.hexogendev.api.world.World;

public interface IBiomeModifier {
	public BiomeInfo getModdedBiome(World w, int i, int j, BiomeInfo biome);
}
