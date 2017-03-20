package com.it.academy;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {

    @Test
    public void additionTest(){

        Calculation calc = new Calculation();

        assertEquals("must be 10",10,calc.addition(5,5));


    }
}