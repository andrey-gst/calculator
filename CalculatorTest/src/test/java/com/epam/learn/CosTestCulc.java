package com.epam.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CosTestCulc extends BaseTest {

    @Test
    public void cosZero() {
        double result = calculactor.cos(0);
        Assert.assertEquals(result, 1, "Wrong cosine of 0");
    }
}
