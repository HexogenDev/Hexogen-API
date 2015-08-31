package net.cyanwool.api.utils;

import net.cyanwool.api.material.Material;
import net.cyanwool.api.plugins.IPlugin;

public interface Registry {

	public boolean registerMaterial(String prefix, Material mat);

	public boolean registerMaterial(IPlugin plugin, Material mat);

	public Material getMaterialFromId(String prefix, int id);

	public Material getMaterialFromId(String prefix, int id, int metadata);

	public Material getMaterialFromId(String prefix, int id, int metadata, int customData);

	public Material getMaterialFromId(String prefix, String id);

	public Material getMaterialFromId(String prefix, String id, int metadata);

	public Material getMaterialFromId(String prefix, String id, int metadata, int customData);

	// public boolean unregisterMaterial(String prefix, String id);

	// public boolean unregisterMaterial(String prefix, int id);
}
