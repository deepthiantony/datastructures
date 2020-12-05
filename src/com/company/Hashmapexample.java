package com.company;
import java.util.HashMap;

public class Hashmapexample {
    public static void main(String args[]){
        HashMap<Integer,String> car=new HashMap<Integer,String>();
        car.put(1,"BMW");
        car.put(2,"Porche");
        System.out.println(car.get(1));
        System.out.println(car.keySet());
        System.out.println(car.values());

    }
}
