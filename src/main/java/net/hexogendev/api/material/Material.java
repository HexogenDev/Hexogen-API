package net.hexogendev.api.material;

import net.hexogendev.api.Hexogen;
import net.hexogendev.api.material.blocks.BlockMaterial;
import net.hexogendev.api.material.blocks.MaterialAir;
import net.hexogendev.api.material.blocks.MaterialDirt;
import net.hexogendev.api.material.blocks.MaterialGrass;
import net.hexogendev.api.material.blocks.MaterialStone;
import net.hexogendev.api.material.items.ToolItemMaterial;

public class Material implements Cloneable {

	// Blocks
	public static BlockMaterial AIR = new MaterialAir();
	public static BlockMaterial STONE = new MaterialStone("stone", 1, 0, 0);
	public static BlockMaterial GRASS = new MaterialGrass("grass", 2, 0, 0);
	public static BlockMaterial DIRT = new MaterialDirt("dirt", 3, 0, 0);

	public static BlockMaterial CUSTOM_BLOCK_MATERIAL = (BlockMaterial) Hexogen.getRegistry().getMaterialFromId("minecraft", "testBlock");

	// Items
	public static ToolItemMaterial IRON_SHOVEL = (ToolItemMaterial) Hexogen.getRegistry().getMaterialFromId("minecraft", "iron_shovel");

	public static Material fromId(int id) {
		return Hexogen.getRegistry().getMaterialFromId("minecraft", id);
	}

	private String stringId;
	private int intId;
	private int minecraftData;
	private int customData;

	public Material(Material material) {
		this(material.getStringId(), material.getId());
	}

	public Material(String stringId, int Id) {
		this(stringId, Id, 0, 0);
	}

	public Material(String stringId, int Id, int metadata) {
		this(stringId, Id, metadata, 0);
	}

	public Material(String StringId, int Id, int metadata, int customData) {
		this.stringId = StringId;
		this.intId = Id;
		this.minecraftData = metadata;
		this.customData = customData;
	}

	public String getStringId() {
		return stringId;
	}

	public int getId() {
		return intId;
	}

	public int getMinecraftData() {
		return minecraftData;
	}

	public Material setMinecraftData(int metadata) {
		minecraftData = metadata;
		return this;
	}

	public int getCustomData() {
		return customData;
	}

	public Material setCustomData(int metadata) {
		customData = metadata;
		return this;
	}

	@Override
	public String toString() {
		return "Material [stringId=" + stringId + ", intId=" + intId + ", minecraftData=" + minecraftData + ", customData=" + customData + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + customData;
		result = prime * result + intId;
		result = prime * result + minecraftData;
		result = prime * result + ((stringId == null) ? 0 : stringId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Material)) {
			return false;
		}
		Material other = (Material) obj;
		if (customData != other.customData) {
			return false;
		}
		if (intId != other.intId) {
			return false;
		}
		if (minecraftData != other.minecraftData) {
			return false;
		}
		if (stringId == null) {
			if (other.stringId != null) {
				return false;
			}
		} else if (!stringId.equals(other.stringId)) {
			return false;
		}
		return true;
	}

	@Override
	public Material clone() {
		try {
			return (Material) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new Error(e);
		}
	}
}
