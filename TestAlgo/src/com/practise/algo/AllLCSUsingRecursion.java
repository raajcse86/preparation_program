package com.practise.algo;

public class AllLCSUsingRecursion {

    public static int lcsubstring(String s1, String s2, int n, int m, int countOfLCS) {
        if(n == 0 || m == 0) {
            return countOfLCS;
        }

        if(s1.charAt(n - 1) == s2.charAt(m - 1)) {
            countOfLCS = lcsubstring(s1, s2, n - 1, m - 1, countOfLCS + 1);
        }

        int count1 = lcsubstring(s1, s2, n - 1, m, 0);
        int count2 = lcsubstring(s1, s2, n, m - 1, 0);

        return Math.max(countOfLCS, Math.max(count1, count2));
    }

    public static int lcs(String s1, String s2, int n, int m) {
        if(n == 0 || m == 0) {
            return 0;
        }

        if(s1.charAt(n - 1) == s2.charAt(m - 1)) {
            return 1 + lcs(s1, s2, n - 1, m - 1);
        }

        return Math.max(lcs(s1, s2, n - 1, m), lcs(s1, s2, n, m - 1));
    }

    //longest-palindromic-subsequence
    public static int lps(String str, int start, int end) {
        if(start > end) {
            return 0;
        }

        if(start == end) {
            return 1;
        }

        if(str.charAt(start) == str.charAt(end)) {
            return 2 + lps(str, start + 1, end - 1);
        }

        return Math.max(lps(str, start + 1, end), lps(str, start, end - 1));
    }

    //longest-palindromic-substring
    public static int lpSubstring(String str, int start, int end) {
        if(start > end) {
            return 0;
        }

        if(start == end) {
            return 1;
        }

        if(str.charAt(start) == str.charAt(end)) {
            int lpsRemainingString = end - start - 1;

            if(lpsRemainingString == lpSubstring(str, start + 1, end - 1)) {
                return 2 + lpsRemainingString;
            }
        }

        return Math.max(lpSubstring(str, start + 1, end), lpSubstring(str, start, end - 1));
    }
}
