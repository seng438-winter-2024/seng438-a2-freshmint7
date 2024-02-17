package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `intersects` method in the `Range` class.
 * The test tests the method with an input range that is from the most negative to most positive number,
 * where the 'Range' instances lower and upper bounds are fully within this input range.
 */

public class RangeIntersectsRangeInsideMaxSizeInput {

    private Range range;

    @Before
    public void setUp() {
        // Create a range between 0 and 10
        range = new Range(0, 10);
    }

    @Test
    public void testIntersectsRangeInsideMaxSizeInput() {
        // range intersects with largest possible input range
        assertTrue(range.intersects(-1 * Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
