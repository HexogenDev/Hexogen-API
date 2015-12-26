package net.hexogendev.hexogen.api.network;

import net.hexogendev.hexogen.api.Initializable;
import net.hexogendev.hexogen.api.Server;
import net.hexogendev.hexogen.api.Shutdownable;
import net.hexogendev.hexogen.api.entity.alive.player.Player;
import net.hexogendev.hexogen.api.world.Position;
import net.hexogendev.hexogen.api.world.World;

public interface NetworkServer extends Initializable, Shutdownable {

	public Server getServer();

	public Object getProtocolServer();

	public int getPort();

	public String getHostAddress();

	public void sendPacketForAll(IPacket packet);

	public void sendPacketForAll(World world, IPacket packet);

	public void sendPacketForAllExpect(IPacket packet, Player expect);

	public void sendPacketForAllExpect(World world, IPacket packet, Player expect);

	public void sendPacketDistance(Position pos, IPacket packet, int radius);

	public void sendPacketDistanceExpect(Position pos, IPacket packet, int radius, Player expect);

	public void shutdown();

}
