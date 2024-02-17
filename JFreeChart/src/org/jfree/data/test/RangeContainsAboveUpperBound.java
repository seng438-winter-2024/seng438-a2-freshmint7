package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `contains` method in the `Range` class.
 * The test tests the method with an input that is just above the upper bound in the 'Range' instance.
 */

public class RangeContainsAboveUpperBound {

    private Range range;

    @Before
    public void setUp() {
        // Create a range between 0 and 10
        range = new Range(0, 10);
    }

    @Test
    public void testContainsAboveUpperBound() {
        assertFalse(range.contains(10.001)); // Value just above the upper bound
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
