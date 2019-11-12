package com.company.easy.happyNumber;

public class HappyNumber {
    public static boolean isHappy(int n) {

        int result = 0;

        while(result<=100){
            int pop = n%10;
            n/=10;
            result = (n*n)+(pop*pop);
            n = result;
            if(result==100){
                while(result!=0){
                    pop = n%100;
                    n/=100;
                    result = (n*n)+(pop*pop);
                    if(result==1){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
