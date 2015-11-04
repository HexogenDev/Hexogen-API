package net.hexogendev.api.entity.controllers;

import net.hexogendev.api.entity.Entity;
import net.hexogendev.api.world.Position;

public interface EntityMoveController extends EntityController {

	public void moveEntity(double x, double y, double z);

	public void moveEntity(Position pos);

	public void moveEntity(Entity entity);
}
