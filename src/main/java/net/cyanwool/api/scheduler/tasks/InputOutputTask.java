package net.cyanwool.api.scheduler.tasks;

import java.util.concurrent.CopyOnWriteArrayList;

import net.cyanwool.api.Server;
import net.cyanwool.api.io.IORequest;

public class InputOutputTask implements Runnable {

	private CopyOnWriteArrayList<IORequest> requests;
	private Server server;
	private boolean running;

	public InputOutputTask(Server server) {
		this.server = server;
		this.requests = new CopyOnWriteArrayList<IORequest>();
		this.running = true;
	}

	public void shutdown() {
		this.running = false;
	}

	public void addRequest(IORequest request) {
		if (running) {
			this.requests.add(request);
		}
	}

	@Override
	public void run() {
		if (isRunning()) {
			while (!this.requests.isEmpty()) {
				IORequest request = requests.get(0);
				request.update();
				requests.remove(0);
			}
		}
	}

	public boolean isRunning() {
		return running;
	}

}
