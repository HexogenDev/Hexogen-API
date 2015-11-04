package net.hexogendev.hexogen.api.world.generator.utils;

public class Vector2 {
	public long X;
	public long Y;

	public Vector2(long x, long y) {
		X = x;
		Y = y;

	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Vector2) {
			Vector2 compairing = (Vector2) obj;
			if (compairing.X == X && compairing.Y == Y) {
				return true;
			}
		}
		return false;
	}
}
