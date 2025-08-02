package com.example.encapsulation;

public class Humans {

    private String name;
    private static String job;
    private double Salary;
    private int age;

    public String getName() {
        return name;
    }

    public static String getJob() {
        return job;
    }

    public double getSalary() {
        return Salary;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void setJob(String job) {
        Humans.job = job;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void show() {
        System.out.println(this.getName() + " : " + this.getAge() + " : " + Humans.getJob() + " : " + this.getSalary());
    }

}
