package com.careerdevs.hackerrank.thirtydaysofcode;

import java.io.*;
import java.util.*;

public class Day06 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String even = "";
        String odd = "";
        int numOfWords = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < numOfWords;i++){
            String word = scanner.nextLine();
            for(int j = 0; j < word.length();j++){
                if(j%2==0){
                    even+=word.charAt(j);
                }else{
                    odd+=word.charAt(j);
                }
            }
            System.out.println(even + " " + odd);
            even = "";
            odd = "";
        }

    }
}
