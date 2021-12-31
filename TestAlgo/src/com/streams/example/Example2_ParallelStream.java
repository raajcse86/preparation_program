package com.streams.example;

import java.util.Arrays;

public class Example2_ParallelStream {
    public static void main(String[] args) {
        long[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.parallelSetAll(array,x->array[x]+5);
        System.out.println(Arrays.toString(array));
    }
}
