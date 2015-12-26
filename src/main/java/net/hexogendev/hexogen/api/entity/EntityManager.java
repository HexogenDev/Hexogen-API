package net.hexogendev.hexogen.api.entity;

import java.util.Collection;

import net.hexogendev.hexogen.api.Initializable;
import net.hexogendev.hexogen.api.Server;
import net.hexogendev.hexogen.api.Shutdownable;
import net.hexogendev.hexogen.api.world.Position;

public interface EntityManager extends Initializable, Shutdownable {

	public Collection<Entity> getAllEntities();

	public Entity getEntity(int id);

	public void registerEntity(Entity entity);

	public void unregisterEntity(Entity entity);

	public void moveToOtherPosition(Entity entity, Position pos);

	public Server getServer();
}
