package com.company.easy.twoSum;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int [] numbers = {2,7,11,15};
        System.out.println(Arrays.toString(TwoSum.twoSum(numbers, 9)));

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(6);
        linkedList.add(4);

        addTwoNumber(linkedList);
    }

    public static void addTwoNumber(LinkedList<Integer> linkedList){

        LinkedList<Integer> linkedList1 = new LinkedList<>();

        int one_sum = 0;
        int two_sum = 0;


        for(int i = 0; i<linkedList.size()/2;i++){
            one_sum+=linkedList.get(i);
        }

        for(int j = linkedList.size()/2;j<linkedList.size();j++){
            two_sum+=linkedList.get(j);
        }

        linkedList1.add(one_sum);
        linkedList1.add(two_sum);

        Iterator<Integer> integerIterator = linkedList1.iterator();

        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

    }

}
