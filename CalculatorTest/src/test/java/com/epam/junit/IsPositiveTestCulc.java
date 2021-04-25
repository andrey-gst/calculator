package com.epam.junit;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class IsPositiveTestCulc extends BaseTest {

    @Test
    public void isPositiveOne() {
        boolean result = calculactor.isPositive(1);
        assertTrue("Number is not positive", result);
    }
}
