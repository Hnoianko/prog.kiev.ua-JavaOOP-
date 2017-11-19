package com.gmail.gnoianko;

public class Main {
    public static void main(String[] args) {
        Cat catOne = new Cat("Bobik", 4, 4.5, "Black");
        catOne.voice();
        System.out.println(catOne);
        catOne.setCoatColor("White");
        System.out.println(catOne);
    }
}
