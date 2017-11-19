package com.gmail.gnoianko;

public class Triangle {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        this.sideOne = sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        this.sideTwo = sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        this.sideThree = sideThree;
    }

    public void square() {
        double p = (sideOne + sideTwo + sideThree) / 2;
        if (sideOne > sideTwo + sideThree || sideTwo > sideThree + sideOne || sideThree > sideTwo + sideOne) {
            System.out.println("Incorrect input");
        } else {
            System.out.println("Square = " + Math.sqrt(p * (p - sideOne) * (p - sideTwo) * (p - sideThree)));
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideOne=" + sideOne +
                ", sideTwo=" + sideTwo +
                ", sideThree=" + sideThree +
                '}';
    }
}
