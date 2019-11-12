package com.company.easy.isSubsequence;

import java.util.Arrays;

public class IsSubsquence {
    public static boolean isSubsequence(String s, String t) {

        StringBuilder stringBuilder = new StringBuilder();
        Arrays.sort(s.toCharArray());
        Arrays.sort(t.toCharArray());
        for(int i = 0; i<s.length();i++){
            for(int j = 0;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    stringBuilder.append(s.charAt(i));
                }
            }
        }

        return stringBuilder.toString().equals(t);
    }
}
