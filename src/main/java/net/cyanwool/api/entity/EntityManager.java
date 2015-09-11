package net.cyanwool.api.entity;

import java.util.Collection;

import net.cyanwool.api.Server;
import net.cyanwool.api.world.Position;

public interface EntityManager {

	public Collection<Entity> getAllEntities();

	public Entity getEntity(int id);

	public void registerEntity(Entity entity);

	public void unregisterEntity(Entity entity);

	public void moveToOtherPosition(Entity entity, Position pos);

	public Server getServer();
}
