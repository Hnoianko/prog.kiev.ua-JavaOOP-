package com.gmail.gnoianko;

public class Circle extends Shape {
    private Point centr;
    private Point circlePoint;
    private double radius;

    public Circle(Point centr, Point circlePoint) {
        this.centr = centr;
        this.circlePoint = circlePoint;
        radius = Point.getLength(centr, circlePoint);
    }

    public Point getCentr() {
        return centr;
    }

    public void setCentr(Point centr) {
        this.centr = centr;
    }

    public Point getCirclePoint() {
        return circlePoint;
    }

    public void setCirclePoint(Point circlePoint) {
        this.circlePoint = circlePoint;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "centr=" + centr +
                ", circlePoint=" + circlePoint +
                ", radius=" + radius +
                '}';
    }

    @Override
    public double calculatePerimetr() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
