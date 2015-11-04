package net.hexogendev.api.network;

import net.hexogendev.api.Server;
import net.hexogendev.api.entity.alive.player.Player;

public interface PlayerNetwork {

	public Player getPlayer();

	public void sendPacket(IPacket packet);

	// public void addListener(SessionListener listener);

	// public void removeListener(SessionListener listener);

	public void disconnect(String reason);

	public String getHost();

	public Server getServer();
}
