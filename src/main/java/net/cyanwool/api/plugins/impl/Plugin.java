package net.cyanwool.api.plugins.impl;

import net.cyanwool.api.CyanWool;
import net.cyanwool.api.Server;
import net.cyanwool.api.plugins.IPlugin;
import net.cyanwool.api.plugins.IPluginDescription;
import net.cyanwool.api.plugins.PluginLogger;

public class Plugin implements IPlugin {

	private IPluginDescription description;
	private boolean enabled;
	private PluginLogger logger;

	@Override
	public void onEnable() {
	}

	@Override
	public void onLoad() {
	}

	@Override
	public void onDisable() {
	}

	@Override
	public Server getServer() {
		return CyanWool.getServer();
	}

	@Override
	public PluginLogger getLogger() {
		return logger;
	}

	@Override
	public IPluginDescription getDescription() {
		return description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		return result;
	}

	@Override
	public void init(IPluginDescription description) {
		this.description = description;
		this.logger = new PluginLogger(this);
	}

	@Override
	public boolean isEnabled() {
		return enabled;
	}

	@Override
	public void setEnabled(boolean flag) {
		if (flag) {
			if (!isEnabled()) {
				getLogger().info("Enabling " + getDescription().getName() + " " + getDescription().getVersion() + " by " + getDescription().getDevelopers());
				for (String sDepend : getDescription().getDependPlugins()) {
					IPlugin depend = getServer().getPluginManager().getPlugin(sDepend);
					if (depend == null) {
						getLogger().info("Revert load plugin: Invalid depend " + sDepend);
						return;
					}
					depend.setEnabled(true);
				}
				onEnable();
				this.enabled = flag;
			}
		} else {
			if (isEnabled()) {
				getLogger().info("Disabling " + getDescription().getName() + " " + getDescription().getVersion() + " by " + getDescription().getDevelopers());
				onDisable();
				this.enabled = flag;
			}
		}
	}

}
