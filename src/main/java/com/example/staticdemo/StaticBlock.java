package com.example.staticdemo;

class Cars {
    String brand;
    String model;
    static double price;
    // Static Block will only be called once, No matter how many objects are created
    // for Cars
    static {
        price = 900000;
        System.out.println("in static block now");
    }

    // Every Time an Object is created of Cars , Constructor is called. So we do Not
    // Include Static variable inside constructor, because it is shared anyways, so
    // why initialize that variable for every object.
    public Cars() {
        brand = "X";
        model = "X";
    }

    // Constructor overloading And Parameterzied Constructor
    public Cars(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        Cars.price = price;

    }

    public void show() {
        System.out.println(brand + " : " + model + " : " + price);
    }
}

public class StaticBlock {

    public static void main(String[] args) {
        Cars car = new Cars();
        Cars car1 = new Cars();

        car.show();
        car1.show();
        Cars.price = 50;
        car.show();

        Cars newCar = new Cars("Tesla", "S", 600000);
        newCar.show();
    }

}
