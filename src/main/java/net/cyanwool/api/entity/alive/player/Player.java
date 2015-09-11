package net.cyanwool.api.entity.alive.player;

import net.cyanwool.api.command.ICommandSender;
import net.cyanwool.api.network.PlayerNetwork;

public interface Player extends OfflinePlayer, ICommandSender {

	public PlayerNetwork getPlayerNetwork();

}
