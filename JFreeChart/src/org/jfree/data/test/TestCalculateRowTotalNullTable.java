package org.jfree.data.test;

import java.security.InvalidParameterException;

import org.jfree.data.DataUtilities;
import org.junit.Test;
/**
 * This class tests the behavior of the calculateRowTotal method in the DataUtilities class 
 * when provided with a null table.
 */

public class TestCalculateRowTotalNullTable extends DataUtilities{

	@Test(expected = InvalidParameterException.class)
    public void testNullInputCalculateRowTotal() {
        try {
            // Invocation
            DataUtilities.calculateRowTotal(null, 0); //Method under test
        } catch (Exception e) { //If a Exception other than InvalidParameterException is caught then the test will fail since we are expecting a InvalidParameterException
        }
    }

}
