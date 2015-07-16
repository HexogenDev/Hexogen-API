package net.cyanwool.api.entity.component.generic;

import net.cyanwool.api.entity.Entity;
import net.cyanwool.api.entity.component.Component;

public interface Transport extends Component {

	public void setPassenger(Entity entity);

	public Entity getPassenger();

	public Entity getVehicle();

}
