package net.hexogendev.hexogen.api.inventory.item.meta;

import java.util.List;

public interface FireworkMeta extends ItemMeta {

	public List<FireworkExplosion> getExplosions();

	public void addExplosion(FireworkExplosion explosion);

	public boolean hasExplosions();

	public void clearExplosion();

	public int getFlight();

	public void setFlight(int flight);
}
