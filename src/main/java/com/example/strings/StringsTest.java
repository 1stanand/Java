package com.example.strings;

public class StringsTest {
    public static void main(String[] args) {
        String name = new String("Amit");
        System.out.println(name);
        String namo = "anand";
        String namo1 = "anand";
        System.out.println(namo);

        if (namo == namo1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        StringBuffer surname = new StringBuffer("Vaibhav");
        StringBuffer surname1 = new StringBuffer("Vaibhav");
        if (surname == surname1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        surname.append("abc");
        System.out.println(surname);
    }
}
