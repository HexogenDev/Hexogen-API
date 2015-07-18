package net.cyanwool.api.entity;

import net.cyanwool.api.world.sounds.Sound;

public interface EntityLivingBase extends BaseEntity {

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
}
