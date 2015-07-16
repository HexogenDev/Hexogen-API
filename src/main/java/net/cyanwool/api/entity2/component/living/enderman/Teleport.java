package net.cyanwool.api.entity2.component.living.enderman;

import net.cyanwool.api.entity2.component.Component;

public interface Teleport extends Component {

	public double getTeleportRadius();

	public void setTeleportRadius(double radius);

	public void teleportRandomly();
}
