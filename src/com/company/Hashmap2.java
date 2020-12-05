package com.company;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    public class Hashmap2 {

        // Complete the twoStrings function below.
        static String twoStrings(String s1, String s2) {
        HashMap <Character,Integer> map=new HashMap<>();
        int count=0;
        String answer="No";
        for(char ch: s1.toCharArray()) {
            count = map.containsKey(ch)?map.get(ch):0;
            map.put(ch,count+1);
        }
            for(char ch: s2.toCharArray()) {
                if (map.containsKey(ch)) {
                    answer = "YES";
                    break;
                }
            }
            return answer;

        }

        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int q = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int qItr = 0; qItr < q; qItr++) {
                String s1 = scanner.nextLine();

                String s2 = scanner.nextLine();

                String result = twoStrings(s1, s2);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

            scanner.close();
        }
    }
