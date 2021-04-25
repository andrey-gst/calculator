package com.epam.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowCulcTest extends BaseTest {
    
    @Test(groups = "first")
    public void twoAndAHalfPowTwo() {
        double result = calculactor.pow(2.5,2);
        Assert.assertEquals(result, 6.25, "Wrong exponentiation 2.5 x 2");
    }
}
