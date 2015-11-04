package net.hexogendev.hexogen.api.entity;

import java.util.List;
import java.util.UUID;

import net.hexogendev.hexogen.api.Server;
import net.hexogendev.hexogen.api.command.ICommandSender;
import net.hexogendev.hexogen.api.entity.controllers.EntityMoveController;
import net.hexogendev.hexogen.api.network.IPacket;
import net.hexogendev.hexogen.api.utils.Rotation;
import net.hexogendev.hexogen.api.world.Position;
import net.hexogendev.hexogen.api.world.World;
import net.hexogendev.hexogen.api.world.chunk.Chunk;

public interface Entity extends ICommandSender {

	public EntityTrackerEntry getTrackerEntry();

	public void applyMetadata();

	public boolean isTeleported();

	public boolean isMoved();

	public boolean isRotated();

	public boolean isValid();

	public boolean isSneaking();

	public void setSneaking(boolean flag);

	public boolean isSprinting();

	public void setSprinting(boolean flag);

	public Position getPosition();

	public Position getPreviousPosition();

	public int getEntityID();

	public void setEntityID(int id);

	public UUID getUUID();

	public World getWorld();

	public void teleport(Position pos);

	public boolean isAlive();

	public boolean isInvisible();

	public boolean onGround();

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

	@Override
	public Server getServer();

	public Rotation getBodyRotation();

	public void setBodyRotation(Rotation rotation);

	public EntityMoveController getMoveController();

	// NBT
	// public void loadCompoundTag(CompoundTag tag);

	// public void saveCompoundTag(CompoundTag tag);

	// public CompoundTag getCompoundTag();

	public List<IPacket> getUpdatePackets();

	public abstract List<IPacket> getSpawnPackets();
}
