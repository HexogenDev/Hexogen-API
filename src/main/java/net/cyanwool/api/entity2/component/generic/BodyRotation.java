package net.cyanwool.api.entity2.component.generic;

import net.cyanwool.api.entity2.component.Component;
import net.cyanwool.api.utils.Rotation;

public interface BodyRotation extends Component{
	
	public Rotation getBodyRotation();

	public void setBodyRotation(Rotation rotation);
}