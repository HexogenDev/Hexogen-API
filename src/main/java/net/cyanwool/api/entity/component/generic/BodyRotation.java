package net.cyanwool.api.entity.component.generic;

import net.cyanwool.api.entity.component.Component;
import net.cyanwool.api.utils.Rotation;

public interface BodyRotation extends Component {

	public Rotation getBodyRotation();

	public void setBodyRotation(Rotation rotation);
}
