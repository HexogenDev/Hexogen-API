package net.cyanwool.api.entity.types.player;

import net.cyanwool.api.entity.EntityLivingBase;
import net.cyanwool.api.world.GameMode;
import net.cyanwool.api.world.Position;

public interface Human extends EntityLivingBase {

	public String getName();

	public boolean isSleeping();

	public boolean isBlocking();

	public void sleepInBedAt(int x, int y, int z);

	public void sleepInBedAt(Position pos);

	public void wakeUp();

	public void closeInventory();

	public int getSleepingTicks();

	public void setSleepingTicks(int ticks);

	public GameMode getGameMode();

	public void setGameMode(GameMode gamemode);

}
