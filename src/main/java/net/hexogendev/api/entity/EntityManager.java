package net.hexogendev.api.entity;

import java.util.Collection;

import net.hexogendev.api.Server;
import net.hexogendev.api.world.Position;

public interface EntityManager {

	public Collection<Entity> getAllEntities();

	public Entity getEntity(int id);

	public void registerEntity(Entity entity);

	public void unregisterEntity(Entity entity);

	public void moveToOtherPosition(Entity entity, Position pos);

	public Server getServer();
}
