package net.hexogendev.hexogen.api.plugins.impl;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import net.hexogendev.hexogen.api.Server;
import net.hexogendev.hexogen.api.plugins.IPlugin;
import net.hexogendev.hexogen.api.plugins.IPluginDescription;
import net.hexogendev.hexogen.api.plugins.IPluginLoader;
import net.hexogendev.hexogen.api.plugins.IPluginManager;
import net.hexogendev.hexogen.api.plugins.InvalidPluginException;

public class PluginManager implements IPluginManager {
	private File moduleFolder;
	private IPluginLoader loader;
	private List<IPlugin> plugins = new LinkedList<IPlugin>();
	private Server server;

	public PluginManager(Server server, String moduleFolder) throws IOException {
		this.server = server;
		this.moduleFolder = new File(moduleFolder);

		if (!this.moduleFolder.exists()) {
			if (!this.moduleFolder.mkdirs()) {
				throw new IOException("Unable to create folder: \"" + this.moduleFolder.getAbsolutePath() + "\"");
			}
		}

		if (this.moduleFolder.isFile()) {
			throw new IOException("Path \"" + this.moduleFolder.getAbsolutePath() + "\" does not be file");
		}

		loader = new PluginLoader(this.getClass().getClassLoader());
	}

	@Override
	public String[] getListJars() {
		return moduleFolder.list(new FilenameFilter() {
			@Override
			public boolean accept(File file, String s) {
				return s.toLowerCase().endsWith(".jar");
			}
		});
	}

	@Override
	public void loadPlugins() {
		String[] jarList = getListJars();

		getServer().getLogger().info("Loading " + jarList.length + " plugins...");
		for (String jarFile : jarList) {
			loadPlugin(jarFile);
		}
	}

	@Override
	public IPlugin getPlugin(String name) {
		for (IPlugin module : plugins) {
			if (module.getDescription().getName().equals(name)) {
				return module;
			}
		}
		return null;
	}

	@Override
	public IPluginLoader getLoader() {
		return loader;
	}

	@Override
	public void loadPlugin(String JarFileName) {
		try {
			IPluginDescription pluginInfo = loader.loadPlugin(moduleFolder.getPath() + File.separator + JarFileName);
			IPlugin plugin = (IPlugin) loader.loadClass(pluginInfo.getMain()).newInstance();
			plugin.init(pluginInfo);
			plugin.onLoad();
			plugins.add(plugin);
			getServer().getLogger().info("Loaded " + pluginInfo.getName() + " " + pluginInfo.getVersion() + " by " + pluginInfo.getDevelopers());
		} catch (InvalidPluginException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			System.err.printf("Error load plugin \"%s\"", moduleFolder.getPath() + File.separator + JarFileName);
			e.printStackTrace();
		}
	}

	@Override
	public void unloadPlugins() {
		disablePlugins();
		plugins.clear();
	}

	@Override
	public void unloadPlugin(String name) {
		IPlugin plugin = getPlugin(name);
		plugin.setEnabled(false);
		plugins.remove(plugin);
	}

	@Override
	public void enablePlugins() {
		for (IPlugin plugin : getPlugins()) {
			if (!plugin.isEnabled()) {
				plugin.setEnabled(true);
			}
		}
	}

	@Override
	public void disablePlugins() {
		for (IPlugin plugin : getPlugins()) {
			if (plugin.isEnabled()) {
				plugin.setEnabled(false);
			}
		}
	}

	@Override
	public Collection<IPlugin> getPlugins() {
		return plugins;
	}

	@Override
	public boolean isPluginLoaded(String name) {
		IPlugin plugin = getPlugin(name);
		return plugin != null;
	}

	@Override
	public Server getServer() {
		return server;
	}
}
