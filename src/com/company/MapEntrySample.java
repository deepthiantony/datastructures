package com.company;

import java.util.*;
import java.util.Map;

public class MapEntrySample {
    public static void main(String args[]){
        LinkedHashMap<String,Integer>  students=new LinkedHashMap<String,Integer>();
        students.put("Lino",1);
        students.put("Deepthi",2);
        students.put("Rachel",3);
        int newKey= (int) (Math.random()*100);

        Set<Map.Entry<String,Integer>> s =students.entrySet();
        for(Map.Entry<String,Integer> i: s){
            System.out.println("Before changes"+ i.getKey()+" "+i.getValue()
            );
            i.setValue(newKey);
            System.out.println( "After changes" + i.getKey()+" "+i.getValue());
        }
    }

}
