package net.hexogendev.api.network;

import net.hexogendev.api.Server;
import net.hexogendev.api.entity.alive.player.Player;
import net.hexogendev.api.world.Position;

public interface NetworkServer {

	public Server getServer();

	public Object getProtocolServer();

	public int getPort();

	public String getHostAddress();

	public void sendPacketForAll(IPacket packet);

	public void sendPacketDistance(Position pos, IPacket packet, int radius);

	public void sendPacketForAllExpect(IPacket packet, Player expect);

	public void sendPacketDistanceExpect(Position pos, IPacket packet, int radius, Player expect);

	public void shutdown();

}
