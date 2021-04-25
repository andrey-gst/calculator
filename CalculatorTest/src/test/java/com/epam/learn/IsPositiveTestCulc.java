package com.epam.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveTestCulc extends BaseTest {

    @Test
    public void isPositiveOne() {
        boolean result = calculactor.isPositive(1);
        Assert.assertTrue(result,"Number is not positive");
    }
}
