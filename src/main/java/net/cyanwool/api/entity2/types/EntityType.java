package net.cyanwool.api.entity2.types;

import net.cyanwool.api.entity.Entity;

public interface EntityType {
	
	public String getName();
	
	public int getId();
	
	public void onTick(Entity entity);
	
	
	
}