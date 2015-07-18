package net.cyanwool.api.entity.component;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import net.cyanwool.api.entity.BaseEntity;

public class ComponentManager {

	// private ConcurrentMap<String, Component> components;
	private List<Component> components;
	private BaseEntity baseEntity;

	public ComponentManager(BaseEntity baseEntity) {
		this.baseEntity = baseEntity;
		// this.components = new ConcurrentHashMap<String, Component>();
		this.components = new CopyOnWriteArrayList<Component>();
	}

	public BaseEntity getEntity() {
		return baseEntity;
	}

	public List<Component> getComponents() {
		// return new ArrayList<Component>(components.values());
		return components;
	}

	public synchronized boolean addComponent(Component component) {
		if (!hasComponent(component.getClass())) {
			// components.put(component.getID(), component);
			if (component.getClass().isAssignableFrom(EntityData.class)) {
				return false;
			}
			if (components.add(component)) {
				component.initialization();
				return true;
			}
		}
		return false;
	}

	public synchronized boolean hasComponent(Class<? extends Component> component) {
		for (Component comp : getComponents()) {
			if (comp.getClass().isAssignableFrom(component)) {
				return true;
			}
		}
		return false;
	}

	public synchronized Component getComponent(Class<? extends Component> component) {
		for (Component comp : getComponents()) {
			if (comp.getClass().isAssignableFrom(component)) {
				return comp;
			}
		}
		return null;
	}

	public synchronized boolean removeComponent(Class<? extends Component> component) {
		if (hasComponent(component)) {
			// if (getComponent(id) instanceof SystemComponent) {
			// // IS IMPOSSIBLE!!1!!
			// return false;
			// }

			if (getComponent(component).getClass().isAssignableFrom(EntityData.class)) {
				return false;
			}
			Component comp = getComponent(component);
			components.remove(comp);
			return true;
		}
		return false;
	}

	public synchronized void onUpdateComponents() {
		for (Component component : components) {
			if (component.autoUpdate()) {
				component.update();
			}
		}
	}
}
