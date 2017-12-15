package com.gmail.gnoianko;

import java.io.Serializable;
import java.util.*;

public class Group implements Voenkom, Serializable {
    private List<Student> studentList = new ArrayList<Student>();

    public Group() {
    }


    public void addStudent(Student student) throws MyException {
        if (student == null) {
            throw new IllegalArgumentException("Empty student");
        }
        if (studentList.size() > 10) {
            throw new MyException();
        }
        studentList.add(student);
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


    public boolean deleteStudent(Student student) {
        Iterator<Student> studentIterator = studentList.iterator();
        for (; studentIterator.hasNext(); ) {
            Student element = studentIterator.next();
            if (element == student) {
                studentIterator.remove();
                return true;
            }
        }
        return false;
    }

    public Student findStudent(String name) {
        for (Student student : studentList) {
            if (student.getName() != null && student.getName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    public void sort() {
        Collections.sort(studentList);
    }

    public void newSort(int i) {

        switch (i) {
            case 1:
                Collections.sort(studentList, (one, two) -> {
                    if (one != null && two != null)
                        return one.getName().compareTo(two.getName());
                    else
                        return 0;
                });
                break;
            case 2:
                Collections.sort(studentList, (one, two) -> {
                    if (one != null && two != null)
                        return one.getAge() - two.getAge();
                    else
                        return 0;
                });
                break;
            case 3:
                Collections.sort(studentList, (one, two) -> {
                    if (one != null && two != null)
                        return one.getWeight() - two.getWeight();
                    else
                        return 0;
                });
                break;
            case 4:
                Collections.sort(studentList, (one, two) -> {
                    if (one != null && two != null)
                        return one.getHeight() - two.getHeight();
                    else
                        return 0;
                });
                break;
            case 5:
                Collections.sort(studentList, (one, two) -> {
                    if (one != null && two != null)
                        return one.getCourse() - two.getCourse();
                    else
                        return 0;
                });
                break;
            case 6:
                Collections.sort(studentList, (one, two) -> {
                    if (one != null && two != null)
                        return (int) (two.getAvgScore() * 10000 - one.getAvgScore() * 10000);
                    else
                        return 0;
                });
                break;
        }
    }

    @Override
    public List<Student> getStudentAdult() {
        List<Student> adultStudents = new ArrayList<>();
        for (Student student : adultStudents) {
            if (student.getAge() >= 18 && student.isSex() == true) {
                adultStudents.add(student);
            }
        }
        return adultStudents;
    }

    @Override
    public String toString() {
        return "Group{" +
                "studentList=" + studentList +
                '}';
    }
}
