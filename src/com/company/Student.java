package com.company;
import java.lang.Comparable;

public class Student implements Comparable<Student> {
    int age;
    int rollno;
    String name;

    public Student(int age, int rollno, String name) {
        this.age = age;
        this.rollno = rollno;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int compareTo(Student s) {
        if (this.getAge() < s.getAge()) {
            return -1;
        } else if (this.getAge() > s.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
