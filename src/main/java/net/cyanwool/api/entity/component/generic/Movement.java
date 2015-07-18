package net.cyanwool.api.entity.component.generic;

import net.cyanwool.api.entity.BaseEntity;
import net.cyanwool.api.entity.component.Component;
import net.cyanwool.api.world.Position;

public interface Movement extends Component {

	public float getMovementSpeed();

	public void setMovementSpeed(float speed);

	public void moveEntity(double x, double y, double z);

	public void moveEntity(Position pos);

	public void moveEntity(BaseEntity baseEntity);
}
