package com.company;

import java.util.*;

public class Main {

    private static int i;
    private static int j;

    public static void main(String[] args) {
        int[] array = {1,2,2,1};
        int[] array1 = {2,2};
        System.out.println(Arrays.toString(intersect(array,array1)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        int [] number;
        if(nums1.length>=nums2.length){
            number = new int[nums2.length];
        }else {
            number = new int[nums1.length];
        }

        for(int i = 0; i<nums1.length;i++){
            for (int number1:nums2) {
                int j = 0;
                if(nums1[i]==number1){
                    number[j] = nums1[i];
                }
                ++j;
            }
        }

        return number;
    }

    private static String reverseString(char[] chars){

        int j = chars.length-1;

        for(int i = 0;i<chars.length;i++){
            chars[i] = chars[j];
        }

        return Arrays.toString(chars);
    }

    private static boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);

        int currentCounter = 0;

        List<Integer> set = new ArrayList<>();
        List<Integer> setCounter = new ArrayList<>();
        for(int i = 0; i<arr.length;i++){
            if(set.contains(arr[i])){
                continue;
            }else {
                set.add(arr[i]);
            }
            for (int number:arr) {
                if(arr[i]==number){
                    ++currentCounter;
                }
            }
            if(setCounter.contains(currentCounter)){
                return false;
            }else {
                setCounter.add(currentCounter);
            }
            currentCounter = 0;
        }

        return true;
    }

    private static void rotate(int[] nums, int k) {
        System.out.println(Arrays.toString(nums));
        int temp, previous;
        for (int i = 0; i < k; i++) {
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    private static boolean isPalindrome(LinkedList<Integer> linkedList){

        boolean isPalindromInTwo = false;
        boolean isPalindromNoInTwo = false;


        int i;

        if(linkedList.size()%2!=0){
            for(i = 0; i<linkedList.size();i++){
                for(int j = linkedList.size()-1;j>0;j--){
                    if(linkedList.get(i).equals(linkedList.get(j))){
                        isPalindromInTwo = true;
                    }
                }
            }
            return isPalindromInTwo;
        }else {
            for( int i1 = 0; i1<linkedList.size();i1++){
                for(int j1 = linkedList.size()-1;j1>0;j1--){
                    if(linkedList.get(i1).equals(linkedList.get(j1))){
                        isPalindromNoInTwo = true;
                    }
                }
            }
            return isPalindromNoInTwo;
        }
    }

    public static int[] maxNumber(int[] array){

        int sum_min = 0,sum_max = 0;


        for(int i = 0; i<array.length-1;i++){
            sum_min+=array[i];
        }

        for(int j = 1;j<array.length;j++){
            sum_max+=array[j];
        }

        return new int[]{sum_min,sum_max};
    }

    public static int insertSorted(int[] arr, int n, int key, int capacity){

        if (n >= capacity)
            return n;

        int i;
        for(i = n-1;(i>=0 && arr[i]>key);i--)
            arr[i+1] = arr[i];

        arr[i+1] = key;

        return (n+1);
    }

    public static int deleteInArray(int arr[], int n, int key){

        int position = searchInArray(arr,0,n-1,key);

        if(position==-1){
            System.out.println("Element nto found");
            return n;
        }

        int i;
        for(i = position;i<n-1;i++){
            arr[i] = arr[i+1];
        }

        return n-1;
    }

    private static int searchInArray(int[] array,int left,int right,int key){
        if(right < left){
            return -1;
        }

        int middle = (left + right)/2;

        if(key==array[middle]){
            return middle;
        }

        if(key>array[middle]){
            return searchInArray(array,middle+1,right,key);
        }

        return searchInArray(array,left,middle-1,key);
    }

    private static void countingSort(int[] arr){
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        int range = max - min + 1;
        int count[] = new int[range];
        int output[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            count[arr[i] - min]++;
        }

        for (int i = 1; i < count.length; i++)
        {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--)
        {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = output[i];
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] v) {
        quickSort(v, 0, v.length - 1);
        System.out.println(Arrays.toString(v));
    }

    private static int[] quickSort(int[] v, int low, int high) {
        partition(v, low, high);
        if (low < j)
            quickSort(v, low, j);
        if (high > i)
            quickSort(v, i, high);

        return v;
    }

    private static void partition(int[] v, int low, int high) {
        i = low;
        j = high;
        int x = v[(i + j) / 2];
        while (i <= j) {
            while (v[i] < x)
                i++;
            while (v[j] > x)
                j--;
            if (i <= j) {
                int temp = v[i];
                v[i] = v[j];
                v[j] = temp;
                i++;
                j--;
            }
        }

}}
