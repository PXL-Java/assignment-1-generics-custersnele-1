package be.pxl.ja;

import be.pxl.ja.robbery.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductCompareToTest {

	@Test
	public void returnsZeroIfTwoProductsHaveTheSamePrice() {
		Product product1 = new Product("Product 1", 8, 17.5);
		Product product2 = new Product("Product 2", 10, 17.5);

		assertEquals(0, product1.compareTo(product2));
	}

	@Test
	public void returnsNegativeValueIfProductIsMoreExpensiveThanOtherProduct() {
		Product product1 = new Product("Product 1", 8, 25);
		Product product2 = new Product("Product 2", 10, 17.5);

		assertTrue(product1.compareTo(product2) < 0);
	}

	@Test
	public void returnsPositiveValueIfProductIsLessExpensiveThanOtherProduct() {
		Product product1 = new Product("Product 1",  8, 12.5);
		Product product2 = new Product("Product 2", 10, 25);


		assertTrue(product1.compareTo(product2) > 0);
	}

}
