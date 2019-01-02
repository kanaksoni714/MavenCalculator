package App.Mavencalculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Calculator.Mavencalculator.App;



//import App;

/**
 * Unit test for simple App.
 */


public class AppTest {
	
	@Test
	public void shouldAddTwoPositiveNumbers() {

		int result = App.add(2, 3);
		assertEquals(5, result);
	}

	@Test
	public void shouldSubtractTwoPositiveNumbers() {
		int result = App.subtract(5, 3);
		assertEquals(2, result);

	}

	@Test
	public void shouldMultiplyTwoPositiveNumbers() {
		int result = App.multiply(2, 3);
		assertEquals(6, result);
	}

	@Test
	public void shouldDivideTwoPositiveNumbers() {
		int result = App.divide(6, 3);
		assertEquals(2, result);
	}

	@Test
	public void shouldAddFirstPositiveAndOtherNegativeNumber() {

		
		int result = App.add(2, -3);
		assertEquals(-1, result);
	}

	@Test
	public void shouldSubtractFirstPositiveAndOtherNegativeNumber() {
		int result = App.subtract(5,-3);
		assertEquals(8, result);
	}
	@Test
	public void shouldAddFirstNegativeAndOtherPositiveNumber() {
		int result = App.add(-2, 3);
		assertEquals(1, result);
	}

	@Test
	public void shouldSubtractFirstNegativeAndOtherPositiveNumber() {
		int result = App.subtract(-5,3);
		assertEquals(-8, result);
	}

	@Test
	public void shouldMultiplyOnePositiveAndOneNegativeNumber() {
		int result = App.multiply(-2, 3);
		assertEquals(-6, result);
	}

	@Test
	public void shouldDivideOnePositiveAndOneNegativeNumber() {
		int result = App.divide(6, -3);
		assertEquals(-2, result);

	}

	@Test
	public void shouldAddTwoNegativeNumbers() {
		int result = App.add(-2, -3);
		assertEquals(-5, result);
	}

	@Test
	public void shouldSubtractTwoNegativeNumbers() {
		int result = App.subtract(-5, -3);
		assertEquals(-2, result);
	}

	@Test
	public void shouldMultiplyTwoNegativeNumbers() {
		int result = App.multiply(-2, -3);
		assertEquals(6, result);
	}

	@Test
	public void shouldDivideTwoNegativeNumbers() {
		int result = App.divide(-6, -3);
		assertEquals(2, result);
	}
	
	@Test (expected=ArithmeticException.class)
	public void testForZeroDenominator() {
		int result = App.divide(-6, 0);		
	}
}
