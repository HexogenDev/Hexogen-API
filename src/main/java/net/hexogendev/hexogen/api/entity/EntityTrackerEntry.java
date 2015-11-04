package net.hexogendev.hexogen.api.entity;

import java.util.Collection;

import net.hexogendev.hexogen.api.entity.alive.player.Player;
import net.hexogendev.hexogen.api.world.Position;

public interface EntityTrackerEntry {

	public Entity getEntity();

	public void addViewerPlayer(Player player);

	public void removeViewerPlayer(Player player);

	public Collection<Player> getViewerPlayers();

	public void update();

	public void update(Collection<Player> players);

	public void updatePlayerEntity(Player player);

	public boolean checkDistance(Position pos);

	public void destroy();

}
