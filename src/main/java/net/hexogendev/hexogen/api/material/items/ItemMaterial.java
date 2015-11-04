package net.hexogendev.hexogen.api.material.items;

import net.hexogendev.hexogen.api.block.Block;
import net.hexogendev.hexogen.api.entity.EntityLivingBase;
import net.hexogendev.hexogen.api.entity.alive.player.Player;
import net.hexogendev.hexogen.api.inventory.item.ItemStack;
import net.hexogendev.hexogen.api.material.Material;
import net.hexogendev.hexogen.api.utils.BlockSide;
import net.hexogendev.hexogen.api.world.Position;
import net.hexogendev.hexogen.api.world.World;

public class ItemMaterial extends Material {

	private int maxStackSize;
	private int maxAttackDamage;

	public ItemMaterial(String StringId, int Id, int metadata, int customData) {
		super(StringId, Id, metadata, customData);
	}

	public ItemMaterial setMaxStackSize(int max) {
		maxStackSize = max;
		return this;
	}

	public int getMaxStackSize() {
		return maxStackSize;
	}

	public int getMaxAttackDamage() {
		return maxAttackDamage;
	}

	public ItemMaterial setMaxAttackDamage(int max) {
		maxAttackDamage = max;
		return this;
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
