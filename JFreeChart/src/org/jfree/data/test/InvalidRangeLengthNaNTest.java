package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `getLength()` method in the `Range` class.
 * The method tests the getting of the length between a NaN and NaN in the `Range` object.
 */
public class InvalidRangeLengthNaNTest {
    private Range range; // Declare an instance variable to hold the Range object.

    @Before
    public void setUp() {
        // Set up the test by creating a Range object with both lower and upper bounds as NaN.
        range = new Range(Double.NaN, Double.NaN);
    }

    @Test
    public void testInvalidRangeLengthNaN() {
        // Test whether the length of the Range object is NaN.
        assertTrue(Double.isNaN(range.getLength())); // Assert that the length is NaN.
    }

    @After
    public void tearDown() {
        // Clean up after the test by setting the Range object to null.
        range = null;
    }
}
