package com.epam.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultCulcTest extends BaseTest {
    @Test
    public void twoMultTwoLong() {
        long result = calculactor.mult(2,2);
        Assert.assertTrue(result == 4);
    }

    @Test
    public void twoAndAHalfMultTreeDouble() {
        double result = calculactor.mult(2.5,3);
        Assert.assertEquals(result, 7.5, "Wrong multiply 2.5 x 3");
    }

}
