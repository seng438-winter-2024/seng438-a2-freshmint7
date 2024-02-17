package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `intersects` method in the `Range` class.
 * The test tests the method with an input that intersects the 'Range' instance only at the ranges lower bound.
 */

public class RangeIntersectsCommonBoundaryLeft {

    private Range range;

    @Before
    public void setUp() {
        // Create a range between 5 and 10
        range = new Range(5, 10);
    }

    @Test
    public void testIntersectsCommonBoundaryLeft() {
        // Range intersects with input at 5
        assertTrue(range.intersects(0, 5));
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
