package net.hexogendev.api.entity.controllers;

import net.hexogendev.api.entity.Entity;
import net.hexogendev.api.world.Position;

public interface EntityLookController extends EntityController {

	public void lookAt(double x, double y, double z);

	public void lookAt(Position pos);

	public void lookAtEntity(Entity entity);

}
