package net.cyanwool.api.entity2.component.generic;

import net.cyanwool.api.entity2.component.Component;
import net.cyanwool.api.utils.ChatColor;

public interface Colored extends Component {
	// TODO: replace ChatColor

	public ChatColor getColor();

	public void setColor(ChatColor color);

}
