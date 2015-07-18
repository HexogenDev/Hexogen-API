package net.cyanwool.api.entity.component.living;

import net.cyanwool.api.entity.component.Component;
import net.cyanwool.api.inventory.Inventory;

public interface Inventorying extends Component {

	public Inventory getInventory();
}
