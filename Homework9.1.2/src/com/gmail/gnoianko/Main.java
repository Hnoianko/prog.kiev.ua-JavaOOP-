package com.gmail.gnoianko;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        Group group = new Group();

        Student artem = new Student("Artem", 25, 75, 175, true, 2, 4.8);
        Student bohdan = new Student("Bohdan", 18, 80, 180, true, 2, 4.6);
        Student roman = new Student("Roman", 37, 88, 173, true, 2, 4.3);
        Student ivan = new Student("Ivan", 27, 60, 160, true, 2, 3.8);
        Student kolya = new Student("Kolya", 24, 100, 154, true, 2, 3.6);
        Student serj = new Student("Serj", 23, 59, 187, true, 2, 5.0);
        Student vlad = new Student("Vlad", 22, 105, 200, true, 2, 5.0);
        Student illya = new Student("Illya", 21, 77, 198, true, 2, 4.9);
        Student dima = new Student("Dima", 28, 78, 188, true, 2, 4.7);
        Student john = new Student("John", 19, 73, 179, true, 2, 3.0);
        Student cristian = new Student("Cristian", 34, 81, 168, true, 2, 3.7);
        Student hans = new Student("Hans", 25, 68, 177, true, 2, 3.2);

        try {
            group.addStudent(artem);
            group.addStudent(bohdan);
            group.addStudent(roman);
            group.addStudent(ivan);
            group.addStudent(kolya);
            group.addStudent(serj);
            group.addStudent(vlad);
            group.addStudent(illya);
            group.addStudent(dima);
            group.addStudent(john);
            group.addStudent(cristian);
            group.addStudent(hans);
        } catch (MyException e) {
            e.printStackTrace();
        }
        /*
        try {
            group.addStudentInteractive();
        } catch (MyException e) {
            e.printStackTrace();
        }
        */

        System.out.println(group);
        System.out.println();

        group.deleteStudent(serj);
        group.deleteStudent(vlad);

        group.newSort(6);
//        group.sort();
        System.out.println("Interactive sorting -> " + group);
        System.out.println();


//        System.out.println("Simple sorting -> "+group);

        System.out.println(group.findStudent("Ivan"));

        BaseGroup bg = new BaseGroup("bg.txt");
        bg.saveGroup(group);

        System.out.println();
        System.out.println("Reading from file");
        System.out.println(bg.loadGroup());

        System.out.println();
        System.out.println("Homework9");

        List<String> myList = new ArrayList<>();
        for (char c = 'A'; c <= 'J'; c++) {
            String s = new String();
            s += c;
            myList.add(s);
        }
        System.out.println(myList);
        myList.remove(0);
        myList.remove(0);
        myList.remove(myList.size() - 1);
        System.out.println(myList);

    }
}