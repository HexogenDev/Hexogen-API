package net.cyanwool.api.entity.types.monster;

import net.cyanwool.api.entity.BaseEntity;

public interface Zombie extends Monster {

	public boolean isBaby(BaseEntity baseEntity);

	public void setBaby(BaseEntity baseEntity, boolean flag);

	public boolean isVillager(BaseEntity baseEntity);

	public void setVillager(BaseEntity baseEntity, boolean flag);

}
