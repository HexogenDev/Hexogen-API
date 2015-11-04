package net.hexogendev.hexogen.api.utils.chatReplacer.defaultPack;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.hexogendev.hexogen.api.command.ICommandSender;
import net.hexogendev.hexogen.api.utils.chatReplacer.Replacer;

public class TimeReplacer implements Replacer {

	@Override
	public String getDetectWord() {
		return "%TIME%";
	}

	@Override
	public String getReplaceWord(String message, ICommandSender user) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String time = sdf.format(date);
		return time;
	}

}
