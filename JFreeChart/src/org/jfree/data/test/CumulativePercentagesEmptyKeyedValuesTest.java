package org.jfree.data.test;
import java.security.InvalidParameterException;
import org.jfree.data.DefaultKeyedValues;

import org.jfree.data.DataUtilities;
import org.junit.Test;

/*
 * This class tests the exception that gets returned from the getCumulativePercentages in the DataUtilities class
 * when provided with an empty KeyedValues object
 */

public class CumulativePercentagesEmptyKeyedValuesTest extends DataUtilities {

	@Test(expected = InvalidParameterException.class)
    public void testGetCumulativePercentages_EmptyData() {
        DataUtilities.getCumulativePercentages(new DefaultKeyedValues()); // creates an empty KeyedValues object to be used in testing
    }

}
