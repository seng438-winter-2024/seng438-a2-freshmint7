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
 * when provided with a valid table with the maximum boundary row index.
 */

public class TestCalculateRowTotalValidTableMaxBoundaryRow extends DataUtilities {

    private Mockery context;
    private Values2D values;

    @Before
    public void setUp() {
    	//Initialize mocking context and Values2D mock
        context = new Mockery();
        values = context.mock(Values2D.class);
      //Set up expectations for the Values2D mock
        context.checking(new Expectations() {
            {
                allowing(values).getRowCount();
                will(returnValue(3));
                allowing(values).getColumnCount();
                will(returnValue(2));
                allowing(values).getValue(0, 0);
                will(returnValue(6));
                allowing(values).getValue(0, 1);
                will(returnValue(7.5));
                allowing(values).getValue(1, 0);
                will(returnValue(5));
                allowing(values).getValue(1, 1);
                will(returnValue(2));
                allowing(values).getValue(2, 0);
                will(returnValue(2.5));
                allowing(values).getValue(2, 1);
                will(returnValue(2));
            }
        });
    }

    @After
    public void tearDown() {
    	//Clean up mocking context
        context = null;
        values = null;
    }

    @Test
    public void calculateRowTotalValidTableMaxBoundary() {

        //Invocation and assertion
        assertEquals(4.5, DataUtilities.calculateRowTotal(values, 2), .0001);
    }
}
