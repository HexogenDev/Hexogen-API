package net.cyanwool.api.entity2.component.living;

import net.cyanwool.api.entity2.component.Component;
import net.cyanwool.api.utils.Rotation;
import net.cyanwool.api.world.Position;

public interface HeadRotation extends Component {

	public Rotation getHeadRotation();

	public void setHeadRotation(Rotation rotation);

	public Position getEyePosition();

	public float getEyeHeight();
}
