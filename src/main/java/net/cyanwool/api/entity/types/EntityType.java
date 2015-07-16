package net.cyanwool.api.entity.types;

import net.cyanwool.api.entity.Entity;
import net.cyanwool.api.entity.EntityLivingBase;
import net.cyanwool.api.utils.DamageSource;

public interface EntityType {

	public String getName();

	public int getId();

	public void onTick(Entity entity);

	public void onDeathEntity(Entity entity, DamageSource source);

	public void onDeathEntityByEntity(Entity entity, Entity killer);

	public void onDamageEntity(Entity entity, Entity damager, float damage);

	public void onAttackEntity(Entity entity, Entity target, float damage);

	public void onWalkingEntity(Entity entity);

	public void onInteractEntity(Entity entity, EntityLivingBase interacter);
}
