package net.cyanwool.api.utils;

public class Rotation {
	
	private float yaw;
	private float pitch;
	private float roll; //???
	
	public Rotation(float yaw, float pitch, float roll){
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
	}

	public float getPitch() {
		return pitch;
	}

	public void setPitch(float pitch) {
		this.pitch = pitch;
	}

	public float getRoll() {
		return roll;
	}

	public void setRoll(float roll) {
		this.roll = roll;
	}
	
}