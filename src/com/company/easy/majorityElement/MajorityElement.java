package com.company.easy.majorityElement;

public class MajorityElement {

    public static int majorityElement(int[] arr) {

        int n = arr.length;
        int maxCount = 0;
        int index = 0; // sentinels
        for(int i = 0; i < n; i++)
        {
            int count = 0;
            for (int i1 : arr) {
                if (arr[i] == i1)
                    count++;
            }

            // update maxCount if count of
            // current element is greater
            if(count > maxCount)
            {
                maxCount = count;
                index = i;
            }
        }

        // if maxCount is greater than n/2
        // return the corresponding element
        if (maxCount > n/2)
            return arr[index];

        else
            return -1;

    }

}
