package net.cyanwool.api.entity.alive;

import net.cyanwool.api.entity.EntityType;

public enum LivingEntityType implements EntityType {

	// Based: http://minecraft.gamepedia.com/Data_values/Entity_IDs

	// Hostile mobs
	CREEPER(50, "Creeper"), SKELETON(51, "Skeleton"), SPIDER(52, "Spider"), GIANT(53, "Giant"), ZOMBIE(54, "Zombie"), SLIME(55, "Slime"), GHAST(56, "Ghast"), ZOMBIE_PIGMAN(57, "Pigman"), ENDERMAN(58, "Enderman"), CAVE_SPIDER(59, "CaveSpider"), SILVERFISH(60, "Silverfish"), BLAZE(61, "Blaze"), MAGMA_CUBE(62, "MagmaCube"), ENDER_DRAGON(63, "EnderDragon"), WITHER(64, "Wither"), WITCH(66, "Witch"), ENDERMITE(67, "Endermite"), GUARDIAN(68, "Guardian"), KILLER_RABBIT(101, "KillerRabbit"),

	// Passive mobs
	BAT(65, "Bat"), PIG(90, "Pig"), SHEEP(91, "Sheep"), COW(92, "Cow"), CHICKEN(93, "Chicken"), SQUID(94, "Squid"), WOLF(95, "Wolf"), MOOSHROOM(96, "Mooshroom"), SNOW_GOLEM(97, "SnowGolem"), OCELOT(98, "Ocelot"), IRON_GOLEM(99, "IronGolem"), HORSE(100, "Horse"), RABBIT(101, "Rabbit");

	private int id;
	private String name;

	private LivingEntityType(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

}
