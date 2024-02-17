package org.jfree.data.test;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.fail;
/**
 * This class tests the behavior of the calculateColumnTotal method in the DataUtilities class 
 * when provided with a data table containing non-numeric values.
 */

public class TestCalculateColumnTotalNonNumericValues extends DataUtilities {

    private Mockery context;
    private Values2D values;

    @Before
    public void setUp() {
        //Initialize mocking context and Values2D mock
        context = new Mockery();
        values = context.mock(Values2D.class);

        //Set up expectations
        context.checking(new Expectations() {{
            allowing(values).getRowCount();
            will(returnValue(3));
            allowing(values).getColumnCount();
            will(returnValue(1));
            allowing(values).getValue(0, 0);
            will(returnValue("abc")); //Non-numeric value
            allowing(values).getValue(1, 0);
            will(returnValue(5.0)); //Numeric value
            allowing(values).getValue(2, 0);
            will(returnValue("xyz")); //Non-numeric value
        }});
    }

    @Test(expected = InvalidParameterException.class)
    public void testCalculateColumnTotalValidDataTableWithNonNumericValues() {
        try {
            //Invocation
            DataUtilities.calculateColumnTotal(values, 0);

            //If the method call doesn't throw InvalidParameterException, fail the test
            fail("Expected InvalidParameterException was not thrown");
        } catch (Exception e) {
            //Catch any exception other than InvalidParameterException which will cause the test to fail
        }
    }

    @After
    public void tearDown() {
        //Clean up mocking context
        context = null;
        values = null;
    }
}
