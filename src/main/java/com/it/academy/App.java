package com.it.academy;


public class App {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        int a = calc.addition(5, 5);
        System.out.println(a);
        a = calc.multiply(5, 5);
        System.out.println(a);
        a = calc.substraction(10, 5);
        System.out.println(a);
        a = (int) calc.addToPower(5, 57);
        System.out.println(a);
        a = (int) calc.dev(5, 5);
        System.out.println(a);
        String str = calc.stringPrint();
        System.out.println(str);
    }

}
