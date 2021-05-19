package com.epam.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SqrtCulcTest extends BaseTest {
    @Test
    public void sixAndAQuaterSqrt() {
        double result = calculactor.sqrt(6.25);
        assertEquals(2.5, result, 0);
    }
}
