package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `contains` method in the `Range` class.
 * This test tests the method with an input that is just above the lower bound in the 'Range' instance.
 */

public class RangeContainsAboveLowerBound {

    private Range range;

    @Before
    public void setUp() {
        // Create a range between 0 and 10
        range = new Range(0, 10);
    }

    @Test
    public void testContainsAboveUpperBound() {
        assertTrue(range.contains(0.001)); // Value just above the Lower bound
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
