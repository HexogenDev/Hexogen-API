package net.cyanwool.api.entity;

import net.cyanwool.api.Server;
import net.cyanwool.api.command.ICommandSender;
import net.cyanwool.api.entity.component.ComponentManager;
import net.cyanwool.api.entity.types.EntityType;
import net.cyanwool.api.world.Position;
import net.cyanwool.api.world.World;
import net.cyanwool.api.world.chunk.Chunk;

public interface BaseEntity extends ICommandSender {

	public Position getPosition();

	public void teleport(Position pos);

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

	public boolean canSeeEntity(BaseEntity baseEntity);

	public boolean canSeePosition(Position pos);

	@Override
	public Server getServer();

	public ComponentManager getComponentManager();
}
