package org.jfree.data.test;

import java.security.InvalidParameterException;
import org.jfree.data.DataUtilities;
import org.junit.Test;
/**
 * This class tests the behavior of the calculateColumnTotal method in the DataUtilities class 
 * when provided with a null table.
 */

public class TestCalculateColumnTotalNullTable extends DataUtilities {

    @Test(expected = InvalidParameterException.class)
    public void testNullInputCalculateColumnTotal() {
        try {
            // Invocation
            DataUtilities.calculateColumnTotal(null, 0); // Method under test
        } catch (Exception e) {
            // If an exception other than InvalidParameterException is caught, the test will fail since we are expecting an InvalidParameterException
        }
    }
}
