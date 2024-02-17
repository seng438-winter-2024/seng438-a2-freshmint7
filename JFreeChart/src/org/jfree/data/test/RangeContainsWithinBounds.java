package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `contains` method in the `Range` class.
 * The test tests the method with an input that is greater than the lower bound of the range and less than the upper bound of the range
 */

public class RangeContainsWithinBounds {

    private Range range;

    @Before
    public void setUp() {
        // Create a range between 0 and 10
        range = new Range(0, 10);
    }

    @Test
    public void testContainsWithinBounds() {
        assertTrue(range.contains(5)); // Value within the bounds
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
