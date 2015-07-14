package net.cyanwool.api.world.sounds;

public enum MusicSounds implements Sound {

	// Records
	RECORD_11("records.11"), RECORD_13("records.13"), RECORD_BLOCKS("records.blocks"), RECORD_CAT("records.cat"), RECORD_CHIRP("records.chirp"), RECORD_FAR("records.far"), RECORD_MALL("records.mall"), RECORD_MELLOHI("records.mellohi"), RECORD_STAL("records.stal"), RECORD_STRAD("records.strad"), RECORD_WAIT("records.wait"), RECORD_WARD("records.ward"),

	// Musics
	MUSIC_MENU("music.menu"), MUSIC_GAME("music.game"), MUSIC_CREATIVE("music.game.creative"), MUSIC_GAME_END("music.game.end"), MUSIC_GAME_END_DRAGON("music.game.end.dragon"), MUSIC_GAME_END_CREDITS("music.game.end.credits"), MUSIC_GAME_NETHER("music.game.nether");

	private String name;

	MusicSounds(String name) {
		this.name = name;
	}

	@Override
	public String getString() {
		return name;
	}
}
