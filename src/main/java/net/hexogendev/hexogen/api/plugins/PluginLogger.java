package net.hexogendev.hexogen.api.plugins;

public class PluginLogger {

	private IPlugin plugin;

	public PluginLogger(IPlugin plugin) {
		this.plugin = plugin;
	}

	public IPlugin getPlugin() {
		return plugin;
	}

	public void info(String string) {
		getPlugin().getServer().getLogger().info("[" + getPlugin().getDescription().getName() + "] " + string);
	}

	public void fatal(String string) {
		getPlugin().getServer().getLogger().fatal("[" + getPlugin().getDescription().getName() + "] " + string);
	}

	public void warn(String string) {
		getPlugin().getServer().getLogger().warn("[" + getPlugin().getDescription().getName() + "] " + string);
	}

	public void error(String string) {
		getPlugin().getServer().getLogger().error("[" + getPlugin().getDescription().getName() + "] " + string);
	}

	public void error(String string, Exception ex) {
		getPlugin().getServer().getLogger().error("[" + getPlugin().getDescription().getName() + "] " + string, ex);
	}

}
