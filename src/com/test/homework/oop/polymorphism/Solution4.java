package com.test.homework.oop.polymorphism;

    /* "Cat", or "Dog", or "Bird", or "Lamp"
    Implement the method, which defines the type of object which class was passed,
    And prints to the console one of the names: "Cat", "Dog", "Bird", "Lamp".
    */

public class Solution4 {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        //Implement here

    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
