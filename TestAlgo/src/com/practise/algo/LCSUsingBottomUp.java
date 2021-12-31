package com.practise.algo;

public class LCSUsingBottomUp {

    public static void main(String[] args) {
        String s1 = "abde";
        String s2 = "acd";

        lcsUsingBottomUp(s1,s2, s1.length(),s2.length());


    }

    int lcsUsingRecursion(String s1, String s2, int m, int n){
        if(m==0 || n==0){
            return 0;
        }

        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1+lcsUsingRecursion(s1,s2,m-1,n-1);
        }
        return Math.max(lcsUsingRecursion(s1,s2,m-1,n),lcsUsingRecursion(s1,s2,m,n-1));
    }

    private static int lcsUsingBottomUp(String s1, String s2, int m, int n) {
        int[][] lcs = new int[m+1][n+1];

        for(int i=1;i<m;i++){

            for(int j=1;j<n;j++){

                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    lcs[i][j] = 1+lcs[i-1][j-1];
                }else{
                    lcs[i][j] = Math.max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }

        return lcs[m][n];






    }

}
