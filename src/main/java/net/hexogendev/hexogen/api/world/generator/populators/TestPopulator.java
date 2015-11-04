package net.hexogendev.hexogen.api.world.generator.populators;

import java.util.Random;

import net.hexogendev.hexogen.api.material.Material;
import net.hexogendev.hexogen.api.material.blocks.BlockMaterial;
import net.hexogendev.hexogen.api.world.World;
import net.hexogendev.hexogen.api.world.chunk.Chunk;
import net.hexogendev.hexogen.api.world.generator.BlockPopulator;

public class TestPopulator extends BlockPopulator {

	@Override
	public void populate(World world, Random random, Chunk source) {
		for (int dofor = 0; dofor < 2; dofor++) {
			if (random.nextInt(4) == 0) {
				int j = random.nextInt(18) + 16;
				for (int l = 0; l < 64; l++) {
					int i1 = (8 + random.nextInt(8)) - random.nextInt(8);
					int j1 = (j + random.nextInt(4)) - random.nextInt(4);
					int k1 = (8 + random.nextInt(8)) - random.nextInt(8);
					if (source.getBlock(i1, j1, k1).getBlockType() == Material.AIR) {
						source.getBlock(i1, j1, k1).setBlock((BlockMaterial) Material.fromId(1));
					}
				}
			}
		}
	}

}
