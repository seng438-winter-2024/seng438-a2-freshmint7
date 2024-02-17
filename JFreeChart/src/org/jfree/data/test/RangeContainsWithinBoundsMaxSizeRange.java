package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `contains` method in the `Range` class.
 * The test tests the method with an input that is greater than the lower bound of the range and less than the upper bound of the range, 
 * where the lower and upper bounds are -Double.MAX_VALUE and Double.MAX_VALUE respectively.
 */

public class RangeContainsWithinBoundsMaxSizeRange {

    private Range range;

    @Before
    public void setUp() {
        // Create largest range possible
        range = new Range(Double.MAX_VALUE * -1, Double.MAX_VALUE);
    }

    @Test
    public void testContainsWithinBoundsMaxSizeRange() {
        assertTrue(range.contains(0)); // Value within the bounds
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
