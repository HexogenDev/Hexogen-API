package net.cyanwool.api.entity.component.living;

import net.cyanwool.api.entity.BaseEntity;
import net.cyanwool.api.entity.component.Component;

public interface Target extends Component {

	public void setTarget(BaseEntity entity);

	public BaseEntity getTarget();

}
