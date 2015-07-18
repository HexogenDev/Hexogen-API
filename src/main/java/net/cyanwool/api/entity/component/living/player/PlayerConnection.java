package net.cyanwool.api.entity.component.living.player;

import net.cyanwool.api.entity.component.Component;
import net.cyanwool.api.network.PlayerNetwork;

public interface PlayerConnection extends Component {
	
	public PlayerNetwork getPlayerNetwork();	
}