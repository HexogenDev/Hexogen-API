package net.cyanwool.api.world.effect;

public enum ParticleEffect implements Effect {

	SMOKE(2000), BREAK_BLOCK(2001), BREAK_SPLASH_POTION(2002), BREAK_EYE_OF_ENDER(2003), MOB_SPAWN(2004), BONEMEAL_GROW(2005);
	// HARD_LANDING_DUST(2006);

	private int id;

	ParticleEffect(int id) {
		this.id = id;
	}

	@Override
	public int getID() {
		return id;
	}

}
