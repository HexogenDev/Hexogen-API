package net.cyanwool.api.utils.chatReplacer;

import net.cyanwool.api.command.ICommandSender;

public interface Replacer {

	public String getDetectWord();

	public String getReplaceWord(String message, ICommandSender sender); // /???

}
