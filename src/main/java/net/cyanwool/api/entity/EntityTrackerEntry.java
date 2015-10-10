package net.cyanwool.api.entity;

import java.util.Collection;

import net.cyanwool.api.entity.alive.player.Player;

public interface EntityTrackerEntry {

	public Entity getEntity();

	public void onUpdate();

	public void addViewerPlayer(Player player);

	public void removeViewerPlayer(Player player);

	public Collection<Player> getViewerPlayers();

	public void refresh();

}
