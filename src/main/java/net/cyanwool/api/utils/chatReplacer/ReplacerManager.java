package net.cyanwool.api.utils.chatReplacer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import net.cyanwool.api.command.ICommandSender;
import net.cyanwool.api.utils.ChatColor;

public class ReplacerManager {

	private static Map<String, Replacer> replacers = new HashMap<String, Replacer>();

	public static Collection<Replacer> getReplacers() {
		return replacers.values();
	}

	public static boolean registerReplacer(Replacer replacer) {
		if (replacers.containsKey(replacer.getDetectWord())) {
			return false;
		}
		replacers.put(replacer.getDetectWord(), replacer);
		return true;
	}

	public static boolean unregisterReplacer(String replacerWords) {
		if (replacers.containsKey(replacerWords)) {
			return false;
		}
		replacers.remove(replacerWords);
		return true;
	}

	public static Replacer getReplacer(String replacerWords) {
		return replacers.get(replacerWords);
	}

	public static String replace(String format, String message, ICommandSender user) {// ??
		for (String word : replacers.keySet()) {
			Replacer replacer = getReplacer(word);
			if (format.contains(replacer.getDetectWord())) {
				format = format.replace(replacer.getDetectWord(), replacer.getReplaceWord(format, message, user));
			}
		}
		format = ChatColor.translateAlternateColorCodes('&', format);
		return format;
	}

	public String replaceV2(String message, ICommandSender user) {// ??
		for (String word : replacers.keySet()) {
			Replacer replacer = getReplacer(word);
			if (message.contains(replacer.getDetectWord())) {
				message = message.replace(replacer.getDetectWord(), replacer.getReplaceWord(message, message, user));
			}
		}
		message = ChatColor.translateAlternateColorCodes('&', message);
		return message;
	}

	public static boolean hasReplacer(String word) {
		return getReplacer(word) != null;
	}
}
