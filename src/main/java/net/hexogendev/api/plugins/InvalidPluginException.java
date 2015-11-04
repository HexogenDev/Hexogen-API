package net.hexogendev.api.plugins;

public class InvalidPluginException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidPluginException() {
		super();
	}

	public InvalidPluginException(String message) {
		super(message);
	}

	public InvalidPluginException(String message, Throwable cause) {
		super(message, cause);
	}

	public InvalidPluginException(Throwable cause) {
		super(cause);
	}
}
