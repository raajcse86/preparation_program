package com.codility;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapKthLargest {

    public static void main(String[] args) {
        int[] a = {10,7,11,30,20,38,2,45};
        int k=3;

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<a.length;i++){
            priorityQueue.add(a[i]);
        }
        System.out.println("Largest "+priorityQueue.peek());

        for(int i=0;i<k;i++){
            priorityQueue.poll();
        }

        System.out.println("Kth Largest "+priorityQueue.peek());



    }
}
