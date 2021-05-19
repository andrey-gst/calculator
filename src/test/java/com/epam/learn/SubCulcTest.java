package com.epam.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCulcTest extends BaseTest {
    @Test(groups = "first")
    public void twoMinusOneLong() {
        long result = calculactor.sub(2,1);
        Assert.assertTrue(result == 1);
    }

    @Test
    public void twoMinusOneAndAHalfDouble() {
        double result = calculactor.sub(2.0,1.5);
        Assert.assertTrue(result == 0.5);
    }
}
