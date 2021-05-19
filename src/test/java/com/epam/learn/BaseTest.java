package com.epam.learn;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected Calculator calculactor;

    @BeforeClass
    public void setUp() {
        calculactor = new Calculator();
    }

    @AfterClass
    public void tearDown() {
        calculactor = null;
    }

}
