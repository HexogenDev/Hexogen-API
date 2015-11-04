package net.hexogendev.hexogen.api.network;

import net.hexogendev.hexogen.api.Server;
import net.hexogendev.hexogen.api.entity.alive.player.Player;
import net.hexogendev.hexogen.api.world.Position;

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
