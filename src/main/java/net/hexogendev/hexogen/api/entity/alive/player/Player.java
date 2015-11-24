package net.hexogendev.hexogen.api.entity.alive.player;

import net.hexogendev.hexogen.api.network.PlayerNetwork;
import net.hexogendev.hexogen.api.world.Particle;
import net.hexogendev.hexogen.api.world.Position;
import net.hexogendev.hexogen.api.world.effect.Effect;
import net.hexogendev.hexogen.api.world.sounds.Sound;

public interface Player extends OfflinePlayer {

	public PlayerNetwork getPlayerNetwork();

	public void kick(String reason);

	public void playSound(Position pos, String sound, float volume, float pitch);

	public void playSound(Position pos, Sound sound, float volume, float pitch);

	public void playEffect(Position pos, Effect effect, int data);

	public void playParticle(Position pos, Particle particle, int amount, int data);

	public void setTime(long worldTime);
}
