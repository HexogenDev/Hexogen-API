package net.cyanwool.api.lang.impl;

import java.util.HashMap;

import net.cyanwool.api.lang.ILanguageFile;

public class CWLanguageFile implements ILanguageFile {

	private String localeCode;
	private HashMap<String, String> values = new HashMap<String, String>();

	public CWLanguageFile(String localeCode) {
		this.localeCode = localeCode;
	}

	@Override
	public String getValue(String unlocalizedName) {
		return values.get(unlocalizedName);
	}

	@Override
	public void setValue(String unlocalizedName, String value) {
		values.put(unlocalizedName, value);
	}

	@Override
	public boolean hasValue(String unlocalizeName) {
		return values.containsKey(unlocalizeName);
	}

	@Override
	public String getLocaleCode() {
		return localeCode;
	}

}
