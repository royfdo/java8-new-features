package java8.lambda.expression;

/**
 * Test class to check lambda expressions.
 * 
 * @author roy
 */
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathOperationTest {

	private MathOperation mathOperation = new MathOperation();

	@Test
	public void testAdd() {
		assertEquals(5, mathOperation.add(2, 3));
	}

	@Test
	public void testSubstract() {
		assertEquals(0, mathOperation.substract(3, 3));
	}

	@Test
	public void testMultiply() {
		assertEquals(9, mathOperation.multiply(3, 3));
	}

}
