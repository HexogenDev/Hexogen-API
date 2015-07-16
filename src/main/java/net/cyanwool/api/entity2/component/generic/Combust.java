package net.cyanwool.api.entity2.component.generic;

import net.cyanwool.api.entity2.component.Component;

public interface Combust extends Component {

	public boolean canCombust();

	public void setCombust(boolean flag);

}
