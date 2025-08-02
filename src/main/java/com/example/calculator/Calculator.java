package com.example.calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HelperClass calc = new HelperClass();
        System.out.println("Enter First Number : ");
        double a = sc.nextDouble();
        System.out.println("Enter Second Number : ");
        double b = sc.nextDouble();

        System.out.println("Enter Your Operator : ");
        String Operator = sc.next();
        sc.close();
        switch (Operator) {
            case "+":
                calc.add(a, b);
                break;
            case "-":
                calc.sub(a, b);
                break;
            case "*":
                calc.mul(a, b);
                break;
            case "/":
                calc.div(a, b);
                break;
            default:
                System.out.println("Expected Operator Values are '+','-','*','/'");
                break;
        }
    }
}
