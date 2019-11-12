package com.company.easy.longestCommonPrefix;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(strings));
        print(strings);
    }

    public static void print(String[] args){
        for(int i = 1 ; i<args.length;i++){
            System.out.println(args[i].indexOf(args[0]));
        }
    }

}
