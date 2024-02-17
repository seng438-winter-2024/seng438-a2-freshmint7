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
 * This class tests the behavior of the calculateRowTotal method in the DataUtilities class 
 * when provided with an invalid row index.
 */

public class TestCalculateRowTotalInvalidRowIndex extends DataUtilities {

    private Mockery context;
    private Values2D values;

    @Before
    public void setUp() {
        //Initialize mocking context and Values2D mock
        context = new Mockery();
        values = context.mock(Values2D.class);

        //Set up expectations for the Values2D mock
        context.checking(new Expectations() {{
            allowing(values).getColumnCount();
            will(returnValue(2)); //Assuming 2 columns in the mock
            allowing(values).getRowCount();
            will(returnValue(1)); //Assuming 1 row in the mock
        }});
    }

    @Test
    public void testInvalidRowIndex() {
        //Invocation and assertion
        try {
            double total = DataUtilities.calculateRowTotal(values, 1); //Invalid row index
            assertEquals(0.0, total, 0.0001); //Check that the method returns 0 for an invalid row index
        } catch (Throwable e) {
            fail("Unexpected exception: " + e.getMessage()); //Fail the test if it does not return 0
        }
    }

    @After
    public void tearDown() {
        //Clean up mocking context
        context = null;
        values = null;
    }
}
