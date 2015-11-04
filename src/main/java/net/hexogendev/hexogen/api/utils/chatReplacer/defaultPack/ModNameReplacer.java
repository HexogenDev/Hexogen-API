package net.hexogendev.hexogen.api.utils.chatReplacer.defaultPack;

import net.hexogendev.hexogen.api.Hexogen;
import net.hexogendev.hexogen.api.command.ICommandSender;
import net.hexogendev.hexogen.api.utils.chatReplacer.Replacer;

public class ModNameReplacer implements Replacer {

	@Override
	public String getDetectWord() {
		return "%MOD_NAME%";
	}

	@Override
	public String getReplaceWord(String message, ICommandSender user) {
		return Hexogen.getModName();
	}

}
