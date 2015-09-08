package net.cyanwool.api.command;

import net.cyanwool.api.Server;

public interface ICommandManager {

	public boolean registerCommand(ICommand command);

	public boolean unregisterCommand(String Command);

	public boolean availableCommand(String command);

	public void dispatchCommand(ICommandSender sender, String rawMessage);

	public Server getServer();
}
