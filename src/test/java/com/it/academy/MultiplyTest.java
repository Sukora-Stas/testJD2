package com.it.academy;

import org.junit.Test;

import org.junit.Assert;

public class MultiplyTest {

    @Test
    public void multiplyMethodTest(){
        Calculation calculation = new Calculation();
        int x = calculation.multiply(5, 6);
        Assert.assertEquals(30, x);
    }
}
