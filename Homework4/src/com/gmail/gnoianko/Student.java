package com.gmail.gnoianko;

public class Student extends Human implements Comparable {
    private int course;
    private double avgScore;
    private String university;

    public Student(String name, int age, int weight, int height, boolean sex, int course, double avgScore) {
        super(name, age, weight, height, sex);
        this.course = course;
        this.avgScore = avgScore;
        this.university = "KPI";
    }

    public Student() {
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }


    @Override
    public int compareTo(Object o) {
        Student anotherStudent = (Student) o;
        return this.getName().compareTo(anotherStudent.getName());

    }

    @Override
    public String toString() {
        return "{" +
                "course=" + course +
                "AvgScore = " + avgScore +
                " } " + super.toString();
    }
}
