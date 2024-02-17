package org.jfree.data.test;

import static org.junit.Assert.*;

import org.jfree.data.DataUtilities;
import org.junit.Test;

/*
 * This class tests the createNumberArray2D method in the DataUtilities class
 * when a valid 2d array is passed in.
 */

public class NumberArray2DTest extends DataUtilities {

    @Test
    public void testCreateNumberArray2D_ValidData() {
        double[][] data = {{1.5, 2.0, 3.7}, {4.2, 5.8, 6.1}}; // valid array with type double

        Number[][] expected = {{1.5, 2.0, 3.7}, {4.2, 5.8, 6.1}}; // expected array after conversion

        Number[][] result = DataUtilities.createNumberArray2D(data); // store the converted array
        
// 		the following commented out code shows that the last element in each subarray has a value of null
        
//        for(int i=0;i<2;i++) {
//        	for(int j=0;j<data[i].length;j++) {
//        		System.out.println(result[i][j]);
//        	}
//        } 
        
        assertArrayEquals(expected, result); // test the result
    }
}
