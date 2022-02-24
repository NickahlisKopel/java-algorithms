package com.careerdevs.personal;
import java.util.ArrayList;

public class Challenge {
    public static boolean isSeven(int x) {
        return x == 7;
    }
    public static boolean isEmpty(String str) {
        return str == "";
    }
    public static int countTrue(boolean[] arr) {
        int x = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == true){
                x++;
            }
        }
        return x;
    }
    public static boolean isSameNum(int x, int y) {
        return x == y;
    }
    public static int nextEdge(int side1, int side2) {
        return (side1 + side2) - 1;
    }
    public static int convert(int minutes) {
        return minutes * 60;
    }
    public static int power(int voltage, int current) {
        return voltage * current;
    }
    public static String inatorInator(String inv) {
        if(inv.endsWith("a") ||inv.endsWith("e")||inv.endsWith("i")||inv.endsWith("o")||inv.endsWith("u")||inv.endsWith("A") ||inv.endsWith("E")||inv.endsWith("I")||inv.endsWith("O")||inv.endsWith("U")){
            return inv+"-inator "+Integer.toString(inv.length()) +"000";
        }else{
            return inv+"inator "+Integer.toString(inv.length())+"000";
        }
    }
        public static ArrayList<Integer> indexOfCaps(String s) {
            ArrayList<Integer>index = new ArrayList<Integer>();
            for(int i = 0; i < s.length();i++){
                if(Character.isUpperCase(s.charAt(i))){
                    index.add(i);
                }
            }
            return index;
        }
        public static String removeVowels(String s) {
            s = s.replaceAll("[aeiouAEIOU]", "");
            return s;



        }
    public static int charCount(char c, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
    }

