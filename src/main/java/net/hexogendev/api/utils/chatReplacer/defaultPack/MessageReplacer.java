package net.hexogendev.api.utils.chatReplacer.defaultPack;

import net.hexogendev.api.command.ICommandSender;
import net.hexogendev.api.utils.chatReplacer.Replacer;

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
