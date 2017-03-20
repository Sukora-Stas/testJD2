package com.it.academy;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Calculation {

    public int addition(int first, int second) {
        return first + second;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public int substraction(Integer a, Integer b) {
        if (a != null || b != null) {
            return (a - b);
        } else {
            System.out.println("Checkout you numbers");
            return 0;
        }
    }

    public double addToPower(double x, double y) {
        return (int) Math.pow(x, y);
    }

    public double dev(double first, double second) {
        double var = 0;
        try {
            var = first / second;
        } catch (ArithmeticException arEx) {
            System.out.println("Недопустимая операция");
        }
        return var;
    }

}
