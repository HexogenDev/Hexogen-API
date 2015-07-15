package net.cyanwool.api.entity.alive;

public enum LivingEntityType {

	// Based: http://minecraft.gamepedia.com/Data_values/Entity_IDs

	// Hostile mobs
	CREEPER(50), SKELETON(51), SPIDER(52), GIANT(53), ZOMBIE(54), SLIME(55), GHAST(56), ZOMBIE_PIGMAN(57), ENDERMAN(58), CAVE_SPIDER(59), SILVERFISH(60), BLAZE(61), MAGMA_CUBE(62), ENDER_DRAGON(63), WITHER(64), WITCH(66), ENDERMITE(67), GUARDIAN(68), KILLER_RABBIT(101);

	private int id;

	private LivingEntityType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
