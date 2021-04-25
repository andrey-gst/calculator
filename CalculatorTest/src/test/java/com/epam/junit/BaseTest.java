package com.epam.junit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Before;


public class BaseTest {

    protected Calculator calculactor;

    @Before
    public void setUp() {
        calculactor = new Calculator();
    }

    @After
    public void tearDown() {
        calculactor = null;
    }

}
