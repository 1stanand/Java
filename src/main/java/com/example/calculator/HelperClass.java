package com.example.calculator;

public class HelperClass {
    int J = 10;

    public void add(double a, double b) {
        System.out.println("Sum of Given Numbers is : " + (a + b));
    }

    public void sub(double a, double b) {
        System.out.println("Substraction of Given Numbers is : " + (a - b));
    }

    public void mul(double a, double b) {
        System.out.println("Multiplication of Given Numbers is : " + (a * b));
    }

    public void div(double a, double b) {
        System.out.println("Division of Given Numbers is : " + (a / b));
    }

    public void div(String a, String b) {
        System.out.println(a + b);
    }
}
