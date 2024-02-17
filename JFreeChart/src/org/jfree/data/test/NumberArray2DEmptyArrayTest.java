package org.jfree.data.test;
import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.junit.Test;

/*
 * This class tests the createNumberArray2D method in the DataUtilities class
 * when provided with an empty 2 dimensional array. 
 */

public class NumberArray2DEmptyArrayTest extends DataUtilities {

	@Test(expected = InvalidParameterException.class)
    public void testCreateNumberArray2D_EmptyData() {
        DataUtilities.createNumberArray2D(new double[2][1]); // creates an empty 2 dimensional array with 1 item each to be used
    }
}
