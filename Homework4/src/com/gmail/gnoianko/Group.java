package com.gmail.gnoianko;

import java.util.Arrays;
import java.util.Scanner;

public class Group implements Voenkom {
    private int id;
    private Student student[] = new Student[10];

    public Group() {
    }


    public void addStudent(Student student) throws MyException {
        if (student != null) {
            int i = 0;
            while (this.student[i] != null) {
                i++;
                if (i == 10)
                    throw new MyException();
            }
            this.student[i] = student;
        } else {
            System.out.println("student is null");
        }

    }

    public void addStudentInteractive() throws MyException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name");
        String name = scanner.nextLine();

        System.out.println("Enter age (15-45)");
        int age = scanner.nextInt();

        System.out.println("Enter weight (20-199)");
        int weight = scanner.nextInt();

        System.out.println("Enter height(120 - 256)");
        int height = scanner.nextInt();

        System.out.println("Enter sex (true or false)");
        boolean sex = scanner.nextBoolean();

        System.out.println("Enter course (1-7)");
        int course = scanner.nextInt();

        System.out.println("Enter Score (2.0 - 5.0)");
        double score = scanner.nextDouble();

        if (!check(name, age, weight, height, course, score))
            return;

        try {
            this.addStudent(new Student(name, age, height, weight, sex, course, score));
        } catch (MyException e) {
            throw new MyException();
        }

    }

    private static boolean check(String name, int age, int weight, int height, int course, double score) {
        if (name == null || name.length() < 3)
            return false;
        if (age < 15 || age > 45)
            return false;
        if (weight < 20 || weight > 199)
            return false;
        if (height < 120 || height > 256)
            return false;
        if (score > 5 || score < 2)
            return false;
        if (course < 1 || course > 7)
            return false;
        return true;

    }


    public void deleteStudent(int i) {
        if (this.student[i - 1] != null && i >= 0 && i < 10) {
            this.student[i - 1] = null;
        } else
            System.out.println("Error. Student does not exist or index not supported ");
    }

    public Student findStudent(String name) {
        if (name != null) {
            for (int i = 0; i < 10; i++) {
                if (this.student[i] == null) {

                } else {
                    if (this.student[i].getName().equalsIgnoreCase(name))
                        return this.student[i];
                }
            }
        }
        return null;
    }

    private void sort() {
        for (int i = this.student.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (
                        this.student[j] != null &&
                                this.student[j + 1] != null &&
                                this.student[j].getName().compareTo(this.student[j + 1].getName()) > 0
                        ) {
                    Student tmp = this.student[j];
                    this.student[j] = this.student[j + 1];
                    this.student[j + 1] = tmp;

                }

            }
        }
    }

    public void newSort(int i) {
        this.nullToEnd();
        switch (i) {
            case 1:
                Arrays.sort(student, (one, two) -> {
                    if (one != null && two != null)
                        return one.getName().compareTo(two.getName());
                    else
                        return 0;
                });
                break;
            case 2:
                Arrays.sort(student, (one, two) -> {
                    if (one != null && two != null)
                        return one.getAge() - two.getAge();
                    else
                        return 0;
                });
                break;
            case 3:
                Arrays.sort(student, (one, two) -> {
                    if (one != null && two != null)
                        return one.getWeight() - two.getWeight();
                    else
                        return 0;
                });
                break;
            case 4:
                Arrays.sort(student, (one, two) -> {
                    if (one != null && two != null)
                        return one.getHeight() - two.getHeight();
                    else
                        return 0;
                });
                break;
            case 5:
                Arrays.sort(student, (one, two) -> {
                    if (one != null && two != null)
                        return one.getCourse() - two.getCourse();
                    else
                        return 0;
                });
                break;
            case 6:
                Arrays.sort(student, (one, two) -> {
                    if (one != null && two != null)
                        return (int) (one.getAvgScore() * 10000 - two.getAvgScore() * 10000);
                    else
                        return 0;
                });
                break;
        }


    }

    private void nullToEnd() {
        for (int i = student.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (student[j] == null && student[j + 1] == null) {
                }
                if (student[j] == null && student[j + 1] != null) {
                    student[j] = student[j + 1];
                }

            }

        }
    }

    @Override
    public Student[] getStudentAdult() {
        Student adultStudent[] = new Student[10];
        int j = 0;
        for (int i = 0; i < student.length; i++) {
            if (student[i] != null && student[i].getAge() >= 18) {
                student[j] = student[i];
                j++;

            }

        }
        return adultStudent;
    }

    @Override
    public String toString() {
        return "Group{" +
                Arrays.toString(student) +
                '}';
    }
}
