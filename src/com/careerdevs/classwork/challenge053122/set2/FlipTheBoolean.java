package com.careerdevs.classwork.challenge053122.set2;

public class FlipTheBoolean {
    public static boolean reverse(boolean b) {
        if(b == false){
            return true;
        }else{
            return false;
        }
    }
    public static boolean reverse2(boolean b) {
        return !b;
    }
}
