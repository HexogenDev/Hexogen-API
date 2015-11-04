package net.hexogendev.hexogen.api.plugins;

import net.hexogendev.hexogen.api.Server;

public interface IPlugin {

	public IPluginDescription getDescription();

	public void init(IPluginDescription description);

	public void onEnable();

	public void onLoad();

	public void onDisable();

	public Server getServer();

	public boolean isEnabled();

	public void setEnabled(boolean flag);

	public PluginLogger getLogger();
}
