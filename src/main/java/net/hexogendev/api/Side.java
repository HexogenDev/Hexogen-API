package net.hexogendev.api;

public enum Side {

	CLIENT, SERVER;

	public boolean isServer() {
		return !isClient();
	}

	public boolean isClient() {
		return this == CLIENT;
	}
}
