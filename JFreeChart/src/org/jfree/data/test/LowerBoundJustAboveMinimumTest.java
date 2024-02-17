package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `getLowerBound()` method in the `Range` class.
 * The method tests the getting of a value near the -MAX_VALUE in the `Range` object.
 */
public class LowerBoundJustAboveMinimumTest {
    private Range range; // Declare an instance variable to hold the Range object.

    @Before
    public void setUp() {
        // Set up the test by creating a Range object with a lower bound just above -Double.MAX_VALUE and an upper bound of 10.0.
        range = new Range(-Double.MAX_VALUE/2, 10.0);
    }

    @Test
    public void testLowerBoundJustAboveMinimum() {
        // Test whether the lower bound of the Range object is equal to -Double.MAX_VALUE/2.
    	// We divide the -Double.MAX_VALUE by two to give us a number close to the 
    	// minimum since addition/subtraction doesn't work because of precision.
        assertEquals(-Double.MAX_VALUE/2, range.getLowerBound(), 0.0001); // Assert that the lower bound is equal to -Double.MAX_VALUE/2 with a delta of 0.0001.
    }

    @After
    public void tearDown() {
        // Clean up after the test by setting the Range object to null.
        range = null;
    }
}
