package net.cyanwool.api.entity.types.alive.player;

import java.util.List;

import net.cyanwool.api.network.PlayerNetwork;
import net.cyanwool.api.world.Particle;
import net.cyanwool.api.world.Position;
import net.cyanwool.api.world.chunk.Chunk;
import net.cyanwool.api.world.chunk.ChunkCoords;
import net.cyanwool.api.world.effect.Effect;
import net.cyanwool.api.world.sounds.Sound;

public interface Player extends Human {

	public boolean isDisableDamage();

	public void setDisableDamage(boolean flag);

	public boolean isFlying();

	public void setFlying(boolean flag);

	public boolean isAllowFlying();

	public void setAllowFlying(boolean flag);

	public float getFlySpeed();

	public void setFlySpeed(float speed);

	public float getWalkSpeed();

	public void setWalkSpeed(float speed);

	public boolean canBuild();

	public void setBuild(boolean flag);

	public PlayerNetwork getPlayerNetwork();

	public void chat(String message);

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

	public void closeInventory();

	public void kick(String message);

	public String getLangCode();

	public void setLangCode(String code);

}
