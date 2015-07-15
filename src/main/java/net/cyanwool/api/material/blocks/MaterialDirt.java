package net.cyanwool.api.material.blocks;

import net.cyanwool.api.material.Material;
import net.cyanwool.api.world.sounds.GeneralSounds;

public class MaterialDirt extends TexturedMaterial {

	public MaterialDirt(String StringId, int Id, int metadata, int customData) {
		super(StringId, Id, metadata, customData);
		setBreakSound(GeneralSounds.DIG_GRASS);
		setPlaceSound(GeneralSounds.DIG_GRASS);
		setStepSound(GeneralSounds.STEP_GRASS);
	}

	public MaterialDirt() {
		this("dirt", 2, 0, 0);
	}

	public MaterialDirt(int metadata) {
		this("dirt", 2, metadata, 0);
	}

	public MaterialDirt(int metadata, int customData) {
		this("dirt", 2, metadata, customData);
	}

	public MaterialDirt(Material material) {
		this(material.getStringId(), material.getId(), material.getMinecraftData(), material.getCustomData());
	}
}
