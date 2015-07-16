package net.cyanwool.api.entity2.component.living.zombie;

import net.cyanwool.api.entity2.component.Component;

public interface ZombieVillagerHealing extends Component {

	public int getHealTime();

	public void setHealTime(int ticks);

	public void start();

	public void stop();

	public boolean isPaused();

	public void pause();
}
