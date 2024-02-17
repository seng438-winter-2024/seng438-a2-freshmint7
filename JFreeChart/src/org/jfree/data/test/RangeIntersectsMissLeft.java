package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `intersects` method in the `Range` class.
 * The test tests the method with an input range where the input upper bound is less than the 'Range' instance lower bound.
 */

public class RangeIntersectsMissLeft {

    private Range range;

    @Before
    public void setUp() {
        // Create a range between 5 and 10
        range = new Range(5, 10);
    }

    @Test
    public void testIntersectsMissLeft() {
        // Upper bound of input doesn't intersect with lower bound of range
        assertFalse(range.intersects(0, 4));
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
