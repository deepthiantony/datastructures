package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class NewStudentStream {
    public static void main(String args[]){
        List<Student> list= Arrays.asList(new Student(20,3,"Leah"),
                new Student(22,4,"Yohan"));
        list.stream().filter(student -> student.getAge()>5).map(student -> student.getRollno()).forEach(student->{
            System.out.println(student);
        });
        list.stream().filter(s->s.getName().startsWith("L")).forEach(s-> System.out.println(s.getName()));
        long a=list.stream().filter(s->{
            return s.getName().contains("a")||
                    s.getName().contains("A");

        }
        ).count();
        System.out.println(a);
    }
}
