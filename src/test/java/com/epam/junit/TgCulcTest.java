package com.epam.junit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TgCulcTest extends BaseTest {

    @Test
    public void tgOne() {
        double result = calculactor.tg(180);
        assertEquals(0, result, 0);
    }
}
