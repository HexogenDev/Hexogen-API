package net.cyanwool.api.io.requests;

import net.cyanwool.api.io.IORequest;
import net.cyanwool.api.world.chunk.Chunk;

public interface ChunkIORequest extends IORequest {

	public void readChunk(int x, int z);

	public void saveChunk(Chunk chunk);

}
