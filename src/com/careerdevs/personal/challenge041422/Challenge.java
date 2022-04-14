package com.careerdevs.personal.challenge041422;

import java.util.ArrayList;

public class Challenge {
    public static int[][] squarePatch(int n) {
        int[][] finalArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                finalArray[i][j] = n;
            }
        }
        return finalArray;
    }
}
