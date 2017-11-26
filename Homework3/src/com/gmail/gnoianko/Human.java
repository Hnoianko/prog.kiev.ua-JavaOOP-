package com.gmail.gnoianko;

public class Human {
    private String name;
    private String sureName;
    private int age;
    private boolean sex;

    public Human(String name, String sureName, int age, boolean sex) {
        this.name = name;
        this.sureName = sureName;
        this.age = age;
        this.sex = sex;
    }
    public Human(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
