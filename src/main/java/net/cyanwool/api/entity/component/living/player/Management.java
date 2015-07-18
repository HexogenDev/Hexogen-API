package net.cyanwool.api.entity.component.living.player;

import net.cyanwool.api.entity.component.Component;

public interface Management extends Component {
	
	public void kickPlayer(String message);

	public boolean isOp();

	public void setOp(boolean flag);
	
	public boolean isBanned();

	public void setBanned(boolean banned);

	public boolean isWhitelisted();

	public void setWhitelisted(boolean whitelisted);
}