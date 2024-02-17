package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `contains` method in the `Range` class.
 * The test tests the method with an input that is equivalent to the upper bound, where both equal Double.MAX_VALUE
 */

public class RangeContainsMaxRangeValueAtUpperBound {

    private Range range;

    @Before
    public void setUp() {
        // Create a range between 0 and max double value
        range = new Range(0, Double.MAX_VALUE);
    }

    @Test
    public void testContainsMaxRangeValueAtUpperBound() {

        assertTrue(range.contains(Double.MAX_VALUE)); // Value at the upper bound
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
