package net.cyanwool.api.management;

import java.util.List;

import net.cyanwool.api.Server;
import net.cyanwool.api.entity.BaseEntity;
import net.cyanwool.api.world.World;

public interface PlayerManager {

	public Server getServer();

	// public void joinPlayer(GameProfile info);

	public void spawnPlayer(BaseEntity player);

	// public void refreshPlayer(Player player, PlayerListEntryAction action);

	public void leavePlayer(BaseEntity player);

	public List<BaseEntity> getPlayers();

	public void sendMessageForAll(String message);

	public void sendMessageForAll(World world, String message);

	public BaseEntity getPlayer(String name);
}
