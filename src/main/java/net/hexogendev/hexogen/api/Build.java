package net.hexogendev.hexogen.api;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Build {

	public static final int CURRENT_VERSION = VERSION_CODES.AIR;

	private static final List<String> map;

	static {
		map = new CopyOnWriteArrayList<String>();
		map.add(VERSION_CODES.UNKNOWN, "Unknown");
		map.add(VERSION_CODES.AIR, "Air");
		map.add(VERSION_CODES.DIRT, "Dirt");
	}

	public static class VERSION_CODES {
		public static int UNKNOWN = 0;
		public static int AIR = 1;
		public static int DIRT = 2;
	}

	public static String getNameForInt(int id) {
		final String name = map.get(id);
		if (name == null) {
			return map.get(0);
		}
		return name;
	}
}
