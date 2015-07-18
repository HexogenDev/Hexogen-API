package net.cyanwool.api.entity.types;

import net.cyanwool.api.entity.BaseEntity;
import net.cyanwool.api.entity.EntityLivingBase;
import net.cyanwool.api.utils.DamageSource;

public interface EntityType {

	public String getName();

	public int getId();
	
	public void registerComponents(BaseEntity baseEntity);

	public void onTick(BaseEntity baseEntity);

	public void onDeathEntity(BaseEntity baseEntity, DamageSource source);

	public void onDeathEntityByEntity(BaseEntity baseEntity, BaseEntity killer);

	public void onDamageEntity(BaseEntity baseEntity, BaseEntity damager, float damage);

	public void onAttackEntity(BaseEntity baseEntity, BaseEntity target, float damage);

	public void onWalkingEntity(BaseEntity baseEntity);

	public void onInteractEntity(BaseEntity baseEntity, EntityLivingBase interacter);
}
