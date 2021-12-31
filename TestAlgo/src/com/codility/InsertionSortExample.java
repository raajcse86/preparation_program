package com.codility;

import java.util.Arrays;

public class InsertionSortExample {

    public static void main(String[] args) {
        int a[] = {5,4,10,1,6,2};

        for(int i=1;i<a.length;i++){
            int temp = a[i];
            int j=i-1;
            while(a[j]> temp && j>=0){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        System.out.println(Arrays.toString(a));

    }
}
