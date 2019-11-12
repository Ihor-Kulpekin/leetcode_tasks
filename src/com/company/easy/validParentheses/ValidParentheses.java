package com.company.easy.validParentheses;

public class ValidParentheses {

    public static boolean isValid(String s) {
        int firstIndex = 0;
        int lastIndex = s.length()-1;

        int middleIndex = (firstIndex+lastIndex)/2;

        String firstPart = s.substring(0,middleIndex);
        String lastPart = s.substring(middleIndex,lastIndex);



        return firstPart.equals(lastPart);
    }

}
