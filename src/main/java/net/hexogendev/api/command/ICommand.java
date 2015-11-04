package net.hexogendev.api.command;

import java.util.List;

public interface ICommand {

	public void execute(ICommandSender sender, String[] args);

	public String getName();

	public String getDescription();

	public List<String> getAliases();
}
