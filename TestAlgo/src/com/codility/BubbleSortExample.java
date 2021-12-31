package com.codility;

import java.util.Arrays;

public class BubbleSortExample {

    public static void main(String[] args) {
        int[] a = {15,16,6,8,5};

        for(int i=0;i<a.length-1;i++){
            int flag=0;
            for(int j=0;j<a.length-1;j++){
                if(a[j]> a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
            }
            if(flag == 0){
                break;
            }
        }

        System.out.println(Arrays.toString(a));



    }
}
