package net.cyanwool.api.entity.component.living;

import net.cyanwool.api.entity.component.Component;
import net.cyanwool.api.world.sounds.Sound;

public interface Sounding extends Component {

	public Sound getDamageSound();

	public Sound getTalkSound();

	public Sound getDeathSound();

	public void setDeathSound(Sound sound);

	public void setDamageSound(Sound sound);

	public void setTalkSound(Sound sound);

	public boolean playDamageSound();

	public boolean playTalkSound();

	public boolean playDeathSound();

}
