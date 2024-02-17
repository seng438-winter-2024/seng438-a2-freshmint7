package org.jfree.data.test;

import org.junit.*;

import static org.junit.Assert.*;
import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.*;

/*
 * This class tests the getCumulativePercentages method in the DataUtilities class
 * using a mocked KeyedValues object where one of the values is 0. 
 * Note: The bug in this method allows this test to pass if the first value in the KeyedValues
 * is set to 0 as getCumulativePercentages seems to ignore the first value in calculations
 */

public class CumulativePercentagesZeroTest extends DataUtilities {

	private Mockery mockKeyed;
	private KeyedValues values;

	@Before
	public void setUp() {
		mockKeyed = new Mockery(); // create the mockery object

		values = mockKeyed.mock(KeyedValues.class); // creates a mock of the KeyedValues object
		mockKeyed.checking(new Expectations() {
			{
				allowing(values).getItemCount();
				will(returnValue(3));
				allowing(values).getKey(0);
				will(returnValue("0"));
				allowing(values).getKey(1);
				will(returnValue("1"));
				allowing(values).getKey(2);
				will(returnValue("2"));
				allowing(values).getValue(0);
				will(returnValue(1));
				allowing(values).getValue(1);
				will(returnValue(0)); // we set the middle value to 0 since it was seen that the first value is always
										// skipped in calculation
				allowing(values).getValue(2);
				will(returnValue(3));
			}
		});
	}

	@After
	public void tearDown() {
		mockKeyed = null;
		values = null;
	}

	@Test
	public void testGetCumulativePercentagesWithZero() {

		double[] expected = { 0.25, 0.25, 1.0 }; // expected cumulative percentages

		KeyedValues result = DataUtilities.getCumulativePercentages(values); // get the cumulative percentages

		assertEquals(expected.length, result.getItemCount()); // test the length of the result
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], result.getValue(i).doubleValue(), 0.0001); // test each cumulative percentage
		}
	}
}
