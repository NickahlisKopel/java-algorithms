package com.careerdevs.personal.challenge040422;

public class Program {
    public static boolean validateEmail(String s) {
        if(s.contains("@") && s.endsWith(".com") && s.charAt(0) != '@' && s.charAt(0) != '.'){
            return true;
        }else{
            return false;
        }

    }

    public static boolean testJackpot(String[] result) {
        int hits = 1;
        for(int i = 1; i < result.length;i++){
            if(result[0] == result[i]){
                hits++;
            }
        }
        if(hits == result.length){
            return true;
        }else{
            return false;
        }

    }

    public static double discount(int price, int percentage) {
        double discount = 100-percentage;
        discount *= 0.01;
        double total = discount * price;
        double finalPrice = Math.round(total * 100.0) / 100.0;
        return finalPrice;
    }

}
