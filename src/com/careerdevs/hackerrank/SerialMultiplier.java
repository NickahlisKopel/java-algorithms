package com.careerdevs.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class SerialMultiplier {
    int first;
    int second;
    int third;
    int fourth;
    int fifth;
    int result;
    SerialMultiplier(int first,int second, int third, int fourth, int fifth){
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.fifth = fifth;
        System.out.println(first*second*third*fourth*fifth);
    }
    SerialMultiplier(int first,int second, int third, int fourth){
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }
    SerialMultiplier(int first,int second, int third){
        this.first = first;
        this.second = second;
        this.third = third;
    }
    SerialMultiplier(int first,int second){
        this.first = first;
        this.second = second;
    }
    SerialMultiplier(int first){
        this.first = first;
    }

    @Override
    public String toString() {
        return Integer.toString(result);
    }
}
//public class Solution {
//    public static void main(String args[] ) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//        String[] input = sc.nextLine().split(" ");;
//        int first=1, second=1, third=1, fourth=1, fifth=1;
//        first = Integer.parseInt(input[0]);
//        if(n > 1) {
//            second = Integer.parseInt(input[1]);
//            if(n >= 3) {
//                third = Integer.parseInt(input[2]);
//                if(n >= 4) {
//                    fourth = Integer.parseInt(input[3]);
//                    if(n == 5) {
//                        fifth = Integer.parseInt(input[4]);
//                    }
//                }
//            }
//        }
//
//        SerialMultiplier result;
//
//        switch(n) {
//            case 1:
//                result = new SerialMultiplier(first);
//                System.out.println(result);
//                break;
//            case 2:
//                result = new SerialMultiplier(first,second);
//                System.out.println(result);
//                break;
//            case 3:
//                result = new SerialMultiplier(first,second,third);
//                System.out.println(result);
//                break;
//            case 4:
//                result = new SerialMultiplier(first,second,third,fourth);
//                System.out.println(result);
//                break;
//            case 5:
//                result = new SerialMultiplier(first,second,third,fourth,fifth);
//                System.out.println(result);
//                break;
//            default:
//                System.out.println("Invalid Inputs");
//        }
//    }
//}
