package net.cyanwool.api.material.texture;

import net.cyanwool.api.material.Material;

public interface ITextured {

	public Material setTextureIndex(int index);

	public int getTextureIndex();

	public Material setTexture(IMaterialTextures textures);
}
