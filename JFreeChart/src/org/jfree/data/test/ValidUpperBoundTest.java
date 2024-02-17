package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `getUpperBound()` method in the `Range` class.
 * The method tests the getting of a normal value in a `Range` object.
 */
public class ValidUpperBoundTest {
    private Range range; // Declare an instance variable to hold the Range object.

    @Before
    public void setUp() {
        // Set up the test by creating a Range object with a lower bound of 0.0 and an upper bound of 10.0.
        range = new Range(0.0, 10.0);
    }

    @Test
    public void testValidUpperBound() {
        // Test whether the upper bound of the Range object is equal to 10.0.
        assertEquals(10.0, range.getUpperBound(), 0.0001); // Assert that the upper bound is equal to 10.0 with a delta of 0.0001.
    }

    @After
    public void tearDown() {
        // Clean up after the test by setting the Range object to null.
        range = null;
    }
}
