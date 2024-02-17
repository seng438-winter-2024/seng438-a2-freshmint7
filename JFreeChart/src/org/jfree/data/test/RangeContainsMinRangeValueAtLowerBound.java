package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `contains` method in the `Range` class.
 * The test tests the method with an input that is equivalent to the upper bound, where both equal  -Double.MAX_VALUE
 */

public class RangeContainsMinRangeValueAtLowerBound {

    private Range range;

    @Before
    public void setUp() {
        // Create a range with most negative lower bound
        range = new Range(Double.MAX_VALUE * -1, 0);
    }

    @Test
    public void testContainsMinRangeValueAtLowerBound() {
        assertTrue(range.contains(Double.MAX_VALUE * -1)); // Value at the lower bound
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
