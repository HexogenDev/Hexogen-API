package net.cyanwool.api.io.requests;

import net.cyanwool.api.io.IORequest;
import net.cyanwool.api.world.World;

public interface WorldIORequest extends IORequest {

	public void readWorld(String name);

	public void saveWorld(World world);

}
