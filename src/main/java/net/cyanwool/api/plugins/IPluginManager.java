package net.cyanwool.api.plugins;

import java.util.Collection;

import net.cyanwool.api.Server;

public interface IPluginManager {
	
	public IPluginLoader getLoader();
	
	public String[] getListJars();
	
	public void loadPlugins();
	 
	public void loadPlugin(String JarFileName);
	
	public void unloadPlugins();
	
	public void unloadPlugin(String name);
	
	public IPlugin getPlugin(String name);
	
	public void enablePlugins();

	public void disablePlugins();
	
	public Collection<IPlugin> getPlugins();
	
	public boolean isPluginLoaded(String name);
	
	public Server getServer();
}