package org.jfree.data.test;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.security.InvalidParameterException;
import static org.junit.Assert.fail;
/**
 * This class tests the behavior of the calculateRowTotal method in the DataUtilities class 
 * when provided with a data table containing non-numeric values.
 */

public class TestCalculateRowTotalNonNumericValues extends DataUtilities {

    private Mockery context;
    private Values2D values;

    @Before
    public void setUp() {
    	//Initialize mocking context and Values2D mock
        context = new Mockery();
        values = context.mock(Values2D.class);
      //Set up expectations for the Values2D mock
        context.checking(new Expectations() {{
            allowing(values).getRowCount();
            will(returnValue(1));
            allowing(values).getColumnCount();
            will(returnValue(3));
            allowing(values).getValue(0, 0);
            will(returnValue("abc")); //Non-numeric value
            allowing(values).getValue(0, 1);
            will(returnValue(5.0)); //Numeric value
            allowing(values).getValue(0, 2);
            will(returnValue("xyz")); //Non-numeric value
        }});
    }

    @After
    public void tearDown() {
        //Clean up mocking context
        context = null;
        values = null;
    }

    @Test(expected = InvalidParameterException.class)
    public void testValidDataTableWithNonNumericValues() {
        try {
            //Invocation
            DataUtilities.calculateRowTotal(values, 0);

            //If the method call doesn't throw InvalidParameterException, fail the test
            fail("Expected InvalidParameterException was not thrown");
        } catch (Exception e) {
            //Catch any exception (expected to be InvalidParameterException)
        }
    }
}
