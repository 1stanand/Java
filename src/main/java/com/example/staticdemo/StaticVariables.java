package com.example.staticdemo;

class Phone {
    String Name;
    String Brand;
    static String Category;

    public void show() {
        System.out.println(Name + " : " + Brand + " : " + Category);
    }
}

public class StaticVariables {

    public static void main(String[] args) {
        Phone mobile1 = new Phone();
        Phone mobile2 = new Phone();
        mobile1.Name = "s23";
        mobile1.Brand = "Samsung";

        mobile1.Category = "smartphone";

        mobile2.Name = "s6";
        mobile2.Brand = "Apple";
        mobile2.Category = "DumbPhone";
        // will work, but Warning is because, Since Static Variable is shared for all
        // the objects that are created fro this class, so why bother naming each
        // object.variable as object does now own this, and mobile2.Category will update
        // value for mobile1.category as well
        mobile1.show();
        mobile2.show();
        Phone.Category = "samrtPhone";
        // standard and Correct Way of calling or using static Variable.
        // Since class owns the variable and all objects share it.
        // Directly tell class to work with variable.
        mobile1.show();
        mobile2.show();
    }

}
