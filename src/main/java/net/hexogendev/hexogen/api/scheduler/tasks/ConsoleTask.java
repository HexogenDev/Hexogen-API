package net.hexogendev.hexogen.api.scheduler.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import net.hexogendev.hexogen.api.Server;

public class ConsoleTask implements Runnable {

	private Server server;

	public ConsoleTask(Server server) {
		this.server = server;
	}

	@Override
	public void run() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));// Console...
		// Maybe...
		try {
			String line = reader.readLine();
			server.getCommandManager().dispatchCommand(server.getConsoleCommandSender(), line);
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
