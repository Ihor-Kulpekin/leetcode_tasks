package com.company.easy.peakIndexInAMountainArray;

public class PeakIndexInArray {
    public static int peakIndexInMountainArray(int[] array) {

        int max = array[0];

        int i;

        int counter = 0;

        for( i = 0; i<array.length;i++){
            if(array[i]>max){
                max = array[i];
                counter++;
            }
        }

        return counter;
    }

}
