package net.cyanwool.api.utils.chatReplacer.defaultPack;

import net.cyanwool.api.CyanWool;
import net.cyanwool.api.command.ICommandSender;
import net.cyanwool.api.utils.chatReplacer.Replacer;

public class MinecraftVersionReplacer implements Replacer {

	@Override
	public String getDetectWord() {
		return "%MINECRAFT_VERSION%";
	}

	@Override
	public String getReplaceWord(String message, ICommandSender user) {
		return CyanWool.getMCVersion();
	}

}
