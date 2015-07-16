package net.cyanwool.api.entity.types.monster;

import net.cyanwool.api.entity.Entity;

public interface Zombie extends Monster {

	public boolean isBaby(Entity entity);

	public void setBaby(Entity entity, boolean flag);

	public boolean isVillager(Entity entity);

	public void setVillager(Entity entity, boolean flag);

}
