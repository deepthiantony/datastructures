package com.company;
import java.util.Collections;
import java.util.LinkedList;

public class Linkedlistexample {
    public static void main(String args[]){
        LinkedList <String> veg=new LinkedList<String>();
        veg.addFirst("tomato");
        veg.add("potato");
        veg.addLast("cauliflower");
        System.out.println(veg);
        Collections.sort(veg);
        System.out.println(veg);
        for(String i:veg){
            System.out.println(i);
        }
    }

}
