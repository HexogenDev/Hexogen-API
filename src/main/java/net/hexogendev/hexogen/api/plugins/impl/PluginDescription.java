package net.hexogendev.hexogen.api.plugins.impl;

import java.util.List;

import net.hexogendev.hexogen.api.plugins.IPluginDescription;

public class PluginDescription implements IPluginDescription {

	private String name;
	private List<String> developers;
	private String version;
	private String description;
	private List<String> depends;
	private String main;
	private int minimumAPI;

	public PluginDescription(String name, String main, List<String> developers, String version, String description, int minimumAPI, List<String> depends) {
		this.name = name;
		this.developers = developers;
		this.version = version;
		this.description = description;
		this.minimumAPI = minimumAPI;
		this.depends = depends;
		this.main = main;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public List<String> getDevelopers() {
		return developers;
	}

	@Override
	public String getVersion() {
		return version;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getMain() {
		return main;
	}

	@Override
	public List<String> getDependPlugins() {
		return depends;
	}

	@Override
	public int getMinimumAPIVersion() {
		return minimumAPI;
	}
}
