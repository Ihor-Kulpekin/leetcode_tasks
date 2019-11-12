package com.company.easy.mergeTwoSortedList;

import java.util.List;
import java.util.LinkedList;

public class MergeTwoSortedList<T> {

    public void mergeTwoSortedArray(LinkedList<T> linkedList, LinkedList<T> linkedList1){

        List<T> sortedLinkedList = new LinkedList<>();

        sortedLinkedList.addAll(linkedList);
        sortedLinkedList.addAll(linkedList1);

        sortedLinkedList.stream()
                .sorted()
                .forEach(System.out::println);
    }

}
