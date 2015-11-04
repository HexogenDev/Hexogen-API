package net.hexogendev.api.material.blocks;

import net.hexogendev.api.block.Block;
import net.hexogendev.api.entity.EntityLivingBase;
import net.hexogendev.api.entity.alive.player.Player;
import net.hexogendev.api.inventory.item.ItemStack;
import net.hexogendev.api.material.items.ItemMaterial;
import net.hexogendev.api.world.Position;
import net.hexogendev.api.world.World;
import net.hexogendev.api.world.sounds.Sound;

public class BlockMaterial extends ItemMaterial {

	private int lightValue;
	private Sound stepSound;
	private Sound placeSound;
	private Sound breakSound;
	protected boolean solid;

	public BlockMaterial(String StringId, int Id, int metadata, int customData) {
		super(StringId, Id, metadata, customData);
	}

	public boolean onBlockPlaced(Player player, Position pos) {
		return true;
	}

	public boolean onBlockDestroy(Player player, Block block) {
		return true;
	}

	public boolean onBlockInteract(Player player, Block block, ItemStack item) {
		return true;
	}

	public boolean onBlockDig(Player player, Block block, ItemStack item) {
		return true;
	}

	public void onEntityWalk(EntityLivingBase baseEntity, Block block) {
	}

	public int getLightValue() {
		return lightValue;
	}

	public BlockMaterial setLightValue(int value) {
		this.lightValue = value;
		return this;
	}

	public Sound getStepSound() {
		return stepSound;
	}

	public BlockMaterial setStepSound(Sound stepSound) {
		this.stepSound = stepSound;
		return this;
	}

	public Sound getPlaceSound() {
		return placeSound;
	}

	public BlockMaterial setPlaceSound(Sound placeSound) {
		this.placeSound = placeSound;
		return this;
	}

	public Sound getBreakSound() {
		return breakSound;
	}

	public BlockMaterial setBreakSound(Sound breakSound) {
		this.breakSound = breakSound;
		return this;
	}

	public boolean canPlaceBlockAt(World worldIn, Position pos) {
		return true;
	}

	public boolean isSolid() {
		return solid;
	}

	protected void setSolid(boolean flag) {
		this.solid = flag;
	}
}
