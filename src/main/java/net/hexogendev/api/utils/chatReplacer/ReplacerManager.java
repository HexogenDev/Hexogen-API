package net.hexogendev.api.utils.chatReplacer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import net.hexogendev.api.command.ICommandSender;
import net.hexogendev.api.utils.ChatColor;

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

	public static String replace(String format, ICommandSender sender) {
		return replace(format, null, sender);
	}

	public static String replace(String format, String message, ICommandSender user) {// ??
		for (String word : replacers.keySet()) {
			Replacer replacer = getReplacer(word);
			if (format.contains(replacer.getDetectWord())) {
				format = format.replace(replacer.getDetectWord(), replacer.getReplaceWord(message, user));
			}
		}
		format = ChatColor.translateAlternateColorCodes('&', format);
		return format;
	}

	public static boolean hasReplacer(String word) {
		return getReplacer(word) != null;
	}
}
