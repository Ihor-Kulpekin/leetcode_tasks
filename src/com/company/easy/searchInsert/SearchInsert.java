package com.company.easy.searchInsert;

public class SearchInsert {


    public static int searchInsert(int[] nums, int target) {
        int i=0;
        while (nums[i]<target && nums[i]!=target){
            ++i;
            if (i==nums.length)
                break;

        }
        return i;
    }


}
