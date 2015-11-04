package net.hexogendev.hexogen.api.command;

import net.hexogendev.hexogen.api.Server;

public interface ICommandSender {

	public void sendMessage(String message);

	public Server getServer();

	public String getName();

	public boolean isPlayer();

	public String getLangCode();

	public void executeCommand(String commandName);
}
