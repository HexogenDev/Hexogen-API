package net.hexogendev.hexogen.api.world.sounds;

public enum MobSounds implements Sound {

	// bat
	BAT_DEATH("mob.bat.death"), BAT_HURT("mob.bat.hurt"), BAT_IDLE("mob.bat.idle"), BAT_LOOP("mob.bat.loop"), BAT_TAKEOFF("mob.bat.takeoff"),

	// Blaze
	BLAZE_BREATHE("mob.blaze.breathe"), BLAZE_DEATH("mob.blaze.death"), BLAZE_HIT("mob.blaze.hit");

	// etc

	private String name;

	MobSounds(String name) {
		this.name = name;
	}

	@Override
	public String getString() {
		return name;
	}
}
