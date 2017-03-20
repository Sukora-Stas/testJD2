package com.it.academy;

import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void additionTest(){

    }

    @Test
    public void addToPowerTest(){

        Calculation calculation = new Calculation();
        int result = (int) calculation.addToPower(2, 5);
        assertEquals(32, result);
    }
}