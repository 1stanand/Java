package com.example.encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Humans h1 = new Humans();
        h1.setAge(10);
        h1.setName("Anand");
        Humans.setJob("IT");
        h1.setSalary(50000);
        h1.show();
    }
}
