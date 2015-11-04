package net.hexogendev.hexogen.api.utils.chatReplacer.defaultPack;

import net.hexogendev.hexogen.api.command.ICommandSender;
import net.hexogendev.hexogen.api.utils.chatReplacer.Replacer;

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
