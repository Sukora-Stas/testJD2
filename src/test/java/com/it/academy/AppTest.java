package com.it.academy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest{

    @Test
    public void additionTest() {

        Calculation calc = new Calculation();

        assertEquals("must be 10", 10, calc.addition(5, 5));

    }

    @Test
    public void multiplyMethodTest(){
        Calculation calculation = new Calculation();
        int x = calculation.multiply(5, 6);
        Assert.assertEquals(30, x);
    }

}