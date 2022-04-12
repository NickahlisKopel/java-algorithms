package com.careerdevs.personal.challenge041122;

public class Challenge {
    public static String societyName(String[] friends) {
        String name = "";
        for(int i = 0; i < friends.length;i++){
            name += friends[i].charAt(0);
        }
        return name;
    }

    public static int WeeklySalary(int[] hours) {
        int total = 0;
        int day = 0;
        for(int i = 0; i <= 6; i++){
            day = 0;
            if (hours[i] <= 8){
                day = hours[i] * 10;
            }else{
                day = (hours[i] - 8) * 15 + 80;
            }
            if(i <= 4){
                total += day;
            }else{
                total += day * 2;
            }
        }
        return total;
    }
}
