package com.company.easy.deleteDublicate;

public class DeleteDuplicates {
    public static int removeDuplicates(int[] nums) {
        int counter = 0;

        for(int index = 1;index<nums.length;index++){
                if(nums[index]!=nums[counter]){
                    counter++;
                    nums[index] = nums[counter];
                }
        }

        return counter-1;
    }
}
