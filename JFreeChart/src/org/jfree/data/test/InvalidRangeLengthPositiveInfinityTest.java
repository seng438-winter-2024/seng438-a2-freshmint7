package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `getLength()` method in the `Range` class.
 * The method tests the getting of the length between a normal value and POSITIVE_INFINITY in the `Range` object.
 */
public class InvalidRangeLengthPositiveInfinityTest {
    private Range range; // Declare an instance variable to hold the Range object.

    @Before
    public void setUp() {
        // Set up the test by creating a Range object with a lower bound of 0.0 and an upper bound of Double.POSITIVE_INFINITY.
        range = new Range(0.0, Double.POSITIVE_INFINITY);
    }

    @Test
    public void testInvalidRangeLengthPositiveInfinityTest() {
        // Test whether the length of the Range object is Double.POSITIVE_INFINITY.
        assertEquals(Double.POSITIVE_INFINITY, range.getLength(), 0.0001); // Assert that the length is Double.POSITIVE_INFINITY with a delta of 0.0001.
    }

    @After
    public void tearDown() {
        // Clean up after the test by setting the Range object to null.
        range = null;
    }
}
