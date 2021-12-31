package com.streams.example;

import java.util.Arrays;

public class Example1 {
    public static void main(String[] args) {
        int[] a = {1,1,2,2,3,3,4,5,6,7,8,9};

        //this will give error as it is not boxed.
        //Arrays.asList(a).stream().distinct().forEach(i-> System.out.println(i));

        //below will make the int to box to integer
        //Arrays.stream(a).boxed().distinct().forEach(i-> System.out.println(i));

        //using method reference.
        Arrays.stream(a).boxed().distinct().forEach(System.out::println);



    }
}
