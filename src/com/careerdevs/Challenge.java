package com.careerdevs;

public class Challenge{
    public static int getFirstValue(int[] arr) {
        return arr[0];
    }
    public static int addition(int num) {
        return num + 1;
    }
    public static int search(int arr[], int item) {
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(item == arr[i]){
                index = i;
            }
        }
        if(index == 0){
            index = -1;
        }
        return index;
    }
    public static int convert(int minutes) {
        return minutes * 60;
    }
}
