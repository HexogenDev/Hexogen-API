package net.hexogendev.api.world.sounds;

public enum GeneralSounds implements Sound {

	// Based: http://www.minecraftforum.net/forums/mapping-and-modding/mapping-and-modding-tutorials/2213619-1-8-all-playsound-sound-arguments

	// Ambient
	AMBIENT_CAVE("ambient.cave.cave"), AMBIENT_WEATHER_RAIN("ambient.weather.rain"), AMBIENT_WEATHER_THUNDER("ambient.weather.thunder"),

	// Game
	GAME_PLAYER_HURT_FALL_BIG("game.player.hurt.fall.big"), GAME_PLAYER_HURT_FALL_SMALL("game.player.hurt.fall.small"), GAME_PLAYER_HURT("game.player.hurt"), GAME_PLAYER_DIE("game.player.die"), GAME_TNT_PRIMED("game.tnt.primed"),

	// Dig
	DIG_CLOTH("dig.cloth"), DIG_GLASS("dig.class"), DIG_GRASS("dig.grass"), DIG_GRAVEL("dig.gravel"), DIG_SAND("dig.sand"), DIG_SNOW("dig.snow"), DIG_STONE("dig.stone"), DIG_WOOD("dig.wood"),

	// Fire
	FIRE_FIRE("fire.fire"), FIRE_IGNITE("fire.ignite"),

	// Item
	ITEM_FIRE_CHARGE_USE("item.fireCharge.use"),

	// Fireworks
	FIREWORKS_BLAST("fireworks.blast"), FIREWORKS_BLAST_FAR("fireworks.blast_far"), FIREWORKS_LARGE_BLAST("fireworks.largeBlast"), FIREWORKS_LARGE_BLAST_FAR("fireworks.largeBlast_far"), FIREWORKS_LAUNCH("fireworks.launch"), FIREWORKS_TWINKLE("fireworks.twinkle"), FIREWORKS_TWINKLE_FAR("fireworks.twinkle_far"),

	// liquid
	LIQIUD_LAVA("liquid.lava"), LIQIUD_LAVAPOP("liquid.lavapop"), LIQUID_WATER("liquid.water"),

	// Minecart
	MINECART_BASE("minecart.base"), MINECART_INSIDE("minecart.inside"),

	// Note
	NOTE_BASS("note.bass"), NOTE_BASS_ATTACK("note.bassattack"),

	// Portal
	PORTAL_PORTAL("portal.portal"), PORTAL_TRAVEL("portal.travel"), PORTAL_TRIGGER("portal.trigger"),

	// Random
	RANDOM_ANVIL_BREAK("random.anvil_break"), RANDOM_ANVIL_LAND("random.anvil_land"), RANDOM_ANVIL_USE("random.anvil_use"), RANDOM_BOW("random.bow"), RANDOM_BOW_HIT("random.bowhit"), RANDOM_BREAK("random.break"), RANDOM_BURP("random.burp"), RANDOM_CHEST_CLOSED("random.chestclosed"), RANDOM_CHEST_OPEN("random.chestopen"), RANDOM_CLICK("random.click"), RANDOM_DOOR_OPEN("random.door_open"), RANDOM_DRINK("random.drink"), RANDOM_EAT("random.eat"), RANDOM_EXPLODE("random.explode"), RANDOM_FIZZ("random.fizz"), RANDOM_LEVEL_UP("random.levelup"), RANDOM_ORB("random.orb"), RANDOM_POP("random.pop"), RANDOM_SPLASH("random.splash"), RANDOM_SUCCESSFUL_HIT("random.successful_hit"), RANDOM_WOOD_CLICK("random.wood_click"),

	// GUI
	GUI_BUTTON_PRESS("gui.button.press"),

	// Step
	STEP_CLOTH("step.cloth"), STEP_GRASS("step.grass"), STEP_GRAVEL("step.gravel"), STEP_LADDER("step.ladder"), STEP_SAND("step.sand"), STEP_SNOW("step.snow"), STEP_STONE("step.stone"), STEP_WOOD("step.wood"),

	// Tile
	TILE_PISTON_IN("tile.piston.in"), TILE_PISTON_OUT("tile.piston.out");

	private String name;

	GeneralSounds(String name) {
		this.name = name;
	}

	@Override
	public String getString() {
		return name;
	}
}
