package com.company.easy.palindromeInteger;

public class PalindromInteger {

    public static boolean isPalindromInteger(int number){

        int rev = 0;

        int currentNumber = number;

        while(number!=0){
            int pop = number%10;
            number/=10;
            rev=rev*10+pop;
        }

        if (currentNumber<0){
            return false;
        }

        return rev == currentNumber;

    }

}
