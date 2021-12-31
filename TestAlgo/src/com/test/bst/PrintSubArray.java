package com.test.bst;

import java.util.ArrayList;
import java.util.List;

public class PrintSubArray {

    public static void main(String[] args) {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        int currentSum=arr[0];
        int l=0;
        int r=0;
        int pointer=0;
        while(l<n && r<n){
            r++;
            currentSum+=arr[r];

            while(currentSum>sum){
                currentSum = currentSum-arr[l];
                l++;
            }
            if(currentSum == sum){
                System.out.println("start index "+l+"end index "+r);
                break;
            }
        }


    }

}
