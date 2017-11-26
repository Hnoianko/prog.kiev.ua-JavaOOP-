package com.gmail.gnoianko;

public class Student extends Human {
    private String university;
    private double totalMark;

    public Student(String name, String sureName, int age, boolean sex, String university, double totalMark) {
        super(name, sureName, age, sex);
        this.university = university;
        this.totalMark = totalMark;
    }

    public Student() {
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "university='" + university + '\'' +
                ", totalMark=" + totalMark+", " + super.toString() +
                '}';
    }
}
