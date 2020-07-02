package com.java.tutorial;

public class Earth {

    public static void main(String args[]){
        Human tom;
        tom = new Human("tom",18,8,"brown");
        tom.age = 18;
        tom.name = "Tom";
        tom.eyeColor = "Brown";
        tom.heightInInches = 7;

        tom.speak();
        tom.walk();

        Human joe = new Human("Joe",12,5,"Blue");

        //joe.age = 36;
        joe.speak();
    }
}
