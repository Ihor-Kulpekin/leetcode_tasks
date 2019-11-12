package com.company.easy.factorialTrailingZeroes;

public class FactorialTrailingZeroes {

    // 1ms
    public static int trailingZeroe(int n) {
        if(n == 0) return 0;
        return n/5 + trailingZeroe(n/5);
    }


    // 2ms
    public static int trailingZeroes(int n){

        int counter = 0;

        int factorialNumber = factorial(n);

        if(n==0){
            ++counter;
        }

        while(factorialNumber%10==0){
            int pop = factorialNumber%10;
            factorialNumber/=10;
            if(pop == 0){
                counter++;
            }
        }

        return counter;
    }

    public static int factorial(int n){
        if(n==0 || n==1){
            return n;
        }
        return factorial(n-1)*n;
    }

}
