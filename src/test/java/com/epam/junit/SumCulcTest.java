package com.epam.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)
public class SumCulcTest extends BaseTest {



    private int a;
    private int b;
    private int expected;

    public SumCulcTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
            {1, 1, 2},
            {3, 2, 5},
            {-1, 1, 0},
            {2, -3, -1},
            {0, 0, 0}
        });
    }

    @Test
    public void parametrizedSumTest() {
        long result = calculactor.sum(a, b);
        assertEquals(expected, result);
    }




}
