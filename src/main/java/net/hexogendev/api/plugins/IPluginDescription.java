package net.hexogendev.api.plugins;

import java.util.List;

public interface IPluginDescription {

	public String getName();

	public List<String> getDevelopers();

	public String getVersion();

	public String getDescription();

	public List<String> getDependPlugins();

	public String getMain();

}
