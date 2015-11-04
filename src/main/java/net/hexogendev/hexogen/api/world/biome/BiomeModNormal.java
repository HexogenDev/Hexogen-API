package net.hexogendev.hexogen.api.world.biome;

import net.hexogendev.hexogen.api.world.World;

public class BiomeModNormal implements IBiomeModifier {

	@Override
	public BiomeInfo getModdedBiome(World w, int i, int j, BiomeInfo biome) {
		return biome;
	}

}
