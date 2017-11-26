package com.gmail.gnoianko;

public class Main {
    public static void main (String[]args){
        Student bohdan = new Student("Bohdan", "Hnoianko", 22, true, "KNUTE",75);
        Student ivan = new Student("Ivan", "Ivanov", 21, true, "KNUTE",75);
        Student roma = new Student("Roman", "Ermak", 22, true, "KNUTE",75);
        Student anna = new Student("Ann", "Klop", 21, true, "KNUTE",75);
        Student vlad = new Student("Vlad", "Bosh", 23, true, "KNUTE",75);
        Student inna = new Student("Inna", "Movchan", 22, true, "KNUTE",75);
        Student artem = new Student("Artem", "Kas`ka", 22, true, "KNUTE",75);
        Student dima = new Student("Dima", "Varva", 24, true, "KNUTE",75);
        Student john = new Student("John", "Robston", 22, true, "KNUTE",75);
        Student den = new Student("Den", "Tsaryk", 21, true, "KNUTE",75);

        Group group = new Group();
        try{
            group.addStudent(bohdan);
            group.addStudent(ivan);
            group.addStudent(roma);
            group.addStudent(anna);
            group.addStudent(vlad);
            group.addStudent(inna);
            group.addStudent(artem);
            group.addStudent(dima);
            group.addStudent(john);
            group.addStudent(den);
        }catch (GroupIsFullException e){
            e.printStackTrace();
        }
        System.out.println(group);
        group.deleteStudent(5);
        group.deleteStudent(6);
        System.out.println(group);
        System.out.println(group.searchStudent("Robston"));



    }
}