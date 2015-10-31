package net.hexodev.hexostone.api;

public class Hexostone {
	
	private static IServer server;

	public static void initServer(IServer init) {
		if (getServer() != null) {
			server.getLogger().warn("Cannot redefine singleton Server");
			return;
		}
		server = init;
		getServer().getLogger().info("############################################");
		getServer().getLogger().info("|   |                   |                  ");
		getServer().getLogger().info("|---|,---..  ,,---.,---.|--- ,---.,---.,---.");
		getServer().getLogger().info("|   ||---' >< |   |`---.|    |   ||   ||---'");
		getServer().getLogger().info("`   '`---''  ``---'`---'`---'`---'`   '`---'");
		getServer().getLogger().info("############################################");
		
		getServer().getLogger().info("Starting minecraft server " + getServer().getModName() + " (Minecraft Version: " + getServer().getMCVersion() + ")");
		getServer().start();
	}

	public static IServer getServer() {
		return server;
	}

	public static String getModName() {
		return getServer().getModName();
	}

	public static String getMCVersion() {
		return getServer().getMCVersion();
	}

	public static String getImplementationType() {
		return getServer().getImplementationType();
	}
	
}