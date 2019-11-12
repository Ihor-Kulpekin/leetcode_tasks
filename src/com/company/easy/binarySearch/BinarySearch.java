package com.company.easy.binarySearch;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        return binarySearch(nums,0,nums.length-1,target);
    }


    private static int binarySearch(int[] nums,int first,int last,int key){
        if(last>=first){
            int middle = (first+last)/2;

            if(nums[middle]==key){
                return middle;
            }

            if(nums[middle]>key){
                return binarySearch(nums,first,middle-1,key);
            }

            return binarySearch(nums,middle+1,last,key);
        }
        return -1;
    }
}
