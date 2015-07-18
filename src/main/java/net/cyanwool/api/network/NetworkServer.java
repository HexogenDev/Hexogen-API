package net.cyanwool.api.network;

import net.cyanwool.api.entity.BaseEntity;
import net.cyanwool.api.world.Position;

public interface NetworkServer {

	public net.cyanwool.api.Server getServer();

	public Object getProtocolServer();

	public int getPort();

	public String getHostAddress();

	public void sendPacketForAll(Packet packet);

	public void sendPacketDistance(Position pos, Packet packet, int radius);

	public void sendPacketForAllExpect(Packet packet, BaseEntity expect);

	public void sendPacketDistanceExpect(Position pos, Packet packet, int radius, BaseEntity expect);

}
