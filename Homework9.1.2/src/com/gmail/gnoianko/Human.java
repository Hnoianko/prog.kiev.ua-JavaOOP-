package com.gmail.gnoianko;

import java.io.Serializable;

public class Human implements Serializable {
    protected String name;
    protected int age;
    protected int weight;
    protected int height;
    protected boolean sex;

    public Human(String name, int age, int weight, int height, boolean sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return " " +
                "name='" + name + '\'' +
                ", sex=" + sex;
    }
}