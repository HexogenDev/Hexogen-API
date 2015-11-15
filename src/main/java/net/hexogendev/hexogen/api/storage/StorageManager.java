package net.hexogendev.hexogen.api.storage;

import net.hexogendev.hexogen.api.world.World;
import net.hexogendev.hexogen.api.world.WorldInfo;
import net.hexogendev.hexogen.api.world.chunk.Chunk;

public interface StorageManager {

	public World readWorld(String folderName, String worldName);

	public void saveWorld(World world);
	
	public Chunk readChunk(WorldInfo info, int x, int z);
}
