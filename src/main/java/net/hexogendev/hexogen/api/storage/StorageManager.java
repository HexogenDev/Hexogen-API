package net.hexogendev.hexogen.api.storage;

import net.hexogendev.hexogen.api.world.World;

public interface StorageManager {
	
	public World readWorld(String folderName, String worldName);
	
	public void saveWorld(World world);
}