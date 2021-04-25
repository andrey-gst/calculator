package com.epam.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SubCulcTest extends BaseTest {
    @Test
    public void twoMinusOneLong() {
        long result = calculactor.sub(2,1);
        assertEquals(1, result);
    }

    @Test
    public void twoMinusOneAndAHalfDouble() {
        double result = calculactor.sub(2.0,1.5);
        assertEquals(0.5, result, 0);
    }
}
