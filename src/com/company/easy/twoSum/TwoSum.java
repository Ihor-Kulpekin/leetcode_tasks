package com.company.easy.twoSum;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        int [] array;

        for(int i = 0; i<nums.length-1;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    array = new int[]{i, j};
                    return array;
                }
            }
        }

        return null;
    }

}
