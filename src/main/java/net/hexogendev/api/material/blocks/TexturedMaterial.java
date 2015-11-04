package net.hexogendev.api.material.blocks;

import net.hexogendev.api.material.Material;
import net.hexogendev.api.material.texture.IMaterialTextures;
import net.hexogendev.api.material.texture.ITextured;

public class TexturedMaterial extends BlockMaterial implements ITextured {

	public TexturedMaterial(String string, int id, int metadata, int customData) {
		super(string, id, metadata, customData);
	}

	@Override
	public Material setTextureIndex(int index) {
		return setMinecraftData(index);
	}

	@Override
	public int getTextureIndex() {
		return getMinecraftData();
	}

	@Override
	public Material setTexture(IMaterialTextures textures) {
		return setTextureIndex(textures.getIndex());
	}

}
