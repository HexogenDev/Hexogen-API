package net.hexogendev.api.utils;

public class Rotation {

	private float yaw;
	private float pitch;
	private float roll; // ???
	private boolean rotated;

	public Rotation(float yaw, float pitch, float roll) {
		this.setYaw(yaw);
		this.setPitch(pitch);
		this.setRoll(roll);
	}

	public Rotation(float yaw, float pitch) {
		this(yaw, pitch, 0);
	}

	public float getYaw() {
		return yaw;
	}

	public void setYaw(float yaw) {
		this.yaw = yaw;
		update();
	}

	public float getPitch() {
		return pitch;
	}

	public void setPitch(float pitch) {
		this.pitch = pitch;
		update();
	}

	public float getRoll() {
		return roll;
	}

	public void setRoll(float roll) {
		this.roll = roll;
		update();
	}

	public boolean isRotated() {
		return rotated;
	}

	public void update() {
		if (!rotated) {
			rotated = true;
			return;
		}
		rotated = false;
	}

	public BlockSide getDirection() {
		double rot = getYaw() % 360;
		if (rot < 0) {
			rot += 360.0;
		}
		if (0 <= rot && rot < 45) {
			return BlockSide.south;
		} else if (45 <= rot && rot < 135) {
			return BlockSide.west;
		} else if (135 <= rot && rot < 225) {
			return BlockSide.north;
		} else if (225 <= rot && rot < 315) {
			return BlockSide.east;
		} else if (315 <= rot && rot < 360.0) {
			return BlockSide.south;
		} else {
			return BlockSide.east;
		}
	}

	public BlockSide getFacing() {
		return BlockSide.fromDirection((int) Math.floor(((getYaw() + 360.0F - 45.0F + 180.0F)) / 90.0) & 3);
	}
}
