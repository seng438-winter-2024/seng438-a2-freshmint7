package org.jfree.data.test;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.junit.Test;

/*
 * This class tests the createNumberArray method in the DataUtilities class
 * when an empty double array is passed in
 */

public class NumberArrayEmptyArrayTest extends DataUtilities {

	@Test(expected = InvalidParameterException.class)
	public void testCreateNumberArray_EmptyData() {
		DataUtilities.createNumberArray(new double[1]); // test using a new empty array
	}

}
