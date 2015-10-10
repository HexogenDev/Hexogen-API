package net.cyanwool.api.management;

import java.util.List;
import java.util.UUID;

import net.cyanwool.api.Server;
import net.cyanwool.api.entity.alive.player.Player;
import net.cyanwool.api.entity.alive.player.PlayerProfile;
import net.cyanwool.api.world.World;

public interface PlayerManager {

	public Server getServer();

	public void joinPlayer(PlayerProfile profile);

	public void onLeavePlayer(Player player);

	public List<Player> getPlayers();

	public void sendMessageForAll(String message);

	public void sendMessageForAll(World world, String message);

	public Player getPlayer(String name);

	public Player getPlayer(UUID uuid);
}
