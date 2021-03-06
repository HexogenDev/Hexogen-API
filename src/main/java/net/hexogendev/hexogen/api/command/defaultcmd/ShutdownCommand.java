package net.hexogendev.hexogen.api.command.defaultcmd;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import net.hexogendev.hexogen.api.command.ICommand;
import net.hexogendev.hexogen.api.command.ICommandSender;
import net.hexogendev.hexogen.api.lang.LanguagePath;
import net.hexogendev.hexogen.api.utils.ChatColor;

public class ShutdownCommand implements ICommand {

	private List<String> aliases;

	@Override
	public void execute(ICommandSender sender, String[] args) {
		String text = sender.getServer().getLanguageManager().getLanguageFile(sender.getLangCode()).getValue(LanguagePath.MESSAGES.DEFAULT_SHUTDOWN_MESSAGE);
		if (args.length >= 1) {
			if (args[0] != null) {
				text = args[0];
			}
		}
		text = ChatColor.translateAlternateColorCodes('&', text);
		sender.getServer().shutdown(text);
	}

	@Override
	public String getName() {
		return "shutdown";
	}

	@Override
	public String getDescription() {
		// return "Shutdown this server";
		return LanguagePath.COMMANDS.SHUTDOWN.DESCRIPTION;
	}

	@Override
	public List<String> getAliases() {
		if (aliases == null) {
			aliases = new CopyOnWriteArrayList<String>();
			aliases.add("stop");
		}
		return aliases;
	}

}
