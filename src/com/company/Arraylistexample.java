package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Arraylistexample {

    public static void main(String[] args) {
	ArrayList <String> fruits=new ArrayList<String>();
    fruits.add("Banana");
    fruits.add("Strawberry");
    fruits.add("Raspberry");
        System.out.println(fruits);
    Collections.sort(fruits);
    for(String i:fruits) {
        System.out.println(i);
    }
    }
}
