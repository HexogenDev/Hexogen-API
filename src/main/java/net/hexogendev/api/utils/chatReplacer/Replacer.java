package net.hexogendev.api.utils.chatReplacer;

import net.hexogendev.api.command.ICommandSender;

public interface Replacer {

	public String getDetectWord();

	public String getReplaceWord(String message, ICommandSender sender); // /???

}
