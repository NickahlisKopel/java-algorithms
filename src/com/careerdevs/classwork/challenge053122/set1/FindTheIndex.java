package com.careerdevs.classwork.challenge053122.set1;

import java.lang.reflect.Array;

public class FindTheIndex {
    public static int search(int arr[], int item) {
        int index = 0;
        for(int i = 0; i < arr.length;i++){
            if(item == arr[i]){
                index = i;
                return index;
            }
            else{
                index = -1;
            }
        }
        return index;

    }
}
