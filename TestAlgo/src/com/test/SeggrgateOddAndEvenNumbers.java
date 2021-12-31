package com.test;

import java.util.Arrays;
import java.util.List;

public class SeggrgateOddAndEvenNumbers {

    public static void main(String[] args) {
        int[] arr = {2,4,1,6,3,8,7};

        seggregateOddAndEven(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private static void seggregateOddAndEven(int[] arr) {
        int left=0;
        int right=arr.length-1;

        while(left < right){

            while(left<right && arr[left] %2 ==0){
                left++;
            }

            while(left<right && arr[right] %2 ==1){
                right--;
            }

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left++;
            right--;

        }



    }
}
