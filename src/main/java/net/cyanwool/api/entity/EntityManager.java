package net.cyanwool.api.entity;

import java.util.Collection;

import net.cyanwool.api.Server;
import net.cyanwool.api.world.Position;

public interface EntityManager {

	public Collection<BaseEntity> getAll();

	public BaseEntity getEntity(int id);

	public void registerEntity(BaseEntity baseEntity);

	public void unregisterEntity(BaseEntity baseEntity);

	public void moveToOtherPosition(BaseEntity baseEntity, Position pos);

	public Server getServer();
}
