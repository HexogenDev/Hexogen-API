package net.hexogendev.hexogen.api.entity.alive.player;

import java.util.UUID;

public interface PlayerProfile {

	public UUID getUUID();

	public String getName();

	public void setName();

}
