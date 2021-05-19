package com.epam.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PowCulcTest extends BaseTest {
    
    @Test
    public void twoAndAHalfPowTwo() {
        double result = calculactor.pow(2.5,2);
        assertEquals(6.25, result, 0);
    }
}
