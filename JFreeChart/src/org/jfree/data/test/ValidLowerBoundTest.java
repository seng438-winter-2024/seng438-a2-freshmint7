package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `getLowerBound()` method in the `Range` class.
 * The method tests the getting of a normal value in the `Range` object.
 */
public class ValidLowerBoundTest {
    private Range range; // Declare an instance variable to hold the Range object.

    @Before
    public void setUp() {
        // Set up the test by creating a Range object with a lower bound of 0.0 and an upper bound of 10.0.
        range = new Range(0.0, 10.0);
    }

    @Test
    public void testValidLowerBound() {
        // Test whether the lower bound of the Range object is equal to 0.0.
        assertEquals(0.0, range.getLowerBound(), 0.0001); // Assert that the lower bound is equal to 0.0 with a delta of 0.0001.
    }

    @After
    public void tearDown() {
        // Clean up after the test by setting the Range object to null.
        range = null;
    }
}
