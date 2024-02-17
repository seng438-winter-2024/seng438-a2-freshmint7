package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

/*
 * This class tests the createNumberArray method in the DataUtilities class
 * when a valid double array is passed in
 */

public class NumberArrayTest extends DataUtilities {

	@Test
	public void testCreateNumberArray_ValidData() {
		double[] data = { 1.5, 2.0, 3.7, 1.2 }; // valid array with type double

		Number[] expected = { 1.5, 2.0, 3.7, 1.2 }; // copy of the original array but with type number

		Number[] result = DataUtilities.createNumberArray(data); // convert the original array to new type

// 		The following commented out code prints out the converted array, you will notice that the last value is always null
		
//        	for(int j=0;j<data.length;j++) {
//        		System.out.println(result[j]);
//        	} 

		assertArrayEquals(expected, result); // check result
	}
}
