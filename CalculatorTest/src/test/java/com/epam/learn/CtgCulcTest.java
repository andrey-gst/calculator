package com.epam.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgCulcTest extends BaseTest {

    @Test
    public void ctgPositiveInfinity() {
        double result = calculactor.ctg(Double.POSITIVE_INFINITY);
        Assert.assertEquals(result, 1, "Wrong ctangent of + infinity");
    }
}
