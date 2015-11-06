package net.hexogendev.hexogen.api.world.generator;

import java.util.Random;

import net.hexogendev.hexogen.api.material.Material;
import net.hexogendev.hexogen.api.world.World;

/*
 * Base class for all map generation classes
 */
public class MapGenBase {
	public int range;
	protected Random rand;
	protected World worldObj;

	public int highestCaveLavaPool = 10;
	public Material CaveWallsBlock = Material.STONE;
	// public Material CaveWallsBlockHell = Material.NETHERRACK;

	/*
	 * Class constructor
	 */
	public MapGenBase() {
		range = 8;
		rand = new Random();
	}

	/*
	 * Returns the completed terrain stored in bytes for your generator. Cave settings can be modified before to generate different caves!
	 * 
	 * @param world The world used to get world settings such as seed
	 * 
	 * @param i The X co-ord of the chunk
	 * 
	 * @param j The Z co-ord of the chunk
	 * 
	 * @param abyte0 The terrain already generated
	 * 
	 * @return The finished terrain generated (not really needed!)
	 */
	public byte[] generate(World world, int i, int j, byte abyte0[]) {
		int k = range;
		worldObj = world;
		rand.setSeed(world.getWorldInfo().getSeed());
		long l = rand.nextLong();
		long l1 = rand.nextLong();
		for (int i1 = i - k; i1 <= i + k; i1++) {
			for (int j1 = j - k; j1 <= j + k; j1++) {
				long l2 = i1 * l;
				long l3 = j1 * l1;
				rand.setSeed(l2 ^ l3 ^ world.getWorldInfo().getSeed());
				abyte0 = recursiveGenerate(world, i1, j1, i, j, abyte0);

			}
		}
		return abyte0;
	}

	protected byte[] recursiveGenerate(World world, int i, int j, int k, int l, byte abyte0[]) {
		return abyte0;
	}
}
