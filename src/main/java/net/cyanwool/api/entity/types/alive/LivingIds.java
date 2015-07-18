package net.cyanwool.api.entity.types.alive;

public enum LivingIds {

	// Based: http://minecraft.gamepedia.com/Data_values/Entity_IDs

	// Hostile mobs
	CREEPER(50), SKELETON(51), SPIDER(52), GIANT(53), ZOMBIE(54), SLIME(55), GHAST(56), ZOMBIE_PIGMAN(57), ENDERMAN(58), CAVE_SPIDER(59), SILVERFISH(60), BLAZE(61), MAGMA_CUBE(62), ENDER_DRAGON(63), WITHER(64), WITCH(66), ENDERMITE(67), GUARDIAN(68), KILLER_RABBIT(101),

	// Passive mobs
	BAT(65), PIG(90), SHEEP(91), COW(92), CHICKEN(93), SQUID(94), WOLF(95), MOOSHROOM(96), SNOW_GOLEM(97), OCELOT(98), IRON_GOLEM(99), HORSE(100), RABBIT(101);

	private int id;

	private LivingIds(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

}
