package net.hexogendev.api.material.texture;

import net.hexogendev.api.material.Material;

public interface ITextured {

	public Material setTextureIndex(int index);

	public int getTextureIndex();

	public Material setTexture(IMaterialTextures textures);
}
