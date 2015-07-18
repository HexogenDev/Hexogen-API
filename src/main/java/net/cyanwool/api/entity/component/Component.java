package net.cyanwool.api.entity.component;

import net.cyanwool.api.entity.BaseEntity;

public interface Component {

	public void initialization();

	public void update();

	public boolean autoUpdate();

	public BaseEntity getEntity();

	public String getID();
}
