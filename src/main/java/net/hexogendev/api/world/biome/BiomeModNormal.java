package net.hexogendev.api.world.biome;

import net.hexogendev.api.world.World;

public class BiomeModNormal implements IBiomeModifier {

	@Override
	public BiomeInfo getModdedBiome(World w, int i, int j, BiomeInfo biome) {
		return biome;
	}

}
