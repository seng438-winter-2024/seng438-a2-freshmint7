package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `intersects` method in the `Range` class.
 * The test tests the method with an input that intersects the 'Range' instance only at the ranges upper bound.
 */

public class RangeIntersectsCommonBoundaryRight {

    private Range range;

    @Before
    public void setUp() {
        // Create a range between 0 and 5
        range = new Range(0, 5);
    }

    @Test
    public void testIntersectsCommonBoundaryRight() {
        // Range intersects with input at 5
        assertTrue(range.intersects(5, 10));
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
