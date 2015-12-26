package net.hexogendev.hexogen.api.world;

import java.util.List;

import net.hexogendev.hexogen.api.Server;
import net.hexogendev.hexogen.api.Shutdownable;

public interface WorldManager extends Shutdownable {

	public Server getServer();

	public List<World> getWorlds();

	public boolean addWorld(String folderName, String name);

	public World getWorld(String name);

	public void removeWorld(World world);

	public void saveWorld(World world);

	public void saveAllWorlds();
}
