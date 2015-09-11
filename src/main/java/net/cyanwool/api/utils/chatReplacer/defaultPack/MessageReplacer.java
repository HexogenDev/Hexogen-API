package net.cyanwool.api.utils.chatReplacer.defaultPack;

import net.cyanwool.api.command.ICommandSender;
import net.cyanwool.api.utils.chatReplacer.Replacer;

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
