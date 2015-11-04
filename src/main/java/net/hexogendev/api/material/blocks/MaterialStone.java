package net.hexogendev.api.material.blocks;

import net.hexogendev.api.world.sounds.GeneralSounds;

public class MaterialStone extends TexturedMaterial {

	public MaterialStone(String StringId, int Id, int metadata, int customData) {
		super(StringId, Id, metadata, customData);
		setSolid(true);
		setBreakSound(GeneralSounds.DIG_STONE);
		setPlaceSound(GeneralSounds.DIG_STONE);
		setStepSound(GeneralSounds.STEP_STONE);
	}
}
