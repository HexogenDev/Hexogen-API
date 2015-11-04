package net.hexogendev.hexogen.api.world;

import java.util.List;

import net.hexogendev.hexogen.api.Server;
import net.hexogendev.hexogen.api.block.Block;
import net.hexogendev.hexogen.api.entity.Entity;
import net.hexogendev.hexogen.api.entity.EntityLivingBase;
import net.hexogendev.hexogen.api.entity.alive.player.Player;
import net.hexogendev.hexogen.api.material.blocks.BlockMaterial;
import net.hexogendev.hexogen.api.world.chunk.ChunkManager;
import net.hexogendev.hexogen.api.world.effect.Effect;
import net.hexogendev.hexogen.api.world.sounds.Sound;

public interface World {

	public ChunkManager getChunkManager();

	public boolean isLoadedSpawnChunks();

	public void loadSpawnChunks();

	public WorldInfo getWorldInfo();

	public void setBlock(Position pos, int id, int data);

	public void setBlock(int x, int y, int z, int id, int data);

	public void setBlock(Position pos, BlockMaterial type);

	public void setBlock(int x, int y, int z, BlockMaterial type);

	public Block getBlock(Position position);

	public Block getBlock(int x, int y, int z);

	public Position getSpawnPosition();

	public void setSpawnPosition(Position pos);

	public void playSoundAtEntity(Entity baseEntity, String sound, float volume, float pitch);

	public void playSound(Position pos, String sound, float volume, float pitch);

	public void playSoundExpect(Position pos, String sound, float volume, float pitch, Player player);

	public void playSoundAtEntity(Entity baseEntity, Sound sound, float volume, float pitch);

	public void playSound(Position pos, Sound sound, float volume, float pitch);

	public void playEffect(Position pos, Effect effect, int data);

	public void playSoundExpect(Position pos, Sound sound, float volume, float pitch, Player player);

	public void playEffectExpect(Position pos, Effect effect, int data, Player player);

	public void playParticle(Position pos, Particle particle, int amount, int data);

	public void playParticleExpect(Position pos, Particle particle, int amount, int data, Player player);

	public Entity spawnEntity(String id, Position pos);

	public Entity spawnEntity(int id, Position pos);

	public long getWorldTime();

	public void setWorldTime(long time);

	public long getTotalWorldTime();

	public boolean isHardcore();

	public void setHardcore(boolean flag);

	public boolean isAutoSave();

	public void setAutoSave(boolean value);

	public Difficulty getDifficulty();

	public void setDifficulty(Difficulty diff);

	public boolean isThundering();

	public void setThundering(boolean flag);

	public int getThunderTime();

	public void setThunderTime(int time);

	public boolean isRaining();

	public void setRaining(boolean rain);

	public int getRainTime();

	public void setRainTime(int time);

	public int getMaxHeight();

	public List<Entity> getEntities();

	public List<EntityLivingBase> getLivingEntities();

	public List<Player> getPlayers();

	public void onTick();

	public Server getServer();
}
