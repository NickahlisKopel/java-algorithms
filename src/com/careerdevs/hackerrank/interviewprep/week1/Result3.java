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

class Result3 {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        // Write your code here
        String slot = s.substring(8);
        int hour = Integer.parseInt(s.substring(0,2));
        String minute = s.substring(3,5);
        String secs = s.substring(6,8);
        String hour_str = "";
        if(slot.equals("AM") && hour == 12){
            hour = 0;
        }
        if(slot.equals("PM") && hour != 12){
            hour += 12;
        }
        if(hour < 10){
            hour_str = "0"+Integer.toString(hour);
        }else{
            hour_str = Integer.toString(hour);
        }
        return(hour_str+":"+minute+":"+secs);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result3.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
