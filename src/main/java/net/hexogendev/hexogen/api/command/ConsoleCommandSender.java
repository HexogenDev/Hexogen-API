package net.hexogendev.hexogen.api.command;

import net.hexogendev.hexogen.api.Hexogen;
import net.hexogendev.hexogen.api.Server;
import net.hexogendev.hexogen.api.utils.ChatColor;

public class ConsoleCommandSender implements ICommandSender {

	@Override
	public void sendMessage(String message) {
		String mess = ChatColor.stripColor(message);
		getServer().getLogger().info(mess);
	}

	@Override
	public Server getServer() {
		return Hexogen.getServer();
	}

	@Override
	public String getName() {
		return "Console";
	}

	@Override
	public boolean isPlayer() {
		return false;
	}

	@Override
	public String getLangCode() {
		return "en_US";
	}

	@Override
	public void executeCommand(String commandName) {
		getServer().getCommandManager().dispatchCommand(this, commandName);
	}
}
