package net.hexogendev.hexogen.api.entity.alive.player;

import net.hexogendev.hexogen.api.entity.EntityLivingBase;
import net.hexogendev.hexogen.api.inventory.Inventory;
import net.hexogendev.hexogen.api.inventory.PlayerInventory;
import net.hexogendev.hexogen.api.inventory.item.ItemStack;
import net.hexogendev.hexogen.api.storage.PlayerStorage;
import net.hexogendev.hexogen.api.world.GameMode;

public interface OfflinePlayer extends EntityLivingBase {

	public boolean isOnline();

	public PlayerProfile getProfile();

	public boolean hasItemInHand();

	public void setItemInHand(ItemStack item);

	public boolean isSleeping();

	public boolean isBlocking();

	public void sleepInBedAt(int x, int y, int z);

	public void wakeUp();

	public boolean isNeedFood();

	public int getFoodLevel();

	public void setFoodLevel(int level);

	public void closeInventory();

	public int getXPLevel();

	public int getXPTotal();

	public float getXPInBar();

	public void setXPLevel(int level);

	public void setXPTotal(int xp);

	public void setXPInBar(float xp);

	public boolean isDisableDamage();

	public void setDisableDamage(boolean flag);

	public boolean isFlying();

	public void setFlying(boolean flag);

	public boolean isAllowFlying();

	public void setAllowFlying(boolean flag);

	public boolean isCreativeMode();

	public float getFlySpeed();

	public void setFlySpeed(float speed);

	public float getWalkSpeed();

	public void setWalkSpeed(float speed);

	public boolean canBuild();

	public void setBuild(boolean flag);

	public Inventory getViewInventory();

	public void openInventory(Inventory inventory);

	public GameMode getGameMode();

	public void setGamemode(GameMode mode);

	public Inventory getEnderChest();

	public int getSleepingTicks();

	public void setSleepingTicks(int ticks);

	public PlayerInventory getInventory();

	@Override
	public PlayerStorage getStorage();

	public void loadStorage(PlayerStorage storage);
}
