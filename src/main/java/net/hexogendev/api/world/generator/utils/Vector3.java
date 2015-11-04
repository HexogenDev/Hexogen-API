package net.hexogendev.api.world.generator.utils;

public class Vector3 {
	public long X;
	public long Y;
	public long Z;

	public Vector3(long x, long y, long z) {
		X = x;
		Y = y;
		Z = z;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vector3) {
			Vector3 compairing = (Vector3) obj;
			if (compairing.X == X && compairing.Y == Y && compairing.Z == Z) {
				return true;
			}
		}
		return false;
	}
}
