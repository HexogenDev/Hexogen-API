package net.cyanwool.api.utils.chatReplacer.defaultPack;

import net.cyanwool.api.CyanWool;
import net.cyanwool.api.command.ICommandSender;
import net.cyanwool.api.utils.chatReplacer.Replacer;

public class ModNameReplacer implements Replacer {

	@Override
	public String getDetectWord() {
		return "%MOD_NAME%";
	}

	@Override
	public String getReplaceWord(String format, String message, ICommandSender user) {
		return CyanWool.getModName();
	}

}
