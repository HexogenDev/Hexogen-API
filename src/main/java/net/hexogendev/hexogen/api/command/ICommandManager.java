package net.hexogendev.hexogen.api.command;

import net.hexogendev.hexogen.api.Initializable;
import net.hexogendev.hexogen.api.Server;

public interface ICommandManager extends Initializable {

	public boolean registerCommand(ICommand command);

	public boolean unregisterCommand(String Command);

	public boolean availableCommand(String command);

	public void dispatchCommand(ICommandSender sender, String rawMessage);

	public Server getServer();
}
