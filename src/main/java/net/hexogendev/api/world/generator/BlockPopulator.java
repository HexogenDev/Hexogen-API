package net.hexogendev.api.world.generator;

import java.util.Random;

import net.hexogendev.api.world.World;
import net.hexogendev.api.world.chunk.Chunk;

public abstract class BlockPopulator {

	public abstract void populate(World world, Random random, Chunk source);
}
