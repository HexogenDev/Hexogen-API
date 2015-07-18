package net.cyanwool.api.entity.component.living.player;

import net.cyanwool.api.entity.component.Component;
import net.cyanwool.api.world.Position;

public interface Sleep extends Component {

	public boolean isSleeping();

	public void sleepInBedAt(int x, int y, int z);

	public void sleepInBedAt(Position pos);

	public void wakeUp();

	public int getSleepingTicks();

	public void setSleepingTicks(int ticks);
}
