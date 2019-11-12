package com.company.easy.removeElement;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] numbers = {0,1,2,2,3,0,4,2};
        Arrays.sort(numbers);
        RemoveElement.removeElement(numbers,2);
    }
}
