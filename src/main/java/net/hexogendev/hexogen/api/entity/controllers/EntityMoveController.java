package net.hexogendev.hexogen.api.entity.controllers;

import net.hexogendev.hexogen.api.entity.Entity;
import net.hexogendev.hexogen.api.world.Position;

public interface EntityMoveController extends EntityController {

	public void moveEntity(double x, double y, double z);

	public void moveEntity(Position pos);

	public void moveEntity(Entity entity);
}
