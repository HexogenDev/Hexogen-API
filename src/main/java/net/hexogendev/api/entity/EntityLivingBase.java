package net.hexogendev.api.entity;

import net.hexogendev.api.entity.controllers.EntityJumpController;
import net.hexogendev.api.entity.controllers.EntityLookController;
import net.hexogendev.api.utils.DamageSource;
import net.hexogendev.api.utils.Rotation;
import net.hexogendev.api.world.Position;
import net.hexogendev.api.world.sounds.Sound;

public interface EntityLivingBase extends Entity {

	public boolean isEntityUndead();

	public float getEyeHeight();

	public Position getEyePosition();

	public Rotation getHeadRotation();

	public void setHeadRotation(Rotation rotation);

	public void damage(float amount, DamageSource source);

	public void damage(float amount, DamageSource source, Entity damager);

	public double getHealth();

	public void setHealth(double health);

	public double getMaxHealth();

	public void setMaxHealth(double maxHealth);

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

	public String getDisplayName();

	public void setDisplayName(String name);

	public boolean hasDisplayName();

	public boolean isRenderDisplayName();

	public void setRenderDisplayName(boolean flag);

	public void interact(EntityLivingBase entity);

	public void kill();

	public void kill(DamageSource source);

	public void kill(Entity entity);

	public EntityJumpController getJumpController();

	public EntityLookController getLookController();

	// Events...
	public void onDamageEntity(Entity damager, float damage);

	public void onAttackEntity(Entity target, float damage);

	public void onDeathEntity();

	public void onWalkingEntity();

	public void onInteractEntity(EntityLivingBase interacter);

}
