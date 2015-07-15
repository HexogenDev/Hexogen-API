package net.cyanwool.api.entity.controllers;

import net.cyanwool.api.entity.Entity;
import net.cyanwool.api.world.Position;

public interface EntityMoveController extends EntityController{
	
	public void moveEntity(double x, double y, double z);
	
	public void moveEntity(Position pos);
	
	public void moveEntity(Entity entity);
}