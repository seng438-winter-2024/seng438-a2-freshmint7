package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `intersects` method in the `Range` class.
 * The test tests the method with an input that is fully within a range that is the maximum size.
 */

public class RangeIntersectsInputInsideMaxSizeRange {

    private Range range;

    @Before
    public void setUp() {
        // Create largest possible range
        range = new Range(-1 * Double.MAX_VALUE, Double.MAX_VALUE);
    }

    @Test
    public void testIntersectsInputInsideMaxSizeRange() {
        //Input fully enclosed by bounds of range
        assertTrue(range.intersects(-100, 100));
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
