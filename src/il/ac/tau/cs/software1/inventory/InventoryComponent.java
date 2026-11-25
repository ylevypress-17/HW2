package il.ac.tau.cs.software1.inventory;

import il.ac.tau.cs.software1.components.IComponent;
import il.ac.tau.cs.software1.math.Vector2;

/*
 * A component that gives its owner an Inventory with a weight limit (Question 7).
 */
public class InventoryComponent implements IComponent {

	// Collected objects are not destroyed. They are moved here, far outside of the screen.
	private static final Vector2 INVENTORY_POSITION = new Vector2(-100.0f, -100.0f);

	private static final float INITIAL_MAX_WEIGHT = 10.0f;

	// TODO: add the fields:
	//       - an Inventory, initialized to a new NaiveInventory
	//       - a float maxWeight, initialized to INITIAL_MAX_WEIGHT
	private Inventory inventory = new NaiveInventory();
	private float maxWeight = INITIAL_MAX_WEIGHT;

	public Inventory getInventory() {
		return inventory;
	}

	public Vector2 getInventoryPosition() {
		return INVENTORY_POSITION;
	}

	public float getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(float maxWeight) {
		this.maxWeight = maxWeight;
	}
}
