package net.cyanwool.api.utils.chatReplacer.defaultPack;

import net.cyanwool.api.command.ICommandSender;
import net.cyanwool.api.utils.chatReplacer.Replacer;

public class SenderNameReplacer implements Replacer {

	@Override
	public String getDetectWord() {
		return "%SENDER_NAME%";
	}

	@Override
	public String getReplaceWord(String message, ICommandSender user) {
		return user.getName();
	}

}
