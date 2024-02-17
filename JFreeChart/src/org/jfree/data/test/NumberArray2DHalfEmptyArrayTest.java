package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

/*
 * This class tests the createNumberArray2D method in the DataUtilities class
 * when one of the subarrays passed in is empty.
 */

public class NumberArray2DHalfEmptyArrayTest extends DataUtilities {

	@Test
    public void testCreateNumberArray2D_HalfEmpty() {
        double[][] data = {{1.5, 2.0, 3.7, 1.2}, {}}; // array of type double with only 1 valid subarray

        Number[][] expected = {{1.5, 2.0, 3.7, 1.2}, {}}; // same array with type number, as it should be converted

        Number[][] result = DataUtilities.createNumberArray2D(data); // run the method to convert
        
        assertArrayEquals(expected, result); // check result
    }

}
