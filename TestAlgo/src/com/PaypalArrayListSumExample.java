package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PaypalArrayListSumExample {
    public static void main(String[] args) {
        int[] a = {2,3,6,9,10,12};
        Arrays.sort(a);
        int givenSum=22;
        int first = a[0];
        int second =a[1];
        int currentSum=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){
            map.put(a[i],i);
        }
        int low=0;
        int high=a.length-1;
        while(low< high){
            int tempSum=a[low]+a[high];
            int midVal = givenSum-tempSum;
            if(map.containsKey(midVal)){
                System.out.println("--"+a[low]+"--"+a[high]+midVal);
            }
            low++;
        }



    }
}
