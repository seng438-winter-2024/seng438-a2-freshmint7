package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `getLength()` method in the `Range` class.
 * The method tests the getting of the length between two equal points in a `Range` object.
 */
public class SinglePointRangeLengthTest {
    private Range range; // Declare an instance variable to hold the Range object.

    @Before
    public void setUp() {
        // Set up the test by creating a Range object with a lower and upper bound of 3.0, creating a single-point range.
        range = new Range(3.0, 3.0);
    }

    @Test
    public void testSinglePointRangeLength() {
        // Test whether the length of the Range object is 0.0.
        assertEquals(0.0, range.getLength(), 0.0001); // Assert that the length is 0.0 with a delta of 0.0001.
    }

    @After
    public void tearDown() {
        // Clean up after the test by setting the Range object to null.
        range = null;
    }
}
