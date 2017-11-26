package com.gmail.gnoianko;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
    private Student[] group = new Student[10];

    public Group() {
        super();
    }

    public void addStudent(Student newStudent)throws GroupIsFullException{
        if(newStudent == null){
            throw new IllegalArgumentException("Student cannot be null");
        }
        for (int i = 0; i < group.length; i++){
            if(group[i]==null){
                group[i]=newStudent;
                return;
            }
        }throw new GroupIsFullException();
    }

    public boolean deleteStudent(int index) {
        if ((index >= 0) & (index <= group.length)) {
            group[index - 1] = null;
            return true;
        } else {
            return false;
        }
    }

    public Student searchStudent(String surname) {
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null && group[i].getSureName() != null && group[i].getSureName().equalsIgnoreCase(surname)) {
                return group[i];
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(group, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1 == null || o1.getSureName() == null) {
                    return 1;
                }
                if (o2 == null || o2.getSureName() == null) {
                    return -1;
                }
                if (o1 == null && o2 == null || (o1.getSureName() == null || o2.getSureName() == null)) {
                    return 0;
                }
                return o1.getSureName().compareTo(o2.getSureName());
            }
        });
        for (int i = 0; i < group.length; i++) {
            if (group[i] != null) {
                sb.append(group[i].toString());
            }
        }
        return "Group:" + sb.toString();
    }
}





