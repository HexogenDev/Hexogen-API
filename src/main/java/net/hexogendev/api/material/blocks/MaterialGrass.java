package net.hexogendev.api.material.blocks;

import net.hexogendev.api.world.sounds.GeneralSounds;

public class MaterialGrass extends TexturedMaterial {

	public MaterialGrass(String StringId, int Id, int metadata, int customData) {
		super(StringId, Id, metadata, customData);
		setSolid(true);
		setBreakSound(GeneralSounds.DIG_GRASS);
		setPlaceSound(GeneralSounds.DIG_GRASS);
		setStepSound(GeneralSounds.STEP_GRASS);
	}
}
