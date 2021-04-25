package com.epam.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MultCulcTest extends BaseTest {
    @Test
    public void twoMultTwoLong() {
        long result = calculactor.mult(2,2);
        assertEquals(4, result);
    }

    @Test
    public void twoAndAHalfMultTreeDouble() {
        double result = calculactor.mult(2.5,3);
        assertEquals(7.5, result, 0);
    }

}
