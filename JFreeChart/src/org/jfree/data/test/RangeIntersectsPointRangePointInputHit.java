package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `intersects` method in the `Range` class.
 * The test tests the method with an input range where the lower and upper bounds for the input range are the same, 
 * which are equal to the lower and upper bounds of the 'Range' instance.
 */

public class RangeIntersectsPointRangePointInputHit {

    private Range range;

    @Before
    public void setUp() {
        // Create a single point range at 5
        range = new Range(5, 5);
    }

    @Test
    public void testIntersectsPointRangePointInputHit() {
        // Point range equivalent to input point range
        assertTrue(range.intersects(5, 5));
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
