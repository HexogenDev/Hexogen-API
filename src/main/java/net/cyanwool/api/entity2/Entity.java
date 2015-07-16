package net.cyanwool.api.entity2;

import net.cyanwool.api.Server;
import net.cyanwool.api.entity2.component.ComponentManager;
import net.cyanwool.api.entity2.types.EntityType;
import net.cyanwool.api.world.Position;
import net.cyanwool.api.world.World;
import net.cyanwool.api.world.chunk.Chunk;

public interface Entity {

	public Position getPosition();

	public int getEntityID();

	public void setEntityID(int id);
	
	public World getWorld();

	public boolean isAlive();

	public boolean isInvisible();

	public boolean onGround();

	public void destroy();

	public void onTick();

	public void setInvisible(boolean flag);

	public EntityType getEntityType();

	public Chunk getChunk();

	public boolean canSeeEntity(Entity entity);

	public boolean canSeePosition(Position pos);

	public Server getServer();
	
	public ComponentManager getComponentManager();

	// NBT
	// public void loadCompoundTag(CompoundTag tag);

	// public void saveCompoundTag(CompoundTag tag);

	// public CompoundTag getCompoundTag();

	// public List<Packet> getUpdatePackets();

	// public abstract List<Packet> getSpawnPackets();
}
