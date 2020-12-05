package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String args[]) {
        List<Student> students = Arrays.asList(new Student(30, 1, "Deepthi"),
                new Student(33, 2, "Lino"), new Student(2, 3, "Rachel"));
//        Stream<Student> studentStream = students.stream().filter(student -> student.getAge() < 5);
//        studentStream.forEach((student -> {
//            System.out.println(student.getAge());
//        }));
//        Stream<String> studentStream =
        students.stream().filter(c -> c.getAge() > 5).map(st -> {
            return st.getName();
        }).forEach(a -> {
            System.out.println(a);
        });
//        studentStream.forEach((student -> {
//            System.out.println(student.getAge());
//        }));

    }
}
