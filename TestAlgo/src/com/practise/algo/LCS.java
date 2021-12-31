package com.practise.algo;

public class LCS {

    public static void main(String[] args) {
        String s1 = "ABCDGH";
        String s2 = "AEDFHR";


        int result =longestCommonSubSequence(s1.toCharArray() ,s2.toCharArray(), s1.length(),s2.length());
        System.out.println(result);
    }


    int bottomUpApproach(char[] s1, char[] s2, int m, int n){
        int L[][] = new int[m+1][n+1];

        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                if(i==0 || j==0){
                    L[i][j]=0;
                }else if(s1[m-1] == s2[n-1]){
                    L[i][j]=L[m-1][n-1]+1;
                }else
                    L[i][j] = Math.max(L[m-1][n],L[m][n-1]);
            }
        }
        return L[m][n];
    }


    static int longestCommonSubSequence(char[] s1, char[] s2, int m, int n){
        if(m==0 || n==0){
            return 0;
        }
        if(s1[m-1] == s2[n-1]){
            return 1+ longestCommonSubSequence(s1,s2,m-1,n-1);
        }
        return Math.max(longestCommonSubSequence(s1,s2,m-1,n),longestCommonSubSequence(s1,s2,m,n-1));
    }
}
