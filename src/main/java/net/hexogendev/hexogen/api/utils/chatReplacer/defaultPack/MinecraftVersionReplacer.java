package net.hexogendev.hexogen.api.utils.chatReplacer.defaultPack;

import net.hexogendev.hexogen.api.Hexogen;
import net.hexogendev.hexogen.api.command.ICommandSender;
import net.hexogendev.hexogen.api.utils.chatReplacer.Replacer;

public class MinecraftVersionReplacer implements Replacer {

	@Override
	public String getDetectWord() {
		return "%MINECRAFT_VERSION%";
	}

	@Override
	public String getReplaceWord(String message, ICommandSender user) {
		return Hexogen.getMCVersion();
	}

}
