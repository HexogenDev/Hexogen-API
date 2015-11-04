package net.hexogendev.api.world.generator.environment;

import java.util.List;

import net.hexogendev.api.material.Material;
import net.hexogendev.api.world.World;
import net.hexogendev.api.world.chunk.Chunk;
import net.hexogendev.api.world.generator.BlockPopulator;
import net.hexogendev.api.world.generator.EnvironmentGenBase;
import net.hexogendev.api.world.generator.populators.TestPopulator;

public class EnvironmentGenFlat extends EnvironmentGenBase {

	@Override
	public Chunk generate(World world, int i, int j) {
		Chunk chunk = world.getChunkManager().getChunk(i, j);
		for (int dofor = 0; dofor < 4; dofor++) {
			for (int x = 0; x < 16; x++) {
				for (int z = 0; z < 16; z++) {

					if (dofor == 0) {
						chunk.setBlock(x, dofor, z, Material.STONE);
					} else if (dofor == 3) {
						chunk.setBlock(x, dofor, z, Material.GRASS);
					} else {
						chunk.setBlock(x, dofor, z, Material.DIRT);
					}
				}
			}
		}
		return chunk;
	}

	public List<BlockPopulator> getPopulators() {
		List<BlockPopulator> list = super.getPopulators();
		list.add(new TestPopulator());
		return list;
	}
}
