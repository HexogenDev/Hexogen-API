package net.cyanwool.api.entity.component.living;

import net.cyanwool.api.entity.component.Component;

public interface Blocking extends Component{
	
	public boolean isBlocking();
	
	public void setBlocking(boolean flag);
	
	public double getBlockedAttackDeal();
	
	public double setBlockedAttackDeal(double deal);
}