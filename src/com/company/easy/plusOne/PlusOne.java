package com.company.easy.plusOne;

public class PlusOne {

    public static int[] plusOne(int[] digits){

        int number = digits[digits.length-1];

        for(int i = 0; i<digits.length;i++){
            if(number==digits[i]){
                digits[i]++;
            }
        }

        return digits;
    }

}
