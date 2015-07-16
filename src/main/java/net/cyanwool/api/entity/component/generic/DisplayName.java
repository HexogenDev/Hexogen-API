package net.cyanwool.api.entity.component.generic;

import net.cyanwool.api.entity.component.Component;

public interface DisplayName extends Component {

	public String getDisplayName();

	public void setDisplayName(String name);

	public boolean hasDisplayName();

	public boolean isRenderDisplayName();

	public void setRenderDisplayName(boolean flag);

}
