package net.cyanwool.api.entity.component.generic;

import net.cyanwool.api.entity.BaseEntity;
import net.cyanwool.api.entity.component.Component;

public interface Transport extends Component {

	public void setPassenger(BaseEntity baseEntity);

	public BaseEntity getPassenger();

	public BaseEntity getVehicle();

}
