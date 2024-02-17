package org.jfree.data.test;

import static org.junit.Assert.*;
import org.jfree.data.Range;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class contains a JUnit test case for the `intersects` method in the `Range` class.
 * The test tests the method with an input range where the lower and upper bounds for the input range are the same.
 * The 'Range' instance is also a range where the lower and upper bounds are equivalent. In this case, the 'Range' 
 * instances lower and upper bounds are more than those input into the function.
 */


public class RangeIntersectsPointRangePointInputMissLeft {
    private Range range;

    @Before
    public void setUp() {
        //Point range at 5
        range = new Range(5, 5);
    }

    @Test
    public void testIntersectsPointRangePointInputMissLeft() {
        //Point range at 5 point range at 3 to the left
        assertFalse(range.intersects(3, 3));
    }

    @After
    public void tearDown() {
        // Clean up resources
        range = null;
    }
}
