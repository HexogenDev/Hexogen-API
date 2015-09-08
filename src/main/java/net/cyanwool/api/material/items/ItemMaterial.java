package net.cyanwool.api.material.items;

import net.cyanwool.api.block.Block;
import net.cyanwool.api.entity.EntityLivingBase;
import net.cyanwool.api.entity.alive.player.Player;
import net.cyanwool.api.inventory.item.ItemStack;
import net.cyanwool.api.material.Material;
import net.cyanwool.api.utils.BlockSide;
import net.cyanwool.api.world.Position;
import net.cyanwool.api.world.World;

public class ItemMaterial extends Material {

	private int maxStackSize;
	private int maxAttackDamage;

	public ItemMaterial(Material material) {
		super(material);
	}

	public ItemMaterial(String StringId, int Id) {
		super(StringId, Id, 0);
	}

	public ItemMaterial(String StringId, int Id, int metadata) {
		super(StringId, Id, metadata, 0);
	}

	public ItemMaterial(String StringId, int Id, int metadata, int customData) {
		super(StringId, Id, metadata, customData);
	}

	public void setMaxStackSize(int max) {
		maxStackSize = max;
	}

	public int getMaxStackSize() {
		return maxStackSize;
	}

	public int getMaxAttackDamage() {
		return maxAttackDamage;
	}

	public void setMaxAttackDamage(int max) {
		maxAttackDamage = max;
	}

	public boolean onItemUse(ItemStack stack, Player player, World world, Position pos, BlockSide side) {
		return true;
	}

	public boolean onItemRightClick(ItemStack itemStackIn, World worldIn, Player playerIn) {
		return true;
	}

	public boolean onItemLeftClick(ItemStack itemStackIn, World worldIn, Player playerIn) {
		return true;
	}

	public boolean onItemUseFinish(ItemStack stack, World worldIn, Player playerIn) {
		return true;
	}

	public boolean onHitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		return true;
	}

	public boolean onBlockDestroyed(ItemStack stack, World worldIn, Block blockIn, Position pos, Player playerIn) {
		return true;
	}

	public void onCreatedItem(ItemStack stack, World worldIn, Player playerIn) {
	}

	public void onPlayerStoppedUsing(ItemStack stack, World worldIn, Player playerIn, int timeLeft) {
	}
}
