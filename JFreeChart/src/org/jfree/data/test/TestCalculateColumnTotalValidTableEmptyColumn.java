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
 * when provided with a valid table with an empty column.
 */
public class TestCalculateColumnTotalValidTableEmptyColumn extends DataUtilities {

    private Mockery context;
    private Values2D values;

    @Before
    public void setUp() {
        //Initialize mocking context and Values2D mock
        context = new Mockery();
        values = context.mock(Values2D.class);

        //Set up expectations for a table with an empty column
        context.checking(new Expectations() {{
            allowing(values).getRowCount();
            will(returnValue(3));

            allowing(values).getColumnCount();
            will(returnValue(1));

            allowing(values).getValue(with(any(int.class)), with(any(int.class)));
            will(returnValue(null)); //Return null for all values in the column
        }});
    }

    @Test
    public void testEmptyColumn() {
        //Invocation and assertion
        assertEquals(0.0, DataUtilities.calculateColumnTotal(values, 0), 0.0001);
    }

    @After
    public void tearDown() {
        //Clean up mocking context
        context = null;
        values = null;
    }
}
