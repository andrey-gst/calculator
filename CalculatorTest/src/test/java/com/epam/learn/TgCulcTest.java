package com.epam.learn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TgCulcTest extends BaseTest {

    @Test
    public void tgOne() {
        double result = calculactor.tg(180);
        Assert.assertEquals(result, 0, "Wrong tangent of 0 degree");
    }
}
