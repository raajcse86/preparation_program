package com.codility;

public class SubArrayWithMaxSum {
    public static void main(String[] args) {
        int[] a= {-3,2,-7,6,-2,4,-8,5};
        int maxSum=0;
        int sumSoFar=0;
        int start=0;
        int end=0;
        for(int i=0;i<a.length;i++){
            sumSoFar = sumSoFar+a[i];
            if(sumSoFar<0){
                sumSoFar=0;
                start=i+1;
                continue;
            }
            if(sumSoFar>maxSum){
                maxSum=sumSoFar;
                end=i;
            }
        }
        System.out.println(maxSum);
        for(int k=start;k<=end;k++){
            System.out.println(a[k]);
        }







    }

}
