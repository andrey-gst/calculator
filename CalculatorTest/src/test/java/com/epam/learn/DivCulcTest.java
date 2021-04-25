package com.epam.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivCulcTest extends BaseTest {
    @Test
    public void sixDivTwoLong() {
        long result = calculactor.div(6,2);
        Assert.assertEquals(result, 3, "Wrong division 6 : 2");
    }

    @Test
    public void sevenDivZero() {
        long result = calculactor.div(7, 0);

    }

    @Test
    public void sixAndAHalfDivTwoDouble() {
        double result = calculactor.div(6.5,2.0);
        Assert.assertEquals(result, 3.25, "Wrong division 6.5 : 2.0");
    }
}
