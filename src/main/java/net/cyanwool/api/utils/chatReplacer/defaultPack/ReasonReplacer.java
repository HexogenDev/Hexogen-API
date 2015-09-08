package net.cyanwool.api.utils.chatReplacer.defaultPack;

import net.cyanwool.api.command.ICommandSender;
import net.cyanwool.api.utils.chatReplacer.Replacer;

public class ReasonReplacer implements Replacer {

	@Override
	public String getDetectWord() {
		return "%REASON%";
	}

	@Override
	public String getReplaceWord(String format, String message, ICommandSender user) {
		return message;
	}

}
