package net.hexogendev.api.entity.alive.player;

import net.hexogendev.api.network.PlayerNetwork;

public interface Player extends OfflinePlayer {

	public PlayerNetwork getPlayerNetwork();

	public void kick(String reason);

}
