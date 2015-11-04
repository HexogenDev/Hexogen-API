package net.hexogendev.hexogen.api.material.texture;

public interface IMaterialTextures {

	public String getStringId();

	public int getIndex();

	public IMaterialTextures getTextureFromId(int id);

	public IMaterialTextures getTextureFromId(String id);
}
