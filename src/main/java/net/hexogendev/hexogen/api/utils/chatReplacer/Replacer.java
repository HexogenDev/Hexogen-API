package net.hexogendev.hexogen.api.utils.chatReplacer;

import net.hexogendev.hexogen.api.command.ICommandSender;

public interface Replacer {

	public String getDetectWord();

	public String getReplaceWord(String message, ICommandSender sender); // /???

}
