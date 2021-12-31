package com;

import java.util.Arrays;

public class PaypalArrayListSum {
    public static void main(String[] args) {
        int[] a = {2,3,6,9,10,12};
        Arrays.sort(a);
        int sum=22;
        int low=0;
        int high=a.length-1;
        int first=a[low];
        int mid = (low+high)/2;
        int second=a[mid];
        int third=a[high];

        while(low<a.length && low<mid){
            int currentSum=first+second+third;
            if(currentSum<sum){
                currentSum = currentSum-first;
                low++;
                if(low == mid){
                    mid--;
                    currentSum=currentSum+first;
                    currentSum = currentSum-second;
                    second=a[mid];
                }else{
                    first = a[low];
                }

            }else if(currentSum>sum){
                currentSum =currentSum-third;
                high--;
                third = a[high];
            }else if(currentSum == sum){
                System.out.println("Combinations are "+first+"---"+second+"---"+third);
            }
        }
    }
}
