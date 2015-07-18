package net.cyanwool.api.entity.component.generic;

import java.awt.Color;

import net.cyanwool.api.entity.component.Component;

public interface Colored extends Component {

	public Color getColor();

	public void setColor(Color color);

}
