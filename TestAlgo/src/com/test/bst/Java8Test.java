package com.test.bst;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Test {

    public static void main(String[] args) {
        int[] numbers = {4,1,13,90,16,2,-1};
        IntStream.of(numbers).min().ifPresent(s-> System.out.println("Min >> "+s));

        IntStream.of(numbers).max().ifPresent((s-> System.out.println("Max >> "+s)));

        System.out.println("Sum >> "+IntStream.of(numbers).sum());

        IntStream.of(numbers).average().ifPresent((s)-> System.out.println("Average >>> "+s));


        IntSummaryStatistics intSummaryStatistics = IntStream.of(numbers).summaryStatistics();

        //IntStream.range(1,100).forEach((s)-> System.out.println(s));

        //IntStream.rangeClosed(1,100).forEach((s)-> System.out.println(s));

//        IntStream.generate(()->{
//           return IntStream.rangeClosed(1,100).collect(Collectors.toList());
//        });


        //Find first 3 distinct numbers from an array.
        IntStream.of(numbers)  //create the stream
                .distinct() // process the stream
                .sorted()
                .limit(3)
                .forEach((n)-> System.out.println(n)); //consume the stream




    }
}
