package com.epam.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtCulcTest extends BaseTest {
    @Test
    public void sixAndAQuaterSqrt() {
        double result = calculactor.sqrt(6.25);
        Assert.assertEquals(result, 2.5, "Wrong square root of 6.25");
    }
}
