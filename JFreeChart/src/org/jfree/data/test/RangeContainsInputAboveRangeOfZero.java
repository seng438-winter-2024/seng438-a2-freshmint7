package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `contains` method in the `Range` class.
 * The test tests the method with an input that is just above the upper bound of the range, but where the lower and upper bounds are equivalent
 */

public class RangeContainsInputAboveRangeOfZero {

    private Range range;

    @Before
    public void setUp() {
        // Create a point range at 0
        range = new Range(0, 0);
    }

    @Test
    public void testContainsInputAboveRangeOfZero() {
        assertFalse(range.contains(1)); // Value above the range
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
