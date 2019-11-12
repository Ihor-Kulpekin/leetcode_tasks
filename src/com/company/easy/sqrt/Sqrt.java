package com.company.easy.sqrt;

public class Sqrt {

    public static int sqrt(int number){

        if (number == 0 || number == 1)
            return number;

        // Staring from 1, try all numbers until
        // i*i is greater than or equal to x.
        int i = 1, result = 1;

        while (result <= number) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

}
