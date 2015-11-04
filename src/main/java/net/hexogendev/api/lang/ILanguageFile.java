package net.hexogendev.api.lang;

public interface ILanguageFile {

	public String getValue(String unlocalizedName);

	public void setValue(String unlocalizedName, String value);

	public boolean hasValue(String unlocalizeName);

	public String getLocaleCode();

	public void save();
}
