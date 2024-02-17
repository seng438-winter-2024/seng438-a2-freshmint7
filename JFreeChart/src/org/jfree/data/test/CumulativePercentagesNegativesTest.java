package org.jfree.data.test;

import org.junit.*;

import static org.junit.Assert.*;
import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.*;

/*
 * This class tests the getCumulativePercentages method in the DataUtilities class
 * when provided a mocked KeyedValue object that contains a negative value
 */

public class CumulativePercentagesNegativesTest extends DataUtilities {

    private Mockery mockKeyed;
    private KeyedValues values;

    @Before
    public void setUp() {
        mockKeyed = new Mockery(); // create the mockery object

        values = mockKeyed.mock(KeyedValues.class); // creates a mock of the KeyedValues object, contains the pairs (0,-1),(1,2),(2,3)
        mockKeyed.checking(new Expectations() {{
            allowing(values).getItemCount();
            will(returnValue(3));
            allowing(values).getKey(0);
            will(returnValue("0"));
            allowing(values).getKey(1);
            will(returnValue("1"));
            allowing(values).getKey(2);
            will(returnValue("2"));
            allowing(values).getValue(0);
            will(returnValue(-1));
            allowing(values).getValue(1);
            will(returnValue(2));
            allowing(values).getValue(2);
            will(returnValue(3));
        }});
    }

    @After
    public void tearDown() {
        mockKeyed = null;
        values = null;
    }

    @Test
    public void testGetCumulativePercentagesWithNegativeValues() {
        double[] expected = {-0.25, 0.25, 1.0}; // an array of the expected cumulative percentages indexed at each level
        
        KeyedValues result = DataUtilities.getCumulativePercentages(values); // get the cumulative percentages from the function being tested

        assertEquals(expected.length, result.getItemCount()); // test that the length of the returned result is the same as expected
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i], result.getValue(i).doubleValue(), 0.0001); // test each cumulative percentage for each index
        }
    }

}
