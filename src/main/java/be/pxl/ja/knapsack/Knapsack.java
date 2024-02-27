package be.pxl.ja.knapsack;

import java.util.ArrayList;
import java.util.List;

public class Knapsack<T extends Item> {

	private final List<T> items = new ArrayList<>();
	private final double maximumCapacity;

	public Knapsack(double maximumCapacity) {
		this.maximumCapacity = maximumCapacity;
	}

	public void add(T item) throws KnapsackFullException {
		if (getCurrentWeight() + item.getWeight() > maximumCapacity) {
			throw new KnapsackFullException("The weight is over max capacity.");
		}
		items.add(item);
	}

	public List<T> getItems() {
		return items;
	}

	public double getCurrentWeight() {
		return items.stream().mapToDouble(Item::getWeight).sum();
	}
}
