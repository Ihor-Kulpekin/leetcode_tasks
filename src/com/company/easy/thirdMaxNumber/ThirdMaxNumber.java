package com.company.easy.thirdMaxNumber;

import com.company.Main;

import java.util.*;

public class ThirdMaxNumber {
    public static int thirdMax(int[] nums) {

        Main.sort(nums);

        int thirdMaxNumber;

        List<Integer> list = fillList(nums);


        int indexThirdMaxNumberWhenListMoreTwoElements = list.size()-3;

        int arrayLength = nums.length;

        if(arrayLength<=2){
            return nums[nums.length-1];
        }

        for(int i = 0;i<list.size();i++){
            if(list.size()<=2){
                return list.get(list.size()-1);
            }
            if(list.size()>=3){
                if((list.get(i).equals(list.get(indexThirdMaxNumberWhenListMoreTwoElements)))){
                    thirdMaxNumber = list.get(i);
                    return thirdMaxNumber;
                }
            }
        }


        return -1;
    }

    public static List<Integer> fillList(int[] nums){

        List<Integer> list = new ArrayList<>();

        for(int i = 0; i<nums.length;i++){
            if(list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
        }

        return list;
    }

}
