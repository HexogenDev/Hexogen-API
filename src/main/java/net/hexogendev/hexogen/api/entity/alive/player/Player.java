package net.hexogendev.hexogen.api.entity.alive.player;

import net.hexogendev.hexogen.api.network.PlayerNetwork;

public interface Player extends OfflinePlayer {

	public PlayerNetwork getPlayerNetwork();

	public void kick(String reason);

}
