package net.cyanwool.api.utils.chatReplacer.defaultPack;

import java.text.SimpleDateFormat;
import java.util.Date;

import net.cyanwool.api.command.ICommandSender;
import net.cyanwool.api.utils.chatReplacer.Replacer;

public class TimeReplacer implements Replacer {

	@Override
	public String getDetectWord() {
		return "%TIME%";
	}

	@Override
	public String getReplaceWord(String format, String message, ICommandSender user) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String time = sdf.format(date);
		return time;
	}

}
