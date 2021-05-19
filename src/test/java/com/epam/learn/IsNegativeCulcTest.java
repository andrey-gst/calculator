package com.epam.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegativeCulcTest extends BaseTest {

    @Test
    public void isNegativeMinusOne() {
        boolean result = calculactor.isNegative(-1);
        Assert.assertTrue(result,"Number is positive");
    }
}
