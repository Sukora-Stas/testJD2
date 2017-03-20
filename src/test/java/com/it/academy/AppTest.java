package com.it.academy;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void additionTest() {
        Calculation calc = new Calculation();
        assertEquals("must be 10", 10, calc.addition(5, 5));
    }

    @Test
    public void subtractionTest() {
        Calculation calc = new Calculation();
        assertEquals("", 95, calc.substraction(100, 5));
    }

}