package com.codility;

import java.util.Arrays;

public class MergeArrays {

    public static void main(String[] args) {
        int[] aarray = {1,3,5,7,12,14};
        int[] barray = {2,4,6,8};
        int[] karray = new int[aarray.length+barray.length];
        int i=0,j=0,k=0;
        while(i<aarray.length && j<barray.length){
            if(aarray[i] < barray[j]){
                karray[k] = aarray[i];
                i++;
                k++;
            }else{
                karray[k] = barray[j];
                j++;
                k++;
            }
        }
        while(i<aarray.length){
            karray[k++]=aarray[i++];
        }

        System.out.println("--"+Arrays.toString(karray));



    }
}
