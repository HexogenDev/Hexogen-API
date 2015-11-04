package net.hexogendev.hexogen.api.inventory.item.meta;

public interface FireworkExplosion {

	public boolean isFlicker();

	public void setFlicker(boolean flicker);

	public boolean isTrail();

	public void setTrail(boolean trail);

	public int getType();

	public void setType(FireworkType type);

	public void setType(int type);

	public int[] getColors();

	public void setColors(int[] colors);

}
