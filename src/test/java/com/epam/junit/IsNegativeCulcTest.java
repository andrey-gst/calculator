package com.epam.junit;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class IsNegativeCulcTest extends BaseTest {

    @Test
    public void isNegativeMinusOne() {
        boolean result = calculactor.isNegative(-1);
        assertTrue("Number is not negative", result);
    }
}
