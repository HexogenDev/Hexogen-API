package net.hexogendev.api.inventory.item.meta;

import java.util.List;

public interface ItemMeta {

	public String getDisplayName();

	public void setDisplayName(String name);

	public void clearDisplayName();

	public List<String> getLore();

	public void setLore(List<String> lore);

	public boolean isUnbreakable();

	public void setUnbreakable(boolean flag);

	public List<HideFlag> getHideFlags();

	public void addHideFlag(HideFlag flag);

	// Enchant..

	// Attributes...

	// Potions...

}
