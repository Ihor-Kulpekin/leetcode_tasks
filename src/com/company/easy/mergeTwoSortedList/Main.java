package com.company.easy.mergeTwoSortedList;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LinkedList list = defineLinkedList();
        LinkedList list1 = defineLinkedList();

        MergeTwoSortedList<Integer> mergeTwoSortedList = new MergeTwoSortedList<>();
        mergeTwoSortedList.mergeTwoSortedArray(list,list1);
    }


    private static LinkedList defineLinkedList(){
        Random random = new Random();
        LinkedList list = new LinkedList();

        for(int i = 0; i<5;i++){
            int number =random.nextInt(56);
            list.add(number);
        }

        return list;
    }
}
