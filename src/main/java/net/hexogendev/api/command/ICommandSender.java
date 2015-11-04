package net.hexogendev.api.command;

import net.hexogendev.api.Server;

public interface ICommandSender {

	public void sendMessage(String message);

	public Server getServer();

	public String getName();

	public boolean isPlayer();

	public String getLangCode();

	public void executeCommand(String commandName);
}
