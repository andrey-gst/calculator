package com.epam.learn;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumCulcTest extends BaseTest {
    @Test(dataProvider = "valuesForTestSum")
    public void onePlusTwoLong(long a, long b, long expectedValue) {
        long result = calculactor.sum(a, b);
        Assert.assertEquals(result, expectedValue, "Invalid rusult of sum operation");
    }

    @Test
    public void onePlusTreeDouble() {
        double result = calculactor.sum(3.2, 1.5);
        Assert.assertEquals(result, 4.7, "Invalid rusult of sum operation");
    }

    @DataProvider(name = "valuesForTestSum")
    public Object[][] valuesForSum() {
        return new Object[][] {
                {1, 1, 2},
                {-2, 2, 0},
                {-5, -2, -7},
                {0, 0, 0},
                {4, -2, 2}
        };
    }

}
