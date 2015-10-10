package net.cyanwool.api.entity.alive.player;

import net.cyanwool.api.network.PlayerNetwork;

public interface Player extends OfflinePlayer {

	public PlayerNetwork getPlayerNetwork();

	public void kick(String reason);

}
