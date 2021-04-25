package com.epam.junit;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CtgCulcTest extends BaseTest {

    @Test
    public void ctgPositiveInfinity() {
        double result = calculactor.ctg(Double.POSITIVE_INFINITY);
        assertEquals(1, result, 0);
    }
}
