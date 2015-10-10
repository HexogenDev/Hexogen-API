package net.cyanwool.api.entity.alive.player;

import net.cyanwool.api.entity.EntityLivingBase;

public interface OfflinePlayer extends EntityLivingBase {

	public boolean isOnline();

	public PlayerProfile getProfile();

}
