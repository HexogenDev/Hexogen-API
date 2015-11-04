package net.hexogendev.hexogen.api.utils.chatReplacer.defaultPack;

import net.hexogendev.hexogen.api.command.ICommandSender;
import net.hexogendev.hexogen.api.utils.chatReplacer.Replacer;

public class MessageReplacer implements Replacer {

	@Override
	public String getDetectWord() {
		return "%MESSAGE%";
	}

	@Override
	public String getReplaceWord(String message, ICommandSender user) {
		return message;
	}

}
