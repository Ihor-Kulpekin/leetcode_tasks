package com.company.easy.removeElement;

import java.util.Arrays;

public class RemoveElement {

    public static void removeElement(int[] nums, int val) {
        Arrays.stream(nums)
                .filter(number->number!=val)
                .forEach(System.out::println);
    }
}
