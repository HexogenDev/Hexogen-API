package net.cyanwool.api.entity.controllers;

import net.cyanwool.api.entity.Entity;
import net.cyanwool.api.world.Position;

public interface EntityLookController extends EntityController{
	
	public void lookAt(double x, double y, double z);
	
	public void lookAt(Position pos);
	
	public void lookAtEntity(Entity entity);
	
}