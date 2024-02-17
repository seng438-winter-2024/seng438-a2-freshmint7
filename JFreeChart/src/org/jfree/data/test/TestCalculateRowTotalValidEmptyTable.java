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
 * when provided with a valid empty table.
 */

public class TestCalculateRowTotalValidEmptyTable extends DataUtilities {

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
            will(returnValue(0));
            allowing(values).getRowCount();
            will(returnValue(0));
        }});

    }

    @After
    public void tearDown() {
    	//Clean up mocking context
        context = null;
        values = null;
    }

    @Test
    public void testValidInputEmptyTableCalculateRowTotal() {
        assertEquals(0.0, DataUtilities.calculateRowTotal(values, 0), 0.0001); // Sum of values in any row of an empty table should be 0.0
    }
}
