package com.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Quadruple {

    public static void main(String[] args) {
        int[] a = {1,2,-3,4,-2,-1,3};
        Arrays.sort(a);
        int totalSum = 3;
        //{-3,-2,-1,1,2,3,4}
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int partSum = totalSum - (a[i]+a[j]);
                int start = j+1;
                int end = a.length-1;
                while(start < end){
                    if(partSum == (a[start] + a[end])){
                        list.add(Arrays.asList(a[i],a[j],a[start],a[end]));
                        start++;
                        end--;
                    }else if(partSum < (a[start] + a[end])){
                        start++;
                    }else if(partSum > (a[start] + a[end])){
                        end--;
                    }
                }
            }
        }
        System.out.println(list);




    }
}
