package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class SampleProgram {

    public static void main(String[] args) {
        //int[] a = {1,3,6,4,1,2};
        //int[] a = {1,2,3};
        //int[] a = {-1,-3};
        //int[] a = {-1,1,2,3};
        int[] a = {-3,0,1,2};
        System.out.println("Result "+solution(a));
    }

    public static int solution(int[] a) {
        int minPositiveValueInArray =1;
        int maxPositiveValueInArray = 1;
        for(int i=0;i<a.length;i++){
            if(a[i]<minPositiveValueInArray){
                minPositiveValueInArray = a[i];
            }
            if(a[i]> maxPositiveValueInArray){
                maxPositiveValueInArray = a[i];
            }
        }
        boolean allNegative = Arrays.stream(a).boxed().allMatch(i->i<0);
        List<Integer> orgList = Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> otherList = IntStream.rangeClosed(minPositiveValueInArray, maxPositiveValueInArray).mapToObj(i->i).collect(toList());
        int result=0;
        boolean missed=false;
        for(Integer i:otherList){
            if(i>0 && !orgList.contains(i)){
                System.out.println(i);
                result = i;
                missed=true;
            }
        }
        if(result ==0 && missed == false){
            result = maxPositiveValueInArray+1;
        }
        if(allNegative){
            result = 1;
        }
        System.out.println("min >> "+minPositiveValueInArray);
        System.out.println("max >> "+maxPositiveValueInArray);
        return result;
    }
}
