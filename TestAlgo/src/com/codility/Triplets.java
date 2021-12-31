package com.codility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Triplets {

    public static void main(String[] args) {
        int[] a = {1,2,-3,4,-2,-1};
        int totalSum = 1;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(a);
        //{-3,-2,-1,1,2,4}
        for(int i=0;i<a.length;i++){
            int partSum = totalSum-a[i];
            int l= i+1;
            int r=a.length-1;
            while(l<r){
                if(partSum == a[l]+ a[r]){
                list.add(Arrays.asList(a[i],a[l],a[r]));
                l++;
                r--;
                }else if(partSum < a[l]+a[r]){
                    l++;
                }else if(partSum > a[l] + a[r]){
                    r--;
                }
            }
        }

        System.out.println(list);




    }
}
