package net.hexogendev.hexogen.api.command.defaultcmd;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import net.hexogendev.hexogen.api.Hexogen;
import net.hexogendev.hexogen.api.command.ICommand;
import net.hexogendev.hexogen.api.command.ICommandSender;
import net.hexogendev.hexogen.api.plugins.IPlugin;
import net.hexogendev.hexogen.api.utils.ChatColor;

public class PluginsCommand implements ICommand {

	private List<String> aliases;

	@Override
	public void execute(ICommandSender sender, String[] args) {
		String pluginLang = Hexogen.getLanguageManager().getLanguageFile(sender.getLangCode()).getValue("cw.installedPlugins");
		Collection<IPlugin> pluginList = Hexogen.getPluginManager().getPlugins();

		String msg = ChatColor.AQUA + pluginLang + ChatColor.WHITE + " (" + pluginList.size() + "): ";

		if (!pluginList.isEmpty()) {
			for (IPlugin plugin : pluginList) {
				String at = plugin.getDescription().getName();
				if (plugin.isEnabled()) {
					at = ChatColor.GREEN + at;
				} else {
					at = ChatColor.RED + at;
				}
				msg += at + ChatColor.WHITE + ", ";
			}
			msg = msg.substring(0, msg.length() - 2);
		}
		sender.sendMessage(msg);
	}

	@Override
	public String getName() {
		return "plugins";
	}

	@Override
	public String getDescription() {
		return "Get plugin list";
	}

	@Override
	public List<String> getAliases() {
		if (aliases == null) {
			aliases = new CopyOnWriteArrayList<String>();
			aliases.add("pl");
		}
		return aliases;
	}

}
