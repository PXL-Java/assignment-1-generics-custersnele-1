package be.pxl.ja;

import be.pxl.ja.knapsack.Knapsack;
import be.pxl.ja.knapsack.KnapsackFullException;
import be.pxl.ja.robbery.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class KnapsackAddTest {

	private Product product;

	@BeforeEach
	public void init() {
		product = new Product("Something", 10, 12);
	}

	@Test
	public void itemIsAddedWhenThereIsEnoughCapacity() throws KnapsackFullException {
		Knapsack<Product> knapsack = new Knapsack<>(20);
		knapsack.add(product);

		assertTrue(knapsack.getItems().contains(product));
	}

	@Test
	public void whenItemExceedsMaximumCapacityKnapsackFullExceptionIsThrown() {
		Knapsack<Product> knapsack = new Knapsack<>(20);
		product.setWeight(25);
		assertThrows(KnapsackFullException.class, () -> knapsack.add(product));
		assertFalse(knapsack.getItems().contains(product));
	}

	@Test
	public void whenAddingExtraItemExceedsMaximumCapacityKnapsackFullExceptionIsThrown() throws KnapsackFullException {
		Knapsack<Product> knapsack = new Knapsack<>(20);
		knapsack.add(new Product("Product 1", 5, 12));
		knapsack.add(new Product("Product 2", 6, 15));

		assertThrows(KnapsackFullException.class, () -> knapsack.add(product));
		assertFalse(knapsack.getItems().contains(product));
	}
}
