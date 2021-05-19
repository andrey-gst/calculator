package com.epam.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinTestCalc extends BaseTest {

    @Test
    public void sinZero() {
        double result = calculactor.sin(0);
        Assert.assertEquals(result, 0, "Wrong sinus of 0");
    }
}
