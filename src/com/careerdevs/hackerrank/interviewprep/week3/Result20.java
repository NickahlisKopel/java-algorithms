package com.careerdevs.hackerrank.interviewprep.week3;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result20 {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int[] ar = new int[5];
        for(int i = 0; i < arr.size();i++){
            switch(arr.get(i)){
                case 1:
                    ar[0]++;
                    break;
                case 2:
                    ar[1]++;
                    break;
                case 3:
                    ar[2]++;
                    break;
                case 4:
                    ar[3]++;
                    break;
                case 5:
                    ar[4]++;
                    break;
            }
        }
        int highest = 0;
        int answer = 0;
        for(int i = 0; i < ar.length;i++){
            if(ar[i]>highest){
                highest = ar[i];
                answer = i+1;
            }
        }
        return answer;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result20.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

