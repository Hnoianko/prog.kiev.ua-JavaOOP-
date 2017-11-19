package com.gmail.gnoianko;

public class Main {
    public static void main(String[] args) {
        Triangle trOne = new Triangle(3.5, 5.4, 6.0);
        System.out.println(trOne);
        trOne.square();

        System.out.println();

        Triangle trTwo = new Triangle(10, 5.4, 1.0);
        System.out.println(trOne);
        trTwo.square();
    }
}
