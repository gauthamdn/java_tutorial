package com.java.tutorial;

import java.sql.SQLOutput;

public class Human {

    String name;
    int age;
    int heightInInches;
    String eyeColor;

    public Human(String name, int age, int heightInInches, String eyeColor) {
        this.name = name;
        this.age = age;
        this.heightInInches = heightInInches;
        this.eyeColor = eyeColor;
    }

//     public Human(){
//        age = 18;
//        name = "Tom";
//        eyeColor = "Brown";
//        heightInInches = 7;
//    }

    public void speak(){
        System.out.println("Hello, My name is "+name);
        System.out.println("Iam a human");
        System.out.println("My age is "+ age);
    }

    public void eat() {
        System.out.println("eating...");
    }
    public void walk(){
        System.out.println("walking...");
    }

}
