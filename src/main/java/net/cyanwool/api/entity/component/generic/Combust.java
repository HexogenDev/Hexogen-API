package net.cyanwool.api.entity.component.generic;

import net.cyanwool.api.entity.component.Component;

public interface Combust extends Component {

	public boolean canCombust();

	public void setCombust(boolean flag);

}
