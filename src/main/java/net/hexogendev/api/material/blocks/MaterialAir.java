package net.hexogendev.api.material.blocks;

import net.hexogendev.api.world.sounds.GeneralSounds;

public class MaterialAir extends TexturedMaterial {

	public MaterialAir() {
		super("air", 0, 0, 0);
		setSolid(false);
		setBreakSound(GeneralSounds.DIG_GRASS);
		setPlaceSound(GeneralSounds.DIG_GRASS);
		setStepSound(GeneralSounds.STEP_GRASS);
	}
}
