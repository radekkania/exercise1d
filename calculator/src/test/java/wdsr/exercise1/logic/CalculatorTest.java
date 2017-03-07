package wdsr.exercise1.logic;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	private Calculator calculator;

	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void testMin_shouldReturnTheOnlyValue() {
		// given
		int[] values = { -5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		assertEquals(values[0], min);
	}
	
	@Test
	public void testMin_shouldReturnTheSmallestOfAllValues() {
		// given 
		int[] values = { 2, -3, 5 };
		
		// when
		int min = calculator.min(values);
		
		// then
		assertEquals(-3, min);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForNullArgument() {
		// given
		int[] values = null;
		
		// when
		calculator.min(values);
		
		// then
		// empty
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMin_shouldRaiseAnExceptionForEmptyArgument() {
		// given 
		int[] values = {};
		
		// when
		calculator.min(values);
		
		// then
		// empty
	}	
	
	@Test
	public void testMax_shouldReturnTheBigestOfAllValuesGreaterThanZero() {
		//given all values greater than 0.
		int [] values = { 1, 2, 3 };
		
		//when
		int max = calculator.max(values);
		
		//then
		assertThat(max,is(values[2]));
	}
	
	@Test
	public void testMax_shouldReturnTheBigestOfValuesLessThanZero() {
		//given all values less than
		int[] values = { -1, -2, -3};
		
		//when
		int result = calculator.max(values);
		
		//then
		assertThat(result, is(-1));
	}
	
	@Test
	public void testMax_shouldReturnTheBigestOfAllValues() {
		//given all values
		int[] values = { 0, 1, -3 };
		
		//when
		int result = calculator.max(values);
		
		//then
		assertThat(result, is(1));
	}
	
	@Test
	public void testMax_shouldReturnTheOnlyValue() {
		//given
		int [] values = { 5 };
		
		//when
		int max = calculator.max(values);
		
		//then
		assertThat(max,is(values[0]));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_shouldRaiseAnExceptionForEmptyArgument() {
		//given
		int [] values = {};
		
		//when
		calculator.max(values);
		//then
		//empty
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMax_shouldRaiseAnExceptionForNullArgument() {
		//given
		int [] values = null;
		
		//when
		calculator.max(values);
		//then
		//empty
	}
	
	
	


}
