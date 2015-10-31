package net.hexodev.hexostone.api;

import org.apache.logging.log4j.Logger;

public interface IServer {

	public String getModName();

	public String getMCVersion();

	public String getImplementationType();

	public void start();
	
	public Platform getPlatform();

	public Logger getLogger();
}