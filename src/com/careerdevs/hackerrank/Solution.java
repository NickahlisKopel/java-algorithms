package com.careerdevs.hackerrank;

import java.io.*;
import java.lang.reflect.Array;
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



    public static void evenOdd() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int numOfTestCases = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < numOfTestCases; i++){
            String str = scanner.nextLine();
            String even = "";
            String odd = "";
            for(int j = 0; j < str.length();j+=2){
                even += str.charAt(j);
            }
            for(int k = 1; k < str.length();k+=2){
                odd += str.charAt(k);
            }
            System.out.println(even + " " + odd);

        }
    }


    public static void backwardsArr(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        bufferedReader.close();
        String str = "";
        for(int i = arr.size()-1; i > -1;i--){
            str+= arr.get(i) + " ";
        }
        System.out.println(str.trim());
    }


    public static void dictionary() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        Map<String,Long> phoneDictionary = new HashMap<String, Long>();
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < n; i++){
            phoneDictionary.put(scanner.next(),scanner.nextLong());
            scanner.nextLine();
        }
        while (scanner.hasNext()){

            System.out.println(phoneDictionary.get(scanner.nextLine()));
        }
    }

    public static void intToString() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = "";
        s+= n;
        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }

    }

    public static void sumOrderCap() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        System.out.println(a.length() + b.length());
        int a1 = alphabet.indexOf(a.charAt(0));
        int b1 = alphabet.indexOf(b.charAt(0));
        if(a1 > b1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        String a2 = a.substring(0, 1).toUpperCase() + a.substring(1);
        String b2 = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(a2 + " " + b2);



    }

    public static void subString() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(word.substring(start,end));
    }


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i = 0; i < s.length();i++){
            if((i+k) > s.length()){
                break;
            }
            String sub = s.substring(i + (i+k));

            if(smallest.compareTo(sub) >= 0){
                smallest = sub;
            }else if(largest.compareTo(sub) <=0){
                largest = sub;
            }
        }


        return smallest + "\n" + largest;
    }


    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for(int i = 0; i < ar.size();i++){
            sum+= ar.get(i);
        }
        return sum;

    }



    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        ArrayList<Integer> sum = new ArrayList<Integer>();
        int aSum = 0;
        int bSum = 0;
        for(int i = 0; i < a.size();i++){
            if(a.get(i) > b.get(i)){
                aSum++;
            }else if(a.get(i) < b.get(i)){
                bSum++;
            }
        }
        String string = "ssdd";
        string.split(string);

        sum.add(aSum);
        sum.add(bSum);
        return sum;

    }



    public static void regex(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String[] strings = s.split("['!?,._@ ]+");
            System.out.println(strings.length);
            for (String str : strings)
                System.out.println(str);
        }
    }







}
