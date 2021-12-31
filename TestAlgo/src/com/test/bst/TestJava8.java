package com.test.bst;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestJava8 {
    public static void main(String[] args) {
        List<String> listOfString = Arrays.asList("Rajasekar","Mithun");
        List<String> filtered = listOfString.stream().filter(s->s.startsWith("R")).collect(Collectors.toList());
        System.out.println(filtered);
    }
}
