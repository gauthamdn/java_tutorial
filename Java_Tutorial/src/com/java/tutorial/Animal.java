package com.java.tutorial;

public class Animal {

    int age;
    String gender;
    int weightinKg;

    public Animal(int age, String gender, int weightinKg) {
        this.age = age;
        this.gender = gender;
        this.weightinKg = weightinKg;
    }

    public  void eat(){
        System.out.println("eating...");
    }


    public void sleep(){
        System.out.println("Sleeping");
    }
}
