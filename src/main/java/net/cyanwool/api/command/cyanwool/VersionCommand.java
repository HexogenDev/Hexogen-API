package net.cyanwool.api.command.cyanwool;

import java.util.ArrayList;
import java.util.List;

import net.cyanwool.api.CyanWool;
import net.cyanwool.api.command.Command;
import net.cyanwool.api.command.ICommandSender;
import net.cyanwool.api.utils.ChatColor;

public class VersionCommand extends Command {

	public VersionCommand() {
		super("version", "About server", true);
	}

	@Override
	public void execute(ICommandSender sender, String[] args) {
		// ???
		List<String> list = new ArrayList<String>();
		list.add(ChatColor.GREEN + "#=====#_" + ChatColor.AQUA + "CyanWool" + ChatColor.GREEN + "#=====#");
		list.add(ChatColor.AQUA + CyanWool.getLanguageManager().getLanguageFile(sender.getLangCode()).getValue("cw.version.modname") + ": " + ChatColor.WHITE + CyanWool.getModName());
		list.add(ChatColor.AQUA + CyanWool.getLanguageManager().getLanguageFile(sender.getLangCode()).getValue("cw.version.mcversion") + ": " + ChatColor.WHITE + CyanWool.getMCVersion());

		list.add(ChatColor.AQUA + CyanWool.getLanguageManager().getLanguageFile(sender.getLangCode()).getValue("cw.version.developers") + ": ");

		for (String message : list) {
			sender.sendMessage(message);
		}
	}

}
