package com.careerdevs.hackerrank;

import java.io.*;
import java.util.*;
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

public class Solution {

    public static void welcomeToJava () {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    public static void javaStdinAndStdout() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();
        scanner.close();
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

    }

    public static void javaIfElse() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();

        if(value % 2 != 0){
            System.out.println("Weird");
        }else if (value >= 2 && value <= 5){
            System.out.println("Not Weird");
        }else if (value >= 6 && value <= 20){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
    }


    public static void javaStdinAndStdoutTwo() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int integer = scanner.nextInt();
        double dub = scanner.nextDouble();
        scanner.nextLine();
        String string = scanner.nextLine();
        scanner.close();

        System.out.println("String: "+ string);
        System.out.println("Double: "+ dub);
        System.out.println("Int: "+ integer);

    }



    public static void javaOutputFormatting() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);


        String string1 = scanner.next();
        int integer1 = scanner.nextInt();
        String string2 = scanner.next();
        int integer2 = scanner.nextInt();
        String string3 = scanner.next();
        int integer3 = scanner.nextInt();
        scanner.close();
        System.out.println("================================");
        System.out.printf("%-15s%03d%n", string1, integer1);
        System.out.printf("%-15s%03d%n", string2, integer2);
        System.out.printf("%-15s%03d%n", string3, integer3);
        System.out.println("================================");

    }

    public static void javaLoops() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        for(int i = 1; i <= 10; i++){
            System.out.println(N + " x " + i + " = " + (N * i));
        }
    }



    public static void javaLoops2(){
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();
        for(int i=0;i<t;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int n = scanner.nextInt();
            int c = a;
            for(int j=0;j<n;j++){
                c += Math.pow(2, j)*b;
                System.out.printf("%s ",c);
            }
            System.out.println();
        }
        scanner.close();
    }










}
