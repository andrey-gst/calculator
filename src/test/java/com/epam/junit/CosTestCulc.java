package com.epam.junit;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CosTestCulc extends BaseTest {

    @Test
    public void cosZero() {
        double result = calculactor.cos(0);
        assertEquals(1, result, 0);
    }
}
