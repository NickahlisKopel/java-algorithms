package com.careerdevs.personal;

public class Vowels {
    public static boolean isVowel(char ch){
        ch = Character.toUpperCase(ch);
        return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U');
    }
    public static int getCount(String str) {
        int vowelsCount = 0;

        // Your code here
        for (int i=0; i<str.length(); i++)
            if (isVowel(str.charAt(i))){
                vowelsCount++;
            }

        return vowelsCount;
    }
}
