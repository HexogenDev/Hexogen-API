package net.hexogendev.hexogen.api.utils;

import java.awt.image.BufferedImage;

public interface ServerConfiguration {

	public void loadFromFile();

	public String getIPAddress();

	public int getPort();

	public boolean isOnlineMode();

	public void setOnlineMode(boolean online_mode);

	public int getMaxPlayers();

	public void setMaxPlayers(int maxplayers);

	public String getMotd();

	public void setMotd(String motd);

	public int getViewDistance();

	public void setViewDistance(int view);

	public int getCountThreads();

	public void setCountThreads(int count);

	public boolean isDeveloperMode();

	public void setDeveloperMode(boolean flag);

	public Object getValue(String key);

	public void setValue(String key, Object value);

	public BufferedImage getIcon();

	public int getServerCompressionThreshold();

	public void setServerCompressionThreshold(int compress);
}
