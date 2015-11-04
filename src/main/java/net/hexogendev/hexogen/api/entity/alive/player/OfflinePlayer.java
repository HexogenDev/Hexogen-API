package net.hexogendev.hexogen.api.entity.alive.player;

import net.hexogendev.hexogen.api.entity.EntityLivingBase;

public interface OfflinePlayer extends EntityLivingBase {

	public boolean isOnline();

	public PlayerProfile getProfile();

}
