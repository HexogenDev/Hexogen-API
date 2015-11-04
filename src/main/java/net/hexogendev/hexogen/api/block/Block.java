package net.hexogendev.hexogen.api.block;

import net.hexogendev.hexogen.api.material.blocks.BlockMaterial;
import net.hexogendev.hexogen.api.world.Position;
import net.hexogendev.hexogen.api.world.chunk.Chunk;

public interface Block {

	public Position getPosition();

	public Chunk getChunk();

	public void destroyBlock();

	public int getBlockLight();

	public void transformToFallingBlock();

	public void dropBlock();

	public void setBlock(BlockMaterial type);

	public BlockMaterial getBlockType();
}
