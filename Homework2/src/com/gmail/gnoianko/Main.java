/*
1. Создайте абстрактный класс Shape в котором есть два
абстрактных метода double calculateArea() и double calculatePerimetr().
2. Создайте класс Point в котором есть два свойства double x
double y.
3. Создайте классы которые описывают 2
геометрические фигуры (они должны быть подклассами
Shape), при этом они в качестве свойств должны содержать
классы Point.
*/
package com.gmail.gnoianko;

public class Main {
    public static void main(String[] args) {
        Shape trOne = new Triangle(new Point(0, 1), new Point(3, 5), new Point(8, 4));
        System.out.println(trOne);
        System.out.println(trOne.calculateArea());
        System.out.println(trOne.calculatePerimetr());

        System.out.println();

        Shape crOne = new Circle(new Point(0, 0), new Point(3, 3));
        System.out.println(crOne);
        System.out.println(crOne.calculatePerimetr());
        System.out.println(crOne.calculateArea());
    }
}