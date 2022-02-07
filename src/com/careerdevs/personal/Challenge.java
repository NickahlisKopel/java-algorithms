package com.careerdevs.personal;

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
}
