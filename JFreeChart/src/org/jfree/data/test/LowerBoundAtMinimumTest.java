package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `getLowerBound()` method in the `Range` class.
 * The method tests the getting of a -MAX_VALUE value in the `Range` object.
 */
public class LowerBoundAtMinimumTest {
    private Range range; // Declare an instance variable to hold the Range object.

    @Before
    public void setUp() {
        // Set up the test by creating a Range object with a lower bound of -Double.MAX_VALUE and an upper bound of 10.0.
        range = new Range(-Double.MAX_VALUE, 10.0);
    }

    @Test
    public void testLowerBoundAtMinimum() {
        // Test whether the lower bound of the Range object is equal to -Double.MAX_VALUE.
        assertEquals(-Double.MAX_VALUE, range.getLowerBound(), 0.0001); // Assert that the lower bound is equal to -Double.MAX_VALUE with a delta of 0.0001.
    }

    @After
    public void tearDown() {
        // Clean up after the test by setting the Range object to null.
        range = null;
    }
}
