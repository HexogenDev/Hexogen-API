package net.hexogendev.hexogen.api.world.biome;

import net.hexogendev.hexogen.api.world.World;

public interface IBiomeModifier {
	public BiomeInfo getModdedBiome(World w, int i, int j, BiomeInfo biome);
}
