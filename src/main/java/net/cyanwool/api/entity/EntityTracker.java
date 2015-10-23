package net.cyanwool.api.entity;

import java.util.Map;

public interface EntityTracker {

	public void registerEntity(Entity entity);

	public void unregisterEntity(Entity entity);

	public void onUpdate();

	public Map<Integer, EntityTrackerEntry> getMapTrackedEntities();

}
