package net.cyanwool.api.entity;

import java.util.Collection;

import net.cyanwool.api.entity.alive.player.Player;
import net.cyanwool.api.world.Position;

public interface EntityTrackerEntry {

	public Entity getEntity();

	public void addViewerPlayer(Player player);

	public void removeViewerPlayer(Player player);

	public Collection<Player> getViewerPlayers();

	public void update();

	public void update(Collection<Player> players);

	public void updatePlayerEntity(Player player);

	public boolean checkDistance(Position pos);

}
