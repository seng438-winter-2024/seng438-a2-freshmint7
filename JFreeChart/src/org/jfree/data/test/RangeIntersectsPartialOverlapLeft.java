package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `intersects` method in the `Range` class.
 * The test tests the method with an input range where the input upper bound is greater than the 'Range' instances lower bound,
 * however the input lower bound is still less than the 'Range' instances lower bound, hence a partial overlap.
 */

public class RangeIntersectsPartialOverlapLeft {

    private Range range;

    @Before
    public void setUp() {
        // Create a range between 5 and 10
        range = new Range(5, 10);
    }

    @Test
    public void testIntersectsPartialOverlapLeft() {
        // Partial Overlap on the left side of the range with the input
        assertTrue(range.intersects(3, 7));
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
