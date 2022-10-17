package com.careerdevs.hackerrank.interviewprep.week1;

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

class Result4 {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here

        List<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(0);
        if (scores.size() == 1) {
            return list;
        }
        int min = scores.get(0);
        int max = scores.get(0);
        int breakMax = 0;
        int breakMin = 0;
        for (int i = 1; i < scores.size(); i++) {
            if (scores.get(i) > max) {
                max = scores.get(i);
                breakMax++;
            }
            if (scores.get(i) < min) {
                min = scores.get(i);
                breakMin++;
            }
        }
        list.set(0, breakMax);
        list.set(1, breakMin);
        return list;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> scores = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result4.breakingRecords(scores);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}


