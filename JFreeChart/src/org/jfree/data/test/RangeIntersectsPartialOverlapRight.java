package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `intersects` method in the `Range` class.
 * The test tests the method with an input range where the input lower bound is less than the 'Range' instances upper bound,
 * however the input upper bound is still more than the 'Range' instances upper bound, hence a partial overlap.
 */

public class RangeIntersectsPartialOverlapRight {

    private Range range;

    @Before
    public void setUp() {
        // Create a range between 5 and 10
        range = new Range(5, 10);
    }

    @Test
    public void testIntersectsPartialOverlapRight() {
        // Partial Overlap on the left side of the range with the input
        boolean result = range.intersects(8, 12);

        // Verify that the ranges intersect
        assertTrue(result);
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
