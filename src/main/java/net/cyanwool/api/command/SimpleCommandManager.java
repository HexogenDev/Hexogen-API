package net.cyanwool.api.command;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import net.cyanwool.api.Server;
import net.cyanwool.api.command.defaultcmd.InfoCommand;

public class SimpleCommandManager implements ICommandManager {

	private List<ICommand> commands;
	private Server server;

	public SimpleCommandManager(Server server) {
		this.server = server;
		this.commands = new CopyOnWriteArrayList<ICommand>();

		// reg command
		registerCommand(new InfoCommand());
	}

	@Override
	public boolean registerCommand(ICommand command) {
		for (String cmd : command.getAliases()) {
			if (availableCommand(cmd)) {
				return false;
			}
		}
		if (!command.getAliases().contains(command.getName())) {
			command.getAliases().add(command.getName());
		}
		commands.add(command);
		return true;
	}

	@Override
	public boolean unregisterCommand(String Command) {
		if (availableCommand(Command)) {
			commands.remove(getCommand(Command));
			return true;
		}
		return false;
	}

	@Override
	public void dispatchCommand(ICommandSender sender, String rawMessage) {
		String[] args = rawMessage.split(" ");
		String label = args[0];
		ICommand command = getCommand(label);
		if (command == null) {
			// String text = "Unknown command. Type /help for help.";
			String text = getServer().getLanguageManager().getLanguageFile(sender.getLangCode()).getValue("cw.unknownCommand");
			sender.sendMessage(text);
			return;
		}
		String[] rangedArgs = Arrays.copyOfRange(args, 1, args.length);
		command.execute(sender, rangedArgs);
	}

	private ICommand getCommand(String command) {
		for (ICommand cmd : commands) {
			if (cmd.getAliases().contains(command)) {
				return cmd;
			}
		}
		return null;
	}

	@Override
	public boolean availableCommand(String command) {
		for (ICommand cmd : commands) {
			if (cmd.getAliases().contains(command)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Server getServer() {
		return server;
	}

}
