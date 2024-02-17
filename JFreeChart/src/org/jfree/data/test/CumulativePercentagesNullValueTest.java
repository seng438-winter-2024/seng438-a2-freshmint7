package org.jfree.data.test;

import org.junit.*;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.KeyedValues;
import org.jmock.*;

/*
 * This class tests the getCumulativePercentages method in the DataUtilities class
 * when provided with a mocked KeyedValues object where all values are null. We expect that since
 * the data is invalid, the InvalidParameterException is thrown.
 */

public class CumulativePercentagesNullValueTest extends DataUtilities {

    private Mockery mockKeyed;
    private KeyedValues values;

    @Before
    public void setUp() {
        mockKeyed = new Mockery(); // create the mockery object

        values = mockKeyed.mock(KeyedValues.class); // creates a mock of the KeyedValues object, contains the pairs where all values are null
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
            will(returnValue(null));
            allowing(values).getValue(1);
            will(returnValue(null));
            allowing(values).getValue(2);
            will(returnValue(null));
        }});
    }

    @After
    public void tearDown() {
        mockKeyed = null;
        values = null;
    }

    @Test(expected = InvalidParameterException.class)
    public void CumulativePercentagesWithNullValue() {
        KeyedValues result = DataUtilities.getCumulativePercentages(values); // get the cumulative percentages from the function being tested
        
        // since all values in the values should be null, we expect an exception
    }

}
