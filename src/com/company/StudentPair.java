package com.company;

import java.util.*;

public class StudentPair {

    public static int run(int[] student_list) {
        /*
         * Write your code below; return type and arguments should be according to the problem's requirements
         */
        int count = 0;
        int single_student_number = 0;
        Map<Integer, Integer> students = new HashMap<>();
        for (Integer i : student_list) {
            count = students.containsKey(i) ? students.get(i) : 0;
            students.put(i, count + 1);
        }

        for (Map.Entry<Integer, Integer> entry : students.entrySet()) {
            if (entry.getValue() < 2) {
                single_student_number = entry.getKey();
            }
        }

        return single_student_number;
                }

public static void main(String args[]){

        int[]student_list={5,3,2,2,3,5,4,6,9,6,4,12,8,9,12};
        System.out.println(run(student_list));

        }
        }

