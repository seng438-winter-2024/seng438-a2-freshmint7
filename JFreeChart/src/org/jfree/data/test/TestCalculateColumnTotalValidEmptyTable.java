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
 * when provided with a valid empty table.
 */
public class TestCalculateColumnTotalValidEmptyTable extends DataUtilities{

    private Mockery context;
    private Values2D values;

    @Before
    public void setUp() {
        //Initialize mocking context and Values2D mock
    	context = new Mockery();
        values = context.mock(Values2D.class);

        //Set up expectations for an empty table
        context.checking(new Expectations() {{
            allowing(values).getRowCount();
            will(returnValue(0));

            allowing(values).getColumnCount();
            will(returnValue(0));
        }});
    }

    @Test
    public void testValidInputEmptyTableCalculateColumnTotal() {
        //Invocation and assertion for an empty table should be 0
        assertEquals(0.0, DataUtilities.calculateColumnTotal(values, 0), 0.0001);
    }

    @After
    public void tearDown() {
        //Clean up mocking context
        context = null;
        values = null;
    }
}
