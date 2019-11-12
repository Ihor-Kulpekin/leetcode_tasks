package com.company.easy.intersectionTwoArray;

import java.util.*;

public class IntersectionTwoArray {
    public static int[] intersection(int[] nums1, int[] nums2) {


        int commonNumber = 0;

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    commonNumber = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = commonNumber;
                    set.add(commonNumber);
                }
            }
        }

        List<Integer> arrayList = new ArrayList<>(set);
        int[] array = new int[arrayList.size()];

        for(int i = 0; i<array.length;i++){
            array[i] = arrayList.get(i);
        }

        return array;
    }
}
