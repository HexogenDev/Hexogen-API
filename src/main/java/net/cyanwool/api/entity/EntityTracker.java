package net.cyanwool.api.entity;

import java.util.Collection;

public interface EntityTracker {

	public void registerEntity(Entity entity);

	public void unregisterEntity(Entity entity);

	public void onUpdate();

	public Collection<Entity> getRegisteredEntities();

}
