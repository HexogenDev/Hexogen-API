package net.cyanwool.api.entity.component.living.player;

import net.cyanwool.api.entity.component.Component;
import net.cyanwool.api.world.GameMode;

public interface OfflinePlayerData extends Component{
	
	public String getName();

	public GameMode getGameMode();

	public void setGameMode(GameMode gamemode);

	public boolean isOnline();
	
	public boolean isOp();

	public void setOp(boolean flag);

	public boolean isBanned();

	public void setBanned(boolean banned);

	public boolean isWhitelisted();

	public void setWhitelisted(boolean whitelisted);
}