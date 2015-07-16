package net.cyanwool.api.entity2.component.generic;

import net.cyanwool.api.entity2.Entity;
import net.cyanwool.api.entity2.component.Component;

public interface Transport extends Component {
	
	public void setPassenger(Entity entity);
	
	public Entity getPassenger();

	public Entity getVehicle();
	
}