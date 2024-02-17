package org.jfree.data.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.*;


/**
 * This class contains a JUnit test case for the `getCumulativePercentages()` method in the `DataUtilities` class.
 * The method calculates cumulative percentages based on the maximum and minimum values provided as a `KeyedValues` object.
 */
public class CumulativePercentagesMaxMinTest extends DataUtilities {
	private Mockery mockKeyed;
    private KeyedValues values;
 
    @Before
    public void setUp() {
        mockKeyed = new Mockery(); // create the mockery object
        values = mockKeyed.mock(KeyedValues.class); 
        // creates a mock of the KeyedValues object, contains the pairs (0,0),(1,1),(2,Double.MAX_VALUE),(3,-Double.MAX_VALUE)
        mockKeyed.checking(new Expectations() {{
            allowing(values).getItemCount();
            will(returnValue(4));
            allowing(values).getKey(0);
            will(returnValue("0"));
            allowing(values).getKey(1);
            will(returnValue("1"));
            allowing(values).getKey(2);
            will(returnValue("2"));
            allowing(values).getKey(3);
            will(returnValue("3"));
            allowing(values).getValue(0);
            will(returnValue(0));
            allowing(values).getValue(1);
            will(returnValue(1));
            allowing(values).getValue(2);
            will(returnValue(Double.MAX_VALUE));
            allowing(values).getValue(3);
            will(returnValue(-Double.MAX_VALUE));
        }});
    }

    @Test
    public void testGetCumulativePercentagesMaxMin() {
        double[] expected = {0, 1, Double.MAX_VALUE, 1}; // an array of the expected cumulative percentages indexed at each level
        KeyedValues result = DataUtilities.getCumulativePercentages(values); // get the cumulative percentages from the function being tested

        assertEquals(expected.length, result.getItemCount()); // test that the length of the returned result is the same as expected
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result.getValue(i).doubleValue(), 0.0001); // test each cumulative percentage for each index
        }
    }

    @After
    public void tearDown() {
        mockKeyed = null;
        values = null;
    }
}
