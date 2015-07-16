package net.cyanwool.api.entity.component.generic;

import net.cyanwool.api.entity.component.Component;

public interface LivingTicks extends Component {

	public int getLivedTicks();

	public void setLivedTicks(int ticks);

}
