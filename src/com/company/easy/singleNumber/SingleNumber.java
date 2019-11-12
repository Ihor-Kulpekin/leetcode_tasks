package com.company.easy.singleNumber;

public class SingleNumber {
    public static int singleNumber(int[] nums) {

        int sizeArray = nums.length;
        int minCounter = 0;
        int index = 0;

        for(int i = 0;i<sizeArray;i++){

            int count = 0;

            for(int i1:nums){
                if(nums[i]==i1){
                    count++;
                }
            }

            if(count==1){
                minCounter = count;
                index = i;
            }

        }

        if(minCounter<sizeArray/2){
            return nums[index];
        }else {
            return -1;
        }

    }
}
