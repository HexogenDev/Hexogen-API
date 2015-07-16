package net.cyanwool.api.entity2;

import net.cyanwool.api.world.sounds.Sound;

public interface EntityLivingBase extends Entity {

	public boolean isEntityUndead();

	public void setTarget(EntityLivingBase entity);

	public EntityLivingBase getTarget();

	public Sound getDamageSound();

	public Sound getTalkSound();

	public Sound getDeathSound();

	public void setDeathSound(Sound sound);

	public void setDamageSound(Sound sound);

	public void setTalkSound(Sound sound);

	public boolean playDamageSound();

	public boolean playTalkSound();

	public boolean playDeathSound();

	public void interact(EntityLivingBase entity);

	// public EntityJumpController getJumpController();

	// public EntityLookController getLookController();

	// Events...
	public void onDamageEntity(Entity damager, float damage);

	public void onAttackEntity(Entity target, float damage);

	public void onDeathEntity();

	public void onWalkingEntity();

	public void onInteractEntity(EntityLivingBase interacter);

}
