package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `getUpperBound()` method in the `Range` class.
 * The method tests the getting of NaN value in the `Range` object.
 */
public class InvalidUpperBoundNaNTest {
    private Range range; // Declare an instance variable to hold the Range object.

    @Before
    public void setUp() {
        // Set up the test by creating a Range object with a lower bound of 0.0 and an upper bound of Double.NaN.
        range = new Range(0.0, Double.NaN);
    }

    @Test
    public void testInvalidUpperBoundNaN() {
        // Test whether the upper bound of the Range object is NaN.
        assertEquals(Double.NaN, range.getUpperBound(), 0.0001); // Assert that the upper bound is NaN with a delta of 0.0001.
    }

    @After
    public void tearDown() {
        // Clean up after the test by setting the Range object to null.
        range = null;
    }
}
