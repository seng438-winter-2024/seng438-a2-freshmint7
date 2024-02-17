package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `intersects` method in the `Range` class.
 * The test tests the method with an input range that entirely encompasses the lower and upper bounds of the 'Range' instance,
 * however the lower and upper bounds of the 'Range' instance are equivalent.
 */

public class RangeIntersectsPointRangeInsideInput {

    private Range range;

    @Before
    public void setUp() {
        // Create a single point range at 5
        range = new Range(5, 5);
    }

    @Test
    public void testIntersectsPointRangeInsideInput() {
        // Single point range enclosed by input
         assertTrue(range.intersects(3, 7));
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
