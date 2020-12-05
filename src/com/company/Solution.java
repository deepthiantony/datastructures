package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<Character> brackets=new Stack<Character>();
        String result=null;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                brackets.push(s.charAt(i));
            } else  {
                char current=s.charAt(i);
                if(brackets.isEmpty()){
                    result="NO";
                    break;
                }
                char popped=brackets.pop();
                switch(popped){
                    case '{' : if(current!='}'){
                        result="NO";
                    }
                        break;
                    case '(' : if(current!=')'){
                        result="NO";
                    }
                        break;
                    case '[' : if(current!=']'){
                        result="NO";
                    }
                        break;

                }
            }
            if(result!=null){
                break;
            }
        }
        if(brackets.isEmpty() && result==null){
            result="YES";
        }
        return result;

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
            System.out.println(result);
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
