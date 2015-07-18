package net.cyanwool.api.entity.types;

import net.cyanwool.api.entity.BaseEntity;
import net.cyanwool.api.utils.DamageSource;

public interface EntityType {
	
	public String getName();
	
	public int getId();
	
	public BaseEntity getEntity();
	
	public boolean isPlayer();

	public void registerComponents();

	public void onTick();

	public void onDeathEntity(DamageSource source);

	public void onDeathEntityByEntity(BaseEntity killer);

	public void onDamageEntity(BaseEntity damager, float damage);

	public void onAttackEntity(BaseEntity target, float damage);

	public void onWalkingEntity();

	public void onInteractEntity(BaseEntity interacter);
	
	public void onEntitySpawn();
}
