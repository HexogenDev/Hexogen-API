package net.cyanwool.api.command;

import net.cyanwool.api.CyanWool;
import net.cyanwool.api.Server;
import net.cyanwool.api.utils.ChatColor;
import net.cyanwool.api.utils.chatReplacer.ReplacerManager;

public class ConsoleCommandSender implements ICommandSender {

	@Override
	public void sendMessage(String message) {
		message = ReplacerManager.replace(message, message, this);// ???
		String mess = ChatColor.stripColor(message);
		getServer().getLogger().info(mess);
	}

	@Override
	public Server getServer() {
		return CyanWool.getServer();
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
