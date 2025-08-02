package com.example.staticdemo;

class Phones {
    // instance variables
    String model;
    String brand;
    static double price;

    void show() {
        System.out.println(model + " : " + brand + " : " + price);
    }

    // Static Method, Now this method can access the static variables without any
    // issue, but when it comes to non static variables, It will give error. It will
    // give error, because as non static variables will be shared, that is how they
    // work, So that makes static method not work,
    // Example : Phones.show() will not work as it is not sure which objects model
    // it needs to print, so it will need to take object as parameter to print data
    // relevant to that object.
    static void show(Phones p) {
        System.out.println(p.model + " : " + p.brand + " : " + price);
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        Phones p1 = new Phones();
        p1.model = "Elite";
        p1.brand = "Samsung";
        Phones.price = 700000;

        p1.show();
        Phones.show(p1);
        // Below Line will work, but it will give warning, because it is treating
        // p1.show(p1) as non static, Meaning, it already asks for which object it needs
        // to print data for, why would you wnat to render it again
        p1.show(p1);
    }

}
