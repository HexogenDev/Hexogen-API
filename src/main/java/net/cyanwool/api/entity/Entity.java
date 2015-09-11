package net.cyanwool.api.entity;

import java.util.List;

import net.cyanwool.api.Server;
import net.cyanwool.api.entity.controllers.EntityController;
import net.cyanwool.api.entity.controllers.EntityMoveController;
import net.cyanwool.api.network.Packet;
import net.cyanwool.api.utils.Rotation;
import net.cyanwool.api.world.Position;
import net.cyanwool.api.world.World;
import net.cyanwool.api.world.chunk.Chunk;

public interface Entity {

	public Position getPosition();

	public int getEntityID();

	public World getWorld();

	public void teleport(Position pos);

	public boolean isAlive();

	public boolean isInvisible();

	public boolean onGround();

	public void destroy();

	public void onTick();

	public void setInvisible(boolean flag);

	public int getFireTicks();

	public void setFireTicks(int ticks);

	public EntityType getEntityType();

	public int getLivedTicks();

	public Chunk getChunk();

	public void setPassenger(Entity entity);

	public Entity getPassenger();

	public Entity getVehicle();

	public boolean canSeeEntity(Entity entity);

	public boolean canSeePosition(Position pos);

	public Server getServer();

	public Rotation getBodyRotation();

	public void setBodyRotation(Rotation rotation);

	public EntityController getEntityController(String name);

	public void addEntityController(EntityController controller);

	public void removeEntityController(EntityController controller);

	public void removeEntityController(String name);

	public EntityMoveController getMoveController();

	// NBT
	// public void loadCompoundTag(CompoundTag tag);

	// public void saveCompoundTag(CompoundTag tag);

	// public CompoundTag getCompoundTag();

	public List<Packet> getUpdatePackets();

	public abstract List<Packet> getSpawnPackets();

	public void setEntityID(int id);
}
