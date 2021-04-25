package com.epam.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SinTestCalc extends BaseTest {

    @Test
    public void sinZero() {
        double result = calculactor.sin(0);
        assertEquals(0, result, 0);
    }
}
