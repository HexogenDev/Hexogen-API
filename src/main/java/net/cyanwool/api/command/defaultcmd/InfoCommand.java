package net.cyanwool.api.command.defaultcmd;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import net.cyanwool.api.CyanWool;
import net.cyanwool.api.command.ICommand;
import net.cyanwool.api.command.ICommandSender;
import net.cyanwool.api.utils.ChatColor;

public class InfoCommand implements ICommand {

	private List<String> aliases;

	@Override
	public void execute(ICommandSender sender, String[] args) {
		// ???
		List<String> list = new ArrayList<String>();
		list.add(ChatColor.GREEN + "#=====#_" + ChatColor.AQUA + "CyanWool" + ChatColor.GREEN + "_#=====#");
		list.add(ChatColor.AQUA + CyanWool.getLanguageManager().getLanguageFile(sender.getLangCode()).getValue("cw.version.modname") + ": " + ChatColor.WHITE + CyanWool.getModName());
		list.add(ChatColor.AQUA + CyanWool.getLanguageManager().getLanguageFile(sender.getLangCode()).getValue("cw.version.mcversion") + ": " + ChatColor.WHITE + CyanWool.getMCVersion());

		list.add(ChatColor.AQUA + CyanWool.getLanguageManager().getLanguageFile(sender.getLangCode()).getValue("cw.version.maintainer") + ": " + ChatColor.WHITE + "BeYkeRYkt");

		for (String message : list) {
			sender.sendMessage(message);
		}
	}

	@Override
	public String getName() {
		return "info";
	}

	@Override
	public String getDescription() {
		return "About server core.";
	}

	@Override
	public List<String> getAliases() {
		if (aliases == null) {
			aliases = new CopyOnWriteArrayList<String>();
			aliases.add("version");
		}
		return aliases;
	}

}
