package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableSample {
    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(30, 1, "Deepthi"));
        students.add(new Student(33, 2, "Lino"));
        Collections.sort(students);
        for (Student s : students) {
            System.out.println(s.getName()+" "+s.getRollno()+" "+s.getAge());
        }
    }
}
