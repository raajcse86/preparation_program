package com.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArraySumEqualToGivenSum {

    public static void main(String[] args) {
        int[] a = {4,2,5,3,1,8};
        int sum=9;
        int l=0;
        int r=0;
        int windowsum=0;
        List<List<Integer>> list = new ArrayList<>();
        while(l<=r && r<a.length-1){
            windowsum = windowsum+a[r];
            if(windowsum == sum){
                    List<Integer> subList = new ArrayList<>();
                    for(int k=l;k<=r;k++){
                        subList.add(a[k]);
                    }
                    list.add(subList);
                    r++;
            }else if(windowsum<sum){
                r++;
            }else if(windowsum >sum){
                windowsum = windowsum -a[l];
                l++;
                r++;
            }
        }
        System.out.println(list);




    }
}
