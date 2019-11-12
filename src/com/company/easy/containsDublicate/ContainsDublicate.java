package com.company.easy.containsDublicate;

import java.util.Arrays;

public class ContainsDublicate {
    public static boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i<nums.length-1;i++){
            if(nums[i]==nums[i+1])return true;
        }

        return false;
    }
}
