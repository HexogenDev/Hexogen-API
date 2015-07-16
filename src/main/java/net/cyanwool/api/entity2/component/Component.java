package net.cyanwool.api.entity2.component;

import net.cyanwool.api.entity2.Entity;

public interface Component {

	public void initialization();

	public void isNeedUpdate();

	public void update();

	public boolean autoUpdate();

	public Entity getEntity();

	public String getID();
}
