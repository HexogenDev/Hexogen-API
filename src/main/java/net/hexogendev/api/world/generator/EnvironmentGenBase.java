package net.hexogendev.api.world.generator;

import java.util.ArrayList;
import java.util.List;

import net.hexogendev.api.world.World;
import net.hexogendev.api.world.chunk.Chunk;

public abstract class EnvironmentGenBase {

	public abstract Chunk generate(World world, int chunkX, int chunkZ);

	public List<BlockPopulator> getPopulators() {
		return new ArrayList<BlockPopulator>();
	}
}
