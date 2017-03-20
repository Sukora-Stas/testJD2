package com.it.academy;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    Calculation calc = new Calculation();

    @Test
    public void additionTest(){

        assertEquals("must be 10",10,calc.addition(5,5));


    }

    @Test
    public void addToPowerTest () {
        int result = (int) calc.addToPower(2, 5);
        assertEquals(32, result);

    }
}