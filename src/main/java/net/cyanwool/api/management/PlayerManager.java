package net.cyanwool.api.management;

import java.util.List;

import net.cyanwool.api.Server;
import net.cyanwool.api.entity.types.player.Player;
import net.cyanwool.api.world.World;

public interface PlayerManager {

	public Server getServer();

	// public void joinPlayer(GameProfile info);

	public void spawnPlayer(Player player);

	// public void refreshPlayer(Player player, PlayerListEntryAction action);

	public void leavePlayer(Player player);

	public List<Player> getPlayers();

	public void sendMessageForAll(String message);

	public void sendMessageForAll(World world, String message);

	public Player getPlayer(String name);
}
