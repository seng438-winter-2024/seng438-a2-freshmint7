package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.jfree.data.Values2D;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * This class tests the behavior of the calculateColumnTotal method in the DataUtilities class 
 * when provided with an invalid column index.
 */

public class TestCalculateColumnTotalInvalidColumnIndex extends DataUtilities {

    private Mockery context;
    private Values2D values;

    @Before
    public void setUp() {
        //Initialize mocking context and Values2D mock
        context = new Mockery();
        values = context.mock(Values2D.class);

        //Set up expectations
        context.checking(new Expectations() {{
            allowing(values).getColumnCount();
            will(returnValue(1)); //Assuming 1 column in the mock
            allowing(values).getRowCount();
            will(returnValue(2)); //Assuming 2 rows in the mock
        }});
    }

    @Test
    public void testInvalidColumnIndex() {
        //Invocation
        try {
            double total = DataUtilities.calculateColumnTotal(values, 1); //Invalid column index
            //Check that the method returns 0 for an invalid column index
            assertEquals(0.0, total, 0.0001);
        } catch (Throwable e) {
            //Fail the test if it does not return 0
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    @After
    public void tearDown() {
        //Clean up mocking context
        context = null;
        values = null;
    }
}
