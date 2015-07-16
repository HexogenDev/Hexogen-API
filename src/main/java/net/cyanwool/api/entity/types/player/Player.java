package net.cyanwool.api.entity.types.player;

import java.util.List;

import net.cyanwool.api.entity.Entity;
import net.cyanwool.api.network.PlayerNetwork;
import net.cyanwool.api.world.Particle;
import net.cyanwool.api.world.Position;
import net.cyanwool.api.world.chunk.Chunk;
import net.cyanwool.api.world.chunk.ChunkCoords;
import net.cyanwool.api.world.effect.Effect;
import net.cyanwool.api.world.sounds.Sound;

public interface Player extends Human {

	public void kickPlayer(String message);

	public boolean isOp();

	public void setOp(boolean flag);

	public void chat(String message);

	public boolean isBanned();

	public void setBanned(boolean banned);

	public boolean isWhitelisted();

	public void setWhitelisted(boolean whitelisted);

	// public void displayGUI(InventoryType type);

	public List<ChunkCoords> getVisibleChunkCoords();

	public void playSound(Position pos, String sound, float volume, float pitch);

	public void playSound(Position pos, Sound sound, float volume, float pitch);

	public void playEffect(Position pos, Effect effect, int data);

	public void playEffect(Position pos, int effect, int data);

	public void playParticle(Position pos, Particle particle, int amount, int data);

	public void playParticle(Position pos, int particle, int amount, int data);

	public void setTime(long time); // maybe sendTimeUpdate ?

	public void sendChunk(Chunk chunk);

	public void respawn();

	public PlayerNetwork getPlayerNetwork();

	// public PlayerListEntry getPlayerListEntry();

	public boolean isOnline();

	public boolean canSeeEntity(Entity entity);

	public boolean canSeeChunk(Chunk chunk);
}
