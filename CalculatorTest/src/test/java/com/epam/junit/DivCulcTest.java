package com.epam.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class DivCulcTest extends BaseTest {
    @Test
    public void sixDivTwoLong() {
        long result = calculactor.div(6,2);
        assertEquals(3, result);
    }

    @Test (expected = NumberFormatException.class)
    public void sevenDivZeroExpectedException() {
        long result = calculactor.div(7, 0);
        fail("Divide by zero exception did not throw!");
    }

    @Test
    public void sixAndAHalfDivTwoDouble() {
        double result = calculactor.div(6.5,2.0);
        assertEquals(3.25, result, 0);
    }
}
