package com.test.bst;

import java.util.Arrays;

public class TestProgram3 {

    public static void main(String[] args) {
        int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = a.length;
        int currentSum=0;
        int max_sum_so_far=Integer.MIN_VALUE;
        int temp=0;
        int startIndex=0;
        int endIndex=0;

        for(int i=0;i<a.length;i++){

            currentSum+=a[i];

            if(currentSum < 0){
                currentSum=0;
                temp=i+1;
            }

            if(max_sum_so_far < currentSum){
                max_sum_so_far = currentSum;
                startIndex = temp;
                endIndex=i;
            }

        }

        System.out.println("Max length so far "+max_sum_so_far);
        System.out.println("Array Index are "+startIndex+"---"+endIndex);
        System.out.println("Arrays are "+ Arrays.toString(Arrays.copyOfRange(a,startIndex,endIndex)));



    }
}
