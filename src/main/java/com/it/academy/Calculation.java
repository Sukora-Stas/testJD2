package com.it.academy;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Calculation {

    public void add(int first, int second){

    }

    public double dev(double first, double second) {
        try {
            return first / second;
        } catch (ArithmeticException arEx) {
            System.out.println("Недопустимая операция");
        }
    }
}
