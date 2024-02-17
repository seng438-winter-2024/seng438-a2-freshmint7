package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `intersects` method in the `Range` class.
 * The test tests the method with an input range that fully encloses the 'Range' instances
 * lower and upper bounds.
 */

public class RangeIntersectsRangeInsideInput {

    private Range range;

    @Before
    public void setUp() {
        // Create a range between 2 and 8
        range = new Range(2, 8);
    }

    @Test
    public void testIntersectsRangeInsideInput() {
        // Input fully encompasses range
        assertTrue(range.intersects(0, 10));
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
