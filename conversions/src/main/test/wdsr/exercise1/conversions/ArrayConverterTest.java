package wdsr.exercise1.conversions;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayConverterTest {
	private ArrayConverter converter;
	
	@Before
	public void setup() {
		converter = new ArrayConverter();
	}
	
	@After
	public void tearDown() {
		converter = null;
	}
	
	@Test(expected=NumberFormatException.class)
	public void shouldRaiseAnExceptionForNoIntTypeArg() {
		//given
		String[] strings = new String[] { "abc" };
		
		//when
		converter.convertToInts(strings);
		
		//then
		//empty
	}
	
	@Test(expected=NullPointerException.class)
	public void shouldRaiseAnExceptionForNull() {
		//given
		String[] strings = null;
		
		//when
		converter.convertToInts(strings);
		
		//then
		//empty
	}
	
	@Test
	public void shouldReturnTableOfInts() {
		//given
		String[] strings = new String[] { "1", "2", "3"};
		int[] expected = { 1, 2, 3 };
		
		//when
		int[] result = converter.convertToInts(strings);
		
		//then
		assertThat(result, is(expected));
	}
	
}
