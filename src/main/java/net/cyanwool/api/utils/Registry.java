package net.cyanwool.api.utils;

import net.cyanwool.api.entity.EntityType;
import net.cyanwool.api.material.Material;
import net.cyanwool.api.plugins.IPlugin;

public interface Registry {

	// Material
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

	// Entity
	public boolean registerEntity(int id, String name, Class<?> entity);

	public boolean registerEntity(EntityType type, Class<?> entity);

	public Class<?> getEntity(int id);

	public Class<?> getEntity(EntityType type);

	public boolean unregisterEntity(int id);

	public boolean unregisterEntity(EntityType type);
}
