package net.hexogendev.hexogen.api.material.blocks;

import net.hexogendev.hexogen.api.world.sounds.GeneralSounds;

public class MaterialDirt extends TexturedMaterial {

	public MaterialDirt(String StringId, int Id, int metadata, int customData) {
		super(StringId, Id, metadata, customData);
		setSolid(true);
		setBreakSound(GeneralSounds.DIG_GRASS);
		setPlaceSound(GeneralSounds.DIG_GRASS);
		setStepSound(GeneralSounds.STEP_GRASS);
	}
}
