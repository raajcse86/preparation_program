package com.practise.algo;

public class LongestIncreasingSubSequence {

    public static void main(String[] args) {
        int a[] = {7,1,4,8,11,2,14,3};

        int l=0;
        int r=1;
        int n = a.length;
        int sub_start_index=0;
        int longest_so_far=1;

        int lis=1;
        while(r<n){
            if(a[r-1]<a[r]){
                r++;
                lis++;
                longest_so_far = Math.max(longest_so_far,lis);
            }else{
                l=r;
                r++;
                lis=1;
            }
        }
        System.out.println(longest_so_far);




    }

}
