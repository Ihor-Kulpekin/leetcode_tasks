package com.company.easy.searchInsertElement;

public class Main {
    public static void main(String[] args) {

        int[] array = {1,2,3,6};
        System.out.println(searchInsert(array,0));

    }


    private static int searchInsert(int[] array,int target){

        int lastNumberArray = array[array.length-1];
        int firstNumberArray = array[0];

        for(int i = 0; i<array.length;i++){
            if(firstNumberArray>target){
                return i;
            }
            if(lastNumberArray<target){
                return array.length;
            }
            if(array[i]==target){
                return i;
            }else {
                int j = i+1;
                    if(array[i]<target && array[j]>target){
                        return j;
                    }
            }
        }


        return -1;
    }
}
