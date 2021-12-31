package com;

import java.util.*;

public class PaypalArrayListSumExample2 {
    public static void main(String[] args) {
        int[] a = {2,3,6,9,10,12};
        int givenSum=22;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            int sum = givenSum-a[i];
            int start=i+1;
            int end = a.length-1;
            while(start<end){
                int t = a[start]+a[end];
                if(t== sum){
                    System.out.println("--"+a[start]+"----"+a[end]+"---"+a[i]);
                    list.add(Arrays.asList(a[start],a[end],a[i]));
                    start++;
                    end--;
                }else if(t<sum){
                    start++;
                }else{
                    end--;
                }
            }
        }

        System.out.println(list);
    }
}
