package com.company.easy.fibonachi;


public class Fibonachi {
    public static int fibonachi(int n){
        if(n==0 ||n==1){
            return n;
        }

        return fibonachi(n-1)+fibonachi(n-2);
    }
}
