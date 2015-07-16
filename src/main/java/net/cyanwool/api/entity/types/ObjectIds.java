package net.cyanwool.api.entity.types;

public enum ObjectIds {

	// Based: http://minecraft.gamepedia.com/Data_values/Entity_IDs

	// Drops
	DROPPED_ITEM(1), EXPERIENCE_ORB(2),
	// Immobile
	LEAD_KNOT(8), PAINTING(9), ITEM_FRAME(18), ARMOR_STAND(30), ENDER_CRYSTAL(200),

	// Projectiles
	THROWN_EGG(7), SHORT_ARROW(10), THROWN_SNOWBALL(11), GHAST_FIREBALL(12), BLAZE_FIREBALL(13), THROWN_ENDER_PEARL(14), THROWN_EYE_OF_ENDER(15), THROWN_SPLASH_POTION(16), THROWN_BOTTLE_O_ENCHANTING(17), WITHER_SKULL(19), FIREWORK_ROCKET(22),

	// Blocks
	PRIMED_TNT(20), FALLING_BLOCK(21),

	// Vehicles
	MINECART_WITH_COMMAND_BLOCK(40), BOAT(41), MINECART(42), MINECART_WITH_CHEST(43), MINECART_WITH_FURNACE(44), MINECART_WITH_TNT(45), MINECART_WITH_HOPPER(46), MINECART_WITH_SPAWNER(47);

	// Generic - not used
	// MOB(48),
	// MONSTER(49),

	private int id;

	private ObjectIds(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
