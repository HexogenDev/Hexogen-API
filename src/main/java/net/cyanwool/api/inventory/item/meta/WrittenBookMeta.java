package net.cyanwool.api.inventory.item.meta;

import java.util.List;

public interface WrittenBookMeta extends ItemMeta {

	public int getGeneration();

	public void setGeneration(int gen);

	public String getAuthor();

	public void setAuthor(String author);

	public String getTitle();

	public void setTitle(String title);

	public List<BookPage> getPages();

	public BookPage addPage();

	public void removePage(int number);
}
