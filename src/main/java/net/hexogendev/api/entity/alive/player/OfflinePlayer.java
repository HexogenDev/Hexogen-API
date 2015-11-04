package net.hexogendev.api.entity.alive.player;

import net.hexogendev.api.entity.EntityLivingBase;

public interface OfflinePlayer extends EntityLivingBase {

	public boolean isOnline();

	public PlayerProfile getProfile();

}
