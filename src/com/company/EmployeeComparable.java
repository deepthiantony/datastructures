package com.company;

import java.util.*;
import java.util.List;
import java.lang.*;

public class EmployeeComparable {
    public static void main(String args[]) {
        List<EmployeeDetails> em = Arrays.asList(new EmployeeDetails(3, "Rachel", "London"),
                new EmployeeDetails(1, "Deepthi", "Kumbalanaghi"),
                new EmployeeDetails(4, "Lino", "Kumbalanaghi"));
        //Collections.sort(em);

//        for(EmployeeDetails i:em){
//            System.out.println(i.getName());

        Comparator<EmployeeDetails> c = new Comparator<EmployeeDetails>() {
            public int compare(EmployeeDetails obj1, EmployeeDetails obj2) {
                return obj1.getName().compareTo(obj2.getName());
            }
        };
        Collections.sort(em, c);
        for (EmployeeDetails i : em) {
            System.out.println(i.getName());
        }
    }
}
