package com.company;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.regex.*;

public class SortNew {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int count=0;
        int i=0;
        int tmp;
        int n=q.length;
        while(i<=n){
            if(q[i]==i+1){
                i++;
            }
            else if(q[i]==(i+2) || q[i]==(i+3) ){
                count++;
                tmp=q[i+1];
                q[i+1]=q[i];
                q[i]=tmp;
                i++;
            }

            else if(q[i]-(i+2)>2)
                {
                System.out.println("Too chaotic");
                return;
            }
        }

        System.out.println(count);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}

