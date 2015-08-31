package net.cyanwool.api.plugins.impl;

import java.util.List;

import net.cyanwool.api.plugins.IPluginDescription;

public class PluginDescription implements IPluginDescription{

	private String name;
	private List<String> developers;
	private String version;
	private String description;
	private List<String> depends;
	private String main;
	
	public PluginDescription(String name, String main, List<String> developers, String version, String description, List<String> depends) {
		this.name = name;
		this.developers = developers;
		this.version = version;
		this.description = description;
		this.depends = depends;
		this.main = main;
	}
	
	public String getName() {
		return name;
	}

	public List<String> getDevelopers() {
		return developers;
	}

	public String getVersion() {
		return version;
	}

	public String getDescription() {
		return description;
	}

	public String getMain() {
		return main;
	}

	@Override
	public List<String> getDependPlugins() {
		return depends;
	}
}