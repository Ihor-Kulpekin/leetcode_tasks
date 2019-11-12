package com.company.easy.moveZeroToEnd;

import com.company.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MoveZero {
    public static void moveZeroes(int[] nums) {
        Main.sort(nums);

        int countNotZero = -1;

        for(int i = 0; i<nums.length;i++){
            if(nums[i]==0){
                continue;
            }else {
                nums[++countNotZero] = nums[i];
            }
        }

        for(int i = countNotZero+1;i<nums.length;i++){
            nums[i] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }

}
