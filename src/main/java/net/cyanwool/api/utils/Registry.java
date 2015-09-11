package net.cyanwool.api.utils;

import net.cyanwool.api.entity.Entity;
import net.cyanwool.api.entity.EntityType;
import net.cyanwool.api.material.Material;
import net.cyanwool.api.plugins.IPlugin;
import net.cyanwool.api.world.Position;

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
	public boolean registerEntity(int id, String name, Class<? extends Entity> entity);

	public boolean registerEntity(EntityType type, Class<? extends Entity> entity);

	public Entity createEntity(int id, Position pos);

	public Entity createEntity(EntityType type, Position pos);

	public boolean unregisterEntity(int id, String name);

	public boolean unregisterEntity(EntityType type);
}
