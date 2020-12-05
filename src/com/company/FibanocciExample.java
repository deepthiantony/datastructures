package com.company;

public class FibanocciExample {
    public static void Fibanocci ( int n){
        int i = 0,j=1,count=0;
        System.out.println(i);
        System.out.println(j);
        System.out.println();
        for (int k = 2; k< n; k++) {
            count =  i + j;
            System.out.println(count);
            i=j;j=count;
        }
    }

public static void main(String args[]) {
  Fibanocci(6);
 }
}
