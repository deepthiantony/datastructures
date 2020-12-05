package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorSample {
    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(30, 3, "Deepthi"));
        students.add(new Student(33, 2, "Lino"));
//        Comparator<Student> comp=new ]
//        '
//        ]-<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if (o1.getRollno() < o2.getRollno()) {
//                    return -1;
//                } else return 1;
//            }
//        };
//        Collections.sort(students,comp);
        Collections.sort(students, (a, b) -> {
            if (a.getRollno() < b.getRollno()) {
                return -1;
            } else return 1;
        });

        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getRollno() + " " + s.getAge());
        }
    }
}
