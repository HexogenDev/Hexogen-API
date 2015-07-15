package net.cyanwool.api.block;

import net.cyanwool.api.material.blocks.BlockMaterial;
import net.cyanwool.api.world.Position;
import net.cyanwool.api.world.chunk.Chunk;

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
