package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `intersects` method in the `Range` class.
 * The test tests the method with an input range where the input lower bound is more than the 'Range' instances upper bound.
 */

public class RangeIntersectsMissRight {

    private Range range;

    @Before
    public void setUp() {
        // Create a range between 5 and 10
        range = new Range(5, 10);
    }

    @Test
    public void testIntersectsMissRight() {
        // Lower bound of input doesn't intersect with upper bound of range
        assertFalse(range.intersects(15, 20));
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
