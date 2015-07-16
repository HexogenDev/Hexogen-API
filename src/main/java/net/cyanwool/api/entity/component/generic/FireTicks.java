package net.cyanwool.api.entity.component.generic;

import net.cyanwool.api.entity.component.Component;

public interface FireTicks extends Component {

	public boolean isBurned();
	
	public int getFireTicks();

	public void setFireTicks(int ticks);
}
