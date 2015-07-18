package net.cyanwool.api.entity.types.object;

import net.cyanwool.api.entity.BaseEntity;
import net.cyanwool.api.inventory.item.ItemStack;

public interface Item extends Object {

	public ItemStack getItemStack(BaseEntity baseEntity);

	public void setItemStack(BaseEntity baseEntity, ItemStack item);

}
