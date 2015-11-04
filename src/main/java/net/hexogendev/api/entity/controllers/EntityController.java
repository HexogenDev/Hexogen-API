package net.hexogendev.api.entity.controllers;

import net.hexogendev.api.entity.Entity;

public interface EntityController {

	public String getName();

	public boolean isEnabled();

	public void setEnabled(boolean flag);

	public boolean isNeedUpdate();

	public void setUpdate();

	public void onUpdate();

	public Entity getEntity();

}
