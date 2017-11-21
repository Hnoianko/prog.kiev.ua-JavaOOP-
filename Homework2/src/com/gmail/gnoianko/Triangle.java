package com.gmail.gnoianko;

public class Triangle extends Shape {
    private Point a;
    private Point b;
    private Point c;


    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {

    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }


    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    @Override
    public double calculatePerimetr() {
        if (Point.getLength(a, b) > Point.getLength(b, c) + Point.getLength(c, a)
                || Point.getLength(b, c) > Point.getLength(c, a) + Point.getLength(a, b)
                || Point.getLength(c, a) > Point.getLength(b, c) + Point.getLength(a, b)) {
            return -1;
        } else {
            return Point.getLength(a, b) + Point.getLength(b, c) + Point.getLength(a, c);
        }
    }

    @Override
    public double calculateArea() {
        double p = this.calculatePerimetr() / 2;
        if (Point.getLength(a, b) > Point.getLength(b, c) + Point.getLength(c, a)
                || Point.getLength(b, c) > Point.getLength(c, a) + Point.getLength(a, b)
                || Point.getLength(c, a) > Point.getLength(b, c) + Point.getLength(a, b)) {
            return -1;
        } else {
            return Math.sqrt(p * (p - Point.getLength(a, b)) * (p - Point.getLength(b, c))
                    * (p - Point.getLength(c, a)));
        }
    }
}
