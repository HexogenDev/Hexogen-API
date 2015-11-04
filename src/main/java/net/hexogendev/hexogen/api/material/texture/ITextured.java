package net.hexogendev.hexogen.api.material.texture;

import net.hexogendev.hexogen.api.material.Material;

public interface ITextured {

	public Material setTextureIndex(int index);

	public int getTextureIndex();

	public Material setTexture(IMaterialTextures textures);
}
