package net.cyanwool.api.entity.component.living.player;

import java.util.List;

import net.cyanwool.api.entity.component.Component;
import net.cyanwool.api.network.PlayerNetwork;
import net.cyanwool.api.world.GameMode;
import net.cyanwool.api.world.Particle;
import net.cyanwool.api.world.Position;
import net.cyanwool.api.world.chunk.Chunk;
import net.cyanwool.api.world.chunk.ChunkCoords;
import net.cyanwool.api.world.effect.Effect;
import net.cyanwool.api.world.sounds.Sound;

public interface PlayerConnection extends Component {
	
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
	
	public GameMode getGameMode();

	public void setGameMode(GameMode gamemode);
	
	public boolean isOnline();
}