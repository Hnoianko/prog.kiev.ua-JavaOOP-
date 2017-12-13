package com.gmail.gnoianko;


public class Main {
    public static void main(String[] args) {
        Student students[] = new Student[12];
        Group group = new Group();

        students[0] = new Student("Artem", 25, 75, 175, true, 2, 4.8);
        students[1] = new Student("Bohdan", 18, 80, 180, true, 2, 4.6);
        students[2] = new Student("Roman", 37, 88, 173, true, 2, 4.3);
        students[3] = new Student("Ivan", 27, 60, 160, true, 2, 3.8);
        students[4] = new Student("Kolya", 24, 100, 154, true, 2, 3.6);
        students[5] = new Student("Serj", 23, 59, 187, true, 2, 5.0);
        students[6] = new Student("Vlad", 22, 105, 200, true, 2, 5.0);
        students[7] = new Student("Illya", 21, 77, 198, true, 2, 4.9);
        students[8] = new Student("Dima", 28, 78, 188, true, 2, 4.7);
        students[9] = new Student("John", 19, 73, 179, true, 2, 3.0);
        students[10] = new Student("Cristian", 34, 81, 168, true, 2, 3.7);
        students[11] = new Student("Hans", 25, 68, 177, true, 2, 3.2);

        try {
            for (int i = 0; i < 8; i++) {
                group.addStudent(students[i]);

            }
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

        group.deleteStudent(2);
        group.deleteStudent(5);

        group.newSort(6);

        System.out.println(group);

        System.out.println(group.findStudent("Ivan"));

        BaseGroup bg = new BaseGroup("bg.txt");
        bg.saveGroup(group);

        System.out.println();
        System.out.println("Reading from file");
        System.out.println(bg.loadGroup());


    }
}